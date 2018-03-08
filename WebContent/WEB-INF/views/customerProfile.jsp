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
		<h3>Make a profile</h3>
<<<<<<< HEAD
		<form action="addCustomer" method="post">
=======
		<form name="profile" action="" method="post" onsubmit="return validateForm()">
>>>>>>> a1790d2a0fcd136b8edb09b7f11a9a4825b78b86
			First Name: <input type="text" name="fName"> 
			Last Name: <input type="text" name="lName"> 
			Street: <input type="text" name="street">
			City: <input type="text" name="city"> 
			State: <input type="text" name="state"> 
			Zip Code: <input type="text" name="zip">
			Email: <input type="text" name="email" >  
			Home Phone: <input type="text" name="homeTel"> 
			Emergency Number: <input type="text" name="emrgTel"> 
			Veterinarian : <input type="text" name="vetName"> 
			Vet Phone Number: <input type="text" name="vetTel"> 
			Drop-Off Date: <input type="text" name="dropOff"> 
			Pick-Up Date: <input type="text" name="pickUp"> 
			<input type="submit" value="Create Profile">
		</form>
	</div>

${message }
<<<<<<< HEAD
${MSG}
=======
<script >
function validateForm() {
    var x = document.forms["profile"]["fName"].value;
    if (x == "") {
        alert("First Name must be filled out");
        return false;
    }
    var x = document.forms["profile"]["lName"].value;
    if (x == "") {
        alert("Last Name must be filled out");
        return false;
    }
    var x = document.forms["profile"]["street"].value;
    if (x == "") {
        alert("Street must be filled out");
        return false;
    }
    var x = document.forms["profile"]["state"].value;
    if (x == "") {
        alert("State must be filled out");
        return false;
    }
    var x = document.forms["profile"]["zip"].value;
    if (x == "") {
        alert("Zip must be filled out");
        return false;
    }
    var x = document.forms["profile"]["email"].value;
    if (x == "") {
        alert("Email must be filled out");
        return false;
    }
    var x = document.forms["profile"]["homeTel"].value;
    if (x == "") {
        alert("Home telephone number must be filled out");
        return false;
    }
    var x = document.forms["profile"]["emrgTel"].value;
    if (x == "") {
        alert("Emergency telephone number must be filled out");
        return false;
    }
    var x = document.forms["profile"]["vetName"].value;
    if (x == "") {
        alert("Vet's Name must be filled out");
        return false;
    }
    var x = document.forms["profile"]["vetTel"].value;
    if (x == "") {
        alert("Vet's telephone number must be filled out");
        return false;
    }
}

</script>
>>>>>>> a1790d2a0fcd136b8edb09b7f11a9a4825b78b86
</body>
</html>