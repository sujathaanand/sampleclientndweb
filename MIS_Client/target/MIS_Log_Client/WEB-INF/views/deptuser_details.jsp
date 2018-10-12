<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
  <style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
    
    /* Add a gray background color and some padding to the footer */
    footer {
      background-color: #f2f2f2;
      padding: 25px;
    }
  </style>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li ><a href="/MIS_Log_Client/list">Dashboard</a></li>
        <li><a href="/MIS_Log_Client/emphome">Employee </a></li>
        <li class="active"><a href="/MIS_Log_Client/depthome">Department </a></li>
        <li ><a href="/MIS_Log_Client/prohome">Project </a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
      </ul>
    </div>
  </div>
</nav>
	 
		 
			  <!-- Default panel contents -->
		  <div class="card-header bg-secondary text-white">
					<h4 class="card-title">
						<b>Department Management Screen</b>
					</h4>
				</div>
				<div class="card-body mt-3"> 
					<p align="center">
						<strong>Department List</strong>
					</p>
				</div>
		  	<div class="tablecontainer">
			 <div class="table-responsive table-bordered">
				<table class="table table-hover table-bordered"> 
		    		<thead>
			      		<tr>
					        <th>Employee ID</th>
					        <th>Department Name</th>
					        <th>Department ID</th>
					        <th>Edit</th>
					        <th>Delete</th> 
						</tr>
			    	</thead>
		    		<tbody>
					<c:forEach items="${users}" var="user">
						<tr>
							<td>${user.empid}</td>
							<td>${user.deptname}</td>
							<td>${user.deptid}</td>
							<td><button type="button" class="btn btn-success"><a href="<c:url value='/deptedit/${user.deptid}'/>">Edit</a> </td>
							<td><button type="button" class="btn btn-danger"><a href="<c:url value='/deptdelete/${user.deptid}'/>">Delete</a></td>
							
						
						</tr>
					</c:forEach>
		    		</tbody>
		    	</table>
				</div>
		    </div>
		 
	 	<div>
	 		<button type="button" class="btn btn-warning"><a href="<c:url value='/deptadd' />">Add New User</a></button> 
	 	</div>
   	
  




</body>
</html>
