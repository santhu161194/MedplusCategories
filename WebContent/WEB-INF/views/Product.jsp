<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
.red{
color:red;

}
.body .form{
float:left;
clear:both;
}
th, td {
    text-align: left;
    padding: 8px;
}    


</style>
</head>
<body>
<s:form commandName="productModel" action="addproduct" method="post">
<h2 id="id1" align="center">Medplus Categories</h2>

	<div id="id2">
		<h3 align="center">Add New Product Form</h3>
		</div>

<table align="center">
<tr><td>Enter ProductId</td><td><s:input path="productId" cssClass="form" required="true"/></td><td></td></tr>
<tr><td>Enter Productname</td><td><s:input path="productName" cssClass="form" required="true"/></td><td></td></tr>
<tr><td>Enter Manufacturer</td><td><s:input path="manufacturer" cssClass="form" required="true"/></td><td></td></tr>
<tr><td>Enter DateOfExpiry</td><td><s:input path="dateOfExpiry" cssClass="form" required="true"/></td><td></td></tr>
<tr><td>Enter Price</td><td><s:input path="price" cssClass="form" required="true"/></td><td></td></tr>

</table>
	<div align="center">
 	<input type="submit" value="Submit">
	</div>


<a href="home">Return to home</a>
</s:form>


</body>
</html>