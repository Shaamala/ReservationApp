<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer List</title>
</head>
<body>



<table border="1" >

			<c:forEach var="customers" items="${cList}">

			<tr>
				<td><c:out value="${customers.customerID}"></c:out></td> 
				<td><c:out value="${customers.fName}"></c:out></td>
				<td><c:out value="${customers.lName}"></c:out></td>
				<td><c:out value="${customers.street}"></c:out></td>
				<td><c:out value="${customers.city}"></c:out></td>
				<td><c:out value="${customers.state}"></c:out></td>
				<td><c:out value="${customers.zip}"></c:out></td>
				<td><c:out value="${customers.email}"></c:out></td>
				<td><c:out value="${customers.homeTel}"></c:out></td>
				<td><c:out value="${customers.emrgTel}"></c:out></td>
				
			</tr>

		</c:forEach>
</table>


</body>
</html>