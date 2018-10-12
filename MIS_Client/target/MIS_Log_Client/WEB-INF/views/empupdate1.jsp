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
        <li class="active"><a href="/MIS_Log_Client/emphome">Employee </a></li>
        <li><a href="/MIS_Log_Client/depthome">Department </a></li>
        <li><a href="/MIS_Log_Client/prohome">Project</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
      </ul>
    </div>
  </div>
</nav>

<div class="container" style="margin-top: 100px">
			<div class="col-md-12">
				<div class="card">
					<div class="card-header">
						<h4 class="card-title">
							<strong>Employee Update</strong>
						</h4>
					</div>
					                     
	<div class="card-body">
						
		<form action="/MIS_Log_Client/empupdate" method="post" id="form1">
			<c:forEach items="${users}" var="user">
				<div class="form-row">
								<div class="form-group col-md-6">
								  <label for="emplId">Employee ID</label>
								  <input type="text" class="form-control" name="emplId" tabindex="4" id="emplId" value="${user.emplId}">
								</div>
								<div class="form-group col-md-6">
								  <label for="emplName">Employee Name</label>
								  <input type="text" class="form-control" name="emplName" tabindex="4" id="emplName" value="${user.emplName}">
								</div>
						
							</div>
							<div class="form-row">
								<div class="form-group col-md-6">
								  <label for="joinedDate">Joined Date</label>
								  <input type="Date" class="form-control" name="joinedDate" tabindex="4" id="joinedDate" value="${user.joinedDate}">
								</div>
								<div class="form-group col-md-6">
								  <label for="resignedDate">Resigned Date</label>
								  <input type="Date" class="form-control" name="resignedDate" tabindex="4" id="resignedDate" value="${user.resignedDate}">
								</div>
						
							</div>
							
							<div class="form-row">
								<div class="form-group col-md-6">
								  <label for="description">Description</label>
								  <input type="text" class="form-control" name="description" id="description" tabindex="4" value="${user.description}">
								</div>
								<div class="form-group col-md-6">
								  <label for="activeFlag">Active Flag</label>
									<select class="form-control input-sm" name="activeFlag" id ="activeFlag" tabindex="4" value="${user.activeFlag}">
										<option value=""  disabled selected>Select your option</option>
										<option name="one" id="one">1</option>
										<option name="two" id="two">2</option>
										<option name="three" id="three">3</option>
									</select>
								</div>
						
							</div>
			</c:forEach>
			
				</div>
			</div>
	 	</div>
	</div>
					</form>
		 <div class="btn center-block">
					 <button type="submit" form="form1" value="Submit" class="btn btn-primary">Update</button> 
					  <button type="submit" value="Submit" class="btn btn-danger">
							  <a href="/MIS_Log/Client/emphome" style="color:white;text-decoration:none;">Cancel</a> </button>
				</div>
				
				
</body>
</html>
