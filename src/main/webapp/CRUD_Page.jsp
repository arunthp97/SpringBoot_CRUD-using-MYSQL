<%@page import="com.example.demo.Products"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<br>
<h1>List Of Products</h1>
<h3><a href="add">Add_Product</a></h3>
<table cellspacing="10px" style="text-align: center;border:2px solid black;">
<tr><th>Product_Name</th><th>Product_Quantity</th><th>Product_Salary</th><th>Option 1</th><th>Option 2</th></tr>
<% List list=(ArrayList)request.getAttribute("product_list"); 
for(Object ss:list)
{
	Products products=(Products)ss;%>
	
	<tr><td><%=products.getProduct_name() %></td><td><%=products.getProduct_quantity() %></td><td><%=products.getProduct_price() %></td><td><a href="update?id=<%=products.getId()%>"><button>Update</button></a></td><td><a href="delete_product?id=<%=products.getId()%>"><button>Delete</button></a></td></tr>
	
	<%
}
%>
</table>
</center>
</body>
</html>