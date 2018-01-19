/**
 * Project:      PGS - AA
 * Component:    Constants.java
 * Date-Written: May 23, 2012
 * Security:     GE-Confidential
 * Restrictions: GE PROPRIETARY INFORMATION, FOR GE USE ONLY
 *
 *     ****************************************************
 *     *  Copyright (C) 2012 General Electric Company     *
 *     *           All rights reserved                    *
 *     ****************************************************
 *
 */
package com.ge.energy.confirm.common.utility;

/**
 * @author 486028
 */
public class Constants {
	public static final int REJECTONE = 0x9;
	public static final int REJECTTWO = 0xA;
	public static final int REJECTTHREE = 0xD;
	public static final int REJECTFOUR = 0x20;
	public static final int REJECTFIVE = 0xD7FF;
	public static final int REJECTSIX = 0xE000;
	public static final int REJECTSEV = 0xFFFD;
	public static final int REJECTEGIN = 0x10000;
	public static final int REJECTNINE = 0x10FFFF;
	public static final int CALCULATECM = 100;

	/*********************************************************************/
	public static final int MINUS_ONE = -1;
	public static final long MINUS_ONE_L = -1L;
	public static final int TABLE_HEIGHT = 500;
	public static final int ROW_HIGHT = 23;
	public static final int HEARD_HIGHT = 150;

	/********************** HomeBean start ******************************/
	public static final String HOME = "home";
	public static final String ME_UNDERLINE = "me_";
	public static final String APPROVE_UNDERLINE = "approve_";
	public static final String MODEL = "model";
	public static final String POPUPPARAM = "popupParam";
	public static final String HIDMODELID = "hidModelId";
	public static final String HIDMODELNUM = "hidModelNum";
	public static final String HID_ME = "hidMe";
	public static final String HIDME = "hidMe";
	public static final String PX = "px";
	public static final String RECONCILE = "reconcile";
	public static final String CHECKBOX = "checkBox";
	// public static final String EXPNDTRCTGRYID = "expndtrCtgryId";
	public static final String CUSTOM_LIFECYCLE = "SessionLifecycle";
	/********************** BillingBean ********************************/
	public static final String BILLING = "billing";
	public static final String BILL_ING = "billing";
	public static final String TABVALUE = "tabValue";
	/********************** InventoryBean ********************************/
	public static final String INVENTORY = "inventory";
	/*****************/
	public static final String SELECTEDMODELID = "selectedModelId";

	public static final String USER_PROFILE = "USER_PROFILE";
	public static final String BREAD_CRUMB_HOME = "Home";
	public static final String BREAD_CRUMB_ADMIN = "Admin";

	public static final String PATTERJN_STRING = "(?:\\s|[;,])*\\$*([^;=]+)(?:=(?:[\"']((?:\\\\.|[^\"])*)[\"']|([^;,]*)))?(\\s*(?:[;,]+\\s*|$))";
	public static final String JSESSIONID = "JSESSIONID";
	public static final String SESSION_EXPIRE = "Expires";
	public static final Long SESSION_EXPIRE_ID = Long.valueOf("0");
	public static final String HEADER_PRAGMA = "Pragma";
	public static final String HEADER_NO_CACHE = "No-cache";
	public static final String HEADER_CACHE_CONTRL = "Cache-Control";
	public static final String HEADER_STRING = "no-store, no-cache, must-revalidate, post-check=0, pre-check=0";
	public static final String UTF = "UTF-8";
	public static final String SM_USER = "sm_user";
	public static final String CNFM_USER = "user";

	public static final String ITEM_SELECT = "Select";
	public static final String LOGOFF_LINK = "/logOff";
	public static final String PATH_SP = "/";
	public static final String JSP_PAGE = ".jsp";
	public static final String NULL_VALUE = "";

	public static final String REFRESH_PAGE = "refreshPage";
	public static final String OPEN_ITEM_PAGE = "openItemPage";
	public static final String ACTION_ITEM_PAGE = "actionItemPage";

	public static final String SECURI_ANO_USER = "anonymousUser";
	public static final String SECURI_ROLE_USER = "Finance";
	public static final String ROLE_PAGE = "roleSelect";
	public static final String SECURI_ROLE_USER_PRE = "ROLE_";
	public static final String ROLE_ID = "roleId";

	public static final String ROLE_SELECT_PAGE = "roleSelect";
	public static final String ROLE_SELECT_MSG = "Please select one role!";

	public static final String IRS_PAGE = "irservice";
	public static final String IFS_PAGE = "ifservice";

	public static final String ZERO_STRING = "0";
	public static final String ONE_STRING = "1";
	public static final String YES = "Yes";
	public static final String NO = "No";
	public static final String Y_VALUE = "Y";
	public static final String N_VALUE = "N";
	public static final String DATE_FORMAT = "MM-dd-yyyy";

	/******* lineItem Id **********/
	public static final long INV_EXP_CTGRY_ID = 0;
	public static final long PARTS_EXP_CTGRY_ID = 1;
	public static final long CS_EXP_CTGRY_ID = 2;
	public static final long IFS_EXP_CTGRY_ID = 3;
	public static final long IRS_EXP_CTGRY_ID = 4;
	public static final long BILL_EXP_CTGRY_ID = 5;
	public static final long OPEN_EXP_CTGRY_ID = 6;
	public static final long ACTION_EXP_CTGRY_ID = 7;

	public static final long AUDIT_EXP_CTGRY_ID = 11;
	public static final long ME_EXP_CTGRY_ID = 12;
	public static final long MODEL_EXP_CTGRY_ID = 13;
	public static final long ROLL_UP_EXP_CTGRY_ID = 14;
	public static final long ROLL_UP_DETAILS_CTGRY_ID = 15;
	public static final long DR4_CTGRY_ID = 16;

	/************* FinSum *************/
	public static final String FINSUMPAGE = "finSumPage";
	public static final String QTR = "Qtr";
	public static final String ME = "Me";
	public static final String MODEL_ID = "modelId";
	public static final String MODEL_NUM = "modelNum";
	public static final String EXPND_TR_CTGRYID = "expndtrCtgryId";
	public static final String ERPSALES = "erpSales";
	public static final String ERPCOST = "erpCost";
	public static final String ERP_SALES = "erpSales";
	public static final String ERP_COST = "erpCost";
	public static final String ERPSTASALES = "erpStaSales";
	public static final String GLAMOUNT = "glAmont";
	public static final String SALCOST_FLAG = "salCostFlag";
	public static final String GPSTA_FLAG = "gpStaFlag";
	public static final String QTR_LAST = "last";
	public static final String QTR_SECOND = "second";
	public static final String PART_ID = "1";
	public static final String CS_ID = "2";
	public static final String IFS_ID = "3";
	public static final String IRS_ID = "4";
	public static final String BILLING_ID = "5";
	public static final String INVERTY_IDS = "6";
	public static final String INVERTY_ID = "0";
	public static final String GL_FLAG_G = "G";
	public static final String GL_FLAG_S = "S";
	public static final String SC_FLAG_S = "S";
	public static final String SC_FLAG_C = "C";
	public static final String GLCOST = "glCost";
	public static final String GL_COST = "glCost";
	public static final String GLSALES = "glSales";
	public static final String GL_SALES = "glSales";
	public static final String GLSTASALES = "glStaSales";
	public static final String GLSTACOST = "glStaCost";
	public static final String GL_BILLING = "glBilling";
	public static final String GLBILLING = "glBilling";
	public static final String ERPSTACOST = "erpStaCost";

	public static final String TOTAL_GAAP_SALE = "totalGAAPSale";
	public static final String TOTAL_GAAP_COST = "totalGAAPCost";
	/** GAAP STAT Radio option **/
	public static final String GAAP = "gaap";
	public static final String STAT = "stat";
	public static final String GAAPSTAT = "gaapStat";

	/** Duration attribution **/
	public static final String QUARTER_TIME = "quarterTime";
	public static final String CONTRACT_TO = "contractTo";
	public static final String QUARTER_FROM = "quarterFrom";
	public static final String QUARTER_TO = "quarterTo";
	public static final String STAT_SALES = "STAT Sales";
	public static final String STAT_COST = "STAT Costs";
	public static final String GAAP_SALES = "GAAP Sales";
	public static final String GAAP_COST = "GAAP Costs";
	public static final boolean TRUE = true;
	public static final boolean FALSE = false;
	/** PartBean ***/
	public static final String PARTSPAGE = "partsPage";
	public static final String OPENITEM = "openItem";
	public static final String COMMENTITEM = "commonItem";

	/*** CsBean ***/
	public static final String CSPAGE = "csPage";

	public static final String APP_HOME_PAGE = "homePage";
	public static final String HOME_BEAN = "homeBean";
	public static final String HEADER_BEAN = "headerBean";
	public static final String ROLL_UP_PAGE = "rollUpPage";
	public static final String RECONCILE_YN = "reconcileYN";
	public static final String ME_IN_FORM = "me";
	public static final String ME_ID = "meId";

	public static final String CON_QTER_END = "conQterend";

	public static final String UNKNOWN = "unknown";

	public static final int INT_ONE_VALUE = 1;
	public static final int INT_TWO_VALUE = 2;
	public static final int INT_THREE_VALUE = 3;
	public static final int INT_FOUR_VALUE = 4;
	public static final int INT_FIVE_VALUE = 5;
	public static final int INT_SIX_VALUE = 6;
	public static final int INT_SEVEN_VALUE = 7;
	public static final int INT_EIGHT_VALUE = 8;
	public static final int INT_NINE_VALUE = 9;
	public static final int INT_TEN_VALUE = 10;

	/** Download excel **/
	public static final String PART_TEMPLATE = "Parts upload template";
	public static final String RS_TEMPLATE = "RS upload template";
	public static final String FS_TEMPLATE = "FS upload template";
	public static final String CS_TEMPLATE = "CS upload template";
	public static final String BILLINGS_TEMPLATE = "Billings upload template";
	public static final String INVERTY_TEMPLATE = "Inverty upload template";
	public static final String OPENITEM_TEMPLATE = "Openitems upload template";
	public static final String ACTION_TEMPLATE = "Actionitems upload template";
	public static final String FIN_SUMMARY_TAB = "ConFIRM summary tab";
	public static final String GL_TIEOUT_TAB = "GL ConFIRM tie-out tab";
	public static final String INVENTORY_TAB = "Inventory tab";
	public static final String ART_NON_OPN_MSG = "No active Open Items are available for this model";

	/** Task Code **/
	public static final String TASK_HISTORY_FLAG = "tskHistoryFlg";

	public static final String LOGOUT_PAGE = "logout";

	public static final String PAGE_ZIZE = "20";
	public static final int SCROLLER_PAGE = 1;
	/** All pages. **/
	public static final String PAGE_ALL = "All";
	public static final String TABLE_DEF_HEIGHT = "100%";

	public static final String RECON_PARTS = "Parts";
	public static final String RECON_REPAIRS = "Repairs";
	public static final String RECON_FIELD_SERV = "Field Svcs";
	public static final String RECON_CS = "CS";
	public static final String RECON_BILLING = "Billing";
	public static final String RECON_INVERTY = "Inventory";
	public static final String RECON_TRANS_NUM = "Tran #";
	public static final String RECON_ACCT_NUM = "Account #";
	public static final String RECON_CTGR_ID = "ctgrId";
	public static final String RECON_TRAN_NUM_FORM = "tranNum";
	public static final String RECON_ACCT_NUM_FORM = "acctNum";

	/** Audit Log module **/
	public static final String AUDIT_LOG = "AuditLog";

	public static final String STATUS_ID = "statusId";
	public static final String RECON_MDL_ID = "ReconMdlId";

	/** User selected role id **/

	public static final long SELECTED_FINROLE_ID = 1;
	public static final long SELECTED_CACS_ROLE_ID = 2;
	public static final long SELECTED_MODELROLE_ID = 3;
	public static final long SELECTED_CATALOGROLE_ID = 4;
	public static final long SELECTED_ADMINROLE_ID = 5;
	public static final long SELECTED_CPMROLE_ID = 6;
	public static final long SELECTED_READONLYROLE_ID = 7;
	public static final long SELECTED_RECONCILIATIONROLE_ID = 8;

	public static final String CLOSE_ITEM = "C";
	public static final String OPEN_ITEM = "O";
	public static final String ROLE_TITLE_CPM = "roleTitleCPM";

	public static final String ROLE_TITLE_FIN = "roleTitleFIN";
	public static final String ROLE_TITLE_CAC = "roleTitleCAC";
	public static final String ROLE_TITLE_MODELING = "roleTitleModeling";
	public static final String ROLE_TITLE_CATALOG = "roleTitleCatalog";
	public static final String ROLE_TITLE_ADMIN = "roleTitleAdmin";
	public static final String ROLE_TITLE_READONLY = "roleTitleReadOnly";
	public static final String ROLE_TITLE_RECONCILIATION = "roleTitleReconciliation";

	/** table sequence */
	public static final long CUSTOM_ME_TABLE_ID = 1;
	public static final long CUSTOM_MODEL_TABLE_ID = 2;
	public static final long CUSTOM_PART_TABLE_ID = 3;
	public static final long CUSTOM_CS_TABLE_ID = 4;
	public static final long CUSTOM_IR_TABLE_ID = 5;
	public static final long CUSTOM_IF_TABLE_ID = 6;
	public static final long CUSTOM_BILLING_TABLE_ID = 7;
	public static final long CUSTOM_INVENTORY_TABLE_ID = 8;
	public static final long CUSTOM_OPENITEM_TABLE_ID = 9;
	public static final long CUSTOM_ACTIONITEM_TABLE_ID = 10;
	public static final long CUSTOM_AUDIT_TABLE_ID = 11;
	public static final long CUSTOM_ROLLUP_TABLE_ID = 12;
	public static final long CUSTOM_ROLLUP_DETAILS_TABLE_ID = 13;
	public static final long CUSTOM_DR4_RESULT_TABLE_ID = 14;

	public static final String CUSTOM_ME_TABLE_NAME = "me_screen";
	public static final String CUSTOM_MODEL_TABLE_NAME = "model_screen";
	public static final String CUSTOM_PART_TABLE_NAME = "part_screen";
	public static final String CUSTOM_CS_TABLE_NAME = "cs_screen";
	public static final String CUSTOM_IR_TABLE_NAME = "ir_screen";
	public static final String CUSTOM_IF_TABLE_NAME = "if_screen";
	public static final String CUSTOM_BILLING_TABLE_NAME = "billing_screen";
	public static final String CUSTOM_INVENTORY_TABLE_NAME = "inventory_screen";
	public static final String CUSTOM_OPENITEM_TABLE_NAME = "openItem_screen";
	public static final String CUSTOM_ACTIONITEM_TABLE_NAME = "actionItem_screen";
	public static final String CUSTOM_AUDIT_TABLE_NAME = "auditLog_screen";
	public static final String CUSTOM_ROLLUP_TABLE_NAME = "rollUp_screen";
	public static final String CUSTOM_ROLLUP_DETAILS_TABLE_NAME = "roll_details_screen";
	public static final String CUSTOM_DR4_RESULT_TABLE_NAME = "dr4_result_screen";

	public static final String APPROVAL_COUNT = "cntNum";
	public static final String FROM_MAIL_ADDRESS = "Badri.Krishnan@ge.com";
	public static final String CPM_MAIL_ADDRESS = "Badri.Krishnan@ge.com";
	public static final String FINANCE_MAIL_ADDRESS = "Badri.Krishnan@ge.com";
	public static final String CATALOG_RISK_ADDRESS = "Badri.Krishnan@ge.com";
	public static final String CC_ADDRESS = "Badri.Krishnan@ge.com";
	public static final double ZOERO_FORMAT = 0.00;

	public static final String TSKCDID = "tskCdId";
	public static final String TRANID = "tranIdVar";

	/** Role in security **/
	public static final String ROLE_CMP = "ROLE_CMP";
	public static final String ROLE_FINANCE = "ROLE_FINANCE";
	public static final String ROLE_ADMIN = "ROLE_ADMIN";
	public static final String ROLE_MODEL = "ROLE_MODEL";
	public static final String ROLE_CAS = "ROLE_CAS";
	public static final String ROLE_CATALOG = "ROLE_CATALOG";
	public static final String ROLE_SERVICE = "ROLE_SERVICE";
	public static final String ROLE_READONLY = "ROLE_READONLY";
	public static final String ROLE_RECONCILIATION = "ROLE_RECONCILIATION";

	// /**Role Name in database**/
	public static final String FINACE_USER = "FINACE_USER";
	public static final String CSA_USER = "CSA_USER";
	public static final String MODEL_USER = "MODEL_USER";
	public static final String CATALOG_USER = "CATALOG_USER";
	public static final String ADMIN_USER = "ADMIN_USER";
	public static final String CPM_USER = "CPM_USER";
	public static final String SERVICE_DIRECTOR = "SERVICE_DIRECTOR";
	public static final String READONLY_USER = "READONLY_USER";
	public static final String RECONCILIATION_USER = "RECONCILIATION_USER";

	public static final String PROPERT_FILE = "/confirm.properties";
	public static final String LINE_ITEM_ID = "lineItemId";
	public static final String CLOSE_ITEM_VAR = "closeItem";
	public static final String CLOSE_ACTEM_VAR = "closeActiItem";

	public static final String SYNCH_METHOD_NAME = "synchroTotalGAAP";
	public static final String TRAN_METHOD = "getTranId";
	public static final String ROW_KEY = "rowKeyVar";

	/** Any role's tableState ***/
	public static final String DEF_ME_STATE_CPM = "defMeStateCPM";
	public static final String DEF_MODEL_STATE_CPM = "defModelStateCPM";
	public static final String DEF_ME_STATE_FIN = "defMeStateFIN";
	public static final String DEF_MODEL_STATE_FIN = "defModelStateFIN";
	public static final String DEF_ME_STATE_OTHER = "defMeStateOther";
	public static final String DEF_MODEL_STATE_OTHER = "defModelStateOther";
	public static final String STATUS_DESC_MAP_ID = "statusDescMapID";
	public static final String DEF_ME_STATE_CATA = "defMeStateCatalog";
	public static final String DEF_ME_STATE_REC = "defMeStateRec";
	public static final String DEF_MODEL_STATE_REC = "defModelStateRec";

	public static final String AUDIT_LOG_STATE = "auditLogState";
	public static final String PARTS_STATE = "partsState";
	public static final String REPAIR_STATE = "repairState";
	public static final String FIELD_STATE = "fieldState";
	public static final String CS_STATE = "csState";
	public static final String BILLING_STATE = "billingState";
	public static final String INVENTORY_STATE = "inventoryState";
	public static final String OPEN_ITEM_STATE = "openItemState";
	public static final String ACTION_ITEM_STATE = "actionItemState";
	public static final String ROLLUP_STATE = "rollupState";
	public static final String ROLLUP_DETAILS_STATE = "rollupDetailsState";
	public static final String DR4_RESULT_STATE = "dr4ResultState";
	public static final String DR4_ERROE_STATE = "dr4ErrorState";
	public static final String DR4_MID_ERROE_STATE = "dr4MidErrState";
	public static final String APPROVE_STATE = "approveState";

	/** Open Item Status **/
	public static final String OPENSTATUS = "O";
	public static final String CLOSESTATUS = "C";
	public static final String OPNITMEXISTFLG = "F";
	public static final String OPNIMEEXISTFLGS = "T";
	public static final String ACTITMEXISTFLG = "F";
	public static final String ACTITMEXISTFLGS = "T";

	public static final String HIS_ERP_FLAG = "HISTORY LOAD";

	// Search messages
	public static final String SEARCH_PAGE = "searchPage";
	public static final String TITLE_SEARCH = "Search";
	public static final String ADVANCE_SEARCH_PAGE = "advanceSearchPage";
	public static final String TITLE_ADVANCE_SEARCH = "Advance Search";
	public static final String EQUAL_MARK = "=";
	public static final String STAR_MARK = "*";
	public static final String PERCENTAGE_MARK = "%";
	public static final String SEARCH_FORMAT = "The format of search is not correct.";
	public static final String SEARCH_NOT_FOUND = "Data not found.";
	public static final String SEARCH_DEFAULT_VALUE = "Quick Search...";
	public static final String SEARCH_MODEL_ID = "Model ID";
	public static final String SEARCH_PROJECT = "Project";

	public static final String SUCCESS_MSG = "success";
	public static final String VALIDATION_SUCCESS_MSG = "Validation successful";
	public static final String APPROVE_FAIL = " approve is failed.";
	public static final String REJECT_FAIL = " reject is failed.";

	public static final String ME_NAME = "mgmtEntyName";

	public static final double COMPARE_DIFF = 0.0000001;
	public static final double CM_RATE_MULTI = 0.01;
	public static final String HALF_QUOT_MARK = "\"";
	public static final String COLON_MARK = ":";
	public static final String COMMA_MARK = ",";
	public static final String COLUMN_MODEL_STATE = "columnModelState";
	public static final String COLUMN_ORDER_START = "\"columnsOrder\":[";
	public static final String COLUMN_ORDER_END = "]}";
	public static final String COLUMN_ITEM_DESC = "itemDesc";

	public static final String CLOSE_STATUS = "C";
	public static final String AT_FLAG = "@";
	public static final String TASK_VAR = "taskCdVar";
	public static final String MDLBUCK_VAR = "modelBucketVar";
	public static final String CATABUCK_VAR = "catalogVar";
	public static final String FILTERS = "filters";
	public static final String FILTER_ALL = "filterAll";

	public static final String CPM_TITLE = "CPM";
	public static final String CATALOG_TITLE = "Catalog/Risk";
	public static final String FINANCE_TITLE = "Finance";
	public static final String RECONCILIATION_TITLE = "Reconciliation";
	public static final String RECONCILIATION_APPROVE_MAIL = "RECONCILIATION_APPROVE_MAIL";
	public static final String CPM_APPROVE_MAIL = "CPM_APPROVE_MAIL";
	public static final String CATALOG_APPROVE_MAIL = "CATALOG_APPROVE_MAIL";
	public static final String FINANCE_APPROVE_MAIL = "FINANCE_APPROVE_MAIL";
	public static final String CATALOG_REJECT_MAIL = "CATALOG_REJECT_MAIL";
	public static final String FINANCE_REJECT_MAIL = "FINANCE_REJECT_MAIL";
	public static final String CPM_ROLLUP_MAIL = "CPM_ROLLUP_MAIL";
	public static final String FINANCE_ROLLUP_MAIL = "FINANCE_ROLLUP_MAIL";

	public static final String AUDIT_PART_NAME = "PARTS";
	public static final String AUDIT_REPAIR_NAME = "Repair Services";
	public static final String AUDIT_FIELD_NAME = "Field Services";
	public static final String AUDIT_CS_NAME = "CS/Others";
	public static final String AUDIT_BILLING_NAME = "BILLING";
	public static final String AUDIT_INVENTORY_NAME = "Inventory";
	public static final String AUDIT_OPEN_ITEM_NAME = "Open Item";
	public static final String AUDIT_ACTION_ITEM_NAME = "Action Item";
	public static final String AUDIT_ROLL_UP_NAME = "Roll Up";

	public static final String CLEAR_FILTERS = "ClearFilters";
	public static final String TAB_NAME = "tabName";
	public static final String APPROVE = "approve";
	public static final String HIS_MODELUCK = "hisModelBucketVar";
	public static final String HIS_CATALOG = "hisCatalogVar";
	public static final String CHANG_VAR = "changValue";

	// Audit log name.
	public static final String TASK_CODE = "Task Code";
	public static final String MODEL_BUCKET = "Model Bucket";
	public static final String CATALOG_BUCKET = "Catalog Bucket";
	public static final String FALL_OUT_ID = "Fall Out Id";
	public static final String OUT_IN_IND = "Out In Ind";
	public static final String SUPPLIER_INVOICE = "Supplier Invoice";
	public static final String CPM_COMMENTS = "CPM Comments";
	public static final String EXTRA_WORK_BUS_REASON = "Extra Work Business Reason";
	public static final String FEE_TYPE = "Fee Type";
	public static final String SUB_FEE_TYPE = "Sub Fee Type";
	public static final String MARGIN_REVIEW_FLAG = "Margin Review Flag";
	public static final String CUST_PO_NUM = "Customer PO Number";
	public static final String FIN_COMMENTS = "Finance Comments";
	public static final String RISK_ANALYST_COMMENT = "Risk Analyst Comment";
	public static final String REVIEW_COMPLETE = "Review Complete";
	public static final String AR_INVOICE_NUM = "Ar Invoice Number";
	
	//Access log function name.
	public static final String CONFIRM_LOGIN = "CONFIRM_Login";
	public static final String CONFIRM_URL = "CONFIRM_URL-PAGE";
	public static final String CONFIRM_ME_HOME = "CONFIRM_ME-HOME-PAGE";
	public static final String CONFIRM_MODEL_HOME = "CONFIRM_MODEL-HOME-PAGE";
	public static final String CONFIRM_RECON = "CONFIRM_RECONCILIATION-PAGE";
	public static final String CONFIRM_RECON_ME_HOME = "CONFIRM_RECON-ME-HOME-PAGE";
	public static final String CONFIRM_SUMMARY = "CONFIRM_FINANCIAL-SUMMARY-PAGE";
	public static final String CONFIRM_PARTS = "CONFIRM_PARTS-PAGE";
	public static final String CONFIRM_CS_OTHERS = "CONFIRM_CS-OTHERS-PAGE";
	public static final String CONFIRM_BILLING = "CONFIRM_BILLING-PAGE";
	public static final String CONFIRM_OPENITEM = "CONFIRM_OPENITEM-PAGE";
	public static final String CONFIRM_ACTIONITEM = "CONFIRM_ACTIONITEM-PAGE";
	public static final String CONFIRM_AUDITLOG = "CONFIRM_AUDITLOG-PAGE";
	public static final String CONFIRM_DOWNLOAD_EXCEL = "CONFIRM_DOWNLOAD-EXCEL-PAGE";
}