<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container bg-light">
		<div class="row">
			<div class="col-6">
			<h1 class="text-danger">Add Person</h1>
			<a href="viewAllUsers" class="btn btn-primary">View All Users</a>
			<a href="home" class="btn btn-warning">Go To Home</a>
				<form class="form-group" action="./savePerson" method="post">

					<label for="firstName" class="text-primary">
					Please Enter Your First Name: </label>
					<input class="form-control" type="text" name="firstName"
					 placeholder="please enter your first name here"
					 required/> 
					<br>
					
					<label for="lastName" class="text-primary">
					Please Enter Your Last Name: </label>
					<input class="form-control" type="text" name="lastName"
					 placeholder="please enter your last name here"
					 required/> 
					<br>
					
					<label for="age" class="text-primary">
					Please Enter Your Age: </label>
					<input class="form-control" type="number" name="age"
					 placeholder="please enter your age here"
					 required/> 
					<br>
					
					<label for="email" class="text-primary">
					Please Enter Your Email Id: </label>
					<input class="form-control" type="email" name="composite.email" 
					placeholder="please enter your email id here" 
					required/>
					
					<label for="pancardNo" class="text-primary">
					Please Enter Your Pan Number: </label>
					<input class="form-control" type="number" name="composite.pancardNo" 
					placeholder="please enter your Pan number here" 
					required/>
					<input type="submit" class="btn btn-primary"  value="Save Person">
				</form>
			</div>
		</div>
	</div>
</body>
</html>