<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dogs List</title>
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

<form action="searchbydog">
<input type="text" name="dogName">
<input type="submit" value="Search By dog">
</form> <br>
${deletedog}
<table border="1" >

			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Breed</th>
				<th>Size</th>
				<th>Food</th>
				<th>Owner</th>
				<th>Action</th>
			</tr>
			<c:forEach var="dogs" items="${dList}">
			
			<tr>
				<td><c:out value="${dogs.dogID}"></c:out></td>
				<td><c:out value="${dogs.dogName}"></c:out></td>
				<td><c:out value="${dogs.breed}"></c:out></td>
				<td><c:out value="${dogs.size}"></c:out></td>
				<td><c:out value="${dogs.food}"></c:out></td>
				<td><c:out value="${dogs.owner}"></c:out></td>			
				<td>				
					<a href="deletedog?id=${dogs.dogID}">Delete</a></td>
			</tr>

		</c:forEach>
</table>

${addDog}<br>

<h3>Add dog</h3> 
<form action="adddog" method="post">
Dog Name: <input type="text" name="dogName" required>
Owner Name: <input type="text" name="owner" required>
Breed: <input type="text" name="breed" >
Size: <input type="text" name="size" >
food: <input type="text" name="food" >

<input type="submit" value="Add Dog">
</form>

</body>
</html>