<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="j"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
#frame{
float:left;
clear:both;
position:relative;
left:200px;
bottom:300px;
}

</style>
</head>
<body>
<div class="container">
	<h2 align="center">EMPLOYEE INFORMATION</h2>
	<j:out  value=" ${status}"></j:out>
	<j:if test="${status}.equals(null)">
		<jsp:forward page="login"></jsp:forward>
	</j:if>
	 <!-- style="width: 30%"> -->
	<div style="border: 1px double; padding: 10px; width: 60%; margin: auto;">
		<h3 align="center">Home Page</h3>
		<h4><font color="green"> Welcome <j:out value="${userid}"></j:out></font></h4>
		<br>
		
		<div style="margin-left:350px;">
			<div align="left"> <a>View Departments</a></div><br>
			<div align="left"><a>View Employee</a></div><br>
			
			<div align="left"><a>Add Department</a></div><br>
			<div align="left"><a href="addproduct">Add Product</a></div><br>
			
			<div align="left"><a href="invalidate">Logout</a></div><br>
			
		</div>
		
		 
		


	</div>
<!-- <iframe id="frame" src="viewDept" align="right" width="1000px" height="700px"></iframe> --> 
	</div>

</body>
</html>