<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
		margin-top:50px;
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
<div class="container container-control">
		 
			<div class="panel-heading">
				<h4 class="card-title">
						<b>Update Project </b>
					</h4>
				<form action="/MIS_Log_Client/proupdate" method="post" id="form1">
					<c:forEach items="${users}" var="user">
						<div class="row">
							<div class="form-group col-md-6">
								<label>Employee Id</label> <input type="text" name="emplId" id="emplId"
									class="form-control " placeholder="emplId" tabindex="4"
									value="${user.emplId}">
							</div>
							<div class="form-group col-md-6">
								<label>Billing</label> <input type="text" name="billing"
									id="billing" class="form-control " placeholder="billing"
									tabindex="4" value="${user.billing}">
							</div>
						</div>
						<div class="row">	
							
							<div class="form-group col-md-6">
								<label>Project Id Name</label> <input type="text" name="projectid"
									id="projectid" class="form-control " placeholder="projectid"
									tabindex="4" value="${user.projectid}">
							</div>
							<div class="form-group col-md-6">
								<label>Project Name</label> <input type="text" name="projectName" id="projectName"
									class="form-control " placeholder="projectName" tabindex="4"
									value="${user.projectName}">

							</div>
						</div>
						<div class="row">
							<div class="form-group col-md-6">
								<label>Remark</label> <input type="text" name="remarks"
									id="remarks" class="form-control " placeholder="remarks"
									tabindex="4" value="${user.remarks}">
							</div>
					
							
							<div class="form-group col-md-6">
								<label>Utilized Percentage</label> <input type="text" name="utilizedper"
									id="utilizedper" class="form-control " placeholder="utilizedper"
									tabindex="4" value="${user.utilizedper}">
							</div>
						</div>
					</c:forEach>
				</form>
				<div class="text-center">
					<button type="submit" form="form1" value="Submit" class="btn-primary">Update</button>
					<button type="submit"   class="btn-danger"><a href="/MIS_Log_Client/prohome" style="text-decoration:none;color:white;">Cancel</a></button>
				</div>
			</div>
		 
	</div>
</body>
</html>