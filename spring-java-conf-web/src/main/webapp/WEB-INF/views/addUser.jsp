<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
			<h1 class="text-danger">Add New user</h1>
			<a href="viewAllUsers" class="btn btn-primary">View All Users</a>
			<a href="home" class="btn btn-warning">Go To Home</a>
				<form class="form-group" action="./saveUser" method="post">

					<label for="userName" class="text-primary">
					Please Enter Your Name: </label>
					<input class="form-control" type="text" name="userName"
					 placeholder="please enter your name here"
					 title="Must contain at least 6 letters"
					 required/> 
					<br>
					 
					<label for="password" class="text-primary">
					Please Enter Your Password: </label>
					<input class="form-control" type="password" name="password"
					 placeholder="please enter your password here" 
					 pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
					 title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" 
					 required/>
					 <br>
					 
					<label for="email" class="text-primary">
					Please Enter Your Email Id: </label>
					<input class="form-control" type="email" name="email" 
					placeholder="please enter your email id here" 
					required/>
					<br>
					<input type="submit" class="btn btn-primary" value="Save User">
				</form>
			</div>
		</div>
	</div>
</body>
</html>