<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%! String pname,category, quantity,price; %>     
<%     
pname = request.getParameter("pname");     
category = request.getParameter("category"); 
quantity = request.getParameter("quantity"); 
price= request.getParameter("price"); 
%>   
<center>
<P>     
<h2><B>You have provided the following 
info</B>: </h2>    
<P>   
<B>Product Name</B>: <%= pname %><P>     
<B>Product Category</B>: <%= category %> <p>  
<B>Product Quantity</B>: <%= quantity %> <p>
<B>Product Price</B>: <%= price %> <p> 
</center>
</body>
</html>