<%@ page language="java" contentType="text/html; charset=UTF-8"
       pageEncoding="UTF-8"%>
       <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
       <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
       <html>
       <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <link rel="stylesheet" href="../css/bootstrap.min.css">
                           <script src="../js/bootstrap.min.js"></script>

       <title>Flights Inputs</title>
       </head>
       <body>
       <h2>Flight Inputs</h2>
       <form action="form" method="Post">
       Flight Id:<br>
       <input type="text" name="flight_Id">
       <br>
       Arrival City:<br>
       <input type="text" arrival_"city">
       <br><br>
       Date Of Departure:<br>
       <input type="text" name="date_Of_Departure">
       <br>
       Departure City:<br>
       <input type="text" name="Departure_City">
       <br>
       Estimated Departure Time:<br>
       <input type="text" name="Estimated_Departure_Time">
       <br>
       Flight Number:<br>
       <input type="text" name="Flight_Number">
       <br>
       Operating Airlines:<br>
       <input type="text" name="Operating_Airlines">
       <br><br>
       <input type="submit" value="submit">
       </form>
       </body>
       </html>