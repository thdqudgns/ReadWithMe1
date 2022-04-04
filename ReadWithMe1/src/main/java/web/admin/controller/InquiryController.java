package web.admin.controller;

import java.util.List;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import web.admin.service.face.InquiryService;
import web.user.dto.AdminInquiry;
import web.user.dto.Inquiry;
import web.user.dto.Inquiry_file;
import web.user.dto.UserTb;
import web.user.service.face.UserInquiryService;
import web.util.Paging;

//	1:1 질문
@Controller
public class InquiryController {

	//	로그 객체
	private static final Logger logger = LoggerFactory.getLogger(InquiryController.class);
	
	@Autowired
	private JavaMailSender mailSender;
	
	//	서비스 객체
	@Autowired private InquiryService inquiryService;
	@Autowired private UserInquiryService userInquiryService;
	
	
	//	전체 질문 조회
	@RequestMapping(value="/admin/inquiry/list")
	public String InquiryList(Inquiry inquiry, Paging paramData, Model model) {
		
		logger.info("/admin/inquiry/list");
		
		// 검색어 추출
		String search = paramData.getSearch();
		
		// 페이징 처리
		Paging paging = inquiryService.getPaging(paramData);
		
		//	페이징 객체에 검색어 삽입
		paging.setSearch(search);
		
		//	타입 번호
		int type_no = paramData.getType();
		paging.setType(type_no);
		
		
		//	게시판 조회
		List<Inquiry> list = inquiryService.list(paging);
		
		//	모델값 전달
		model.addAttribute("paramData", paramData);
		model.addAttribute("paging", paging);
		model.addAttribute("inquiry", list);
		
		
		return "admin/inquiry/list";
		
	}
	
	
	//	질문 상세보기
	@RequestMapping(value="/admin/inquiry/view", method=RequestMethod.GET)
	public String InquiryView(Inquiry inquiry, Model model) {
		
		//	0 또는 음수의 게시글 번호로 게시글 접근 시도시 차단
		if (inquiry.getBoard_no() < 1 ) {
			return "redirect: /admin/inquiry/list";
		}
		
		inquiry = inquiryService.view(inquiry);
		
		Inquiry_file inquiry_file = inquiryService.getAttachFile(inquiry);
		model.addAttribute("inquiry_file", inquiry_file);
		
		
		//	댓글 리스트 전달
		AdminInquiry adminInquiry = new AdminInquiry();
		List<AdminInquiry> commentList = userInquiryService.getCommentList(inquiry);
		model.addAttribute("commentList", commentList);
		
		//	모델값 전달
		model.addAttribute("inquiry", inquiry);
		
		return "admin/inquiry/view";
	}
	
	//첨부파일 다운로드
	@RequestMapping(value = "/admin/inquiry/download")
	public String download(int file_no, Model model) {

		logger.info("{}", file_no);

		Inquiry_file inquiry_file = inquiryService.getFile(file_no);

		model.addAttribute("downFile2", inquiry_file);

		return "down";
	}
	
	@RequestMapping(value = "/admin/inquiry/check_reply", method=RequestMethod.POST)
	public String CheckReplyProc(HttpServletRequest req, AdminInquiry adminInquiry, Model model) {
		
		int data_for_board_no = Integer.parseInt(req.getParameter("data_for_board_no"));
		
		adminInquiry.setBoard_no(data_for_board_no);
		
		inquiryService.checkReply(adminInquiry);
		
		model.addAttribute("result", 1);
		return "jsonView";
		
	}
	
	//	1:1질문 수정
//	@RequestMapping( value = "/admin/inquiry/update", method = RequestMethod.GET)
//	public String InquiryUpdate(Inquiry inquiry, Model model) {
//		
//		logger.info("{}", inquiry);
//		
//		//	게시글 번호가 1보다 작으면 목록을 보내기
//		if(inquiry.getBoard_no() < 1 ) {
//			return "redirect:/admin/inquiry/list";
//		}
//		
//		//	게시글 상세 정보 전달
//		inquiry = userInquiryService.view(inquiry);
//		
//		//	모델값 전달
//		model.addAttribute("inquiry", inquiry);
//		
//		return "admin/inquiry/update";
//	}
//	
//	@RequestMapping( value = "/admin/inquiry/update", method = RequestMethod.POST)
//	public String InquiryUpdateProc(Inquiry inquiry) {
//		
//		inquiryService.update(inquiry);
//		
//		return "redirect:/admin/inquiry/list?board_no=" + inquiry.getBoard_no();
//	}
	
	//	1:1질문 삭제
	@RequestMapping(value = "/admin/inquiry/delete" , method = RequestMethod.GET)
	public String InquiryDelete(Inquiry inquiry) {
		
		if(inquiry.getBoard_no() < 1 ) {
			return "redirect: /admin/inquiry/list";
		}
		
		inquiryService.delete(inquiry);
		
		return "redirect:/admin/inquiry/list";
	}
	
	// 1:1질문 선택삭제
	@RequestMapping(value = "/admin/inquiry/delete" , method = RequestMethod.POST)
	public String ajaxDelete(HttpServletRequest request) {

		String[] ajaxMsg = request.getParameterValues("valueArr");
		int size = ajaxMsg.length;
		for (int i = 0; i < size; i++) {
			logger.info("ajaxMsg[i]: {}", ajaxMsg[i]);
			inquiryService.deleteChecked(ajaxMsg[i]);
		}

		return "redirect:/admin/inquiry/list";
	}
	
	

    
//	@RequestMapping( value= "/admin/inquiry/sendEmail")
	//mailSend 코드
	
	@RequestMapping(value = "/admin/inquiry/sendMail")
	public String mailSend(HttpServletRequest request, Inquiry inquiry) {
		
		//	질문을 남긴 회원번호
		int user_no = Integer.parseInt((String.valueOf(request.getParameter("user_no"))));
		
		System.out.println(user_no);
		
		// 회원 조회
		UserTb user = userInquiryService.userInfo(user_no);
		System.out.println("user: " + user);
		
		try {
			MimeMessage mimeMessage = mailSender.createMimeMessage();
		    MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true, "UTF-8");
 
		    messageHelper.setFrom("anzu.only@gmail.com"); // 보내는사람 이메일 여기선 google 메일서버 사용하는 아이디를 작성하면됨
		    messageHelper.setTo(user.getEmail()); // 받는사람 이메일
		    messageHelper.setSubject("[ReadWithMe] 문의하신 질문에 답변이 등록되었습니다."); // 메일제목
		    messageHelper.setText( " 감사합니다."); // 메일 내용
 
		    mailSender.send(mimeMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:/admin/inquiry/view?board_no" + inquiry.getBoard_no();
	}
}
















