<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.Flyaway.Search" %>
<%@ page import="com.Flyaway.Booking" %>
<%
    Booking.name_on_card = request.getParameter("name_on_card");
    Booking.card_details = request.getParameter("card_details");
    if (Booking.name_on_card.equals("") || Booking.card_details.equals("")) {
        out.println("Please enter valid card details");
    }
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
      <style>
        body,h1,h2,h3,h4,h5,h6 {font-family: "Raleway", sans-serif}
        body, html {
            height: 100%;
            line-height: 1;
            
        }
        
       
        .container{
        	 align-items: center;
        
        }
    </style>
<title>Flyaway-Ticket</title>
</head>
<body>
    <div class="container">
        <h2 align="center"><span><strong>E-TICKET</strong></span></h2>
        <p align="center"><span><strong> Congratulation !!! Your ticket has been booked.</strong></span></p>
        <h3 align="left"><b>Flight Details</b></h3>
        <p>---------------------------------------------------</p>
        <h4><strong> Source:-</strong> <%=Search.source%> </h4>
        <h4> <strong> Destination:-  </strong><%=Search.destination%></h4>
        <h4> <strong> Travel Date:-</strong> <%=Search.date%> (Days-<%=Search.day%>)</h4>
       <h4 align="left"><b>Flight Number:- </b><%=Booking.flight_booking_id%> <br><b>Airline Name:-</b> <%=Booking.flight_name%> <br><b>Number of Passenger:-</b> <%=Search.persons%></h4><br>
       <p>---------------------------------------------------</p>
        <h3><strong>Passenger Details</strong></h3>
        <p>---------------------------------------------------</p>
        <h4><strong>Passenger Name:-</strong> <%=Booking.passenger_name%> <br><strong>Email:-</strong> <%=Booking.passenger_email%> <br><strong> Mobile No.:-</strong> <%=Booking.passenger_phone%></h4>
        <p>---------------------------------------------------</p>
        
        <h3><strong>Payment Details</strong></h3>
        <p>---------------------------------------------------</p>
        <h4><strong>Payment By:-</strong> <%=Booking.name_on_card%> </h4>
        <h4 align="left"><strong>Total Paid-</strong> <%=Search.persons*Booking.ticket_price%>/Rs.</h4><br>
    </div>

</body>
</html>