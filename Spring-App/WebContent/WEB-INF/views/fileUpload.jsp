<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Upload file</title>
</head>
<body>
	<form action="./saveFile" method="post" enctype="multipart/form-data">
		<label for="file">Please select your resume :</label><br>
		<input type="file" name="file" /><br>
		<input type="submit" value="Upload" />
	</form>
	
</body>
</html>