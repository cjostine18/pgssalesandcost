<%@ page contentType="text/html;charset=utf-8" isErrorPage="true" session="false" %>
<%@ page import="java.util.Vector,java.util.StringTokenizer" %>

<%
Cookie cookie = null;
Cookie[] cookies = request.getCookies();

Vector<String> domains = new Vector<String>();

String serverName = request.getServerName();
StringTokenizer tok = new StringTokenizer(serverName, ".");

while (tok.hasMoreTokens())
{
    try
    {
        String domain = serverName.substring(serverName.indexOf("." + tok.nextToken()), serverName.length());
        domains.add(domain);
    }
    catch (Throwable t)
    {
    	System.out.println(" "+t.getLocalizedMessage());
    }
    request.getSession().invalidate();

}

for (int idx1=0; idx1 < cookies.length; idx1++)
{
    cookie = cookies[idx1];
    if (cookie.getName().equalsIgnoreCase("SMSESSION"))
    {
        for (int idx2=0; idx2 < domains.size(); idx2++)
        {
            cookie.setDomain(((String)domains.get(idx2)));
            cookie.setPath("/");
            cookie.setMaxAge(0);
            response.addCookie(cookie);
        }
    }
}

%>

<html>
<head>
<TITLE>Application Error Page</TITLE>
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
			<ul type="disc">
			<li>&nbsp;Multiple processes clicked started at the same time</li>
			<li>&nbsp;Application is facing severe issue.Please close the browser and check back later or log a ticket to the support team</li>
				
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
