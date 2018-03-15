<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customers List</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="Your description">
<meta name="keywords" content="Your keywords">
<meta name="author" content="Your name">
<link rel="icon" href="images/favicon.ico" type="image/x-icon">
<link rel="shortcut icon" href="images/favicon.ico" type="image/x-icon" />

<link rel="stylesheet" href="resources\\css\\bootstrap.css" type="text/css" media="screen">
<link rel="stylesheet" href="resources\\css\\bootstrap-responsive.css" type="text/css" media="screen">    
<link rel="stylesheet" href="resources\\css\\style.css" type="text/css" media="screen">
<link rel="stylesheet" href="resources\\css\\camera.css" type="text/css" media="screen">
<style>
img.logo{

display: block;
    margin-left: auto;
    margin-right: auto;
   width: 150px;
    
}
div.pictext{
	vertical-align: text-top;

}
</style>

<script type="text/javascript" src="resources\\js\\jquery.js"></script>  
<script type="text/javascript" src="resources\\js\\jquery.easing.1.3.js"></script>
<script type="text/javascript" src="resources\\js\\superfish.js"></script>

<script type="text/javascript" src="resources\\js\\jquery.ui.totop.js"></script>

<script type="text/javascript" src="resources\\js\\camera.js"></script>
<script type="text/javascript" src="resources\\js\\jquery.mobile.customized.min.js"></script>
<script>
$(document).ready(function() {
	/////// icons
	$(".social li").find("a").css({opacity:0.3});
	$(".social li a").hover(function() {
		$(this).stop().animate({opacity:1 }, 400, 'easeOutExpo');		    
	},function(){
	    $(this).stop().animate({opacity:0.3 }, 400, 'easeOutExpo' );		   
	}); 

	// camera
	$('#camera_wrap').camera({
		//thumbnails: true
		autoAdvance			: false,		
		mobileAutoAdvance	: false,
		height: '52%',
		hover: false,
		loader: 'none',
		navigation: true,
		navigationHover: false,
		mobileNavHover: false,
		playPause: false,
		pauseOnClick: false,
		pagination			: false,
		time: 7000,
		transPeriod: 1000,
		minHeight: '200px'
	});

}); //
$(window).load(function() {
	//

}); //
</script>		
</head>

<body>
<div id="main">

<div class="container">
<div class="row">
<div class="span12">
<div class="top1">
<div class="social_wrapper">
	
</div>
</div>
<header>
<a><img class= "logo" src="https://image.ibb.co/jwweKc/dogcation.png" alt="dogcation" border="0"></a>
	
</header>
<div class="navbar navbar_">
	<div class="navbar-inner navbar-inner_">
		<a class="btn btn-navbar btn-navbar_" data-toggle="collapse" data-target=".nav-collapse_">
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
		</a>
		<div class="nav-collapse nav-collapse_ collapse">
			<ul class="nav sf-menu clearfix">
				<li><a class="active" href="index.html">Home</a></li>				
				<li><a class= "active" href="customerList.html">Customers</a></li>
				<li><a class= "active" href="dogList.html">Dogs</a></li>	
				<li><a class= "active" href="reservationList.html">Reservation</a></li>											
															
			</ul>
		</div>
	</div>
</div>
<div class="hl1"></div>	
</div>	
</div>	
</div>
</div>

<br>
<br>
<form action="searchbydate">
<input type="text" name="dropOff">
<input class="btn btn-primary" type="submit" value="Search date">

</form><br>
<table class="table table-bordered">

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

<table>
		<tr>
		<td>First Name:<br> <input type="text" name="fName" required></td>
		<td>City:<br> <input type="text" name="city" ></td>
		<td>Email Address:<br><input type="text" name="email"></td>
<<<<<<< HEAD
		<td>Veterinarian :<br> <input type="text" name="vetName"></td>
=======
		<td>Veterinarian:<br> <input type="text" name="vetName"></td>
>>>>>>> fc0362113015f5cab22c8819089e8df885d5ef9a
		<td>Drop off Date:<br> <input type="text" name="dropOff" ></td>
		</tr>
    <tr>
		<td>Last Name:<br> <input type="text" name="lName" required></td>
		<td>State:<br> <input type="text" name="state" ></td>
<<<<<<< HEAD
		<td>Home Phone:<br> <input type="text" name="homeTel"></td>
		<td>Vet Phone Number:<br> <input type="text" name="vetTel"></td>
		<td>Pick up Date: <br><input type="text" name="pickUp" ></td>
	</tr>
   	<tr>
			<td>Street: <br><input type="text" name="street" ></td>
			<td>ZipCode:<br> <input type="text" name="zip"></td>
			<td>Emergency Number:<br> <input type="text" name="emrgTel"></td>
			<td>Dog Name: <br><input type="text" name="dogName" ></td>
=======
		<td>Home Phone:<br><input type="text" name="homeTel"></td>
		<td>Vet Phone Number:<br><input type="text" name="vetTel"></td>
		<td>Pick up Date:<br><input type="text" name="pickUp" ></td>
	</tr>
   	<tr>
			<td>Street:<br><input type="text" name="street" ></td>
			<td>ZipCode:<br><input type="text" name="zip"></td>
			<td>Emergency Number:<br><input type="text" name="emrgTel"></td>
			<td>Dog Name:<br><input type="text" name="dogName" ></td>
>>>>>>> fc0362113015f5cab22c8819089e8df885d5ef9a
			<td><input class="btn btn-primary" type="submit" value="Add"></td>
	</tr>
</table>

</form>



</body>
</html>