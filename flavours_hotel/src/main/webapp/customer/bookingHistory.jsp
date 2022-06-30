<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- Font awesome -->
<%@include file="/fontawesome/fontawesome.jsp" %> 
<!-- Bootstrap css and JavaScript links -->
<%@include file="/bootstrap_links.jsp" %>
<title>Insert title here</title>
</head>
<body class="align-items-center">
<!-- navbar -->
<%@include file="/navbar.jsp" %><br><br>
<section>
<h3 class="text-center">Booking History</h3>
<div class="container">
<table class="table table-bordered table-striped text-center table-responsive-md">
<tr>
<th>Room Number</th>
<th>Type</th>
<th>Adults</th>
<th>Children</th>
<th>Check IN</th>
<th>Check OUT</th>
<th>Services</th>
<th>Amount</th>
<th>Comments</th>
</tr>
<%-- <td class="border">${user.getUserId()}</td>
<td class="border">${user.getUserName()}</td> --%>
<c:forEach var="history" items="${bookingHistory}" varStatus="status">
<tr>
<td>${history.roomNo }</td>
<td>${history.typeOfRoom }</td>
<td>${history.adults }</td>
<td>${history.children }</td>
<td>${history.checkInDate }</td>
<td>${history.checkOutDate }</td>
<td>${history.services }</td>
<td>${history.bill }$</td>
<td>${history.comments }</td>
</tr>
</c:forEach>
</table>
</div>
</section><br><br>
<!-- footer -->
<%@include file="/footer.jsp" %>
</body>
</html>