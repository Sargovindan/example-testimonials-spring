<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="taglib.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="<c:url value="/resources/css/bootstrap.min.css" />" />
<link rel="stylesheet"
	href="<c:url value="/resources/css/signin.css" />" />
<link rel="stylesheet"
	href="<c:url value="/resources/css/demo_page.css" />" />
<link rel="stylesheet"
	href="<c:url value="/resources/css/demo_table.css" />" />
<!-- JQuery -->
<script type="text/javascript"
	src="<c:url value="/resources/js/jquery-2.0.3.min.js" />"></script>
<script type="text/javascript"
	src="<c:url value="/resources/js/jquery-2.0.3.min.map" />"></script>
<script type="text/javascript"
	src="<c:url value="/resources/js/jquery.dataTables.min.js" />"></script>
<script type="text/javascript"
	src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

<title>${param.title}</title>
</head>
<body>


	<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="<c:url value='/' />">Testimonials</a>
			</div>
			<div class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class=${param.page == 'home' ? 'active' : ''}><a href="<c:url value='/' />">Home</a></li>
					<li class=${param.page == 'new' ? 'active' : ''}><a href="<c:url value='/testimonials/new.html' />">Add new</a></li>
					<li class=${param.page == 'testimonials' ? 'active' : ''}><a href="<c:url value='/testimonials.html' />">List all</a></li>
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</div>

	<div class="container">
	
	<br /><br />
