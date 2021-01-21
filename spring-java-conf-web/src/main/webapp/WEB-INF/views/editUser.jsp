<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<title>Edit User</title>
</head>
<body>
	<h2>Edit User Page</h2>
	<form action="./updateUser" method="post">
	
	<label for="userId" class="text-primary">
					User Id: </label>
					<input class="form-control" type="text" name="userId" 
					value="${user.userId}" readonly="readonly"
					 required/> 
					<br>
		<label for="userName" class="text-primary">
					Please Update User Name: </label>
					<input class="form-control" type="text" name="userName" 
					value="${user.userName}"
					 placeholder="please enter your name here"
					 title="Must contain at least 6 letters"
					 required/> 
					<br>
					 
					<label for="password" class="text-primary">
					Please Update Password: </label>
					<input class="form-control" type="password" name="password"
					value="${user.password}"
					 placeholder="please enter your password here" 
					 pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
					 title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" 
					 required/>
					 <br>
					 
					<label for="email" class="text-primary">
					Please Update Email Id: </label>
					<input class="form-control" type="email" name="email" 
					value="${user.email}"
					placeholder="please enter your email id here" 
					required/>
		<input type="submit" class="btn btn-primary" value="Update User">
	</form>
</body>
</html>