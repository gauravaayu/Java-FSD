<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.Flyaway.Booking" %>
<%@ page import="com.Flyaway.Search" %>
<%
    Booking.passenger_name = request.getParameter("pname");
    Booking.passenger_email= request.getParameter("email");
    Booking.passenger_phone= request.getParameter("phone");
    if (Booking.passenger_name.equals("")
            || Booking.passenger_email.equals("")
            || Booking.passenger_phone.equals("")) {
        out.println("Please enter valid passenger details");
    }
    else {
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <link rel="stylesheet" href="${pageContext.request.contextPath}/style.css">
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
            background-color:gray;
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
                    <h1 align="center" style="color:whitesmoke;"><b>Payment</b></h1>
                    <p align="center" style="color:whitesmoke;"><span><strong>Enter Payment Details</strong></span></p><br>
                </div>
            </div>
           <section class="col-sm-6 col-md-3">
               <form action="${pageContext.request.contextPath}/e_ticket.jsp" method="post" class="form-container">
                   <div class="form-group">
                       <label for="card_details">Name on Card</label>
                       <input type="text" class="form-control" id="name_on_card" name="name_on_card" placeholder="Enter Name on Card">
                   </div>
                   <div class="form-group">
                       <label for="card_details">Card Number</label>
                       <input type="number" class="form-control" id="card_details" name="card_details" placeholder="Enter Card Number">
                   </div>
                   <br>
                   <p align="left"><span><strong>Total fare = <br> <%=Booking.ticket_price%> X <%=Search.persons%> persons = Rs.<%=Booking.ticket_price*Search.persons%></strong></span></p>
                   <button type="submit" class="btn btn-success btn-block" value="Submit">Confirm Payment</button>
               </form>
          </section>
        </section>
    </section>

</body>
</html>
<%
    }
%>