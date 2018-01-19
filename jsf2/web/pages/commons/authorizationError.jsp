<%@ page contentType="text/html;charset=utf-8" isErrorPage="true"
	session="false"%>

<html>
<head>
<TITLE>Authentication Error Page</TITLE>
<script type="text/javascript">
	function closeWindow() {
		window.close();
	}
</script>

</head>
<body id="bodynew">
<table align="center" class="tbl_bg2_content" width="100%" height="80%"
	border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td>
		<form name="frmSessionTimeOut" method="post">

		<table border='0' class="tbl_bg2_content" align="center"
			cellpadding="0">
			<tr>
				<td colspan="2" align="center" class='fntbold'><span
					class="search_head">Below are the reasons for why you have
				been lead to this page...</span></td>
			</tr>
			<tr>
				<td colspan="2">&nbsp;</td>
			</tr>
			<tr>
				<td colspan="2" width='100%' align='left' style="font-size: 15px">
				<ul type="disc">
					<li>&nbsp;You have no valid role to this application</li>
					<li>&nbsp;No SSO found from the request.</li>

				</ul>
				</td>
			</tr>
			<tr>
				<td align="center" class='fntbold'><span class="search_head">
				<a href="javascript:closeWindow();" class="Padding_Link"><b>close
				window</b></a> </span></td>
				<td align="left" class='fntbold'><span class="search_head">
				<a href="javascript:history.back(-1);" class="Padding_Link"><b>
				go back</b></a> </span></td>
			</tr>
		</table>


		</form>
		</td>
	</tr>
</table>

</body>
</html>
