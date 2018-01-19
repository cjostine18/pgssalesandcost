<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/pages/commons/commontaglibs.jsp"%>
<%@ include file="/pages/commons/extendTable.jsp"%>
<html>
<head>
<title>Auto Actualization</title>
</head>
<body>
	<f:view>
		<div class="wrapper">
			<div class="container">
				<div class="inner-container">
					<h:form id="headerForm">
						<h:panelGroup id="search">
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
										<big class="fltLt">Contract Financial Inputs Reconciliation Manager - ConFIRM</big> <br /> <small><h:outputLabel
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
										<li><a4j:commandLink styleClass="menu" value="Home"
												action="#{applicationMenuBean.getHomePage }" /></li>
										<%-- <li><a4j:commandLink value="Standard View"
												styleClass="menu" action="#{homeBean.homePage }" /></li> --%>
										<li><a4j:commandLink value="Audit Log" styleClass="menu"
												style="background:#91867a;"
												action="#{dataTableControlBean.loadLineItemPage }">
												<f:param name="lineItemId" value="11" />
											</a4j:commandLink></li>
										<li><a4j:commandLink value="Report" styleClass="menu"
												action="#{downloadExcelBean.downloadExcel }" />
											<div class="nav-drop">
												<rich:jQuery selector="#.nav li"
													query="mouseover(function(){jQuery(this).find('.nav-drop').show()})" />
												<rich:jQuery selector="#.nav li"
													query="mouseout(function(){jQuery(this).find('.nav-drop').hide()})" />
												<div class="nav-drop-top"></div>
												<div class="nav-drop-mid">
													<ul>
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
							</div>
							<a4j:status onstart="#{rich:component('wait')}.show()"
								id="statusIndicator" onstop="#{rich:component('wait')}.hide()"
								rendered="#{homeBean.headerBean.processFlag }" />
							<rich:modalPanel id="wait" autosized="true" width="200"
								height="20" moveable="false" resizeable="false"
								style="position: fixed; left: 43%; top: 44%;">
								<f:facet name="header">
									<h:outputText value="Processing" />
								</f:facet>
								<h:panelGrid columns="1">
									<h:outputText value="Please Wait..." />
									<h:graphicImage value="/images/Wait.gif" />
								</h:panelGrid>
							</rich:modalPanel>
						</h:panelGroup>
					</h:form>
				</div>
			</div>
		</div>

		<div class="wrapper">
			<div class="container">
				<div class="inner-container">
					<div class="content">
						<div class="shadow home-content">
							<rich:spacer height="15px" />
							<div class="form">
								<h:form id="auditLogForm">
									<h:panelGroup id="dataTable">
										<a4j:commandButton value="#{messages.saveGrid }"
											rendered="#{roleSelectionBean.readOnly }"
											styleClass="saveButton grid" reRender="dataTable"
											action="#{dataTableControlBean.saveUserColumns }" />
										<!-- <div class="table-2"> -->
										<rich:extendedDataTable sortMode="multi" selectionMode="multi"
											id="logList" headerClass="theader"
											value="#{dataTableControlBean.tableData}" var="item"
											tableState="#{dataTableControlBean.tableState }"
											onRowMouseOver="this.style.backgroundColor='#F1F1F1'"
											onRowMouseOut="this.style.backgroundColor='#FFFFFF'"
											rows="#{dataTableControlBean.rows}">
											<rich:column sortBy="#{item.changeDateTime}"
												label="Change DateTime" id="changeDateTime">
												<f:facet name="header">
													<h:outputText value="Date and Time of Change"
														styleClass="left" />
												</f:facet>
												<f:facet name="filter">
													<h:graphicImage
														value="#{dataTableControlBean.auditLogVO.changeDateTimeFilter }">
														<a4j:support event="onclick" reRender="filterColumns"
															ajaxSingle="true"
															actionListener="#{dataTableControlBean.loadModalPanelData }"
															oncomplete="Richfaces.showModalPanel('filterColumns')">
															<f:attribute name="popupParam" value="changeDateTime"></f:attribute>
														</a4j:support>
													</h:graphicImage>
												</f:facet>
												<h:outputText value="#{item.changeDateTime}" />
											</rich:column>
											<rich:column sortBy="#{item.changeBy}" label="Change By"
												id="changeBy">
												<f:facet name="header">
													<h:outputText value="Changed By" styleClass="left" />
												</f:facet>
												<f:facet name="filter">
													<h:graphicImage
														value="#{dataTableControlBean.auditLogVO.changeByFilter }">
														<a4j:support event="onclick" reRender="filterColumns"
															ajaxSingle="true"
															actionListener="#{dataTableControlBean.loadModalPanelData }"
															oncomplete="Richfaces.showModalPanel('filterColumns')">
															<f:attribute name="popupParam" value="changeBy"></f:attribute>
														</a4j:support>
													</h:graphicImage>
												</f:facet>
												<h:outputText value="#{item.changeBy}" />
											</rich:column>
											<rich:column sortBy="#{item.modelNum}" label="Model Number"
												id="modelNum">
												<f:facet name="header">
													<h:outputText value="Model Number" styleClass="left" />
												</f:facet>
												<f:facet name="filter">
													<h:graphicImage
														value="#{dataTableControlBean.auditLogVO.modelNumFilter }">
														<a4j:support event="onclick" reRender="filterColumns"
															ajaxSingle="true"
															actionListener="#{dataTableControlBean.loadModalPanelData }"
															oncomplete="Richfaces.showModalPanel('filterColumns')">
															<f:attribute name="popupParam" value="modelNum"></f:attribute>
														</a4j:support>
													</h:graphicImage>
												</f:facet>
												<h:outputText value="#{item.modelNum}" />
											</rich:column>
											<rich:column sortBy="#{item.me}" label="CS PoNum" id="me">
												<f:facet name="header">
													<h:outputText value="ME" styleClass="left" />
												</f:facet>
												<f:facet name="filter">
													<h:graphicImage
														value="#{dataTableControlBean.auditLogVO.meFilter }">
														<a4j:support event="onclick" reRender="filterColumns"
															ajaxSingle="true"
															actionListener="#{dataTableControlBean.loadModalPanelData }"
															oncomplete="Richfaces.showModalPanel('filterColumns')">
															<f:attribute name="popupParam" value="me"></f:attribute>
														</a4j:support>
													</h:graphicImage>
												</f:facet>
												<h:outputText value="#{item.me}" />
											</rich:column>
											<rich:column sortBy="#{item.pl}" label="P&L" id="pl">
												<f:facet name="header">
													<h:outputText value="P&L" styleClass="left" />
												</f:facet>
												<f:facet name="filter">
													<h:graphicImage
														value="#{dataTableControlBean.auditLogVO.plFilter }">
														<a4j:support event="onclick" reRender="filterColumns"
															ajaxSingle="true"
															actionListener="#{dataTableControlBean.loadModalPanelData }"
															oncomplete="Richfaces.showModalPanel('filterColumns')">
															<f:attribute name="popupParam" value="pl"></f:attribute>
														</a4j:support>
													</h:graphicImage>
												</f:facet>
												<h:outputText value="#{item.pl}" />
											</rich:column>
											<rich:column sortBy="#{item.transNum}" label="Trans Number"
												id="transNum">
												<f:facet name="header">
													<h:outputText value="Transaction Number" styleClass="left" />
												</f:facet>
												<f:facet name="filter">
													<h:graphicImage
														value="#{dataTableControlBean.auditLogVO.transNumFilter }">
														<a4j:support event="onclick" reRender="filterColumns"
															ajaxSingle="true"
															actionListener="#{dataTableControlBean.loadModalPanelData }"
															oncomplete="Richfaces.showModalPanel('filterColumns')">
															<f:attribute name="popupParam" value="transNum"></f:attribute>
														</a4j:support>
													</h:graphicImage>
												</f:facet>
												<h:outputText value="#{item.transNum}" />
											</rich:column>
											<rich:column sortBy="#{item.action}" label="Action Taken"
												id="action">
												<f:facet name="header">
													<h:outputText value="Action Taken" styleClass="left" />
												</f:facet>
												<f:facet name="filter">
													<h:graphicImage
														value="#{dataTableControlBean.auditLogVO.actionFilter }">
														<a4j:support event="onclick" reRender="filterColumns"
															ajaxSingle="true"
															actionListener="#{dataTableControlBean.loadModalPanelData }"
															oncomplete="Richfaces.showModalPanel('filterColumns')">
															<f:attribute name="popupParam" value="action"></f:attribute>
														</a4j:support>
													</h:graphicImage>
												</f:facet>
												<h:outputText value="#{item.action}" />
											</rich:column>
											<rich:column sortBy="#{item.fieldChange}"
												label="Field Changed" id="fieldChange">
												<f:facet name="header">
													<h:outputText value="Field Changed" styleClass="left" />
												</f:facet>
												<f:facet name="filter">
													<h:graphicImage
														value="#{dataTableControlBean.auditLogVO.fieldChangeFilter }">
														<a4j:support event="onclick" reRender="filterColumns"
															ajaxSingle="true"
															actionListener="#{dataTableControlBean.loadModalPanelData }"
															oncomplete="Richfaces.showModalPanel('filterColumns')">
															<f:attribute name="popupParam" value="fieldChange"></f:attribute>
														</a4j:support>
													</h:graphicImage>
												</f:facet>
												<h:outputText value="#{item.fieldChange}" />
											</rich:column>
											<rich:column sortBy="#{item.fromValue}" label="From Value"
												id="fromValue">
												<f:facet name="header">
													<h:outputText value="From Value" styleClass="left" />
												</f:facet>
												<f:facet name="filter">
													<h:graphicImage
														value="#{dataTableControlBean.auditLogVO.fromValueFilter }">
														<a4j:support event="onclick" reRender="filterColumns"
															ajaxSingle="true"
															actionListener="#{dataTableControlBean.loadModalPanelData }"
															oncomplete="Richfaces.showModalPanel('filterColumns')">
															<f:attribute name="popupParam" value="fromValue"></f:attribute>
														</a4j:support>
													</h:graphicImage>
												</f:facet>
												<h:outputText title="#{item.fromValue}"
													value="#{item.fromValue}" />
											</rich:column>
											<rich:column sortBy="#{item.toValue}" label="To Value"
												id="toValue">
												<f:facet name="header">
													<h:outputText value="To Value" styleClass="left" />
												</f:facet>
												<f:facet name="filter">
													<h:graphicImage
														value="#{dataTableControlBean.auditLogVO.toValueFilter }">
														<a4j:support event="onclick" reRender="filterColumns"
															ajaxSingle="true"
															actionListener="#{dataTableControlBean.loadModalPanelData }"
															oncomplete="Richfaces.showModalPanel('filterColumns')">
															<f:attribute name="popupParam" value="toValue"></f:attribute>
														</a4j:support>
													</h:graphicImage>
												</f:facet>
												<h:outputText title="#{item.toValue}"
													value="#{item.toValue}" />
											</rich:column>
										</rich:extendedDataTable>
										<!-- </div> -->
										<h:panelGrid columns="5" width="100%" cellspacing="2">
											<rich:datascroller id="eventPagination" align="right"
												maxPages="5" ignoreDupResponses="false" reRender="dataTable"
												for="logList" />
											<rich:spacer width="32px" />
											<h:panelGroup styleClass="right">
												<h:outputText value="Records per page"
													styleClass="pageRecord" />
												<h:selectOneMenu value="#{auditLogBean.page}"
													style="width: 50px;">
													<f:selectItems value="#{dataTableControlBean.pages }" />
													<a4j:support event="onchange"
														reRender="dataTable,eventPagination" />
												</h:selectOneMenu>
											</h:panelGroup>
										</h:panelGrid>
									</h:panelGroup>
								</h:form>
							</div>
						</div>
					</div>
					<jsp:include page="/pages/commons/footer.jsp" />
				</div>
			</div>
		</div>
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
			     <rich:componentControl for="reportDtl"
				     attachTo="hidelink1" operation="hide" event="onclick" />
		    </h:panelGrid>
			<h:panelGrid columns="3">
			     <h:outputText value="Reports is not available..." />
			</h:panelGrid>
		</div>
	</rich:modalPanel>
		<jsp:include page="/pages/summary/filter.jsp" />
	</f:view>
</body>
</html>
