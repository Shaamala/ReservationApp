<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Customers List</title>
</head>
<body>

<form action="searchbydate">
<input type="text" name="dropOff">
<input type="submit" value="Search By date">
</form>

<title>Customer List</title>
</head>
<body>



<table border="1" >

				<tr>
					<th> ID
					<th>First Name
					<th>Last Name
					<th>Dog Name
					<th>Drop off Date
					<th>Pick up Date
					<th>Street
					<th>city
					<th>State
					<th>ZipCode
					<th>Emial
					<th>Home Phone
					<th>Emergency Number
					<th>Veterinarian
					<th>Vet Phone
					<th>Action
					
				</tr>
			<c:forEach var="customers" items="${cList}">

			<tr>

				<td>${customers.customerID}</td> 
				<td>${customers.fName}</td>
				<td>${customers.lName}</td>
				<td>${customers.dog}</td>
				<td>${customers.dropOff}</td>
				<td>${customers.pickUp}</td>
				<td><c:out value="${customers.street}"></c:out></td>
				<td><c:out value="${customers.city}"></c:out></td>
				<td><c:out value="${customers.state}"></c:out></td>
				<td><c:out value="${customers.zip}"></c:out></td>
				<td><c:out value="${customers.email}"></c:out></td>
				<td><c:out value="${customers.homeTel}"></c:out></td>
				<td><c:out value="${customers.emrgTel}"></c:out></td>
				<td><c:out value="${customers.vetName}"></c:out></td>
				<td><c:out value="${customers.vetTel}"></c:out></td>

				<td>
				
					<a href="delete?id=${customers.customerID}">Delete</a></td>	

			</tr>

		</c:forEach>
</table>

${addCustomer}
<h1>Add Customer</h1> 
<form action="addcustomer" method="post">
First Name: <input type="text" name="fName" required>
Last Name: <input type="text" name="lName" required>
Street: <input type="text" name="street" >
city: <input type="text" name="city" >
State: <input type="text" name="state" >
ZipCode: <input type="text" name="zip">
Emial:<input type="text" name="email">
Home Phone:<input type="text" name="homeTel">
Emergency Number: <input type="text" name="emrgTel">
Veterinarian : <input type="text" name="vetName">
Vet Phone Number: <input type="text" name="vetTel">
Dog Name: <input type="text" name="dogName" >
Drop off Date: <input type="text" name="dropOff" >
Pick up Date: <input type="text" name="pickUp" >

<input type="submit" value="Add Customer">
</form>



</body>
</html>