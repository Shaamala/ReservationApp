<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.form {
	border-radius: 5px;
	background-color: #f2f2f2;
	padding: 20px;
}

input[type=text], select, textarea {
	width: 100%;
	padding: 12px;
	border: 1px solid #ccc;
	border-radius: 4px;
	resize: vertical;
}

input[type=submit] {
	background-color: #4CAF50;
	color: white;
	padding: 12px 20px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	float: ;eft;
}
</style>
</head>
<body>
<div style="text-align:center">
		<h1>
			Make a customer Profile<br> <br>
		</h1>

<h3>
			<a href="index.html">Home</a>
			<a href="pricing.html">Pricing</a>
			<a href="customerProfile.html">Make Profile</a>
			<a href="reserve.html">Reserve</a>
		</h3>
		</div>
		
	<div class="form"">
		<h3>Create profile and make reservation</h3>
		<form action="addProfile" method="post" id="form1">
		<h3>Customer Information:</h3><br>
			First Name: <input type="text" name="fName"> 
			Last Name: <input type="text" name="lName"> 
			Street: <input type="text" name="street">
			City: <input type="text" name="city"> 
			State: <input type="text" name="state"> 
			Zip Code: <input type="text" name="zip">
			Email: <input type="text" name="email">  
			Home Phone: <input type="text" name="homeTel"> 
			Emergency Number: <input type="text" name="emrgTel"> 
			Veterinarian : <input type="text" name="vetName"> 
			Vet Phone Number: <input type="text" name="vetTel"> <br>
			
		<h3>Dog Information:</h3><br>
		
			Dog Name: <input type="text" name="dogName"> 
			Breed: <input type="text" name="breed"> 
			Size: <input type="text" name="size"> Food: <input type="text" name="food"><br>
			
			
		<h3>Date:</h3><br>
		
			Drop-Off Date: <input type="text" name="dropOff"> 
			Pick-Up Date: <input type="text" name="pickUp"> <br>
			<br>
			<input type="submit" value="Reserve" onclick="submitForms">
			</form>		
			
			
			<form action="sendEmail" id="form2">
			${response}
			${login}
			</form>
			<br>
			
	
</div>

${MSG}

		<script type="text/javascript">
			submitForms = function(){
		    document.getElementById["form1"].submit();
		    document.getElementById["form2"].submit();
			}
		</script>
</body>
</html>