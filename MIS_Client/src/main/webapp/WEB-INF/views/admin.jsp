<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
  
  <!-- Include jQuery -->
<script type="text/javascript" src="https://code.jquery.com/jquery-1.11.3.min.js"></script>

<!-- Include Date Range Picker -->
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/js/bootstrap-datepicker.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/css/bootstrap-datepicker3.css"/>

  
 <script>
	$(document).ready(function(){
		var date_input=$('input[name="joineddate"]'); //our date input has the name "date"
		var container=$('.bootstrap-iso form').length>0 ? $('.bootstrap-iso form').parent() : "body";
		date_input.datepicker({
			format: 'yyyy-mm-dd',
			container: container,
			todayHighlight: true,
			autoclose: true,
		})
	})
	$(document).ready(function(){
		var date_input=$('input[name="joineddate1"]'); //our date input has the name "date"
		var container=$('.bootstrap-iso form').length>0 ? $('.bootstrap-iso form').parent() : "body";
		date_input.datepicker({
			format: 'yyyy-mm-dd',
			container: container,
			todayHighlight: true,
			autoclose: true,
		})
	})
</script>

  
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
        <li class="active"><a href="/MIS_Log_Client/list">Dashboard</a></li>
        <li><a href="/MIS_Log_Client/emphome">Employee </a></li>
        <li ><a href="/MIS_Log_Client/depthome">Department </a></li>
        <li ><a href="/MIS_Log_Client/prohome">Project </a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
      </ul>
    </div>
  </div>
</nav>
<div class="container-fluid">
		<div class="col-md-12 col-sm-12 col-lg-12 col-xs-12">
			<div class="card">
				<div class="card-header bg-secondary text-white">
					<h4 class="card-title">
						<b>Employee Management Screen</b>
					</h4>
				</div>
				<div class="card-body mt-3">

					<p align="center">
						<strong> Active Employee List</strong>
					</p>
           <form:form action="search1" method="post">

						<table>
							<tr>

								<td>Search By Date:</td>
								<td><input type="text" path="joineddate" id="joineddate"
									name="joineddate" /></td>
								<td><input type="submit" value="Search"></td>
							</tr>
						</table>

					</form:form> 
				

						<div style="margin-top: 20px"
							class="table-responsive">
							<table class="table table-bordered">
								<thead>
									<tr class="bg-secondary text-white">
										<th>EmployeeID</th>
										<th>Name</th>
										<th>Description</th>
										<th>Date of Join</th>
										<th>Resign Date</th>
										<th>Active Flag</th>
										 
									</tr>
								</thead>
								<tbody>


									<c:forEach var="employee1" items="${listEmpbydateAct1}">
										<tr>
											<td>${employee1.sid}</td>
											<td>${employee1.sname}</td>
											<td>${employee1.sdescription}</td>
											<td>${employee1.sjoineddate}</td>
											<td>${employee1.sresigneddate}</td>
											<td>${employee1.sactiveflag}</td>
										
										</tr>
									</c:forEach>
							</table>
						</div>

						<p align="center">
							<strong>Resigned Employee List</strong>
						</p>

						<form:form action="search2" method="post">

							<table>
								<tr>
									<td>Search By Date:</td>
									<td><input type="text" path="joineddate" id="joineddate1"
										name="joineddate" /></td>
									<td><input type="submit" value="Search"></td>
								</tr>
							</table>

						</form:form>
							<div style="margin-top: 20px"
								class="table-responsive">
								<table class="table table-bordered">
									<thead>
										<tr class="bg-secondary text-white">
											<th>EmployeeID</th>
											<th>Name</th>
											<th>Description</th>
											<th>Date of Join</th>
											<th>Resign Date</th>
											<th>Active Flag</th>
											 
										</tr>
									</thead>
									<tbody>


										<c:forEach var="employee2" items="${listEmpbydateAct2}">
											<tr>
											<td>${employee2.sid}</td>
											<td>${employee2.sname}</td>
											<td>${employee2.sdescription}</td>
											<td>${employee2.sjoineddate}</td>
											<td>${employee2.sresigneddate}</td>
											<td>${employee2.sactiveflag}</td>
 
											</tr>
										</c:forEach>
								</table>
							</div>
				</div>
			</div>
			
			
			</div>
			</div>
</body>
</html>
	 