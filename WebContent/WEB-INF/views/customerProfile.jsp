b<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
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
		<form name="myForm" onsubmit="return validateForm()" action="addProfile" method="post">
			<h3>Customer Information:</h3><br>
				First Name: <input type="text" id="firstName" name="fName"> 
				Last Name: <input type="text" id="lastName" name="lName"> 
				Street: <input type="text" id="street" name="street">
				City: <input type="text" id="city" name="city">
				State: <input type="text" id="state" name="state"> 
				Zip Code: <input type="text" id="zip" name="zip">
				Email: <input type="text" id="email" name="email">  
				Home Phone: <input type="text" id="homeTel" name="homeTel"> 
				Emergency Number: <input type="text" id="emrgTel" name="emrgTel"> 
				Veterinarian : <input type="text" id="vetName" name="vetName"> 
				Vet Phone Number: <input type="text" id="vetTel" name="vetTel"> <br>
			
			<h3>Dog Information:</h3><br>
			
				Dog Name: <input type="text" id="dogName" name="dogName"> 
				Breed: <input type="text" id="breed" name="breed"> 
				Size: <input type="text" id="size" name="size"> 
				Food: <input type="text" id="food" name="food"><br>
				
			
			<h3>Date:</h3><br>
		
				Drop-Off Date: <input type="text" id="dropOff" name="dropOff"> 
				Pick-Up Date: <input type="text" id="pickUp" name="pickUp"> <br>
			<br>
			<input type="submit" value="Reserve">
		</form>		
			
			
			
			<br>
			
	
</div>

${MSG}

<script>
function validateForm() {
    
    var a = document.getElementById("firstName").value;
    if (!a) {
        alert("First name must be filled out");
        return false;
    }
    
   
   var b = document.getElementById("lastname").value;
    if (!b) {
        alert("Last name must be filled out");
        return false;
    }
    
    var c = document.getElementById("street").value;
    if (!c) {
        alert("Street must be filled out");
        return false;
    }
    
    var d = document.getElementById("city").value;
    if (!d) {
        alert("City must be filled out");
        return false;
    }
    
    var e = document.getElementById("state").value;
    if (!e) {
        alert("State must be filled out");
        return false;
    }
    
    var f = document.getElementById("zip").value;
    if (!f) {
        alert("Zip must be filled out");
        return false;
    }
    
    
    var g = document.getElementById("email").value;
    if (!g) {
        alert("Email must be filled out");
        return false;
    }
    
    var h = document.getElementById("homeTel").value;
    if (!h) {
        alert("Home telephone number must be filled out");
        return false;
    }
    
    var i = document.getElementById("emrgTel").value;
    if (!i) {
        alert("Emergency telephone number must be filled out");
        return false;
    }
    
    var j = document.getElementById("vetName").value;
    if (!j) {
        alert("Veterinarian name must be filled out");
        return false;
    }
    
    var k = document.getElementById("vetTel").value;
    if (!k) {
        alert("Veterinarian telephone number must be filled out");
        return false;
    }
    
    var l = document.getElementById("dogName").value;
    if (!l) {
        alert("Dog name must be filled out");
        return false;
    }
    
    var m = document.getElementById("breed").value;
    if (!m) {
        alert("Breed must be filled out");
        return false;
    }
    
    var n = document.getElementById("size").value;
    if (!n) {
        alert("Dog size must be filled out");
        return false;
    }
    
    var o = document.getElementById("food").value;
    if (!o) {
        alert("Dog food must be filled out");
        return false;
    }
    
    var p = document.getElementById("dropOff").value;
    if (!p) {
        alert("Drop off date must be filled out (YYYY-MM-DD)");
        return false;
    }
    
    var q = document.getElementById("pickUp").value;
    if (!q) {
        alert("Pick up date must be filled out (YYYY-MM-DD)");
        return false;
    }
}

</script>
	
</body>
</html>