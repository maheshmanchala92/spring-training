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
			<h1 class="text-danger">Add Student</h1>
			<a href="viewAllUsers" class="btn btn-primary">View All Users</a>
			<a href="home" class="btn btn-warning">Go To Home</a>
				<form class="form-group" action="./saveStudent" method="post">

					<label for="studentName" class="text-primary">
					Please Enter Your Name: </label>
					<input class="form-control" type="text" name="studentName"
					 placeholder="please enter your name here"
					 title="Must contain at least 6 letters"
					 required/> 
					<br>
					<c:forEach items="${allCourses}" var="course" >
						<input type="checkbox" name="course" value="${course.cid}" />
						<label for="course">${course.cName}</label><br>
					</c:forEach>
					<input type="submit" class="btn btn-primary"  value="Save Student">
				</form>
			</div>
		</div>
	</div>
</body>
</html>