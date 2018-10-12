<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#username").click(function() {
			$("#invalidCredentials").text("");
		});

	});
</script>
</head>
<body>
	<div class="container">
		<div id="loginbox" style="margin-top: 50px;"
			class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
			<div class="panel panel-success">
				<div class="panel-heading">
					<div class="panel-title">Sign In</div>
					<div
						style="float: right; font-size: 80%; position: relative; top: -10px">
						<a href="#">Forgot password?</a>
					</div>
				</div>
				<form role="form" action="login" method="post" id="form1">
					<div style="padding-top: 30px" class="panel-body">

						<div style="display: none" id="login-alert"
							class="alert alert-danger col-sm-12"></div>


						<div style="margin-bottom: 25px" class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-user"></i></span> <input id="username"
								type="text" class="form-control" name="username"
								placeholder="username " required>
						</div>

						<div style="margin-bottom: 25px" class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-lock"></i></span> <input id="password"
								type="password" class="form-control" name="password"
								placeholder="password" required>
						</div>
						<label id="invalidCredentials">${invalid}</label>
						<div  class="form-group">
							<!-- Button -->

							<div class="col-sm-12 controls">
							<div class="text-center">
								<button type="submit" form="form1" class="btn btn-success"
									onclick="myFunction()">Submit</button>
                               <button type="button" class="btn btn-danger"  onClick="window.location.reload()">Cancel</button> 
							
							</div>
							</div>
						</div>
				</form>

				<div class="form-group">
					<div class="col-md-12 control">
						<div
							style=" padding-top: 15px; font-size: 85%">
							Don't have an account! <a href="/MIS_Client/add1"> Sign Up
								Here </a>
						</div>
					</div>
				</div>




			</div>
		</div>
	</div>




	</div>
	</div>

</body>
</html>