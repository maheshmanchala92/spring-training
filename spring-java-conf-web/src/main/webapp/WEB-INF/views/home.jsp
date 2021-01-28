<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
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
	<h1>Hello World!</h1>
	<p>This is the homepage!</p>
	<a href="addUser" class="btn btn-success">Add New User(One To One, One To Many)</a>
	<a href="viewAllUsers" class="btn btn-primary">View All Users</a>
	<a href="addStudent" class="btn btn-warning">Add Student (Many To Many)</a>
	<a href="addPerson" class="btn btn-warning">Add Person (Composite key)</a>
	<a href="addEmployee" class="btn btn-warning">Add Employee (MappedSuperclass)</a>
	
</body>
</html>
