/**
 * Project:      PGS - AA
 * Component:    Dr4UploadStgng.java
 * Date-Written: Aug 24, 2012
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

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Dr4UploadStgng entity.
 */
@Entity
@SequenceGenerator(name = "dr4UploadSEQ", sequenceName = "SEQ_KEY_VAL", allocationSize = 1)
@Table(name = "CNFM_DR4_UPLOAD_STGNG", schema = "CNFM")
public class Dr4UploadStgng extends BaseEntity {

	/**
	 * serialVersionUID long
	 */
	private static final long serialVersionUID = 1L;

	private long keyVal;
	private String srcCode;
	private String tranNum;
	private String projNum;
	private String tskNum;
	private String custName;
	private String custNum;
	private String billToSiteText;
	private String shpToSiteText;
	private String agrmntId;
	private String agrmntName;
	private String stId;
	private String stName;
	private String eamLocCd;
	private String lglEnty;
	private String mgmtEnty;
	private String pAndLCd;
	private String bucCd;
	private String cpmFlName;
	private String cpmOhrId;
	private String otrFlName;
	private String otrOhrId;
	private String prtfolioFlName;
	private String prtfolioOhrId;
	private String projType;
	private String itmNum;
	private String itmDesc;
	private String crncyCd;
	private String lnType;
	private String prchsOrdrNum;
	private String prchsOrdrLnNum;
	private String tranSrc;
	private String expndtrCtgryDesc;
	private String paExpndtrType;
	private Date expndtrDate;
	private BigDecimal rawCst;
	private String cstAcctDbt;
	private BigDecimal cstCcidDbt;
	private String cstAcctCrdt;
	private BigDecimal cstCcidCr;
	private Date cstPaDate;
	private Date cstGlDate;
	private String cstPaPrd;
	private String cstGlPrd;
	private String evntType;
	private BigDecimal slsAmt;
	private String slsAcctDr;
	private BigDecimal slsCcidDr;
	private String slsAcctCr;
	private BigDecimal slsCcidCrdt;
	private Date slsPaDate;
	private Date slsGlDate;
	private String revPaPrd;
	private String revGlPrd;
	private BigDecimal cmAmt;
	private String cmPct;
	private String fsclYr;
	private String tiebckFlg;
	private Date tiebckDate;
	private BigDecimal glJrnlEntryHdrId;
	private BigDecimal glJrnlEntryBtchId;
	private BigDecimal glJeLnId;
	private String glJrnlBtchName;
	private String glSweepLnkDesc;
	private String glBtchCntrlDesc;
	private Date lstFetchDate;
	private String prtsOrdrNum;
	private String prtsLnNum;
	private String trbnSerNum;
	private String apInvNum;
	private String prListDesc;
	private BigDecimal listPrNum;
	private String custPrchsOrdrNum;
	private String custPrchsOrdrLn;
	private BigDecimal btchId;
	private BigDecimal qtyNum;
	private String frmSzText;
	private String prtsLnTypeDesc;
	private Date cstTrnsfrDate;
	private Date slsTrnsfrDate;
	private String billersCntctInfoDesc;
	private String billersBucCd;
	private BigDecimal delNum;
	private String rcvrsBucCd;
	private Date crtdDate;
	private String crtdBy;
	private Date lstUpdtDate;
	private String lstUpdtdBy;
	private BigDecimal useTax;
	private String projectCategory;
	private String contractNumber;
	private String expenditureCategory;
	private String actionStatus;
	private String apBillerBuc;
	private String arInvoiceNumber;
	private String businessReason;
	private String csRegion;
	private String equipmentFamily;
	private String eventDescription;
	private BigDecimal geFifoCost;
	private String lineComment;
	private String modelBucket;
	private BigDecimal origTransactionNumber;
	private String poDescription;
	private String pushType;
	private Date sourceDateCreated;
	private String subregion;
	private BigDecimal tpAdder;
	private BigDecimal tpPercent;
	private String billToState;
	private String billToCountry;
	private String shipToState;
	private String shipToCountry;
	private String catalogBucket;
	private BigDecimal statCost;
	private String partNumber;
	private Date invoiceDate;
	private BigDecimal docNumber;
	private BigDecimal gaapSalesLevelized;
	private String glJeSourceName;
	private String headerDescription;
	private String icLe;
	private String icMe;
	private Date ofsEventStartDate;
	private Date ofsEventEndDate;
	private BigDecimal icamMarginRateGaap;
	private BigDecimal icamMarginRateStat;
	private String icamPersistentId;
	private BigDecimal identifierKey;
	private String jeHeaderLine;
	private String jobFsrNumber;
	private BigDecimal ofsEventId;
	private String ofsEventType;
	private BigDecimal orgId;
	private String poNumber;
	private String priceList;
	private BigDecimal projectId;
	private String refer;
	private String servicesCm;
	private String supplierName;
	private String vendorName;
	private BigDecimal amount;
	private BigDecimal baseAmount;
	private BigDecimal baseInvoiceAmount;
	private String lineFeeType;
	private BigDecimal invoiceAmount;
	private String invoiceNumber;
	private String subFeeType;
	private String taskName;
	private String lineNumber;
	private String ofsEventDesc;
	private BigDecimal gaapSalesLevelized1;
	private BigDecimal csPoNumber;
	private String processFlg;
	private BigDecimal taxAmt;
	private BigDecimal baseTaxAmt;
	private String invLineNum;
	private String cmServAmt;
	private long modelId;
	private String glQtrDesc;
	private String marginReviewFlag;

	// Constructors

	/** default constructor */
	public Dr4UploadStgng() {
	}

	/** minimal constructor */
	public Dr4UploadStgng(long keyVal, String tranNum, Date crtdDate,
			String crtdBy, Date lstUpdtDate, String lstUpdtdBy) {
		this.keyVal = keyVal;
		this.tranNum = tranNum;
		this.crtdDate = crtdDate;
		this.crtdBy = crtdBy;
		this.lstUpdtDate = lstUpdtDate;
		this.lstUpdtdBy = lstUpdtdBy;
	}

	/** full constructor */
	public Dr4UploadStgng(long keyVal, String srcCode, String tranNum,
			String projNum, String tskNum, String custName, String custNum,
			String billToSiteText, String shpToSiteText, String agrmntId,
			String agrmntName, String stId, String stName, String eamLocCd,
			String lglEnty, String mgmtEnty, String pAndLCd, String bucCd,
			String cpmFlName, String cpmOhrId, String otrFlName,
			String otrOhrId, String prtfolioFlName, String prtfolioOhrId,
			String projType, String itmNum, String itmDesc, String crncyCd,
			String lnType, String prchsOrdrNum, String prchsOrdrLnNum,
			String tranSrc, String expndtrCtgryDesc, String paExpndtrType,
			Date expndtrDate, BigDecimal rawCst, String cstAcctDbt,
			BigDecimal cstCcidDbt, String cstAcctCrdt, BigDecimal cstCcidCr,
			Date cstPaDate, Date cstGlDate, String cstPaPrd, String cstGlPrd,
			String evntType, BigDecimal slsAmt, String slsAcctDr,
			BigDecimal slsCcidDr, String slsAcctCr, BigDecimal slsCcidCrdt,
			Date slsPaDate, Date slsGlDate, String revPaPrd, String revGlPrd,
			BigDecimal cmAmt, String cmPct, String fsclYr, String tiebckFlg,
			Date tiebckDate, BigDecimal glJrnlEntryHdrId,
			BigDecimal glJrnlEntryBtchId, BigDecimal glJeLnId,
			String glJrnlBtchName, String glSweepLnkDesc,
			String glBtchCntrlDesc, Date lstFetchDate, String prtsOrdrNum,
			String prtsLnNum, String trbnSerNum, String apInvNum,
			String prListDesc, BigDecimal listPrNum, String custPrchsOrdrNum,
			String custPrchsOrdrLn, BigDecimal btchId, BigDecimal qtyNum,
			String frmSzText, String prtsLnTypeDesc, Date cstTrnsfrDate,
			Date slsTrnsfrDate, String billersCntctInfoDesc,
			String billersBucCd, BigDecimal delNum, String rcvrsBucCd,
			Date crtdDate, String crtdBy, Date lstUpdtDate, String lstUpdtdBy,
			BigDecimal useTax, String projectCategory, String contractNumber,
			String expenditureCategory, String actionStatus,
			String apBillerBuc, String arInvoiceNumber, String businessReason,
			String csRegion, String equipmentFamily, String eventDescription,
			BigDecimal geFifoCost, String lineComment, String modelBucket,
			BigDecimal origTransactionNumber, String poDescription,
			String pushType, Date sourceDateCreated, String subregion,
			BigDecimal tpAdder, BigDecimal tpPercent, String billToState,
			String billToCountry, String shipToState, String shipToCountry,
			String catalogBucket, BigDecimal statCost, String partNumber,
			Date invoiceDate, BigDecimal docNumber,
			BigDecimal gaapSalesLevelized, String glJeSourceName,
			String headerDescription, String icLe, String icMe,
			Date ofsEventStartDate, Date ofsEventEndDate,
			BigDecimal icamMarginRateGaap, BigDecimal icamMarginRateStat,
			String icamPersistentId, BigDecimal identifierKey,
			String jeHeaderLine, String jobFsrNumber, BigDecimal ofsEventId,
			String ofsEventType, BigDecimal orgId, String poNumber,
			String priceList, BigDecimal projectId, String refer,
			String servicesCm, String supplierName, String vendorName,
			BigDecimal amount, BigDecimal baseAmount,
			BigDecimal baseInvoiceAmount, String lineFeeType,
			BigDecimal invoiceAmount, String invoiceNumber, String subFeeType,
			String taskName, String lineNumber, String ofsEventDesc,
			BigDecimal gaapSalesLevelized1, BigDecimal csPoNumber,
			String processFlg, BigDecimal taxAmt, BigDecimal baseTaxAmt,
			String invLineNum, String cmServAmt, long modelId,
			String glQtrDesc, String marginReviewFlag) {
		this.keyVal = keyVal;
		this.srcCode = srcCode;
		this.tranNum = tranNum;
		this.projNum = projNum;
		this.tskNum = tskNum;
		this.custName = custName;
		this.custNum = custNum;
		this.billToSiteText = billToSiteText;
		this.shpToSiteText = shpToSiteText;
		this.agrmntId = agrmntId;
		this.agrmntName = agrmntName;
		this.stId = stId;
		this.stName = stName;
		this.eamLocCd = eamLocCd;
		this.lglEnty = lglEnty;
		this.mgmtEnty = mgmtEnty;
		this.pAndLCd = pAndLCd;
		this.bucCd = bucCd;
		this.cpmFlName = cpmFlName;
		this.cpmOhrId = cpmOhrId;
		this.otrFlName = otrFlName;
		this.otrOhrId = otrOhrId;
		this.prtfolioFlName = prtfolioFlName;
		this.prtfolioOhrId = prtfolioOhrId;
		this.projType = projType;
		this.itmNum = itmNum;
		this.itmDesc = itmDesc;
		this.crncyCd = crncyCd;
		this.lnType = lnType;
		this.prchsOrdrNum = prchsOrdrNum;
		this.prchsOrdrLnNum = prchsOrdrLnNum;
		this.tranSrc = tranSrc;
		this.expndtrCtgryDesc = expndtrCtgryDesc;
		this.paExpndtrType = paExpndtrType;
		this.expndtrDate = expndtrDate;
		this.rawCst = rawCst;
		this.cstAcctDbt = cstAcctDbt;
		this.cstCcidDbt = cstCcidDbt;
		this.cstAcctCrdt = cstAcctCrdt;
		this.cstCcidCr = cstCcidCr;
		this.cstPaDate = cstPaDate;
		this.cstGlDate = cstGlDate;
		this.cstPaPrd = cstPaPrd;
		this.cstGlPrd = cstGlPrd;
		this.evntType = evntType;
		this.slsAmt = slsAmt;
		this.slsAcctDr = slsAcctDr;
		this.slsCcidDr = slsCcidDr;
		this.slsAcctCr = slsAcctCr;
		this.slsCcidCrdt = slsCcidCrdt;
		this.slsPaDate = slsPaDate;
		this.slsGlDate = slsGlDate;
		this.revPaPrd = revPaPrd;
		this.revGlPrd = revGlPrd;
		this.cmAmt = cmAmt;
		this.cmPct = cmPct;
		this.fsclYr = fsclYr;
		this.tiebckFlg = tiebckFlg;
		this.tiebckDate = tiebckDate;
		this.glJrnlEntryHdrId = glJrnlEntryHdrId;
		this.glJrnlEntryBtchId = glJrnlEntryBtchId;
		this.glJeLnId = glJeLnId;
		this.glJrnlBtchName = glJrnlBtchName;
		this.glSweepLnkDesc = glSweepLnkDesc;
		this.glBtchCntrlDesc = glBtchCntrlDesc;
		this.lstFetchDate = lstFetchDate;
		this.prtsOrdrNum = prtsOrdrNum;
		this.prtsLnNum = prtsLnNum;
		this.trbnSerNum = trbnSerNum;
		this.apInvNum = apInvNum;
		this.prListDesc = prListDesc;
		this.listPrNum = listPrNum;
		this.custPrchsOrdrNum = custPrchsOrdrNum;
		this.custPrchsOrdrLn = custPrchsOrdrLn;
		this.btchId = btchId;
		this.qtyNum = qtyNum;
		this.frmSzText = frmSzText;
		this.prtsLnTypeDesc = prtsLnTypeDesc;
		this.cstTrnsfrDate = cstTrnsfrDate;
		this.slsTrnsfrDate = slsTrnsfrDate;
		this.billersCntctInfoDesc = billersCntctInfoDesc;
		this.billersBucCd = billersBucCd;
		this.delNum = delNum;
		this.rcvrsBucCd = rcvrsBucCd;
		this.crtdDate = crtdDate;
		this.crtdBy = crtdBy;
		this.lstUpdtDate = lstUpdtDate;
		this.lstUpdtdBy = lstUpdtdBy;
		this.useTax = useTax;
		this.projectCategory = projectCategory;
		this.contractNumber = contractNumber;
		this.expenditureCategory = expenditureCategory;
		this.actionStatus = actionStatus;
		this.apBillerBuc = apBillerBuc;
		this.arInvoiceNumber = arInvoiceNumber;
		this.businessReason = businessReason;
		this.csRegion = csRegion;
		this.equipmentFamily = equipmentFamily;
		this.eventDescription = eventDescription;
		this.geFifoCost = geFifoCost;
		this.lineComment = lineComment;
		this.modelBucket = modelBucket;
		this.origTransactionNumber = origTransactionNumber;
		this.poDescription = poDescription;
		this.pushType = pushType;
		this.sourceDateCreated = sourceDateCreated;
		this.subregion = subregion;
		this.tpAdder = tpAdder;
		this.tpPercent = tpPercent;
		this.billToState = billToState;
		this.billToCountry = billToCountry;
		this.shipToState = shipToState;
		this.shipToCountry = shipToCountry;
		this.catalogBucket = catalogBucket;
		this.statCost = statCost;
		this.partNumber = partNumber;
		this.invoiceDate = invoiceDate;
		this.docNumber = docNumber;
		this.gaapSalesLevelized = gaapSalesLevelized;
		this.glJeSourceName = glJeSourceName;
		this.headerDescription = headerDescription;
		this.icLe = icLe;
		this.icMe = icMe;
		this.ofsEventStartDate = ofsEventStartDate;
		this.ofsEventEndDate = ofsEventEndDate;
		this.icamMarginRateGaap = icamMarginRateGaap;
		this.icamMarginRateStat = icamMarginRateStat;
		this.icamPersistentId = icamPersistentId;
		this.identifierKey = identifierKey;
		this.jeHeaderLine = jeHeaderLine;
		this.jobFsrNumber = jobFsrNumber;
		this.ofsEventId = ofsEventId;
		this.ofsEventType = ofsEventType;
		this.orgId = orgId;
		this.poNumber = poNumber;
		this.priceList = priceList;
		this.projectId = projectId;
		this.refer = refer;
		this.servicesCm = servicesCm;
		this.supplierName = supplierName;
		this.vendorName = vendorName;
		this.amount = amount;
		this.baseAmount = baseAmount;
		this.baseInvoiceAmount = baseInvoiceAmount;
		this.lineFeeType = lineFeeType;
		this.invoiceAmount = invoiceAmount;
		this.invoiceNumber = invoiceNumber;
		this.subFeeType = subFeeType;
		this.taskName = taskName;
		this.lineNumber = lineNumber;
		this.ofsEventDesc = ofsEventDesc;
		this.gaapSalesLevelized1 = gaapSalesLevelized1;
		this.csPoNumber = csPoNumber;
		this.processFlg = processFlg;
		this.taxAmt = taxAmt;
		this.baseTaxAmt = baseTaxAmt;
		this.invLineNum = invLineNum;
		this.cmServAmt = cmServAmt;
		this.modelId = modelId;
		this.glQtrDesc = glQtrDesc;
		this.marginReviewFlag = marginReviewFlag;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dr4UploadSEQ")
	@Column(name = "KEY_VAL", nullable = false, precision = 22, scale = 0)
	public long getKeyVal() {
		return this.keyVal;
	}

	public void setKeyVal(long keyVal) {
		this.keyVal = keyVal;
	}

	@Column(name = "SRC_CODE", length = 20)
	public String getSrcCode() {
		return this.srcCode;
	}

	public void setSrcCode(String srcCode) {
		this.srcCode = srcCode;
	}

	@Column(name = "TRAN_NUM", nullable = true, length = 30)
	public String getTranNum() {
		return this.tranNum;
	}

	public void setTranNum(String tranNum) {
		this.tranNum = tranNum;
	}

	@Column(name = "PROJ_NUM", length = 30)
	public String getProjNum() {
		return this.projNum;
	}

	public void setProjNum(String projNum) {
		this.projNum = projNum;
	}

	@Column(name = "TSK_NUM", length = 30)
	public String getTskNum() {
		return this.tskNum;
	}

	public void setTskNum(String tskNum) {
		this.tskNum = tskNum;
	}

	@Column(name = "CUST_NAME")
	public String getCustName() {
		return this.custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	@Column(name = "CUST_NUM", length = 30)
	public String getCustNum() {
		return this.custNum;
	}

	public void setCustNum(String custNum) {
		this.custNum = custNum;
	}

	@Column(name = "BILL_TO_SITE_TEXT", length = 105)
	public String getBillToSiteText() {
		return this.billToSiteText;
	}

	public void setBillToSiteText(String billToSiteText) {
		this.billToSiteText = billToSiteText;
	}

	@Column(name = "SHP_TO_SITE_TEXT", length = 105)
	public String getShpToSiteText() {
		return this.shpToSiteText;
	}

	public void setShpToSiteText(String shpToSiteText) {
		this.shpToSiteText = shpToSiteText;
	}

	@Column(name = "AGRMNT_ID", length = 20)
	public String getAgrmntId() {
		return this.agrmntId;
	}

	public void setAgrmntId(String agrmntId) {
		this.agrmntId = agrmntId;
	}

	@Column(name = "AGRMNT_NAME", length = 75)
	public String getAgrmntName() {
		return this.agrmntName;
	}

	public void setAgrmntName(String agrmntName) {
		this.agrmntName = agrmntName;
	}

	@Column(name = "ST_ID", length = 20)
	public String getStId() {
		return this.stId;
	}

	public void setStId(String stId) {
		this.stId = stId;
	}

	@Column(name = "ST_NAME")
	public String getStName() {
		return this.stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	@Column(name = "EAM_LOC_CD", length = 20)
	public String getEamLocCd() {
		return this.eamLocCd;
	}

	public void setEamLocCd(String eamLocCd) {
		this.eamLocCd = eamLocCd;
	}

	@Column(name = "LGL_ENTY", length = 10)
	public String getLglEnty() {
		return this.lglEnty;
	}

	public void setLglEnty(String lglEnty) {
		this.lglEnty = lglEnty;
	}

	@Column(name = "MGMT_ENTY", length = 10)
	public String getMgmtEnty() {
		return this.mgmtEnty;
	}

	public void setMgmtEnty(String mgmtEnty) {
		this.mgmtEnty = mgmtEnty;
	}

	@Column(name = "P_AND_L_CD", length = 20)
	public String getPAndLCd() {
		return this.pAndLCd;
	}

	public void setPAndLCd(String pAndLCd) {
		this.pAndLCd = pAndLCd;
	}

	@Column(name = "BUC_CD", length = 20)
	public String getBucCd() {
		return this.bucCd;
	}

	public void setBucCd(String bucCd) {
		this.bucCd = bucCd;
	}

	@Column(name = "CPM_FL_NAME", length = 240)
	public String getCpmFlName() {
		return this.cpmFlName;
	}

	public void setCpmFlName(String cpmFlName) {
		this.cpmFlName = cpmFlName;
	}

	@Column(name = "CPM_OHR_ID", length = 30)
	public String getCpmOhrId() {
		return this.cpmOhrId;
	}

	public void setCpmOhrId(String cpmOhrId) {
		this.cpmOhrId = cpmOhrId;
	}

	@Column(name = "OTR_FL_NAME", length = 240)
	public String getOtrFlName() {
		return this.otrFlName;
	}

	public void setOtrFlName(String otrFlName) {
		this.otrFlName = otrFlName;
	}

	@Column(name = "OTR_OHR_ID", length = 30)
	public String getOtrOhrId() {
		return this.otrOhrId;
	}

	public void setOtrOhrId(String otrOhrId) {
		this.otrOhrId = otrOhrId;
	}

	@Column(name = "PRTFOLIO_FL_NAME", length = 50)
	public String getPrtfolioFlName() {
		return this.prtfolioFlName;
	}

	public void setPrtfolioFlName(String prtfolioFlName) {
		this.prtfolioFlName = prtfolioFlName;
	}

	@Column(name = "PRTFOLIO_OHR_ID", length = 20)
	public String getPrtfolioOhrId() {
		return this.prtfolioOhrId;
	}

	public void setPrtfolioOhrId(String prtfolioOhrId) {
		this.prtfolioOhrId = prtfolioOhrId;
	}

	@Column(name = "PROJ_TYPE", length = 30)
	public String getProjType() {
		return this.projType;
	}

	public void setProjType(String projType) {
		this.projType = projType;
	}

	@Column(name = "ITM_NUM", length = 2000)
	public String getItmNum() {
		return this.itmNum;
	}

	public void setItmNum(String itmNum) {
		this.itmNum = itmNum;
	}

	@Column(name = "ITM_DESC", length = 4000)
	public String getItmDesc() {
		return this.itmDesc;
	}

	public void setItmDesc(String itmDesc) {
		this.itmDesc = itmDesc;
	}

	@Column(name = "CRNCY_CD", length = 5)
	public String getCrncyCd() {
		return this.crncyCd;
	}

	public void setCrncyCd(String crncyCd) {
		this.crncyCd = crncyCd;
	}

	@Column(name = "LN_TYPE", length = 10)
	public String getLnType() {
		return this.lnType;
	}

	public void setLnType(String lnType) {
		this.lnType = lnType;
	}

	@Column(name = "PRCHS_ORDR_NUM", length = 50)
	public String getPrchsOrdrNum() {
		return this.prchsOrdrNum;
	}

	public void setPrchsOrdrNum(String prchsOrdrNum) {
		this.prchsOrdrNum = prchsOrdrNum;
	}

	@Column(name = "PRCHS_ORDR_LN_NUM", length = 10)
	public String getPrchsOrdrLnNum() {
		return this.prchsOrdrLnNum;
	}

	public void setPrchsOrdrLnNum(String prchsOrdrLnNum) {
		this.prchsOrdrLnNum = prchsOrdrLnNum;
	}

	@Column(name = "TRAN_SRC", length = 30)
	public String getTranSrc() {
		return this.tranSrc;
	}

	public void setTranSrc(String tranSrc) {
		this.tranSrc = tranSrc;
	}

	@Column(name = "EXPNDTR_CTGRY_DESC", length = 100)
	public String getExpndtrCtgryDesc() {
		return this.expndtrCtgryDesc;
	}

	public void setExpndtrCtgryDesc(String expndtrCtgryDesc) {
		this.expndtrCtgryDesc = expndtrCtgryDesc;
	}

	@Column(name = "PA_EXPNDTR_TYPE", length = 30)
	public String getPaExpndtrType() {
		return this.paExpndtrType;
	}

	public void setPaExpndtrType(String paExpndtrType) {
		this.paExpndtrType = paExpndtrType;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "EXPNDTR_DATE", length = 7)
	public Date getExpndtrDate() {
		return this.expndtrDate;
	}

	public void setExpndtrDate(Date expndtrDate) {
		this.expndtrDate = expndtrDate;
	}

	@Column(name = "RAW_CST", precision = 22, scale = 0)
	public BigDecimal getRawCst() {
		return this.rawCst;
	}

	public void setRawCst(BigDecimal rawCst) {
		this.rawCst = rawCst;
	}

	@Column(name = "CST_ACCT_DBT", length = 200)
	public String getCstAcctDbt() {
		return this.cstAcctDbt;
	}

	public void setCstAcctDbt(String cstAcctDbt) {
		this.cstAcctDbt = cstAcctDbt;
	}

	@Column(name = "CST_CCID_DBT", precision = 22, scale = 0)
	public BigDecimal getCstCcidDbt() {
		return this.cstCcidDbt;
	}

	public void setCstCcidDbt(BigDecimal cstCcidDbt) {
		this.cstCcidDbt = cstCcidDbt;
	}

	@Column(name = "CST_ACCT_CRDT", length = 200)
	public String getCstAcctCrdt() {
		return this.cstAcctCrdt;
	}

	public void setCstAcctCrdt(String cstAcctCrdt) {
		this.cstAcctCrdt = cstAcctCrdt;
	}

	@Column(name = "CST_CCID_CR", precision = 22, scale = 0)
	public BigDecimal getCstCcidCr() {
		return this.cstCcidCr;
	}

	public void setCstCcidCr(BigDecimal cstCcidCr) {
		this.cstCcidCr = cstCcidCr;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CST_PA_DATE", length = 7)
	public Date getCstPaDate() {
		return this.cstPaDate;
	}

	public void setCstPaDate(Date cstPaDate) {
		this.cstPaDate = cstPaDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CST_GL_DATE", length = 7)
	public Date getCstGlDate() {
		return this.cstGlDate;
	}

	public void setCstGlDate(Date cstGlDate) {
		this.cstGlDate = cstGlDate;
	}

	@Column(name = "CST_PA_PRD", length = 20)
	public String getCstPaPrd() {
		return this.cstPaPrd;
	}

	public void setCstPaPrd(String cstPaPrd) {
		this.cstPaPrd = cstPaPrd;
	}

	@Column(name = "CST_GL_PRD", length = 20)
	public String getCstGlPrd() {
		return this.cstGlPrd;
	}

	public void setCstGlPrd(String cstGlPrd) {
		this.cstGlPrd = cstGlPrd;
	}

	@Column(name = "EVNT_TYPE", length = 30)
	public String getEvntType() {
		return this.evntType;
	}

	public void setEvntType(String evntType) {
		this.evntType = evntType;
	}

	@Column(name = "SLS_AMT", precision = 22, scale = 0)
	public BigDecimal getSlsAmt() {
		return this.slsAmt;
	}

	public void setSlsAmt(BigDecimal slsAmt) {
		this.slsAmt = slsAmt;
	}

	@Column(name = "SLS_ACCT_DR", length = 200)
	public String getSlsAcctDr() {
		return this.slsAcctDr;
	}

	public void setSlsAcctDr(String slsAcctDr) {
		this.slsAcctDr = slsAcctDr;
	}

	@Column(name = "SLS_CCID_DR", precision = 22, scale = 0)
	public BigDecimal getSlsCcidDr() {
		return this.slsCcidDr;
	}

	public void setSlsCcidDr(BigDecimal slsCcidDr) {
		this.slsCcidDr = slsCcidDr;
	}

	@Column(name = "SLS_ACCT_CR", length = 200)
	public String getSlsAcctCr() {
		return this.slsAcctCr;
	}

	public void setSlsAcctCr(String slsAcctCr) {
		this.slsAcctCr = slsAcctCr;
	}

	@Column(name = "SLS_CCID_CRDT", precision = 22, scale = 0)
	public BigDecimal getSlsCcidCrdt() {
		return this.slsCcidCrdt;
	}

	public void setSlsCcidCrdt(BigDecimal slsCcidCrdt) {
		this.slsCcidCrdt = slsCcidCrdt;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SLS_PA_DATE", length = 7)
	public Date getSlsPaDate() {
		return this.slsPaDate;
	}

	public void setSlsPaDate(Date slsPaDate) {
		this.slsPaDate = slsPaDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SLS_GL_DATE", length = 7)
	public Date getSlsGlDate() {
		return this.slsGlDate;
	}

	public void setSlsGlDate(Date slsGlDate) {
		this.slsGlDate = slsGlDate;
	}

	@Column(name = "REV_PA_PRD", length = 20)
	public String getRevPaPrd() {
		return this.revPaPrd;
	}

	public void setRevPaPrd(String revPaPrd) {
		this.revPaPrd = revPaPrd;
	}

	@Column(name = "REV_GL_PRD", length = 20)
	public String getRevGlPrd() {
		return this.revGlPrd;
	}

	public void setRevGlPrd(String revGlPrd) {
		this.revGlPrd = revGlPrd;
	}

	@Column(name = "CM_AMT", precision = 22, scale = 0)
	public BigDecimal getCmAmt() {
		return this.cmAmt;
	}

	public void setCmAmt(BigDecimal cmAmt) {
		this.cmAmt = cmAmt;
	}

	@Column(name = "CM_PCT", length = 30)
	public String getCmPct() {
		return this.cmPct;
	}

	public void setCmPct(String cmPct) {
		this.cmPct = cmPct;
	}

	@Column(name = "FSCL_YR", length = 20)
	public String getFsclYr() {
		return this.fsclYr;
	}

	public void setFsclYr(String fsclYr) {
		this.fsclYr = fsclYr;
	}

	@Column(name = "TIEBCK_FLG", length = 1)
	public String getTiebckFlg() {
		return this.tiebckFlg;
	}

	public void setTiebckFlg(String tiebckFlg) {
		this.tiebckFlg = tiebckFlg;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "TIEBCK_DATE", length = 7)
	public Date getTiebckDate() {
		return this.tiebckDate;
	}

	public void setTiebckDate(Date tiebckDate) {
		this.tiebckDate = tiebckDate;
	}

	@Column(name = "GL_JRNL_ENTRY_HDR_ID", precision = 22, scale = 0)
	public BigDecimal getGlJrnlEntryHdrId() {
		return this.glJrnlEntryHdrId;
	}

	public void setGlJrnlEntryHdrId(BigDecimal glJrnlEntryHdrId) {
		this.glJrnlEntryHdrId = glJrnlEntryHdrId;
	}

	@Column(name = "GL_JRNL_ENTRY_BTCH_ID", precision = 22, scale = 0)
	public BigDecimal getGlJrnlEntryBtchId() {
		return this.glJrnlEntryBtchId;
	}

	public void setGlJrnlEntryBtchId(BigDecimal glJrnlEntryBtchId) {
		this.glJrnlEntryBtchId = glJrnlEntryBtchId;
	}

	@Column(name = "GL_JE_LN_ID", precision = 22, scale = 0)
	public BigDecimal getGlJeLnId() {
		return this.glJeLnId;
	}

	public void setGlJeLnId(BigDecimal glJeLnId) {
		this.glJeLnId = glJeLnId;
	}

	@Column(name = "GL_JRNL_BTCH_NAME", length = 100)
	public String getGlJrnlBtchName() {
		return this.glJrnlBtchName;
	}

	public void setGlJrnlBtchName(String glJrnlBtchName) {
		this.glJrnlBtchName = glJrnlBtchName;
	}

	@Column(name = "GL_SWEEP_LNK_DESC", length = 50)
	public String getGlSweepLnkDesc() {
		return this.glSweepLnkDesc;
	}

	public void setGlSweepLnkDesc(String glSweepLnkDesc) {
		this.glSweepLnkDesc = glSweepLnkDesc;
	}

	@Column(name = "GL_BTCH_CNTRL_DESC", length = 150)
	public String getGlBtchCntrlDesc() {
		return this.glBtchCntrlDesc;
	}

	public void setGlBtchCntrlDesc(String glBtchCntrlDesc) {
		this.glBtchCntrlDesc = glBtchCntrlDesc;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "LST_FETCH_DATE", length = 7)
	public Date getLstFetchDate() {
		return this.lstFetchDate;
	}

	public void setLstFetchDate(Date lstFetchDate) {
		this.lstFetchDate = lstFetchDate;
	}

	@Column(name = "PRTS_ORDR_NUM", length = 70)
	public String getPrtsOrdrNum() {
		return this.prtsOrdrNum;
	}

	public void setPrtsOrdrNum(String prtsOrdrNum) {
		this.prtsOrdrNum = prtsOrdrNum;
	}

	@Column(name = "PRTS_LN_NUM", length = 100)
	public String getPrtsLnNum() {
		return this.prtsLnNum;
	}

	public void setPrtsLnNum(String prtsLnNum) {
		this.prtsLnNum = prtsLnNum;
	}

	@Column(name = "TRBN_SER_NUM", length = 100)
	public String getTrbnSerNum() {
		return this.trbnSerNum;
	}

	public void setTrbnSerNum(String trbnSerNum) {
		this.trbnSerNum = trbnSerNum;
	}

	@Column(name = "AP_INV_NUM", length = 100)
	public String getApInvNum() {
		return this.apInvNum;
	}

	public void setApInvNum(String apInvNum) {
		this.apInvNum = apInvNum;
	}

	@Column(name = "PR_LIST_DESC", length = 100)
	public String getPrListDesc() {
		return this.prListDesc;
	}

	public void setPrListDesc(String prListDesc) {
		this.prListDesc = prListDesc;
	}

	@Column(name = "LIST_PR_NUM", precision = 22, scale = 0)
	public BigDecimal getListPrNum() {
		return this.listPrNum;
	}

	public void setListPrNum(BigDecimal listPrNum) {
		this.listPrNum = listPrNum;
	}

	@Column(name = "CUST_PRCHS_ORDR_NUM", length = 100)
	public String getCustPrchsOrdrNum() {
		return this.custPrchsOrdrNum;
	}

	public void setCustPrchsOrdrNum(String custPrchsOrdrNum) {
		this.custPrchsOrdrNum = custPrchsOrdrNum;
	}

	@Column(name = "CUST_PRCHS_ORDR_LN", length = 100)
	public String getCustPrchsOrdrLn() {
		return this.custPrchsOrdrLn;
	}

	public void setCustPrchsOrdrLn(String custPrchsOrdrLn) {
		this.custPrchsOrdrLn = custPrchsOrdrLn;
	}

	@Column(name = "BTCH_ID", precision = 22, scale = 0)
	public BigDecimal getBtchId() {
		return this.btchId;
	}

	public void setBtchId(BigDecimal btchId) {
		this.btchId = btchId;
	}

	@Column(name = "QTY_NUM", precision = 22, scale = 0)
	public BigDecimal getQtyNum() {
		return this.qtyNum;
	}

	public void setQtyNum(BigDecimal qtyNum) {
		this.qtyNum = qtyNum;
	}

	@Column(name = "FRM_SZ_TEXT", length = 150)
	public String getFrmSzText() {
		return this.frmSzText;
	}

	public void setFrmSzText(String frmSzText) {
		this.frmSzText = frmSzText;
	}

	@Column(name = "PRTS_LN_TYPE_DESC", length = 30)
	public String getPrtsLnTypeDesc() {
		return this.prtsLnTypeDesc;
	}

	public void setPrtsLnTypeDesc(String prtsLnTypeDesc) {
		this.prtsLnTypeDesc = prtsLnTypeDesc;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CST_TRNSFR_DATE", length = 7)
	public Date getCstTrnsfrDate() {
		return this.cstTrnsfrDate;
	}

	public void setCstTrnsfrDate(Date cstTrnsfrDate) {
		this.cstTrnsfrDate = cstTrnsfrDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SLS_TRNSFR_DATE", length = 7)
	public Date getSlsTrnsfrDate() {
		return this.slsTrnsfrDate;
	}

	public void setSlsTrnsfrDate(Date slsTrnsfrDate) {
		this.slsTrnsfrDate = slsTrnsfrDate;
	}

	@Column(name = "BILLERS_CNTCT_INFO_DESC", length = 50)
	public String getBillersCntctInfoDesc() {
		return this.billersCntctInfoDesc;
	}

	public void setBillersCntctInfoDesc(String billersCntctInfoDesc) {
		this.billersCntctInfoDesc = billersCntctInfoDesc;
	}

	@Column(name = "BILLERS_BUC_CD", length = 6)
	public String getBillersBucCd() {
		return this.billersBucCd;
	}

	public void setBillersBucCd(String billersBucCd) {
		this.billersBucCd = billersBucCd;
	}

	@Column(name = "DEL_NUM", precision = 22, scale = 0)
	public BigDecimal getDelNum() {
		return this.delNum;
	}

	public void setDelNum(BigDecimal delNum) {
		this.delNum = delNum;
	}

	@Column(name = "RCVRS_BUC_CD", length = 6)
	public String getRcvrsBucCd() {
		return this.rcvrsBucCd;
	}

	public void setRcvrsBucCd(String rcvrsBucCd) {
		this.rcvrsBucCd = rcvrsBucCd;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRTD_DATE", nullable = true, length = 7)
	public Date getCrtdDate() {
		return this.crtdDate;
	}

	public void setCrtdDate(Date crtdDate) {
		this.crtdDate = crtdDate;
	}

	@Column(name = "CRTD_BY", nullable = true, length = 20)
	public String getCrtdBy() {
		return this.crtdBy;
	}

	public void setCrtdBy(String crtdBy) {
		this.crtdBy = crtdBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "LST_UPDT_DATE", nullable = true, length = 7)
	public Date getLstUpdtDate() {
		return this.lstUpdtDate;
	}

	public void setLstUpdtDate(Date lstUpdtDate) {
		this.lstUpdtDate = lstUpdtDate;
	}

	@Column(name = "LST_UPDTD_BY", nullable = true, length = 20)
	public String getLstUpdtdBy() {
		return this.lstUpdtdBy;
	}

	public void setLstUpdtdBy(String lstUpdtdBy) {
		this.lstUpdtdBy = lstUpdtdBy;
	}

	@Column(name = "USE_TAX", precision = 22, scale = 0)
	public BigDecimal getUseTax() {
		return this.useTax;
	}

	public void setUseTax(BigDecimal useTax) {
		this.useTax = useTax;
	}

	@Column(name = "PROJECT_CATEGORY", length = 150)
	public String getProjectCategory() {
		return this.projectCategory;
	}

	public void setProjectCategory(String projectCategory) {
		this.projectCategory = projectCategory;
	}

	@Column(name = "CONTRACT_NUMBER", length = 30)
	public String getContractNumber() {
		return this.contractNumber;
	}

	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}

	@Column(name = "EXPENDITURE_CATEGORY", length = 30)
	public String getExpenditureCategory() {
		return this.expenditureCategory;
	}

	public void setExpenditureCategory(String expenditureCategory) {
		this.expenditureCategory = expenditureCategory;
	}

	@Column(name = "ACTION_STATUS", length = 40)
	public String getActionStatus() {
		return this.actionStatus;
	}

	public void setActionStatus(String actionStatus) {
		this.actionStatus = actionStatus;
	}

	@Column(name = "AP_BILLER_BUC", length = 6)
	public String getApBillerBuc() {
		return this.apBillerBuc;
	}

	public void setApBillerBuc(String apBillerBuc) {
		this.apBillerBuc = apBillerBuc;
	}

	@Column(name = "AR_INVOICE_NUMBER", length = 30)
	public String getArInvoiceNumber() {
		return this.arInvoiceNumber;
	}

	public void setArInvoiceNumber(String arInvoiceNumber) {
		this.arInvoiceNumber = arInvoiceNumber;
	}

	@Column(name = "BUSINESS_REASON", length = 150)
	public String getBusinessReason() {
		return this.businessReason;
	}

	public void setBusinessReason(String businessReason) {
		this.businessReason = businessReason;
	}

	@Column(name = "CS_REGION", length = 240)
	public String getCsRegion() {
		return this.csRegion;
	}

	public void setCsRegion(String csRegion) {
		this.csRegion = csRegion;
	}

	@Column(name = "EQUIPMENT_FAMILY", length = 100)
	public String getEquipmentFamily() {
		return this.equipmentFamily;
	}

	public void setEquipmentFamily(String equipmentFamily) {
		this.equipmentFamily = equipmentFamily;
	}

	@Column(name = "EVENT_DESCRIPTION", length = 720)
	public String getEventDescription() {
		return this.eventDescription;
	}

	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}

	@Column(name = "GE_FIFO_COST", precision = 22, scale = 0)
	public BigDecimal getGeFifoCost() {
		return this.geFifoCost;
	}

	public void setGeFifoCost(BigDecimal geFifoCost) {
		this.geFifoCost = geFifoCost;
	}

	@Column(name = "LINE_COMMENT", length = 2000)
	public String getLineComment() {
		return this.lineComment;
	}

	public void setLineComment(String lineComment) {
		this.lineComment = lineComment;
	}

	@Column(name = "MODEL_BUCKET", length = 150)
	public String getModelBucket() {
		return this.modelBucket;
	}

	public void setModelBucket(String modelBucket) {
		this.modelBucket = modelBucket;
	}

	@Column(name = "ORIG_TRANSACTION_NUMBER", precision = 22, scale = 0)
	public BigDecimal getOrigTransactionNumber() {
		return this.origTransactionNumber;
	}

	public void setOrigTransactionNumber(BigDecimal origTransactionNumber) {
		this.origTransactionNumber = origTransactionNumber;
	}

	@Column(name = "PO_DESCRIPTION", length = 80)
	public String getPoDescription() {
		return this.poDescription;
	}

	public void setPoDescription(String poDescription) {
		this.poDescription = poDescription;
	}

	@Column(name = "PUSH_TYPE", length = 40)
	public String getPushType() {
		return this.pushType;
	}

	public void setPushType(String pushType) {
		this.pushType = pushType;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SOURCE_DATE_CREATED", length = 7)
	public Date getSourceDateCreated() {
		return this.sourceDateCreated;
	}

	public void setSourceDateCreated(Date sourceDateCreated) {
		this.sourceDateCreated = sourceDateCreated;
	}

	@Column(name = "SUBREGION", length = 240)
	public String getSubregion() {
		return this.subregion;
	}

	public void setSubregion(String subregion) {
		this.subregion = subregion;
	}

	@Column(name = "TP_ADDER", precision = 22, scale = 0)
	public BigDecimal getTpAdder() {
		return this.tpAdder;
	}

	public void setTpAdder(BigDecimal tpAdder) {
		this.tpAdder = tpAdder;
	}

	@Column(name = "TP_PERCENT", precision = 22, scale = 0)
	public BigDecimal getTpPercent() {
		return this.tpPercent;
	}

	public void setTpPercent(BigDecimal tpPercent) {
		this.tpPercent = tpPercent;
	}

	@Column(name = "BILL_TO_STATE", length = 150)
	public String getBillToState() {
		return this.billToState;
	}

	public void setBillToState(String billToState) {
		this.billToState = billToState;
	}

	@Column(name = "BILL_TO_COUNTRY", length = 150)
	public String getBillToCountry() {
		return this.billToCountry;
	}

	public void setBillToCountry(String billToCountry) {
		this.billToCountry = billToCountry;
	}

	@Column(name = "SHIP_TO_STATE", length = 150)
	public String getShipToState() {
		return this.shipToState;
	}

	public void setShipToState(String shipToState) {
		this.shipToState = shipToState;
	}

	@Column(name = "SHIP_TO_COUNTRY", length = 150)
	public String getShipToCountry() {
		return this.shipToCountry;
	}

	public void setShipToCountry(String shipToCountry) {
		this.shipToCountry = shipToCountry;
	}

	@Column(name = "CATALOG_BUCKET", length = 150)
	public String getCatalogBucket() {
		return this.catalogBucket;
	}

	public void setCatalogBucket(String catalogBucket) {
		this.catalogBucket = catalogBucket;
	}

	@Column(name = "STAT_COST", precision = 22, scale = 0)
	public BigDecimal getStatCost() {
		return this.statCost;
	}

	public void setStatCost(BigDecimal statCost) {
		this.statCost = statCost;
	}

	@Column(name = "PART_NUMBER", length = 2000)
	public String getPartNumber() {
		return this.partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "INVOICE_DATE", length = 7)
	public Date getInvoiceDate() {
		return this.invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	@Column(name = "DOC_NUMBER", precision = 22, scale = 0)
	public BigDecimal getDocNumber() {
		return this.docNumber;
	}

	public void setDocNumber(BigDecimal docNumber) {
		this.docNumber = docNumber;
	}

	@Column(name = "GAAP_SALES_LEVELIZED", precision = 22, scale = 0)
	public BigDecimal getGaapSalesLevelized() {
		return this.gaapSalesLevelized;
	}

	public void setGaapSalesLevelized(BigDecimal gaapSalesLevelized) {
		this.gaapSalesLevelized = gaapSalesLevelized;
	}

	@Column(name = "GL_JE_SOURCE_NAME", length = 25)
	public String getGlJeSourceName() {
		return this.glJeSourceName;
	}

	public void setGlJeSourceName(String glJeSourceName) {
		this.glJeSourceName = glJeSourceName;
	}

	@Column(name = "HEADER_DESCRIPTION")
	public String getHeaderDescription() {
		return this.headerDescription;
	}

	public void setHeaderDescription(String headerDescription) {
		this.headerDescription = headerDescription;
	}

	@Column(name = "IC_LE", length = 100)
	public String getIcLe() {
		return this.icLe;
	}

	public void setIcLe(String icLe) {
		this.icLe = icLe;
	}

	@Column(name = "IC_ME", length = 100)
	public String getIcMe() {
		return this.icMe;
	}

	public void setIcMe(String icMe) {
		this.icMe = icMe;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "OFS_EVENT_START_DATE", length = 7)
	public Date getOfsEventStartDate() {
		return this.ofsEventStartDate;
	}

	public void setOfsEventStartDate(Date ofsEventStartDate) {
		this.ofsEventStartDate = ofsEventStartDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "OFS_EVENT_END_DATE", length = 7)
	public Date getOfsEventEndDate() {
		return this.ofsEventEndDate;
	}

	public void setOfsEventEndDate(Date ofsEventEndDate) {
		this.ofsEventEndDate = ofsEventEndDate;
	}

	@Column(name = "ICAM_MARGIN_RATE_GAAP", precision = 22, scale = 0)
	public BigDecimal getIcamMarginRateGaap() {
		return this.icamMarginRateGaap;
	}

	public void setIcamMarginRateGaap(BigDecimal icamMarginRateGaap) {
		this.icamMarginRateGaap = icamMarginRateGaap;
	}

	@Column(name = "ICAM_MARGIN_RATE_STAT", precision = 22, scale = 0)
	public BigDecimal getIcamMarginRateStat() {
		return this.icamMarginRateStat;
	}

	public void setIcamMarginRateStat(BigDecimal icamMarginRateStat) {
		this.icamMarginRateStat = icamMarginRateStat;
	}

	@Column(name = "ICAM_PERSISTENT_ID", length = 100)
	public String getIcamPersistentId() {
		return this.icamPersistentId;
	}

	public void setIcamPersistentId(String icamPersistentId) {
		this.icamPersistentId = icamPersistentId;
	}

	@Column(name = "IDENTIFIER_KEY", precision = 22, scale = 0)
	public BigDecimal getIdentifierKey() {
		return this.identifierKey;
	}

	public void setIdentifierKey(BigDecimal identifierKey) {
		this.identifierKey = identifierKey;
	}

	@Column(name = "JE_HEADER_LINE", length = 40)
	public String getJeHeaderLine() {
		return this.jeHeaderLine;
	}

	public void setJeHeaderLine(String jeHeaderLine) {
		this.jeHeaderLine = jeHeaderLine;
	}

	@Column(name = "JOB_FSR_NUMBER", length = 600)
	public String getJobFsrNumber() {
		return this.jobFsrNumber;
	}

	public void setJobFsrNumber(String jobFsrNumber) {
		this.jobFsrNumber = jobFsrNumber;
	}

	@Column(name = "OFS_EVENT_ID", precision = 22, scale = 0)
	public BigDecimal getOfsEventId() {
		return this.ofsEventId;
	}

	public void setOfsEventId(BigDecimal ofsEventId) {
		this.ofsEventId = ofsEventId;
	}

	@Column(name = "OFS_EVENT_TYPE", length = 40)
	public String getOfsEventType() {
		return this.ofsEventType;
	}

	public void setOfsEventType(String ofsEventType) {
		this.ofsEventType = ofsEventType;
	}

	@Column(name = "ORG_ID", precision = 22, scale = 0)
	public BigDecimal getOrgId() {
		return this.orgId;
	}

	public void setOrgId(BigDecimal orgId) {
		this.orgId = orgId;
	}

	@Column(name = "PO_NUMBER", length = 4000)
	public String getPoNumber() {
		return this.poNumber;
	}

	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}

	@Column(name = "PRICE_LIST", length = 240)
	public String getPriceList() {
		return this.priceList;
	}

	public void setPriceList(String priceList) {
		this.priceList = priceList;
	}

	@Column(name = "PROJECT_ID", precision = 22, scale = 0)
	public BigDecimal getProjectId() {
		return this.projectId;
	}

	public void setProjectId(BigDecimal projectId) {
		this.projectId = projectId;
	}

	@Column(name = "REFER", length = 100)
	public String getRefer() {
		return this.refer;
	}

	public void setRefer(String refer) {
		this.refer = refer;
	}

	@Column(name = "SERVICES_CM", length = 30)
	public String getServicesCm() {
		return this.servicesCm;
	}

	public void setServicesCm(String servicesCm) {
		this.servicesCm = servicesCm;
	}

	@Column(name = "SUPPLIER_NAME", length = 250)
	public String getSupplierName() {
		return this.supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	@Column(name = "VENDOR_NAME", length = 100)
	public String getVendorName() {
		return this.vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	@Column(name = "AMOUNT", precision = 22, scale = 0)
	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Column(name = "BASE_AMOUNT", precision = 22, scale = 0)
	public BigDecimal getBaseAmount() {
		return this.baseAmount;
	}

	public void setBaseAmount(BigDecimal baseAmount) {
		this.baseAmount = baseAmount;
	}

	@Column(name = "BASE_INVOICE_AMOUNT", precision = 22, scale = 0)
	public BigDecimal getBaseInvoiceAmount() {
		return this.baseInvoiceAmount;
	}

	public void setBaseInvoiceAmount(BigDecimal baseInvoiceAmount) {
		this.baseInvoiceAmount = baseInvoiceAmount;
	}

	@Column(name = "LINE_FEE_TYPE", length = 150)
	public String getLineFeeType() {
		return this.lineFeeType;
	}

	public void setLineFeeType(String lineFeeType) {
		this.lineFeeType = lineFeeType;
	}

	@Column(name = "INVOICE_AMOUNT", precision = 22, scale = 0)
	public BigDecimal getInvoiceAmount() {
		return this.invoiceAmount;
	}

	public void setInvoiceAmount(BigDecimal invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	@Column(name = "INVOICE_NUMBER", length = 30)
	public String getInvoiceNumber() {
		return this.invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	@Column(name = "SUB_FEE_TYPE", length = 150)
	public String getSubFeeType() {
		return this.subFeeType;
	}

	public void setSubFeeType(String subFeeType) {
		this.subFeeType = subFeeType;
	}

	@Column(name = "TASK_NAME", length = 120)
	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	@Column(name = "LINE_NUMBER", length = 30)
	public String getLineNumber() {
		return this.lineNumber;
	}

	public void setLineNumber(String lineNumber) {
		this.lineNumber = lineNumber;
	}

	@Column(name = "OFS_EVENT_DESC", length = 100)
	public String getOfsEventDesc() {
		return this.ofsEventDesc;
	}

	public void setOfsEventDesc(String ofsEventDesc) {
		this.ofsEventDesc = ofsEventDesc;
	}

	@Column(name = "GAAP_SALES__LEVELIZED", precision = 22, scale = 0)
	public BigDecimal getGaapSalesLevelized1() {
		return this.gaapSalesLevelized1;
	}

	public void setGaapSalesLevelized1(BigDecimal gaapSalesLevelized1) {
		this.gaapSalesLevelized1 = gaapSalesLevelized1;
	}

	@Column(name = "CS_PO_NUMBER", precision = 22, scale = 0)
	public BigDecimal getCsPoNumber() {
		return this.csPoNumber;
	}

	public void setCsPoNumber(BigDecimal csPoNumber) {
		this.csPoNumber = csPoNumber;
	}

	@Column(name = "PROCESS_FLG", length = 1)
	public String getProcessFlg() {
		return this.processFlg;
	}

	public void setProcessFlg(String processFlg) {
		this.processFlg = processFlg;
	}

	@Column(name = "TAX_AMT", precision = 22, scale = 0)
	public BigDecimal getTaxAmt() {
		return this.taxAmt;
	}

	public void setTaxAmt(BigDecimal taxAmt) {
		this.taxAmt = taxAmt;
	}

	@Column(name = "BASE_TAX_AMT", precision = 22, scale = 0)
	public BigDecimal getBaseTaxAmt() {
		return this.baseTaxAmt;
	}

	public void setBaseTaxAmt(BigDecimal baseTaxAmt) {
		this.baseTaxAmt = baseTaxAmt;
	}

	@Column(name = "INV_LINE_NUM", length = 100)
	public String getInvLineNum() {
		return this.invLineNum;
	}

	public void setInvLineNum(String invLineNum) {
		this.invLineNum = invLineNum;
	}

	@Column(name = "CM_SERV_AMT", length = 20)
	public String getCmServAmt() {
		return this.cmServAmt;
	}

	public void setCmServAmt(String cmServAmt) {
		this.cmServAmt = cmServAmt;
	}

	@Column(name = "MODEL_ID", precision = 10, scale = 0)
	public long getModelId() {
		return this.modelId;
	}

	public void setModelId(long modelId) {
		this.modelId = modelId;
	}

	@Column(name = "GL_QTR_DESC", length = 6)
	public String getGlQtrDesc() {
		return this.glQtrDesc;
	}

	public void setGlQtrDesc(String glQtrDesc) {
		this.glQtrDesc = glQtrDesc;
	}

	@Column(name = "MARGIN_REVIEW_FLAG", length = 8)
	public String getMarginReviewFlag() {
		return this.marginReviewFlag;
	}

	public void setMarginReviewFlag(String marginReviewFlag) {
		this.marginReviewFlag = marginReviewFlag;
	}

}