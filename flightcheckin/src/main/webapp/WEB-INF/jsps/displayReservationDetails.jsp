<%@ page language="java" contentType="text/html; charset=UTF-8"
       pageEncoding="UTF-8"%>
       <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
       <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
       <html>
       <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <title>Reservation Details</title>
       </head>
       <body>

       <c:if test = "${reservation.flight == null}">
            <strong> Incorrect Reservation Selected </strong>
       </c:if>

       <c:if test = "${reservation.flight != null}">
           <h2>flight Details:</h2>
           Airlines: ${reservation.flight.operatingAirlines}<br/>
           Flight No: ${reservation.flight.flightNumber}<br/>
           Departure City: ${reservation.flight.departureCity}<br/>
           Arrival City: ${reservation.flight.arrivalCity}<br/>
           Date Of Departure: ${reservation.dateOfDeparture}<br/>
           Estimated Departure Time: ${reservation.flight.estimatedDepartureTime}<br/>

           <h2>Passenger Details</h2>

           First Name: ${reservation.passenger.firstName}
           Last Name: ${reservation.passenger.lastName}
           Email: ${reservation.passenger.email}
           phone: ${reservation.passenger.phone}
           <form action="completeCheckIn" method="post">
           Enter the number of bags you want to check in:<input type="text" name="numberOfBags"/>
           <input type="hidden" name = "reservationId" value="${reservation.id}"/>
           <input type="submit" value="Check In"/>
           </form>
       </c:if>
       </body>
       </html>