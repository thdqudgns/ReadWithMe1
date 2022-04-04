package web.admin.service.face;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import web.user.dto.UserTb;
import web.util.Paging;

public interface AdminMemberService {
	
	public Paging getPaging(Paging paramData);

	/**
	 * 전체 멤버 목록 불러오기
	 * @param paging - 페이징 객체
	 * @param req 
	 * @return 전체 멤버 목록
	 */
	public List<HashMap<String, Object>> getMemberList(Paging paging, HttpServletRequest req);

	/**
	 * 제재 멤버 목록 불러오기
	 * @param paging
	 * @param req
	 * @return
	 */
	public List<HashMap<String, Object>> getBanMemberList(Paging paging, HttpServletRequest req);

	/**
	 * 관리자 권한 설정
	 * @param user
	 * @param req 
	 */
	public void setAdmin(UserTb user, HttpServletRequest req);

	/**
	 * 회원 제재
	 * @param req
	 */
	public void banUser(HttpServletRequest req);

	/**
	 * 회원 제재 삭제
	 * @param req
	 */
	public void banDeleteUser(HttpServletRequest req);


}
