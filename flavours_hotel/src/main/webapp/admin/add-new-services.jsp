<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- Bootstrap css and JavaScript links -->
    <%@include file="../bootstrap_links.jsp" %>
</head>
<body class="align-items-ceter">
<!-- navbar -->
<%@include file="../navbar.jsp" %><br><br>
<h3 class="text-center text-danger">Add Services</h3>
<h4 class="text-success text-center">${success }</h4>
<h4 class="text-danger text-center">${failed }</h4>
<div class="container w-50 cjustify-content-center bg-primary text-white p-5">
<form action="/admin/addNewServices" method="post">

<div class="p-3">
<span class="form-label"><h4>Enter Service Name</h4></span>
<input class="form-control w-50" type="text" name="serviceName" required placeholder="Enter Service Name">
</div>
<div class="p-3">
<span class="form-label pt-3"><h4>Enter Service Price</h4></span>
<input class="form-control w-50" type="text" name="price" required placeholder="Enter Service Price">
</div>
<div class="d-flex justify-content-center pt-3">
<button class="btn btn-success" type="submit">Add Service</button>
</div>
</form>
</div><br><br>
<!-- </div> -->







<!-- footer -->
<%@include file="../footer.jsp" %>
</body>
</html>