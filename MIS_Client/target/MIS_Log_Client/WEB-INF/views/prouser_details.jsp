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
	.container-control{
		margin-top:100px;
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
        <li><a href="/MIS_Log_Client/depthome">Department </a></li>
        <li class="active"><a href="/MIS_Log_Client/prohome">Project</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
      </ul>
    </div>
  </div>
</nav>

 
		<div class="panel panel-default">
			  <!-- Default panel contents -->
		  	<div class="card-header bg-secondary text-white">
					<h4 class="card-title">
						<b>Project Management Screen</b>
					</h4>
				</div>
				<div class="card-body mt-3"> 
					<p align="center">
						<strong>Project List</strong>
					</p>
				</div>
		  	<div class="tablecontainer">
				<table class="table table-hover table-bordered">
		    		<thead>
			      		<tr>
					        <th>Employee ID</th>
					        <th>Billing</th>
					        <th>Project ID</th>
					        <th>Project Name</th>
					        <th>Utilized Percentage</th>
					        <th>Remarks</th>
					     
					       	<th align="center">Edit</th> 
							<th align="center">Delete</th> 
						</tr>
			    	</thead>
		    		<tbody>
					<c:forEach items="${users}" var="user">
						<tr>
							<td>${user.emplId}</td>
							<td>${user.billing}</td>
							<td>${user.projectid}</td>
							<td>${user.projectName}</td>
							<td>${user.utilizedper}</td>
							<td>${user.remarks}</td>
						 
							<td><button type="submit" form="form1" value="Submit" class="btn-success"><a href="<c:url value='/proedit/${user.projectid}' />">Edit</a> </button> </td>
							<td><button type="submit" form="form1" value="Submit" class="btn-danger"><a href="<c:url value='/prodelete/${user.projectid}'/>">Delete</a></button></td>
							
						
						</tr>
					</c:forEach>
		    		</tbody>
		    	</table>
		    </div>
		</div>
	 	<div>
	 		<button type="submit" form="form1" value="Submit" class="btn-warning"><a href="<c:url value='/proadd' />">Add New User</a></button>
	 	</div>
    
</body>
</html>