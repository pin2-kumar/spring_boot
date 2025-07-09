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
    <h2> Employee Registration</h2>
    
    <c:out value = "hellow"></c:out>
    
      <form action = "saveRegistration" method = "post">
       <pre>
      First name <input type = "text" name= "firstname"/>
      Last name  <input type = "text" name= "lastname"/>
      Email id  <input type = "text" name = "email"/>
      Mobile <input type = "text" name = "mobile"/>
      
      <input type = "submit" value ="save"/>
       
       </pre>
      
      </form>  
</body>
</html>