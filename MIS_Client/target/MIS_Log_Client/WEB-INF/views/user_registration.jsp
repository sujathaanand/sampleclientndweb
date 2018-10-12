<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registration</title>
<meta name="viewport" content="width=device-width, initial-scale=1">


  <script type="text/javascript" src='https://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.3.min.js'></script>
<script type="text/javascript" src='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.0.3/js/bootstrap.min.js'></script>
<link rel="stylesheet" href='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.0.3/css/bootstrap.min.css'
    media="screen" />
</head>
<body>
	
		<form role="form" action="create" method="post" id="form1">
		<div id="loginbox" style="margin-top: 50px;"
			class="mainbox col-md-8 col-md-offset-2 col-sm-8 col-sm-offset-2">
		<div class="panel panel-success">
		
				<div class="panel-heading">
					<div class="panel-title">Sign Up</div>
					
				</div>
			<div class="panel-body">
			<div class="col-xs-12 col-sm-12 col-md-12" >
				<h2 class="form-signin-heading">
				   User-Registration</h2>
				<label>
					Username</label>
				<input name="username" type="text" id="username"  class="form-control" placeholder="Enter Username"
					required />
			  
				<label>
					Password</label>
				<input name="password" type="password" id="password" title="Password must contain: Minimum 8 characters atleast 1 Alphabet and 1 Number"
					class="form-control" placeholder="Enter Password" required pattern="^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{8,}$" /required>
				
				<label>
					Confirm Password</label>
				<input name="passwordconfirm" type="password" id="passwordconfirm" class="form-control"
					placeholder="Confirm Password" / required>
					
				<label>
					Role</label>
			   
			   <select class="form-control" name="rolename">
			  <option value="1">admin</option>
			  <option value="2">user</option>
			</select>
			   
			   
			   </form>
			   <div class="btn center-block">
								 <button type="submit" form="form1" class="btn btn-success" onclick="myFunction()">Save </button>
								  <button type="submit" class="btn btn-danger">Cancel </button>
							 </div>
			</div>
			</div>
			</div>
			</div>
			</div>

			<script type="text/javascript">
				window.onload = function () {
					var txtPassword = document.getElementById("password");
					var txtConfirmPassword = document.getElementById("passwordconfirm");
					txtPassword.onchange = ConfirmPassword;
					txtConfirmPassword.onkeyup = ConfirmPassword;
					function ConfirmPassword() {
						txtConfirmPassword.setCustomValidity("");
						if (txtPassword.value != txtConfirmPassword.value) {
							txtConfirmPassword.setCustomValidity("Passwords do not match.");
						}
					}
				}
				
				</script> 
				
				
			  <!--  function myFunction() {
					confirm("your data is sucessfully inserted!");
				}   -->
				


			</body>
			</html>