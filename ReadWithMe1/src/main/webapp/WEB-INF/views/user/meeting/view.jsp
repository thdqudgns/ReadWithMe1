<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<jsp:useBean id="now" class="java.util.Date" />
<fmt:formatDate value="${now}" pattern="yyyy-MM-dd" var="today" />
<fmt:formatDate value="${meeting.meeting_rcr_end}" pattern="yyyy-MM-dd" var="rcr" />
<fmt:formatDate value="${meeting.meeting_end}" pattern="yyyy-MM-dd" var="end" />

<c:import url="/WEB-INF/views/user/layout/header.jsp" />
<style type="text/css">

body {
	font-size: 14px;
    margin: 0;
    padding: 0;
}

.meeting-header {
	order: 1;
	padding: 40px 0;
	border-bottom: 1px solid rgba(0,0,0,.08);
	background-color: #fff;
}

.meeting-body {
	order: 3;
	padding-top: 40px;
	padding-bottom: 80px;
}

.inner {
	display: flex;
	justify-content: space-between;
	margin: 0 auto;
	padding: 0 10px;
	width: 100%;
	max-width: 980px;
}

table.meeting-info {
	flex-shrink: 0;
	margin-top: 0;
	margin-left: 32px;
	font-weight: normal;
	width: 328px;
	height: 416px;
}

th.host-info {
	margin-top: 32px;
	padding-top: 32px;
	border-top: 1px solid rgba(0,0,0,.08);
}

td.meeting-content {
	vertical-align: top;
	font-size: 14px;
	width: 600px;
	height: auto;
}

th.meeting-title {
	font-size: 32px;
	text-align: left;
}

th.meeting-info-list {
	font-weight: normal;
	line-height: 25px;
	height: auto;
	text-align: left;
	margin-top: 8px;	
}

th.meeting-location {
	font-weight: normal;
	text-align: left;	
}

th.meeting-ask {
	margin-top: 24px;
    padding-top: 24px;
    border-top: 1px solid rgba(0,0,0,.08);
	vertical-align: top;
	font-size: 14px;
	font-weight: normal;
	text-align: left;
}

.location {
	width: 328px;
	height: 273px;
}

.property {
	width: 46px;
    color: rgba(0,0,0,.4);
}

p.info-title {
	margin-bottom: 16px;
	font-size: 16px;
	color: rgba(0,0,0,.6);
	letter-spacing: -.2px;
}

p.addr {
	display: block;
	margin-block-start: 1em;
	margin-block-end: 1em;
	margin-inline-start: 0px;
	margin-inline-end: 0px;
}

.btn-apply {
	font-size: 16px;
	width: 200px;
	height: 48px;
	margin-top: 10px;
	justify-content: center;
	align-items: center;
	border-radius: 4px;
	letter-spacing: -.5px;
	border: 1px;
	box-shadow: none;
	color: #ffffff;
	background-color: #9f8170;
}

.btn-delete {
	font-size: 16px;
	width: 200px;
	height: 48px;
	margin-top: 10px;
	justify-content: center;
	align-items: center;
	border-radius: 4px;
	letter-spacing: -.5px;
	border: 1px;
	box-shadow: none;
}

</style>

<body>
<div class="container">	
	<div class="meeting-header">
		<div class="inner">
			<table>
			<thead>
				<tr>
					<td><img src="https://i.imgur.com/qxqjwv4.jpg" style="width: 572px; height: 416px;"></td>
					<td>
						<table class="meeting-info">
						<thead>
							<tr>
								<th class="meeting-title">${meeting.meeting_title }</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<th class="meeting-info-list"><br>
								<span class="property">??????</span> <fmt:formatDate value="${meeting.meeting_start }" pattern="yyyy-MM-dd KK???"/><br>
								<span class="property">??????</span> ${meeting.meeting_location }<br>
								<span class="property">??????</span> ${meeting.meeting_personnel }???<br>
								<span class="property">??????</span> <fmt:formatDate value="${meeting.meeting_rcr_end }" pattern="yyyy-MM-dd KK???"/> ??????</th>
							</tr>
							<tr>
								<th class="host-profile">
								<br>
								<div class="host-info">
								<!-- ????????? ????????? ?????? ${user.file_no } -->
								<span class="property">?????????</span> ${user.nick }
								<div>
								</div>
								<!-- ??????????????? -->
								<c:if test="${login }">
									<c:choose>
									<c:when test="${user_no eq meeting.user_no }">
										<!-- ?????? ????????? ?????? -->
										<a href="/user/meeting/delete?meeting_no=${meeting.meeting_no }"><button class="btn-delete">??????</button></a>	
									</c:when>
									
									<c:when test="${user_no eq participation.user_no && meeting.meeting_no eq participation.meeting_no}">
										<!-- ?????? ????????? ?????? -->
										<button onclick='deleteApply()' class="btn-delete">?????? ??????</button>
									</c:when>
						
									<c:when test="${today > rcr }">
										<button class="btn-delete" disabled>?????? ??????</button>
									</c:when>
									
									<c:otherwise>
										<!-- ????????? ?????? -->
										<button onclick='apply()' class="btn-apply">????????????</button>
									</c:otherwise>
									</c:choose>
								</c:if>
								
								<!-- ?????????????????? -->
								<c:if test="${not login }">
									<c:choose>
									<c:when test="${today > rcr }">
										<button class="btn-delete" disabled>?????? ??????</button>
									</c:when>
									
									<c:otherwise>
										<button onclick='location.href="/login";' class="btn-apply">????????????</button>
									</c:otherwise>
									</c:choose>
								</c:if>
								</div>
								</th>
							</tr>
						</tbody>
						</table>
					</td>
				</tr>
			</thead>
			</table>
		</div> <!-- end inner -->
	</div> <!-- end meeting-header -->
	
	<div class="meeting-body">
		<div class="inner">
			<table>
			<thead>
				<tr>
					<td class="meeting-content">
					<p style="margin:3px"></p>
					<p class="info-title">?????? ??????</p><br>
					${meeting.meeting_content }
					</td>
					<td>
						<table class="meeting-info">
						<thead>
							<tr>
								<th class="meeting-location"><p class="info-title">??????</p><br>
								<div class="location" id="map"></div>
								<p class="addr">${meeting.meeting_address }</p>
								</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<th class="meeting-ask">
								<p class="info-title">??????</p><br>
								${user.email }
							</tr>
						</tbody>
						</table>
					</td>
				</tr>
			</thead>
			</table>
		</div> <!-- end inner -->
	</div> <!-- end meeting-body -->
	
</div> <!-- end container -->
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=d3c54c8bae5dd8337194186463b00699&libraries=services"></script>
<script>
const address = '${meeting.meeting_address}'

var mapContainer = document.getElementById('map'), // ????????? ????????? div 
    mapOption = {
        center: new kakao.maps.LatLng(33.450701, 126.570667), // ????????? ????????????
        level: 3 // ????????? ?????? ??????
    };  

// ????????? ???????????????    
var map = new kakao.maps.Map(mapContainer, mapOption); 

// ??????-?????? ?????? ????????? ???????????????
var geocoder = new kakao.maps.services.Geocoder();

// ????????? ????????? ???????????????
geocoder.addressSearch(address, function(result, status) {

	// ??????????????? ????????? ??????????????? 
	if (status === kakao.maps.services.Status.OK) {

		var coords = new kakao.maps.LatLng(result[0].y, result[0].x);

		// ??????????????? ?????? ????????? ????????? ???????????????
		var marker = new kakao.maps.Marker({
			map: map,
			position: coords
		});

		// ????????? ????????? ??????????????? ?????? ????????? ??????????????????
		map.setCenter(coords);
	} 
});

function apply() {
	const meeting_no = '${meeting.meeting_no}'
	location.href="/user/meeting/apply?meeting_no=" + meeting_no
}

function deleteApply() {
	const meeting_no = '${meeting.meeting_no}'
	location.href="/user/meeting/deleteApply?meeting_no=" + meeting_no
}
</script>
</body>

<c:import url="/WEB-INF/views/user/layout/footer.jsp" />