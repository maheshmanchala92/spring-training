<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List"%>
<%@ page import="com.training.springexample.model.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<title>View All Files</title>
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
/* function deleteUsr (userName){
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
} */
</script>
</head>
<body>
<h1>View All Files</h1>
<!-- reading from modelandview object -->
	<table>
		<tr>
			<th>No.</th>
			<th>File Name</th>
			<th>User Actions</th>
		</tr>
		<c:forEach items="${allFileNames}" var="fileName1" varStatus="status">
			<tr>
				<td>${status.count}</td>
				<td><c:out value="${fileName1}" /></td>
				<td>
				<a class= "btn btn-success" href= "download?id=${status.count}">Download</a>
				</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>