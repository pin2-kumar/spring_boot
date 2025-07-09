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

<h2> view Registration</h2>

<table>

<tr>
<td>
   first name 
</td>
<td>
    last name
</td>
<td>
    email
</td>
<td>
    mobile
    </td>

</tr>

<c:forEach var="emp" items="${employees}">

		<tr>
			<td>
				${emp.firstname}
			</td>
			<td>
				${emp.lastname}
			</td>
			<td>
				${emp.email}
			</td>
			<td>
				${emp.mobile}
			</td>
			<td >
			
			   <a href="deleteRegistration?id=${emp.id}">delete</a>
			</td>
			
			<td >
			
               <a href="getRegistrationById?id=${emp.id}">Update</a>

			</td>
		</tr>
		
		</c:forEach>


</table>

</body>
</html>