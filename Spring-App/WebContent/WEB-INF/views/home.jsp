<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<title>Home Page</title>
</head>
<body>
	<h1 class="container text-primary">Home Page</h1>
	<div class="container bg-light">
		<div class="row">
			<div class="col-6">
				<form class="form-group" action="./sendUserName" method="post">
					<br> Please Enter Your Name: 
					<input class="form-control" type="text" name="userName" placeholder="please enter your name here"/> 
					<br> Please Enter Your Password: 
					<input class="form-control" type="password" name="password" /> <br>
					<input type="submit" class="btn btn-primary" value="Save User">
				</form>
			</div>
		</div>
		<div class="row">
			<div class="col-3">
				<a class="btn btn-warning" href="./second">File Upload Page</a> 
			</div>
			<div class="col-3">
				<a class="btn btn-secondary" href="./getAllUsersFromDb">GET ALL USERS</a>
			</div>
			<div class="col-3">
				<a class="btn btn-secondary" href="getAllFiles" >Get All Files from DB</a>
			</div>
		</div>
	</div>
</body>
</html>