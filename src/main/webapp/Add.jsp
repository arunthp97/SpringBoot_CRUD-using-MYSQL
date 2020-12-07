<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<br>
<h1 align="center"> Add Product </h1>
<br>
<hr>
<form action="add_product" method="post" cellspacing="10px" style="border:2px solid black;text-align: center;">
<table align="center" cellspacing="10px" style="text-align: center;border:3px solid black">
<tr><th>Product_Name : </th><td><input type="text" name="product_name" required></td></tr>
<tr><th>product_Quantity : </th><td><input type="number" name="product_quantity" required></td></tr>
<tr><th>Product_Price : </th><td><input type="number" name="product_price" required></td></tr>
<tr><th><input type="reset"></th><td><input type="submit" value="Add"></td></tr>
</table>
</form>
<hr>
</body>
</html>