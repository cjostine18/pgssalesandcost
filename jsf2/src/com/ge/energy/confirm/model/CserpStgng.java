/**
 * Project:      PGS - AA
 * Component:    CserpStgng.java
 * Date-Written: 2012-9-20
 * Security:     GE-Confidential
 * Restrictions: GE PROPRIETARY INFORMATION, FOR GE USE ONLY
 *
 *     ****************************************************
 *     *  Copyright (C) 2012 General Electric Company     *
 *     *           All rights reserved                    *
 *     ****************************************************
 *
 */
package com.ge.energy.confirm.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * CnfmCserpStgng entity.
 */
@Entity
@Table(name = "CNFM_CSERP_STGNG", schema = "CNFM")
public class CserpStgng implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2137134592113840856L;
	private CserpStgngId id;

	/** default constructor */
	public CserpStgng() {
	}

	/** full constructor */
	public CserpStgng(CserpStgngId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "srcCode", column = @Column(name = "SRC_CODE")),
			@AttributeOverride(name = "tranNum", column = @Column(name = "TRAN_NUM", nullable = false, scale = 0)),
			@AttributeOverride(name = "projNum", column = @Column(name = "PROJ_NUM")),
			@AttributeOverride(name = "tskNum", column = @Column(name = "TSK_NUM")),
			@AttributeOverride(name = "custName", column = @Column(name = "CUST_NAME")),
			@AttributeOverride(name = "custNum", column = @Column(name = "CUST_NUM")),
			@AttributeOverride(name = "billToSiteText", column = @Column(name = "BILL_TO_SITE_TEXT")),
			@AttributeOverride(name = "shpToSiteText", column = @Column(name = "SHP_TO_SITE_TEXT")),
			@AttributeOverride(name = "agrmntId", column = @Column(name = "AGRMNT_ID")),
			@AttributeOverride(name = "agrmntName", column = @Column(name = "AGRMNT_NAME")),
			@AttributeOverride(name = "stId", column = @Column(name = "ST_ID")),
			@AttributeOverride(name = "stName", column = @Column(name = "ST_NAME")),
			@AttributeOverride(name = "eamLocCd", column = @Column(name = "EAM_LOC_CD")),
			@AttributeOverride(name = "lglEnty", column = @Column(name = "LGL_ENTY")),
			@AttributeOverride(name = "mgmtEnty", column = @Column(name = "MGMT_ENTY")),
			@AttributeOverride(name = "PAndLCd", column = @Column(name = "P_AND_L_CD")),
			@AttributeOverride(name = "bucCd", column = @Column(name = "BUC_CD")),
			@AttributeOverride(name = "cpmFlName", column = @Column(name = "CPM_FL_NAME")),
			@AttributeOverride(name = "cpmOhrId", column = @Column(name = "CPM_OHR_ID")),
			@AttributeOverride(name = "otrFlName", column = @Column(name = "OTR_FL_NAME")),
			@AttributeOverride(name = "otrOhrId", column = @Column(name = "OTR_OHR_ID")),
			@AttributeOverride(name = "prtfolioFlName", column = @Column(name = "PRTFOLIO_FL_NAME")),
			@AttributeOverride(name = "prtfolioOhrId", column = @Column(name = "PRTFOLIO_OHR_ID")),
			@AttributeOverride(name = "projType", column = @Column(name = "PROJ_TYPE")),
			@AttributeOverride(name = "itmNum", column = @Column(name = "ITM_NUM")),
			@AttributeOverride(name = "itmDesc", column = @Column(name = "ITM_DESC")),
			@AttributeOverride(name = "crncyCd", column = @Column(name = "CRNCY_CD")),
			@AttributeOverride(name = "lnType", column = @Column(name = "LN_TYPE")),
			@AttributeOverride(name = "prchsOrdrNum", column = @Column(name = "PRCHS_ORDR_NUM")),
			@AttributeOverride(name = "prchsOrdrLnNum", column = @Column(name = "PRCHS_ORDR_LN_NUM")),
			@AttributeOverride(name = "tranSrc", column = @Column(name = "TRAN_SRC")),
			@AttributeOverride(name = "expndtrCtgryDesc", column = @Column(name = "EXPNDTR_CTGRY_DESC")),
			@AttributeOverride(name = "paExpndtrType", column = @Column(name = "PA_EXPNDTR_TYPE")),
			@AttributeOverride(name = "expndtrDate", column = @Column(name = "EXPNDTR_DATE")),
			@AttributeOverride(name = "rawCst", column = @Column(name = "RAW_CST", scale = 0)),
			@AttributeOverride(name = "cstAcctDbt", column = @Column(name = "CST_ACCT_DBT")),
			@AttributeOverride(name = "cstCcidDbt", column = @Column(name = "CST_CCID_DBT", scale = 0)),
			@AttributeOverride(name = "cstAcctCrdt", column = @Column(name = "CST_ACCT_CRDT")),
			@AttributeOverride(name = "cstCcidCr", column = @Column(name = "CST_CCID_CR", scale = 0)),
			@AttributeOverride(name = "cstPaDate", column = @Column(name = "CST_PA_DATE")),
			@AttributeOverride(name = "cstGlDate", column = @Column(name = "CST_GL_DATE")),
			@AttributeOverride(name = "cstPaPrd", column = @Column(name = "CST_PA_PRD")),
			@AttributeOverride(name = "cstGlPrd", column = @Column(name = "CST_GL_PRD")),
			@AttributeOverride(name = "evntType", column = @Column(name = "EVNT_TYPE")),
			@AttributeOverride(name = "slsAmt", column = @Column(name = "SLS_AMT", scale = 0)),
			@AttributeOverride(name = "slsAcctDr", column = @Column(name = "SLS_ACCT_DR")),
			@AttributeOverride(name = "slsCcidDr", column = @Column(name = "SLS_CCID_DR", scale = 0)),
			@AttributeOverride(name = "slsAcctCr", column = @Column(name = "SLS_ACCT_CR")),
			@AttributeOverride(name = "slsCcidCrdt", column = @Column(name = "SLS_CCID_CRDT", scale = 0)),
			@AttributeOverride(name = "slsPaDate", column = @Column(name = "SLS_PA_DATE")),
			@AttributeOverride(name = "slsGlDate", column = @Column(name = "SLS_GL_DATE")),
			@AttributeOverride(name = "revPaPrd", column = @Column(name = "REV_PA_PRD")),
			@AttributeOverride(name = "revGlPrd", column = @Column(name = "REV_GL_PRD")),
			@AttributeOverride(name = "cmAmt", column = @Column(name = "CM_AMT", scale = 0)),
			@AttributeOverride(name = "cmPct", column = @Column(name = "CM_PCT")),
			@AttributeOverride(name = "fsclYr", column = @Column(name = "FSCL_YR")),
			@AttributeOverride(name = "tiebckFlg", column = @Column(name = "TIEBCK_FLG")),
			@AttributeOverride(name = "tiebckDate", column = @Column(name = "TIEBCK_DATE")),
			@AttributeOverride(name = "glJrnlEntryHdrId", column = @Column(name = "GL_JRNL_ENTRY_HDR_ID", scale = 0)),
			@AttributeOverride(name = "glJrnlEntryBtchId", column = @Column(name = "GL_JRNL_ENTRY_BTCH_ID", scale = 0)),
			@AttributeOverride(name = "glJeLnId", column = @Column(name = "GL_JE_LN_ID", scale = 0)),
			@AttributeOverride(name = "glJrnlBtchName", column = @Column(name = "GL_JRNL_BTCH_NAME")),
			@AttributeOverride(name = "glSweepLnkDesc", column = @Column(name = "GL_SWEEP_LNK_DESC")),
			@AttributeOverride(name = "glBtchCntrlDesc", column = @Column(name = "GL_BTCH_CNTRL_DESC")),
			@AttributeOverride(name = "lstFetchDate", column = @Column(name = "LST_FETCH_DATE")),
			@AttributeOverride(name = "prtsOrdrNum", column = @Column(name = "PRTS_ORDR_NUM")),
			@AttributeOverride(name = "prtsLnNum", column = @Column(name = "PRTS_LN_NUM")),
			@AttributeOverride(name = "trbnSerNum", column = @Column(name = "TRBN_SER_NUM")),
			@AttributeOverride(name = "apInvNum", column = @Column(name = "AP_INV_NUM")),
			@AttributeOverride(name = "prListDesc", column = @Column(name = "PR_LIST_DESC")),
			@AttributeOverride(name = "listPrNum", column = @Column(name = "LIST_PR_NUM", scale = 0)),
			@AttributeOverride(name = "custPrchsOrdrNum", column = @Column(name = "CUST_PRCHS_ORDR_NUM")),
			@AttributeOverride(name = "custPrchsOrdrLn", column = @Column(name = "CUST_PRCHS_ORDR_LN")),
			@AttributeOverride(name = "btchId", column = @Column(name = "BTCH_ID", scale = 0)),
			@AttributeOverride(name = "qtyNum", column = @Column(name = "QTY_NUM", scale = 0)),
			@AttributeOverride(name = "frmSzText", column = @Column(name = "FRM_SZ_TEXT")),
			@AttributeOverride(name = "prtsLnTypeDesc", column = @Column(name = "PRTS_LN_TYPE_DESC")),
			@AttributeOverride(name = "cstTrnsfrDate", column = @Column(name = "CST_TRNSFR_DATE")),
			@AttributeOverride(name = "slsTrnsfrDate", column = @Column(name = "SLS_TRNSFR_DATE")),
			@AttributeOverride(name = "billersCntctInfoDesc", column = @Column(name = "BILLERS_CNTCT_INFO_DESC")),
			@AttributeOverride(name = "billersBucCd", column = @Column(name = "BILLERS_BUC_CD")),
			@AttributeOverride(name = "delNum", column = @Column(name = "DEL_NUM", scale = 0)),
			@AttributeOverride(name = "rcvrsBucCd", column = @Column(name = "RCVRS_BUC_CD")),
			@AttributeOverride(name = "crtdDate", column = @Column(name = "CRTD_DATE", nullable = false)),
			@AttributeOverride(name = "crtdBy", column = @Column(name = "CRTD_BY", nullable = false)),
			@AttributeOverride(name = "lstUpdtDate", column = @Column(name = "LST_UPDT_DATE", nullable = false)),
			@AttributeOverride(name = "lstUpdtdBy", column = @Column(name = "LST_UPDTD_BY", nullable = false)),
			@AttributeOverride(name = "useTax", column = @Column(name = "USE_TAX", scale = 0)),
			@AttributeOverride(name = "projectCategory", column = @Column(name = "PROJECT_CATEGORY")),
			@AttributeOverride(name = "contractNumber", column = @Column(name = "CONTRACT_NUMBER")),
			@AttributeOverride(name = "expenditureCategory", column = @Column(name = "EXPENDITURE_CATEGORY")),
			@AttributeOverride(name = "actionStatus", column = @Column(name = "ACTION_STATUS")),
			@AttributeOverride(name = "apBillerBuc", column = @Column(name = "AP_BILLER_BUC")),
			@AttributeOverride(name = "arInvoiceNumber", column = @Column(name = "AR_INVOICE_NUMBER")),
			@AttributeOverride(name = "businessReason", column = @Column(name = "BUSINESS_REASON")),
			@AttributeOverride(name = "csRegion", column = @Column(name = "CS_REGION")),
			@AttributeOverride(name = "equipmentFamily", column = @Column(name = "EQUIPMENT_FAMILY")),
			@AttributeOverride(name = "eventDescription", column = @Column(name = "EVENT_DESCRIPTION")),
			@AttributeOverride(name = "geFifoCost", column = @Column(name = "GE_FIFO_COST", scale = 0)),
			@AttributeOverride(name = "lineComment", column = @Column(name = "LINE_COMMENT")),
			@AttributeOverride(name = "modelBucket", column = @Column(name = "MODEL_BUCKET")),
			@AttributeOverride(name = "origTransactionNumber", column = @Column(name = "ORIG_TRANSACTION_NUMBER", scale = 0)),
			@AttributeOverride(name = "poDescription", column = @Column(name = "PO_DESCRIPTION")),
			@AttributeOverride(name = "pushType", column = @Column(name = "PUSH_TYPE")),
			@AttributeOverride(name = "sourceDateCreated", column = @Column(name = "SOURCE_DATE_CREATED")),
			@AttributeOverride(name = "subregion", column = @Column(name = "SUBREGION")),
			@AttributeOverride(name = "tpAdder", column = @Column(name = "TP_ADDER", scale = 0)),
			@AttributeOverride(name = "tpPercent", column = @Column(name = "TP_PERCENT", scale = 0)),
			@AttributeOverride(name = "billToState", column = @Column(name = "BILL_TO_STATE")),
			@AttributeOverride(name = "billToCountry", column = @Column(name = "BILL_TO_COUNTRY")),
			@AttributeOverride(name = "shipToState", column = @Column(name = "SHIP_TO_STATE")),
			@AttributeOverride(name = "shipToCountry", column = @Column(name = "SHIP_TO_COUNTRY")),
			@AttributeOverride(name = "catalogBucket", column = @Column(name = "CATALOG_BUCKET")),
			@AttributeOverride(name = "statCost", column = @Column(name = "STAT_COST", scale = 0)),
			@AttributeOverride(name = "partNumber", column = @Column(name = "PART_NUMBER")),
			@AttributeOverride(name = "invoiceDate", column = @Column(name = "INVOICE_DATE")),
			@AttributeOverride(name = "docNumber", column = @Column(name = "DOC_NUMBER", scale = 0)),
			@AttributeOverride(name = "gaapSalesLevelized", column = @Column(name = "GAAP_SALES_LEVELIZED", scale = 0)),
			@AttributeOverride(name = "glJeSourceName", column = @Column(name = "GL_JE_SOURCE_NAME")),
			@AttributeOverride(name = "headerDescription", column = @Column(name = "HEADER_DESCRIPTION")),
			@AttributeOverride(name = "icLe", column = @Column(name = "IC_LE")),
			@AttributeOverride(name = "icMe", column = @Column(name = "IC_ME")),
			@AttributeOverride(name = "ofsEventStartDate", column = @Column(name = "OFS_EVENT_START_DATE")),
			@AttributeOverride(name = "ofsEventEndDate", column = @Column(name = "OFS_EVENT_END_DATE")),
			@AttributeOverride(name = "icamMarginRateGaap", column = @Column(name = "ICAM_MARGIN_RATE_GAAP", scale = 0)),
			@AttributeOverride(name = "icamMarginRateStat", column = @Column(name = "ICAM_MARGIN_RATE_STAT", scale = 0)),
			@AttributeOverride(name = "icamPersistentId", column = @Column(name = "ICAM_PERSISTENT_ID")),
			@AttributeOverride(name = "identifierKey", column = @Column(name = "IDENTIFIER_KEY", scale = 0)),
			@AttributeOverride(name = "jeHeaderLine", column = @Column(name = "JE_HEADER_LINE")),
			@AttributeOverride(name = "jobFsrNumber", column = @Column(name = "JOB_FSR_NUMBER")),
			@AttributeOverride(name = "ofsEventId", column = @Column(name = "OFS_EVENT_ID", scale = 0)),
			@AttributeOverride(name = "ofsEventType", column = @Column(name = "OFS_EVENT_TYPE")),
			@AttributeOverride(name = "orgId", column = @Column(name = "ORG_ID", scale = 0)),
			@AttributeOverride(name = "poNumber", column = @Column(name = "PO_NUMBER")),
			@AttributeOverride(name = "priceList", column = @Column(name = "PRICE_LIST")),
			@AttributeOverride(name = "projectId", column = @Column(name = "PROJECT_ID", scale = 0)),
			@AttributeOverride(name = "refer", column = @Column(name = "REFER")),
			@AttributeOverride(name = "servicesCm", column = @Column(name = "SERVICES_CM")),
			@AttributeOverride(name = "supplierName", column = @Column(name = "SUPPLIER_NAME")),
			@AttributeOverride(name = "vendorName", column = @Column(name = "VENDOR_NAME")),
			@AttributeOverride(name = "amount", column = @Column(name = "AMOUNT", scale = 0)),
			@AttributeOverride(name = "baseAmount", column = @Column(name = "BASE_AMOUNT", scale = 0)),
			@AttributeOverride(name = "baseInvoiceAmount", column = @Column(name = "BASE_INVOICE_AMOUNT", scale = 0)),
			@AttributeOverride(name = "lineFeeType", column = @Column(name = "LINE_FEE_TYPE")),
			@AttributeOverride(name = "invoiceAmount", column = @Column(name = "INVOICE_AMOUNT", scale = 0)),
			@AttributeOverride(name = "invoiceNumber", column = @Column(name = "INVOICE_NUMBER")),
			@AttributeOverride(name = "subFeeType", column = @Column(name = "SUB_FEE_TYPE")),
			@AttributeOverride(name = "taskName", column = @Column(name = "TASK_NAME")),
			@AttributeOverride(name = "lineNumber", column = @Column(name = "LINE_NUMBER")),
			@AttributeOverride(name = "ofsEventDesc", column = @Column(name = "OFS_EVENT_DESC")),
			@AttributeOverride(name = "gaapSalesLevelized_1", column = @Column(name = "GAAP_SALES__LEVELIZED", scale = 0)),
			@AttributeOverride(name = "csPoNumber", column = @Column(name = "CS_PO_NUMBER", scale = 0)),
			@AttributeOverride(name = "processFlg", column = @Column(name = "PROCESS_FLG")),
			@AttributeOverride(name = "taxAmt", column = @Column(name = "TAX_AMT", scale = 0)),
			@AttributeOverride(name = "baseTaxAmt", column = @Column(name = "BASE_TAX_AMT", scale = 0)),
			@AttributeOverride(name = "invLineNum", column = @Column(name = "INV_LINE_NUM")),
			@AttributeOverride(name = "cmServAmt", column = @Column(name = "CM_SERV_AMT")) })
	public CserpStgngId getId() {
		return this.id;
	}

	public void setId(CserpStgngId id) {
		this.id = id;
	}

}