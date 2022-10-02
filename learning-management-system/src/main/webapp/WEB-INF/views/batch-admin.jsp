<!DOCTYPE html>
<%@page import="com.technoelevate.lms.pojo.batch.Batch"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.*" %>

<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {box-sizing: border-box;}

body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.topnav {
  overflow: hidden;
  background-color: #e9e9e9;
}

.topnav a {
  float: left;
  display: block;
  color: black;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;
}

.topnav a.active {
  background-color: #2196F3;
  color: white;
}

.topnav input[type=text] {
  float: right;
  padding: 6px;
  margin-top: 8px;
  margin-right: 16px;
  border: none;
  font-size: 17px;
}

@media screen and (max-width: 600px) {
  .topnav a, .topnav input[type=text] {
    float: none;
    display: block;
    text-align: left;
    width: 100%;
    margin: 0;
    padding: 14px;
  }
  
  .topnav input[type=text] {
    border: 1px solid #ccc;  
  }
}
</style>
</head>
<body>

		<h1>Techno Elevate</h1>

<div class="topnav">
  <a class="active" href="#home">Home</a>
  <input type="text" placeholder="Search..">
</div>

<div style="padding-left:16px">
 
</div>
		<div>
		
		<a href="create-new-batch-page"> <input type="button" value="New Batch"  > </a>
		</div>
		
		<div>
		<table>
				<tr>
						<th>Batch No.</th>
						<th>Batch ID</th>
						<th>Batch Name </th>
						<th>Mentor Name</th>
						<th>Technologies</th>
						<th>Start Date</th>
						<th>End Date</th>
						<th>Status</th>
						<th>Action</th>
				</tr> 
				
				<% List<Batch> listt= (List<Batch>) request.getAttribute("list"); %>
				<% for(int i = 1; i < listt.size(); i++) { %>
				<tr> 
				
						<%-- <td> <%=i %></td> --%>
						<td> <%=listt.get(i).getBatchNo() %></td>
						<td> <%=listt.get(i).getBatchId() %> </td>
						<td> <%=listt.get(i).getName() %></td>
						<td> <%=listt.get(i).getMentor() %></td>
						
						<td> <%=listt.get(i).getStartDate() %></td>
						<td> <%=listt.get(i).getEndDate() %></td>
						<td> <%=listt.get(i).getStatus() %></td>
						<td> <a href="" >Edit</a>  <a href="" >Delete</a></td>			
				</tr>
				<%} %>
			
		</table></div>
		
		
</body>
</html>
