<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create New Batch</title>
</head>
<body>
	<form action="save-batch" method="post">

		<label> Batch Name</label> <br> <input type="text" name="name">
		<br> <label>Mentor Name</label> <br> <input type="text"
			name="mentor"> <br> <label>Techologies</label> <br>
			
		<input type="checkbox" value="Java+Spring Boot"  > <label>Java+Spring Boot</label> <br>
		<input type="checkbox" value="Spring MVC">  <label>Spring MVC</label><br> <input
			type="checkbox" value="React Js">  <label>React JS</label><br> <input
			type="checkbox" value="Angular JS"> <label>Angular JS</label> <br>
			
			<label>Start Date</label>
			<input type="date" name="startDate"  > <br>
			<label>End Date</label>
			<input type="date" name="endDate"> <br>
			
			<input type="submit" value="Create"  >
			






	</form>
</body>
</html>