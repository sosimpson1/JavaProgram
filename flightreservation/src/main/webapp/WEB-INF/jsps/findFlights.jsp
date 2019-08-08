<%@ page language="java" contentType="text/html; charset=UTF-8"
       pageEncoding="UTF-8"%>
       <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
       <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
       <html>
       <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <link rel="stylesheet" href="../css/bootstrap.min.css">
                           <script src="../js/bootstrap.min.js"></script>

       <title>Find Flights</title>
       </head>
       <body>
       <h2>Find Flights:</h2>
       <form action="findFlights" method="post">
       From:<input type="text" name="from"/>
       To:<input type="text" name="to"/>
       Departure Date:<input type="text" name="dateOfDeparture"/>
       <input type="submit" value="search"/>
       </form>
       </body>
       </html>

