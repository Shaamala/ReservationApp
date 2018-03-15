<!DOCTYPE html>
<html lang="en">
<head>
<title>DogCation - Profile</title>
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
				<li><a class= "active" href="pricing.html">About</a></li>
				<li><a class= "active" href="customerProfile.html">Reservation</a></li>	
				<li><a class= "active" href="loginform.html">Administration</a></li>											
															
			</ul>
		</div>
	</div>
</div>
<div class="hl1"></div>	
</div>	
</div>	
</div>
</div>
<h1>Create profile and make reservation</h1>
		
	<div class="form">



		<form name="myForm" onsubmit="return validateForm()" class="form-horizontal" action="addProfile" method="post">
		<h3>Customer Information:</h3><br>
		
		<input class="span5" type="text" name="fName" placeholder="First Name" id="firstName"> <br><br>
		<input class="span5" type="text" name="lName" placeholder="Last Name" id="lastName"><br><br>
		<input class="span5" type="text" name="street" placeholder="Street" id ="street"><br><br>
		<input class="span5" type="text" name="city" placeholder="City" id="city"> <br><br>
		<input class="span5" type="text" name="state" placeholder="State" id="state"> <br><br>
		<input class="span5" type="text" name="zip" placeholder="Zip Code" id="zip"> <br><br>
		<input class="span5" type="text" name="email" placeholder="Email" id="email">  <br><br>
		<input class="span5" type="text" name="homeTel" placeholder="Home Phone" id="homeTel"> <br><br>
		<input class="span5" type="text" name="emrgTel" placeholder="Emergency Number" id="emrgTel"><br><br>
		<input class="span5" type="text" name="vetName" placeholder="Verterinarian" id="vetName"> <br><br>
		<input class="span5" type="text" name="vetTel" placeholder="Vet Phone Number" id="vetTel"><br><br>
			
		<h3>Dog Information:</h3><br>
		
			<input class="span5" type="text" name="dogName" placeholder="DogName" id="dogName"><br><br> 
			<input class="span5" type="text" name="breed" placeholder="Breed" id="breed"> <br><br>
			<input class="span5" type="text" name="size" placeholder="Size" id="size"> <br><br>
			<input type="text" name="food" placeholder="Food" id="food"><br><br>
			
			
		<h3>Date:</h3><br>
		
			<input type="text" name="dropOff" placeholder="Drop-Off Date: YYYY-MM-DD" id="dropOff"> <br><br>
			<input type="text" name="pickUp" placeholder="Pick-Up Date: YYYY-MM-DD" id="pickUp"> <br><br>
	
			<input class="btn btn-primary" type="submit" value="Reserve">
			</form>
			

<div class="container">
<div class="row">
<div class="span12">
<div class="hl2"></div>	

</div>	
</div>	
</div>

<footer>
<div class="container">
<div class="row">
<div class="span12">
<div class="bot1">
<div class="menu_bot">
    <ul id="menu_bot" class="clearfix">
     <li><a class="active" href="index.html">Home</a></li>				
				<li><a class= "active" href="pricing.html">About</a></li>
				<li><a class= "active" href="customerProfile.html">Reservation</a></li>	
				<li><a class= "active" href="loginform.html">Administration</a></li>         
    </ul>
</div>
</div>	
<div class="bot2">
<div class="copyright">Copyright © 2013. All rights reserved.</div>
</div>
</div>
</div>		
</div>
</footer>
	
</div>
<script type="text/javascript" src="js/bootstrap.js"></script>
<!-- Input Validation  -->
<script>
function validateForm() {
    
    var a = document.getElementById("firstName").value;
    if (!a) {
        alert("First name must be filled out");
        return false;
    }
    
   
   var b = document.getElementById("lastName").value;
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