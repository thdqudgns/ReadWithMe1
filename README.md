# :pushpin: 2. Read With Me
Servlet/JSP에 Spring을 더해 개발했습니다.

### 본인 담당 코드
<details markdown="1">
<summary>명언게시판</summary>

* [명언게시판 Controller](https://github.com/thdqudgns/ReadWithMe1/blob/main/ReadWithMe1/src/main/java/web/user/controller/FamousController.java)
* [명언게시판 Service](https://github.com/thdqudgns/ReadWithMe1/blob/main/ReadWithMe1/src/main/java/web/user/service/impl/FamousServiceImpl.java)
* [명언게시판 DAO - Mapper](https://github.com/thdqudgns/ReadWithMe1/blob/main/ReadWithMe1/src/main/java/web/user/dao/mapper/FamousMapper.xml)
* [명언게시판(추천) DAO - Mapper](https://github.com/thdqudgns/ReadWithMe1/blob/main/ReadWithMe1/src/main/java/web/user/dao/mapper/Famous_recMapper.xml)
* [명언게시판 DTO](https://github.com/thdqudgns/ReadWithMe1/blob/main/ReadWithMe1/src/main/java/web/user/dto/Famous.java)
* [명언게시판(추천) DTO](https://github.com/thdqudgns/ReadWithMe1/blob/main/ReadWithMe1/src/main/java/web/user/dto/Famous_rec.java)
* [명언게시판 view](https://github.com/thdqudgns/ReadWithMe1/tree/main/ReadWithMe1/src/main/webapp/WEB-INF/views/user/famous)
* [명언게시판 관리 Controller](https://github.com/thdqudgns/ReadWithMe1/blob/main/ReadWithMe1/src/main/java/web/admin/controller/AdminFamousController.java)
* [명언게시판 관리 Service](https://github.com/thdqudgns/ReadWithMe1/blob/main/ReadWithMe1/src/main/java/web/admin/service/impl/AdminFamousServiceImpl.java)
* [명언게시판 관리 DAO - Mapper](https://github.com/thdqudgns/ReadWithMe1/blob/main/ReadWithMe1/src/main/java/web/admin/dao/mapper/AdminFamousMapper.xml)
* [명언게시판 관리 view](https://github.com/thdqudgns/ReadWithMe1/tree/main/ReadWithMe1/src/main/webapp/WEB-INF/views/admin/famous)

</details>

<details markdown="1">
<summary>후기게시판</summary>

* [후기게시판 Controller](https://github.com/thdqudgns/ReadWithMe1/blob/main/ReadWithMe1/src/main/java/web/user/controller/ReviewController.java)
* [후기게시판(댓글) Controller](https://github.com/thdqudgns/ReadWithMe1/blob/main/ReadWithMe1/src/main/java/web/user/controller/ReviewCommentController.java)
* [후기게시판 Service](https://github.com/thdqudgns/ReadWithMe1/blob/main/ReadWithMe1/src/main/java/web/user/service/impl/ReviewServiceImpl.java)
* [후기게시판 DAO - Mapper](https://github.com/thdqudgns/ReadWithMe1/blob/main/ReadWithMe1/src/main/java/web/user/dao/mapper/ReviewMapper.xml)
* [후기게시판(댓글) DAO - Mapper](https://github.com/thdqudgns/ReadWithMe1/blob/main/ReadWithMe1/src/main/java/web/user/dao/mapper/ReviewCommentMapper.xml)
* [후기게시판 DTO](https://github.com/thdqudgns/ReadWithMe1/blob/main/ReadWithMe1/src/main/java/web/user/dto/Review.java)
* [후기게시판(파일) DTO](https://github.com/thdqudgns/ReadWithMe1/blob/main/ReadWithMe1/src/main/java/web/user/dto/Review_file.java)
* [후기게시판(추천) DTO](https://github.com/thdqudgns/ReadWithMe1/blob/main/ReadWithMe1/src/main/java/web/user/dto/Review_rec.java)
* [후기게시판 view](https://github.com/thdqudgns/ReadWithMe1/tree/main/ReadWithMe1/src/main/webapp/WEB-INF/views/user/review)
* [후기게시판 관리 Controller](https://github.com/thdqudgns/ReadWithMe1/blob/main/ReadWithMe1/src/main/java/web/admin/controller/AdminReviewController.java)
* [후기게시판 관리 Service](https://github.com/thdqudgns/ReadWithMe1/blob/main/ReadWithMe1/src/main/java/web/admin/service/impl/AdminReviewServiceImpl.java)
* [후기게시판 관리 DAO - Mapper](https://github.com/thdqudgns/ReadWithMe1/blob/main/ReadWithMe1/src/main/java/web/admin/dao/mapper/AdminReviewMapper.xml)
* [후기게시판 관리 view](https://github.com/thdqudgns/ReadWithMe1/tree/main/ReadWithMe1/src/main/webapp/WEB-INF/views/admin/review)

</details>

<details markdown="1">
<summary>신고, 도서검색, 에러페이지</summary>

* [신고 Controller](https://github.com/thdqudgns/ReadWithMe1/blob/main/ReadWithMe1/src/main/java/web/admin/controller/AdminReportController.java)
* [신고 Service](https://github.com/thdqudgns/ReadWithMe1/blob/main/ReadWithMe1/src/main/java/web/admin/service/impl/AdminReportServiceImpl.java)
* [신고(댓글) Service](https://github.com/thdqudgns/ReadWithMe1/blob/main/ReadWithMe1/src/main/java/web/admin/service/impl/AdminReportCommentServiceImpl.java)
* [신고 DAO - Mapper](https://github.com/thdqudgns/ReadWithMe1/blob/main/ReadWithMe1/src/main/java/web/admin/dao/mapper/AdminReportMapper.xml)
* [신고(댓글) DAO - Mapper](https://github.com/thdqudgns/ReadWithMe1/blob/main/ReadWithMe1/src/main/java/web/admin/dao/mapper/AdminReportCommentMapper.xml)
* [신고 관리 view](https://github.com/thdqudgns/ReadWithMe1/tree/main/ReadWithMe1/src/main/webapp/WEB-INF/views/admin/report)
* [도서검색 API 코드](https://github.com/thdqudgns/ReadWithMe1/blob/main/ReadWithMe1/src/main/java/web/user/controller/SearchBook.java)
* [도서검색 view](https://github.com/thdqudgns/ReadWithMe1/blob/main/ReadWithMe1/src/main/webapp/WEB-INF/views/book.jsp)
* [에러페이지](https://github.com/thdqudgns/ReadWithMe1/tree/main/ReadWithMe1/src/main/webapp/WEB-INF/views/error)
* [UI - 일반](https://github.com/thdqudgns/ReadWithMe1/tree/main/ReadWithMe1/src/main/webapp/WEB-INF/views/user/layout)
* [UI - 관리자](https://github.com/thdqudgns/ReadWithMe1/tree/main/ReadWithMe1/src/main/webapp/WEB-INF/views/admin/layout)

</details>

### :bulb: 개요  
책을 읽다보면 동일한 내용을 읽은 다른 사람의 생각이 궁금할 때가 있다. 다른 사람에게 자신이 알게된 부분을 나누고 싶을 때가 있다. 책을 읽고 나누며 많은 것을 배울 수 있고 깊은 대화를 나눌 수 있다. 독서모임을 하도록 사람을 모으고, 각자의 이야기를 나누는 서비스를 제공하는 사이트를 만들고자 한다. 

### :bulb: 구현 기능
- 회원서비스 : (소셜)로그인, 로그아웃, (소셜)회원가입, 본인확인, 마이페이지, 탈퇴 
- 마이페이지 : 프로필 수정, 비밀번호 변경, To do List 작성 후 메일 발송, 모임일정 캘린더, 자신이 작성한 후기 조회 수정 삭제
- 커뮤니티(모임, 후기, 명언) : 목록조회, 모임신청, 글 작성, 수정, 삭제, 신고, 파일업로드, 댓글 작성, 댓글 수정, 댓글 삭제, 댓글 신고, 지도 API, 도서검색 API
- 안내&문의(공지, 질문, 문의) : 목록조회, 글 작성, 수정, 삭제, 신고, 파일업로드 
- 관리자서비스 : 회원 조회 및 제재, 게시판 조회 및 삭제, 신고내역 조회 및 삭제

### :bulb: 설계의 주안점
- 다양한 SNS를 통한 로그인 시스템
- 회원가입시 본인인증 시스템
- 회원이 결심한 To do List를 이메일 발송
- 모임일정을 '마이페이지 - 캘린더'에서 확인 가능
- 독서모임을 생성하여 회원끼리 모임에 참여할 수 있음
- 후기게시판을 통해 여러 모임의 특징 및 장점과 자신이 읽은 책의 내용을 나눔
- 1:1문의 기능을 통해 자신의 질문에 답변을 확인 가능
- 메인페이지에서 모임, 후기, 공지를 간단하게 확인 가능 
- 메인페이지에서 지도 API를 통해 오프라인 모임 장소 확인 가능
- 도서 검색 API 구현하여 원하는 도서를 검색하고, 상세한 도서정보를 확인할 수 있음
- 관리자페이지를 통해 회원, 게시글, 안내&문의, 신고내역을 관리

### :bulb: 사용기술 및 개발환경
- 사용기술: Java, Spring STS3, Servlet/JSP, HTML5, CSS3, Javascript, Ajax, XML, Json, jQuery
- Open source & Library: Bootstrap, ojdbc6, jstl, cos, standard
- Server: Apache Tomcat v9.0
- IDE: Eclipse, Oracle SQL Developer
- DBMS: Oracle 11g2
- OS: Window 8 ,10 64bit

### :bulb: 팀 구성
- 팀장: 송병훈 - 역할 : **조장, Github&소스트리 사용법 전달, 명언게시판 및 관리, 후기게시판 및 관리, 신고관리, 도서검색 서비스, 에러페이지 처리, 동작 오류 점검**
- 팀원 2 - 역할 : 로그인과 회원가입과 마이페이지를 비롯한 회원서비스, 회원관리, 모임관리 구현
- 팀원 3 - 역할 : 독서모임 게시판 구현
- 팀원 4 - 역할 : 메인페이지, 마이페이지의 후기 관리 구현
- 팀원 5 - 역할 : 공지사항, 자주묻는질문, 1:1질문 및 관리 구현

### 기여도
25% (구성원 5명)

### 느낀점
그동안 배운 내용을 응용하여 새로운 웹 사이트를 만들어냈다는 것이 뿌듯하고 좋았다. 덕분에 **인터페이스, 클래스, 메소드, SQL 쿼리, JSP, 스프링** 등의 기본 내용들을 더 잘 숙지할 수 있었다. 하지만, 아쉬운 부분도 많다. 세미 때 못했던 기술들을 사용했는데, **네이버 책 검색 API** 를 사용하다가 Ajax와 Javascript 개념이 제대로 잡혀있지 않아서 어려웠다. 구현 중 기획이 부족한 부분이 드러났다. 이런 부분이 나타날 때마다 고민하는 시간이 많아서 힘들었다. 또한, Java를 더 알았다면 코딩의 응용 범위가 넓었을 텐데 그러지 못해서 아쉬웠다. 프로젝트를 통해 부족한 부분을 알게 되어 다행이다. Java와 Javascript의 기본 개념을 공부하기로 다짐하여 지금 다시 개념을 정리하고 있다. 기획을 할 때 구현까지 고려하여 **제대로 기획과 설계를 해야 한다**는 것을 몸소 느꼈고, 팀원 간의 **커뮤니케이션이 원활해야 프로젝트가 제대로 수행된다**든 것도 몸소 느꼈다.
