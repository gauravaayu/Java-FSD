<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.fly.Login"%>
<% Login.isLoggedIn = false; %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <link rel="stylesheet" href="${pageContext.request.contextPath}/style.css">
    <link rel = "shortcut icon" type = "image/png" href = "img/favicon.png">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<style>
        body,h1,h2,h3,h4,h5,h6 {font-family: "Raleway", sans-serif}
        body, html {
            height: 100%;
            line-height: 1.8;
        }
        .bgimg-1 {
            background-position: center;
            background-size: cover;
            background-image: url("img/plane.png");
            min-height: 100%;
        }
        .w3-bar .w3-button {
            padding: 16px;
        }
    </style>
<title>Flyaway</title>
</head>
<body>

    <section class="container-fluid bg">
        <section class="row justify-content-center">
            <div class="row">
                <div class="col">
                    <h2 align="center" style="color:whitesmoke;"><b> Admin Login</b></h2>
                    <br>
                </div>
            </div>
            <section class="col-sm-6 col-md-3">
                <form action="login" method="post" class="form-container">
                    <div class="form-group mb-2">
                        <label for="inputEmail" class="sr-only">Email address</label>
                        <input type="email" name="emailEntered" class="form-control" id="inputEmail" aria-describedby="emailHelp" placeholder="Enter email">
                        <br><small id="emailHelp" class="form-text text-muted">&nbsp;&nbsp;Email : gaurav@gmail.com</small>
                    </div>
                    <div class="form-group mx-sm-3 mb-2">
                        <label for="inputPassword" class="sr-only">Password</label>
                        <input type="password" name="passwordEntered" class="form-control" id="inputPassword" placeholder="Password">
                        <br><small id="passwordHelp" class="form-text text-muted">&nbsp;&nbsp; Current Password :&nbsp;<%= Login.password %></small>
                    </div>
                    <button type="submit" class="btn btn-success btn-block" value="Submit">Login</button>
                </form>
            </section>
        </section>
    </section>



</body>
</html>