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
${reserdetail}
<br>
<form action="searchbyreserve">
<input type="text" name="dropOff">
<input type="submit" value="Search By date">
</form>


<table border="1" >

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
${RList}
</body>
</html>