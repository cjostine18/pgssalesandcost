<%@ page contentType="text/html;charset=utf-8" isErrorPage="true" session="false" %>
<html>
<head>
<TITLE>Session Time Out Error Page</TITLE>
<script type="text/javascript">
	function closeWindow(){
		window.close();
	}
</script>

</head> 
<body id="bodynew">
<table  align="center" class="tbl_bg2_content" width="100%" height="80%" border="0" cellpadding="0" cellspacing="0">
<tr>
<td>
<form name="frmSessionTimeOut" method="post" >

<table border='0'  class="tbl_bg2_content" align="center" cellpadding="0">
	<tr>
		<td align="center"   class='fntbold' >
			<span class="search_head" >Below are the reasons for why you have been lead to this page...</span>
		</td>
	</tr>	
	<tr><td>&nbsp;</td></tr>
	<tr>
		<td width='100%' align='left' style="font-size:15px" >
			<ul>
				<li>&nbsp;Session timed out</li>
				<li>&nbsp;&nbsp;Using a book mark to access the required page</li>
			</ul>
		</td>
	</tr>
	<tr>
		<td align="center"   class='fntbold' >
			<span class="search_head">Please <a href="javascript:closeWindow();" class="Padding_Link"><b>Click here</b></a> to close window.</span>
		</td>
	</tr>
</table>


</form>
</td>
</tr>
</table>

</body>
</html>
