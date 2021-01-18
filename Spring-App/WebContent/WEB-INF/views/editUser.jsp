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
		User Name : <input type="text" name="userName" value="${user1.userName}" readonly="readonly" /> 
		<br>
		Password :	<input type="password" name="password" value="${user1.password}" />
		<br> 
		<input type="submit" class="btn btn-primary" value="Update User">
	</form>
</body>
</html>