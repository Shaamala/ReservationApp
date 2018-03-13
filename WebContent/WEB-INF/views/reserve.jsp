<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reservation</title>

 <!-- Bootstrap core CSS -->
    <link href="assets/css/bootstrap.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="assets/css/style.css" rel="stylesheet">
    <link href="assets/css/font-awesome.min.css" rel="stylesheet">

	<!-- datetimepicker css -->
	<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">	
  
    <script src="https://www.gstatic.com/firebasejs/3.7.0/firebase.js"></script>	
	<link type="text/css" rel="stylesheet" href="https://www.gstatic.com/firebasejs/ui/live/0.5/firebase-ui-auth.css" />
	
	<script src="https://cdn.firebase.com/libs/geofire/4.1.1/geofire.min.js"></script>
<style>
</style>
 	
</head>
<body>
	<div style="text-align: center">
		<h1>
			Make a reservation<br> <br>
		</h1>
		<h3>
			<a href="index.html">Home</a> 
			<a href="pricing.html">Pricing</a> 
			<a href="customerProfile.html">Make Profile</a> 
			<a href="reserve.html">Reserve</a>
		</h3>
	</div>
	${stats}
	${emailStats }
	<iframe src="https://calendar.google.com/calendar/embed?height=600&amp;wkst=1&amp;bgcolor=%23FFFFFF&amp;src=q5bt6q6pkpola1dhvpe51dubcs%40group.calendar.google.com&amp;color=%2342104A&amp;ctz=America%2FNew_York" style="border-width:0" width="800" height="600" frameborder="0" scrolling="no"></iframe>
	<div class="col-4 col-lg-6">
			    			<div class="spacing"></div>
							<label for="datepicker">Our Current & Upcoming Events</label>
					    	<div id="datepicker" name="datepicker"></div>
					    	<!-- <input name="datepicker" id="datepicker" value="" type="text"> -->
					    </div>	
 <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
	<script src="assets/js/retina-1.1.0.js"></script>
	<script src="assets/js/jquery.hoverdir.js"></script>
	<script src="assets/js/jquery.hoverex.min.js"></script>
	<script src="assets/js/jquery.prettyPhoto.js"></script>
  	<script src="assets/js/jquery.isotope.min.js"></script>
  	
  	<!-- datetimepicker -->
  	<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  	<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.min.js"></script>  	   	
  	



</body>
</html>