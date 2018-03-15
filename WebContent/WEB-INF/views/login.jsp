<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login page</title>
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
${user}
<div class="container" class="text-center">

      <form class="form-signin" action="login" method="POST">
        <h2 class="form-signin-heading">Please sign in</h2>
        <label for="inputEmail" class="sr-only">User ID</label>
        <input type="text" name="userId" id="inputEmail" class="form-control" placeholder="admin" required autofocus>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" name="password" id="inputPassword" class="form-control" placeholder="Password" required>
       <br>
        <button class="btn btn-lg btn-primary" type="submit">Sign in</button>
      </form>

    </div> 

</body>
</html>