package web.user.dao.face;

import java.util.List;
import java.util.Map;

import web.user.dto.Message;
import web.util.Paging;

public interface MessageDao {

	/**
	 * 페이징을 적용하여 쪽지 목록 조회 / 받은 쪽지 리스트
	 * 
	 * 	paging.startNo, paging.endNo를 이용하여 rownum을 조회한다
	 * 
	 * @param paging - 페이징 정보 객체
	 * @return 페이징이 적용된 쪽지 목록
	 */
	public List<Map<String, Object>> selectAllToMeList(Map<String, Object> params);

	/**
	 * 보낸 쪽지 리스트
	 * 
	 * @param params
	 * @return
	 */
	public List<Map<String, Object>> selectAllToOtherList(Map<String, Object> params);
	
	/**
	 * 전체 쪽지 수를 조회한다
	 * 
	 * @return 총 쪽지 수
	 */
	public int selectCntAll(Paging paging);

	/**
	 * 쪽지 번호를 이용하여 쪽지를 조회한다 / 받은 쪽지 상세보기
	 * 
	 * @param viewMessage - 조회하려는 쪽지의 글 번호 객체
	 * @return 조회된 쪽지 정보
	 */
	public Map<String, Object> selectMessgaeByMsg_no(Message viewMessage);
	
	/**
	 * 보낸 쪽지 상세보기
	 * 
	 * @param viewMessage
	 * @return
	 */
	public Map<String, Object> selectMessgaeBySendMsg_no(Message viewMessage);
	
	/**
	 * 쪽지 정보를 삽입한다
	 * 
	 * @param message - 삽입할 쪽지 정보
	 */
	public void insertMessage(Message message);
	
	/**
	 * 쪽지 삭제
	 * 
	 * @param message - 삭제할 쪽지의 쪽지 번호 객체
	 */
	public void delete(Message message);

	/**
	 * 받는 사람 닉으로 입력하기
	 * 
	 * @param nick
	 * @return
	 */
	public int selectUserByNick(String nick);








}
