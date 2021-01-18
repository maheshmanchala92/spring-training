<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List"%>
<%@ page import="com.training.springexample.model.User"%>
<!DOCTYPE html>
<%-- <% List<User> users = (List<User>)request.getAttribute("allUsers");%> --%>
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
/* table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
} */
</style>
<script type="text/javascript">
function deleteUsr (userName){
	 $.ajax({  
         url: "http://localhost:8080/Spring-App/deleteUser?userName="+userName ,  
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
<!-- reading from modelandview object -->
	<table>
		<tr>
			<th>No.</th>
			<th>UserName</th>
			<th>Password</th>
			<th>User Actions</th>
		</tr>
		<c:forEach items="${allUsers}" var="empl" varStatus="status">
			<tr>
				<td>${status.count}</td>
				<td><c:out value="${empl.userName}" /></td>
				<td><c:out value="${empl.password}" /></td>
				<td>
				<a class= "btn btn-success" href= "editUser?userName=${empl.userName}">Edit</a>
				 / <a class= "btn btn-danger" href="javascript:deleteUsr('${empl.userName}');" >Delete</a>
				</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>