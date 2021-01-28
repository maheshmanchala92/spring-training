<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container bg-light">
		<div class="row">
			<div class="col-6">
				<h1 class="text-danger">Add Person</h1>
				<a href="viewAllUsers" class="btn btn-primary">View All Users</a>
				<a href="home" class="btn btn-warning">Go To Home</a>
				<form class="form-group" action="./saveEmployee" method="post">

					<label for="name" class="text-primary"> Please Enter
						Your Name: </label> <input class="form-control" type="text"
						name="name" placeholder="please enter your name here"
						required /> <br>
					<label for="gender" class="text-primary"> Please Enter Your
						Gender: </label> <input class="form-control" type="Text" name="gender"
						placeholder="please enter your gender here" required /> <br> <label
						for="email" class="text-primary"> 
						Please Enter Your Email
						Id: </label> <input class="form-control" type="email"
						name="email"
						placeholder="please enter your email id here" required /> 
						<label
						for="salary" class="text-primary"> Please Enter Your
						Salary: </label> <input class="form-control" type="number"
						name="salary"
						placeholder="please enter your Salary here" required />

					<input type="submit" class="btn btn-primary" value="Save Employee">
				</form>
			</div>
		</div>
	</div>
</body>
</html>