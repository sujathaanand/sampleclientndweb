<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

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
        <li><a href="/MIS_Log_Client/emphome">Employee</a></li>
        <li class="active"><a href="/MIS_Log_Client/depthome">Department  </a></li>
        <li><a href="/MIS_Log_Client/prohome">Project  </a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
      </ul>
    </div>
  </div>
</nav>
	     <body>
		 <div class="container" style="margin-top: 100px">
			<div class="col-md-12">
				<div class="card">
					<div class="card-header">
						<h4 class="card-title">
							<strong>Department Registration</strong>
						</h4>
					</div>
					                     
					<div class="card-body">
							<form role="form" action="deptcreate" method="post" id="form1">

							<div class="form-row">
								<div class="form-group col-md-12">
								  <label for="empid">Employee ID</label>
								  <input type="text" class="form-control" name="empid" id="empid" placeholder="Employee ID" required>
								</div>
								<div class="form-group col-md-12">
								  <label for="deptname">Department Name</label>
								  <input type="text" class="form-control" name="deptname" id="deptname" placeholder="Department Name" required>
								</div>
								<div class="form-group col-md-12">
								  <label for="deptid">Department ID</label>
								  <input type="text" class="form-control" name="deptid"  id="deptid" placeholder="Department ID" required>
								</div>
						
							</div>
							
							
						
						<div class="text-center">
							 <button type="submit" form="form1" value="Submit" class="btn btn-success">Save</button>
							  <button type="submit" value="Submit" class="btn btn-danger"><a href="/Employee_Client/depthome" style="color:white;text-decoration:none;">Cancel</a></button>
							  
						</div>
					
                    </div>     
                </div>       
			</div>
					
		</div>
		 </body>
</html>