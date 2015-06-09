<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script type="text/javascript" src='<c:url value="/libs/jQuery/jquery1.0.8.min.js"></c:url>'></script>
<script type="text/javascript" src='<c:url value="/general/js/constant/Constant.js"></c:url>'></script>
<script type="text/javascript" src='<c:url value="/views/WeatherStationView/js/WeatherStationViewModel.js"></c:url>'></script>
<script type="text/javascript" src='<c:url value="/views/WeatherStationView/js/WeatherStationViewController.js"></c:url>'></script>
<script type="text/javascript" src='<c:url value="/views/WeatherStationView/js/WeatherStationView.js"></c:url>'></script>
<link href='<c:url value="/views/WeatherStationView/css/WeatherStationView.css"></c:url>' rel="stylesheet">

<title>WeatherStationView</title>
</head>
<body>

	<div class="center" >
		<select id="cities">
			<option disabled selected> -- select an option -- </option>
			<option value="london">London</option>
			<option value="luton">Luton</option>
			<option value="manchester">Manchester</option>
			<option value="birmingham">Birmingham</option>
		</select>
		
		<ul id="detailCity">
			<li>Name of the city: <span id="name"></span></li>
			<li>Location (longitude: <span id="latitude"></span> and latitude: <span id="longitude"></span>)</li>
 			<li>The temperature: <span id="temperature"></span> and temperature range: min(<span id="temperature_min"></span>), max(<span id="temperature_max"></span>)</li>
 			<li>The current atmospheric pressure: <span id="atmosphericPressure" ></span></li>
			<li>The current humidity: <span id="humidity"></span></li>
			<li>The current weather condition: <span id="weatherCondition"></span> </li>
			<img id="iconWeatherCondition" src="">
		</ul>
	</div>
	
	<script type="text/javascript">
		$(document).ready(function(){
		  var weatherStationView = new WeatherStationView();
	    });
	</script>

</body>
</html>