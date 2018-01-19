<%@ include file="./taglibs.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Auto Actualization</title>
	<link href="${pageContext.request.contextPath}/styles/common.css" type="text/css" rel="stylesheet">
</head>

<body topmargin="0" RIGHTMARGIN="0" leftmargin="0" bottommargin="0">
<f:subview id="pageHeader">
<h:form id="pageHeaderForm">

		    
<div class="wrapper">
	<div class="container">
		<div class="inner-container">
			<div class="header">
				<div class="top-links">
					<p class="welcome">Welcome, John Smith</p>
					<p class="logout"><a href="#">Logout</a></p>
					<ul>
						<li><a href="#" onclick="alert(':>')">Help</a></li>
					</ul>
				</div>
				<div class="logo-panel">
					<h1 class="logo"><span>GE Energy</span></h1>
					<h2 class="logo-text"><big>Confirm</big>
					<div class="clear"></div>
					<small>Finance Management Entity (ME) Information</small></h2>
					<div class="quick-search"><input type="text" value="Quick Search..." class="placeholder search"><input type="image" src="${pageContext.request.contextPath}/images/icons/search_icon.png"></div>
				</div>
				<div class="nav">
					<ul>
						<li><a href="#" class="active">Home</a></li>
						<li><a href="#">Standard View</a></li>
						<li><a href="#">Audit Log</a></li>
						<li><a href="#">Reports</a></li>
					</ul>
				</div>
				<div class="breadcrumb">
					 <h2>Home</h2>
					<div class="user-tools">
						<h2 class="user-tool-name">User Tool</h2>
						<ul>
							<li class="user-tool tools-print"><h3><a href="#">Print</a></h3></li>
							<li class="user-tool tools-bookmark"><h3><a href="#">Book Mark</a></h3></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
</h:form>
</f:subview>
</body>
</html>
