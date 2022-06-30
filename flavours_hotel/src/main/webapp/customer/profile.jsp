<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <!-- Font awesome -->
    <%@include file="../fontawesome/fontawesome.jsp" %>
 <!-- BootStrap css and JavaScript links -->
    <%@include file="../bootstrap_links.jsp" %>
<title>Insert title here</title>
<style>  
h4 
{  
text-indent: 1em;  
}  
.tab1 {   
            tab-size: 2;   
        }  
</style> 
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
      <div class="container-fluid container">
        <a class="navbar-brand" href="#">Hotel RevaturePro</a>
        <button
          class="navbar-toggler"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#navbarNavDropdown"
          aria-controls="navbarNavDropdown"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavDropdown">
          <ul class="navbar-nav ms-auto">
            <li class="nav-item">
              <a class="nav-link active" aria-current="page" href="/customer/user-dashboard">Home</a>
            </li>
            <!-- <li class="nav-item">
              <a class="nav-link" href="login.jsp">Available Rooms</a>
            </li> -->
            <!-- <li class="nav-item">
              <a class="nav-link" href="#">Features</a>
            </li> -->
            <li class="nav-item">
              <a class="nav-link" href="/pricing">Pricing</a>
            </li>
            <li class="nav-item dropdown">
              <a
                class="nav-link dropdown-toggle"
                href="#"
                id="navbarDropdownMenuLink"
                role="button"
                data-bs-toggle="dropdown"
                aria-expanded="false"
              >
                Features
              </a>
              <ul
                class="dropdown-menu bg-dark text-white p-1"
                aria-labelledby="navbarDropdownMenuLink"
              >
                <li><i class="fa-solid fa-wifi"></i> Seamless Internet</li>
                <li><i class="fas fa-tv"></i> Tv</li>
                <li>
                  <i class="fa fa-cutlery" aria-hidden="true"></i> Restaurent
                </li>
                <li>
                 <i class='fas fa-swimmer'></i> Swimming Pool
                </li>
                <li>
                 <i class='fas fa-heartbeat'></i> Exercise Facilities
                </li>
                <li>
                  <i class="fa fa-plus" aria-hidden="true"></i> Many more
                </li>
              </ul>
            </li>
            <li class="nav-item">
            <a class="nav-link" href="#">About</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>
<br><br>
<h4 class="text-center text-success">${success }</h4>
<div class="container bg-primary p-5 text-light">
<form action="/customer/updateCustomerProfile" method="post">
<div class="p-1">
<h4><span><label>Name&emsp;&emsp;&emsp;:</label>
<input class="text-white bg-primary h4 border-0" value='${customer.userName }' name="userName">
<a type="button"><i class="fas fa-edit"></i></a>
</span></h4>
</div>
<div class="p-1">
<h4><span><label>Mobile No&ensp;&nbsp;:</label>
<input class="text-white bg-primary h4 border-0" value=${customer.mobileNumber } name="mobileNumber"> 
<a type="button"><i class="fas fa-edit"></i></a>
</span></h4>
</div>
<div class="p-1">
<h4><span><label>Email ID&emsp;&emsp;:</label>
 ${customer.userEmail }
 <input hidden value=${customer.userEmail } name="userEmail">
</span></h4>
</div>
<div class="p-1">
<h4><label>ID Proof&emsp;&emsp;:</label> ${customer.idProof }</h4>
</div>
<div class="p-1">
<h4><label>ID Proof No&nbsp;:</label> ${customer.idProofNumber }</h4>
</div>
<div class="p-1">
<h4><span><label>Address&emsp;&emsp;:</label>
<input class="text-white bg-primary h4 border-0"  value='${customer.address }' name="address">
<a type="button"><i class="fas fa-edit"></i></a>
</span></h4>
</div>
<div class="pl-5">
<button type="submit" class="btn btn-warning">Save Changes</button>
</div>
</form>
</div>
<br><br>
<%@include file="../footer.jsp" %>
</body>
</html>