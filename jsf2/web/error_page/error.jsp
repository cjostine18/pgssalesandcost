<%@page isErrorPage="true" contentType="text/html" %>

<html>

<head>
    <title>GE Infrastructure</title>
    <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
    <script type="text/javascript"></script>
    <style type="text/css">@import url("error_page/styles.css");</style>
</head>

<body>
    <div id="frame">
        <div id="mast"><img src="error_page/header.gif" alt="GE Infrastructure" width="250" height="53" /></div>
            <div id="contentcenter">
                <p>
                    <img src="error_page/server.gif" alt="Server Error" width="86" height="18" /><br/>
                    An error (<b>${pageContext.errorData.statusCode}</b>) has occured.  <a href="javascript:history.go(-1);">Click here</a> to go back and try again.
                    <br/><br/><br/><br/><br/><br/><br/><br/><br/>
                </p>
            </div>
            <br clear="all" />
        </div>
    <div id="footer">
        <div id="prop">THIS SITE CONTAINS GE PROPRIETARY INFORMATION</div>
            <p><font class="warn">WARNING:</font>  YOU ARE ATTEMPTING TO ACCESS A PRIVATE COMPUTER SYSTEM.  ACCESS TO THIS SYSTEM IS RESTRICTED TO AUTHORIZED PERSONS ONLY.  THIS SYSTEM MAY NOT BE USED FOR ANY PURPOSE THAT IS UNLAWFUL OR DEEMED INAPPROPRIATE.  ACCESS AND USE OF THIS SYSTEM IS ELECTRONICALLY MONITORED AND, BY ENTERING THIS SYSTEM, YOU ARE GIVING YOUR CONSENT TO BE ELECTRONICALLY MONITORED.  WE RESERVE THE RIGHT TO SEEK ALL REMEDIES FOR UNAUTHORIZED USE, INCLUDING PROSECUTION.<br />
            </p>
        </div>
        <div id="copyright">
            <p>Copyright General Electric Company 2012<br />
            </p>
        </div>
    </div>
</body>

</html>
