 <%@ page language="java" contentType="text/html; charset=UTF-8"
       pageEncoding="UTF-8"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
       <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
       <html>
       <head>
       <meta http-equiv="Content-Type" content="text/html"; charset=UTF-8">
       <link rel="stylesheet" href="../css/bootstrap.min.css">
             <script src="../js/bootstrap.min.js"></script>

       <title>Register User</title>

       </head>
       <body>
       <form action="registerUser" method="post">
       <pre>
       <h2 style="color:blue;">User Registration:</h2>
       <di
       class="w3-container ">
       <span style="color:purple">First Name: </span> <input type="text" name="firstName"/></div>
       <div class="w3-container">
       <span style="color:red">Last Name: </span> <input type="text" name="lastname"/></div>
       <div class="w3-container">
      <span style="color:green">Email: </span> <input type="text" name="email"/></div>
       <div class="w3-container">
       <span style="color:gray">Password: <input type="password" name="password"/></div>
       <div class="w3-container ">
       <span style="color:blue">Confirm Password: <input type="password" name="confirmPassword"/></div>
       <input type="submit" value= "register"/>
       </pre>
       </form>

       </body>
       </html>