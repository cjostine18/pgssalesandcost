<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Auto Actualization</title>
	<link href="../styles/common.css" type="text/css" rel="stylesheet">
	<link href="../styles/lib/fonts.css" type="text/css" rel="stylesheet">
	<link href="../styles/lib/uniform.default.css" type="text/css" rel="stylesheet">
	<link href="../styles/lib/selectbox.css" type="text/css" rel="stylesheet">
	<script src="../scripts/lib/jquery.min.js" type="text/javascript" language="javascript"></script>
	<script src="../scripts/lib/jquery.uniform.min.js" type="text/javascript" language="javascript"></script>
	<script src="../scripts/common.js" type="text/javascript" language="jscript"></script>
	<script src="../scripts/lib/jquery.selectbox-0.5.js" type="text/javascript" language="javascript"></script>
	
	<script>
		$(function() {
			// Uniform form element decorator
			$("input, checkbox").uniform();
			$('select').selectbox(); 
			//toggleElement('#adv-search-home-btn', '#search-filter');
			//$('#offerings-filter .filter-item:eq(0)').click();
			//$('.scrollbar').scrollbar();
		});
	</script>
</head>
<body>
<div class="wrapper">
	<div class="container">
		<div class="inner-container">
			<div class="role-header">
				<div class="top-links">
					<p class="welcome">Welcome, John Smith</p>
					<p class="logout"><a href="#">Logout</a></p>
				</div>
				<div class="role-logo-panel">
					<h1 class="logo"><span>GE Energy</span></h1>
					<h2 class="logo-text"><big>Confirm</big><div class="clear"></div><small>Finance Management Entity (ME) Information</small></h2>
				</div>
			</div>
			<div class="content role-sel">
				<div class="shadow home-content">
				<form>
					<h1>Role Selection</h1>
					<h3><span>*</span>Select your role from the list below:</h3>
					<select>
						<option>CPM</option>
						<option>Sample</option>
						<option>Sample1</option>
					</select>
					<input type="submit" value="">
				</form>
				</div>
			</div>
			<div class="footer">
				<div class="shadow">
				<p>&copy; 2011 General Electric Company</p>
				<p><a href="#">Privacy Statement</a></p>
				<p>PGS Portal</p>
				</div>
			</div>
		</div>
	</div>
</div>
</body>
</html>
