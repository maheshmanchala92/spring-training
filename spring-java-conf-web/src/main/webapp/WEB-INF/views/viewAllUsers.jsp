<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List"%>
<%@ page import="com.training.spring.spring_java_conf_web.model.UserDetails"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<title>View All Users</title>
<style>
table {
  border-collapse: collapse;
  border: 1px solid #dddddd;
  width: 100%;
}
td,th{
border: 1px solid #aaaaaa;
}
</style>
<script type="text/javascript">
function deleteUsr(userId){
	 $.ajax({  
         url: "http://localhost:8080/spring-java-conf-web/deleteUser?userId="+userId,  
         type: 'DELETE',  
         crossDomain: true,
         success: function (data) { 
        	 location.reload(); 
             console.log(data);  
         },  
         error: function (errorThrown) {  
        	 location.reload();
             console.log('Error in Operation'+errorThrown);  
         }  
     }); 
} 
</script>
</head>
<body>
<h1>View All Users</h1>
<a href="addUser" class="btn btn-success" >Add new user</a>
<a href="home" class="btn btn-primary">Go To Home</a>
<!-- reading from modelandview object -->
	<table>
		<tr>
			<!-- <th>No.</th> -->
			<th>User Id</th>
			<th>UserName</th>
			<th>Password</th>
			<th>Email</th>
			<th>User Actions</th>
		</tr>
		<c:forEach items="${allUsers}" var="user" > <!-- varStatus="status"> -->
			<tr>
				<%-- <td>${status.count}</td> --%>
				<td><c:out value="${user.userId}" /></td>
				<td><c:out value="${user.userName}" /></td>
				<td><c:out value="${user.password}" /></td>
				<td><c:out value="${user.email}" /></td>
				<td>
				<a class= "btn btn-success" href= "editUser?userId=${user.userId}">Edit</a>
				 / <a class= "btn btn-danger" href="javascript:deleteUsr(${user.userId});" >Delete</a>
				</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>