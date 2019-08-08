<%@ page language="java" contentType="text/html; charset=UTF-8"
       pageEncoding="UTF-8"%>
       <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
       <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
       <html>
       <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <link rel="stylesheet" href="../css/bootstrap.min.css">
                           <script src="../js/bootstrap.min.js"></script>

       <title>Complete Reservation</title>
       </head>
       <body>
       <h2>Complete Reservation</h2>
       Airline: ${flight.operatingAirlines}<br/>
       Airline: ${flight.departureCity}<br/>
       Airline: ${flight.arrivalCity}<br/>

       <form action="completeReservation" method="post"/>
       <pre>
       <h2>Passenger Details:</h2>
       First Name:<input type="text" name="passengerFirstName"/>
       Last Name:<input type="text" name="passengerLastName"/>
       Email:<input type="text" name="passengerFirstEmail"/>
       Phone:<input type="text" name="passengerPhone"/>

       <h2>Card Details</h2>
       Name on the card:<input type="text" name="nameOnTheCard"/>
       Card No:<input type="text" name="CardNumber"/>
       Expire Date:<input type="text" name="expirationDate"/>
       Three Digit Sec Code:<input type="text" name="securityCode"/>

      <input type="hidden" name="flightId" value="${flight.id}"/>
      <input type="submit" value="confirm"/>
      </pre>
      </form>
      </body>
      </html>