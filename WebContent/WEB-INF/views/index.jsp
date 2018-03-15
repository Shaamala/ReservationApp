<!DOCTYPE html>
<html lang="en">
<head>
<title>DogCation</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="Your description">
<meta name="keywords" content="Your keywords">
<meta name="author" content="Your name">
<link rel="icon" href="images/favicon.ico" type="image/x-icon">
<link rel="shortcut icon" href="images/favicon.ico" type="image/x-icon" />

<link rel="stylesheet" href="resources\\css\\bootstrap.css"
	type="text/css" media="screen">
<link rel="stylesheet" href="resources\\css\\bootstrap-responsive.css"
	type="text/css" media="screen">
<link rel="stylesheet" href="resources\\css\\style.css" type="text/css"
	media="screen">
<link rel="stylesheet" href="resources\\css\\camera.css" type="text/css"
	media="screen">
<style>
img.logo {
	display: block;
	margin-left: auto;
	margin-right: auto;
	width: 150px;
}

div.pictext {
	vertical-align: text-top;
}
</style>

<script type="text/javascript" src="resources//js//jquery.js"></script>
<script type="text/javascript" src="resources//js//jquery.easing.1.3.js"></script>
<script type="text/javascript" src="resources//js//superfish.js"></script>

<script type="text/javascript" src="resources//js//jquery.ui.totop.js"></script>

<script type="text/javascript" src="resources//js//camera.js"></script>
<script type="text/javascript"
	src="resources//js//jquery.mobile.customized.min.js"></script>
<script>
	$(document).ready(function() {
		/////// icons
		$(".social li").find("a").css({
			opacity : 0.3
		});
		$(".social li a").hover(function() {
			$(this).stop().animate({
				opacity : 1
			}, 400, 'easeOutExpo');
		}, function() {
			$(this).stop().animate({
				opacity : 0.3
			}, 400, 'easeOutExpo');
		});

		// camera
		$('#camera_wrap').camera({
			//thumbnails: true
			autoAdvance : false,
			mobileAutoAdvance : false,
			height : '52%',
			hover : false,
			loader : 'none',
			navigation : true,
			navigationHover : false,
			mobileNavHover : false,
			playPause : false,
			pauseOnClick : false,
			pagination : false,
			time : 7000,
			transPeriod : 1000,
			minHeight : '200px'
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
						<div class="social_wrapper"></div>
					</div>
					<header>
						<a><img class="logo"
							src="https://image.ibb.co/jwweKc/dogcation.png" alt="dogcation"
							border="0"></a>

					</header>



					<div class="navbar navbar_">
						<div class="navbar-inner navbar-inner_">
							<a class="btn btn-navbar btn-navbar_" data-toggle="collapse"
								data-target=".nav-collapse_"> <span class="icon-bar"></span>
								<span class="icon-bar"></span> <span class="icon-bar"></span>
							</a>
							<div class="nav-collapse nav-collapse_ collapse">
								<ul class="nav sf-menu clearfix">
									<li><a class="active" href="index.html">Home</a></li>
									<li><a class="active" href="pricing.html">About</a></li>
									<li><a class="active" href="customerProfile.html">Reservation</a></li>
									<li><a class="active" href="loginform.html">Administration</a></li>

								</ul>
							</div>



						</div>
						<div class="hl1"></div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div id="slider">
		<div id="camera_wrap">
			<div
				data-src="https://www.pawlofts.com/wp-content/uploads/2017/02/Spring-Bark-Dallas-Dog-Boarding-at-Pawlofts.jpg">
				<div class="camera_caption fadeIn"></div>

			</div>
		</div>
	</div>

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
								<li><a class="active" href="pricing.html">About</a></li>
								<li><a class="active" href="customerProfile.html">Reservation</a></li>
								<li><a class="active" href="loginform.html">Administration</a></li>
							</ul>
						</div>
					</div>
					<div class="bot2">
						<div class="copyright">Copyright © 2013. All rights
							reserved.</div>
					</div>
				</div>
			</div>
		</div>
	</footer>






	</div>
	<script type="text/javascript" src="resources/js/bootstrap.js"></script>
</body>
</html>