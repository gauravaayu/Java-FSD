<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style >
div{
text-align: center;
font-family: "Roboto", sans-serif;
  width:650px;
  margin:30px auto;
  background:linear-gradient(to right, #ffffff 0%, #fafafa 50%, #ffffff 99%);
  border-radius: 10px;
   padding:10px 40px;
   font-weight: bold;
   background-color: #EFF0F1;
  border-top-left-radius: 10px;
  border-top-right-radius: 10px;

}
body{
background:linear-gradient(to right, #78a7ba 0%, #385D6C 50%, #78a7ba 99%);
}

</style>
</head>
<body bgcolor="silver">
<div>
<h1>Update Product</h1>

<form action="Update">
<h3>Id :<input type="text" name="id" placeholder="please enter integer values"><br><br></h3>
<h3>Name :<input type="text" name="name" placeholder="Enter the name of product"><br><br></h3>
<h3>price :<input type="text" name="price" placeholder="Enter the price"><br><br></h3>
<h3>AddedDate :<input type="date" name="date" placeholder="Enter the date"><br><br></h3>
<button type="submit">Submit</button>
</form><br><br>
</div>
</body>
</html>