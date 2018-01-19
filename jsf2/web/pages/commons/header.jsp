<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/pages/commons/commontaglibs.jsp"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<h:form id="headerForm">
	<div class="header">
		<div class="top-links">
			<p class="welcome">
				Welcome,
				<sec:authentication property="principal.username" />
			</p>
			<p class="logout">
				<a4j:commandLink value="Logout" action="#{loginBean.exitApp }" />
			</p>
			<!-- <ul>
				<li><a href="">Help</a></li>
			</ul> -->
		</div>
		<div class="logo-panel">
			<h1 class="logo">
				<span>GE Energy</span>
			</h1>
			<h2 class="logo-text">
				<big class="fltLt">Contract Financial Inputs Reconciliation
					Manager - ConFIRM</big> <br /> <small><h:outputLabel
						value=" #{headerBean.roleTitle }" /> </small>
			</h2>
			<%-- <div class="quick-search">
				<input type="text" value="Quick Search..."
					class="placeholder search">
				<h:graphicImage value="/images/icons/search_icon.png"></h:graphicImage>
			</div> --%>
		</div>
		<div class="nav">
			<ul>
				<li><a4j:commandLink styleClass="menu"
						onclick="checkSaved(#{dataTableControlBean.changeDataCount });"
						style="background:#91867a;" value="Home"
						action="#{applicationMenuBean.getHomePage }" /></li>
				<%-- <li><a4j:commandLink value="Standard View" styleClass="menu"
						onclick="checkSaved(#{dataTableControlBean.changeDataCount });" />
				</li> --%>
				<li><a4j:commandLink value="Audit Log" styleClass="menu"
						onclick="checkSaved(#{dataTableControlBean.changeDataCount });"
						action="#{dataTableControlBean.loadLineItemPage }">
						<f:param name="lineItemId" value="11" />
					</a4j:commandLink></li>
				<li><h:outputLabel value="Report" styleClass="menu"
						style="color: #fff" />
					<div class="nav-drop">
						<rich:jQuery selector="#.nav li"
							query="mouseover(function(){jQuery(this).find('.nav-drop').show()})" />
						<rich:jQuery selector="#.nav li"
							query="mouseout(function(){jQuery(this).find('.nav-drop').hide()})" />
						<div class="nav-drop-top"></div>
						<div class="nav-drop-mid">
							<!-- <ul>
								<li><h:outputLabel value="Report ConFIRM"
										styleClass="ConFIRMreport"
										onclick="Richfaces.showModalPanel('Report ConFIRM');" />
								</li>
								<li><h:outputLabel value="Report 2"
										onclick="Richfaces.showModalPanel('reportDtl');" />
								</li>
							</ul> -->
							<ul>
								<%-- <li><h:commandLink value="Summary Report"
										action="#{artReportBean.summaryReport}" /></li>

								<li><h:commandLink value="Me Open Item Report"
										action="#{artReportBean.meOpenItem}" /></li>

								<li><h:commandLink value=" Inventory Report"
										action="#{artReportBean.meInventory}" /></li> --%>
									
								<%-- <li><a href="${pageContext.request.contextPath}/templates/DR4_macro.xlsm" title="Please click here to download the template ">DR4 Macro Template</a></li> --%>
								<li><h:outputLabel value="Report 1"
										onclick="Richfaces.showModalPanel('reportDtl');"
										/>
										</li>
								<li><h:outputLabel value="Report 2"
								        onclick="Richfaces.showModalPanel('reportDtl');"
                                        /></li>
							</ul>
						</div>
						<div class="nav-drop-btm"></div>
					</div>
				</li>
			</ul>
		</div>
		<!--  
		<div class="breadcrumb">
			<h2>
				<h:outputLabel value="#{headerBean.breadcrumbs}" />
			</h2>
			<div class="user-tools">
				<h2 class="user-tool-name">User Tool</h2>
				<ul>
					<li class="user-tool tools-print">
						<h3>
							<a href="#">Print</a>
						</h3>
					</li>
					<li class="user-tool tools-bookmark">
						<h3>
							<a href="#">Book Mark</a>
						</h3>
					</li>
				</ul>
			</div>
		</div>
		-->
	</div>
	<a4j:status onstart="#{rich:component('wait')}.show()"
		id="statusIndicator" onstop="#{rich:component('wait')}.hide()"
		rendered="#{homeBean.headerBean.processFlag }" />
	<rich:modalPanel id="wait" autosized="true" width="200" height="20"
		moveable="false" resizeable="false"
		style="position: fixed; left: 43%; top: 44%;">
		<f:facet name="header">
			<h:outputText value="Processing" />
		</f:facet>
		<h:panelGrid columns="1">
			<h:outputText value="Please Wait..." />
			<h:graphicImage value="/images/Wait.gif" />
		</h:panelGrid>
	</rich:modalPanel>
	<rich:modalPanel id="reportDtl" width="300" height="150"
		style="font:14px/20px 'GEInspiraPitch', Arial, Helvetica!important;">
		<div style="z-index: 300">
			<f:facet name="header">
				<rich:spacer style="border-style: none;" width="100%" height="10"></rich:spacer>
			</f:facet>
			<h:panelGrid columns="3" width="100%" border="0"
				styleClass="popupHeader">
				<h:graphicImage styleClass="filterIcon"
					value="/images/poup_close.png" id="hidelink1" />
				<rich:componentControl for="reportDtl" attachTo="hidelink1"
					operation="hide" event="onclick" />
			</h:panelGrid>
			<h:panelGrid columns="3">
				<h:outputText value="Reports is not available..." />
			</h:panelGrid>
		</div>
	</rich:modalPanel>
</h:form>

