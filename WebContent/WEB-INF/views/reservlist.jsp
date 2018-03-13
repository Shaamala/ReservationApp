<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div style="text-align: center">
				<a href="index.html">Home</a>
				<a href="customerList.html">Customers</a>
				<a href="dogList.html">Dogs</a>
				<a href="reservationList.html">listReservation</a>

</div>
<br>
<br>
<form action="searchbyreserve">
<input type="text" name="dropOff">
<input type="submit" value="Search By date">
</form>

<br>
<table border="1" >
			<tr>
					<th>First Name
					<th>Last Name
					<th>Dog Name
					<th>Drop off Date
					<th>Pick up Date
					<th>Home Phone

			<c:forEach var="reserve" items="${RList}">

			<tr>
				
				<td>${reserve.fName}</td>
				<td>${reserve.lName}</td>
				<td>${reserve.dog}</td>
				<td>${reserve.dropOff}</td>
				<td>${reserve.pickUp}</td>
				<td>${reserve.homeTel}</td>
			
			</tr>

		</c:forEach>
</table>

</body>
</html>