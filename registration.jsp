<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2> welcome to registration </h2>
  
   <form action="saveReg" method="post">
    <pre>
    First name <input type = "text" name= "firstname"/>
    Last name  <input type = "text" name= "lastname"/>
    Email id  <input type = "text" name = "email"/>
    Mobile <input type = "text" name = "mobile"/>
    
    City <input type="text" name= "city"/>
    State <input type = "text" name="state"/>
    PinCode <input type = "text" name = "pinCode"/>
    Address <input type = "text" name = "address"/>
    <input type = "submit" value = "save"/>
  </pre>
   </form>
   ${msg}
</body>
</html>