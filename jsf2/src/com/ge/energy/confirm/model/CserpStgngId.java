/**
 * Project:      PGS - AA
 * Component:    CserpStgngId.java
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

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CnfmCserpStgngId entity.
 */

@Embeddable
public class CserpStgngId implements java.io.Serializable {

	private static final long serialVersionUID = 8059562017950442167L;

	private String srcCode;
	private BigDecimal tranNum;
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
	private String subRegion;
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

	// Constructors

	/** default constructor */
	public CserpStgngId() {
	}

	/** minimal constructor */
	public CserpStgngId(BigDecimal tranNum, Date crtdDate1, String crtdBy,
			Date lstUpdtDate1, String lstUpdtdBy) {
		this.tranNum = tranNum;
		this.crtdDate = crtdDate1;
		this.crtdBy = crtdBy;
		this.lstUpdtDate = lstUpdtDate1;
		this.lstUpdtdBy = lstUpdtdBy;
	}

	/** full constructor */
	public CserpStgngId(String srcCode, BigDecimal tranNum, String projNum,
			String tskNum, String custName, String custNum,
			String billToSiteText, String shpToSiteText, String agrmntId,
			String agrmntName, String stId, String stName, String eamLocCd,
			String lglEnty, String mgmtEnty, String pAndLCd, String bucCd,
			String cpmFlName, String cpmOhrId, String otrFlName,
			String otrOhrId, String prtfolioFlName, String prtfolioOhrId,
			String projType, String itmNum, String itmDesc, String crncyCd,
			String lnType, String prchsOrdrNum, String prchsOrdrLnNum,
			String tranSrc, String expndtrCtgryDesc, String paExpndtrType,
			Date expndtrDate1, BigDecimal rawCst, String cstAcctDbt,
			BigDecimal cstCcidDbt, String cstAcctCrdt, BigDecimal cstCcidCr,
			Date cstPaDate1, Date cstGlDate1, String cstPaPrd, String cstGlPrd,
			String evntType, BigDecimal slsAmt, String slsAcctDr,
			BigDecimal slsCcidDr, String slsAcctCr, BigDecimal slsCcidCrdt,
			Date slsPaDate1, Date slsGlDate1, String revPaPrd, String revGlPrd,
			BigDecimal cmAmt, String cmPct, String fsclYr, String tiebckFlg,
			Date tiebckDate1, BigDecimal glJrnlEntryHdrId,
			BigDecimal glJrnlEntryBtchId, BigDecimal glJeLnId,
			String glJrnlBtchName, String glSweepLnkDesc,
			String glBtchCntrlDesc, Date lstFetchDate1, String prtsOrdrNum,
			String prtsLnNum, String trbnSerNum, String apInvNum,
			String prListDesc, BigDecimal listPrNum, String custPrchsOrdrNum,
			String custPrchsOrdrLn, BigDecimal btchId, BigDecimal qtyNum,
			String frmSzText, String prtsLnTypeDesc, Date cstTrnsfrDate1,
			Date slsTrnsfrDate1, String billersCntctInfoDesc,
			String billersBucCd, BigDecimal delNum, String rcvrsBucCd,
			Date crtdDate1, String crtdBy, Date lstUpdtDate1,
			String lstUpdtdBy, BigDecimal useTax, String projectCategory,
			String contractNumber, String expenditureCategory,
			String actionStatus, String apBillerBuc, String arInvoiceNumber,
			String businessReason, String csRegion, String equipmentFamily,
			String eventDescription, BigDecimal geFifoCost, String lineComment,
			String modelBucket, BigDecimal origTransactionNumber,
			String poDescription, String pushType, Date sourceDateCreated1,
			String subregion, BigDecimal tpAdder, BigDecimal tpPercent,
			String billToState, String billToCountry, String shipToState,
			String shipToCountry, String catalogBucket, BigDecimal statCost,
			String partNumber, Date invoiceDate1, BigDecimal docNumber,
			BigDecimal gaapSalesLevelized, String glJeSourceName,
			String headerDescription, String icLe, String icMe,
			Date ofsEventStartDate1, Date ofsEventEndDate1,
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
			String invLineNum, String cmServAmt) {
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
		this.expndtrDate = expndtrDate1;
		this.rawCst = rawCst;
		this.cstAcctDbt = cstAcctDbt;
		this.cstCcidDbt = cstCcidDbt;
		this.cstAcctCrdt = cstAcctCrdt;
		this.cstCcidCr = cstCcidCr;
		this.cstPaDate = cstPaDate1;
		this.cstGlDate = cstGlDate1;
		this.cstPaPrd = cstPaPrd;
		this.cstGlPrd = cstGlPrd;
		this.evntType = evntType;
		this.slsAmt = slsAmt;
		this.slsAcctDr = slsAcctDr;
		this.slsCcidDr = slsCcidDr;
		this.slsAcctCr = slsAcctCr;
		this.slsCcidCrdt = slsCcidCrdt;
		this.slsPaDate = slsPaDate1;
		this.slsGlDate = slsGlDate1;
		this.revPaPrd = revPaPrd;
		this.revGlPrd = revGlPrd;
		this.cmAmt = cmAmt;
		this.cmPct = cmPct;
		this.fsclYr = fsclYr;
		this.tiebckFlg = tiebckFlg;
		this.tiebckDate = tiebckDate1;
		this.glJrnlEntryHdrId = glJrnlEntryHdrId;
		this.glJrnlEntryBtchId = glJrnlEntryBtchId;
		this.glJeLnId = glJeLnId;
		this.glJrnlBtchName = glJrnlBtchName;
		this.glSweepLnkDesc = glSweepLnkDesc;
		this.glBtchCntrlDesc = glBtchCntrlDesc;
		this.lstFetchDate = lstFetchDate1;
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
		this.cstTrnsfrDate = cstTrnsfrDate1;
		this.slsTrnsfrDate = slsTrnsfrDate1;
		this.billersCntctInfoDesc = billersCntctInfoDesc;
		this.billersBucCd = billersBucCd;
		this.delNum = delNum;
		this.rcvrsBucCd = rcvrsBucCd;
		this.crtdDate = crtdDate1;
		this.crtdBy = crtdBy;
		this.lstUpdtDate = lstUpdtDate1;
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
		this.sourceDateCreated = sourceDateCreated1;
		this.subRegion = subregion;
		this.tpAdder = tpAdder;
		this.tpPercent = tpPercent;
		this.billToState = billToState;
		this.billToCountry = billToCountry;
		this.shipToState = shipToState;
		this.shipToCountry = shipToCountry;
		this.catalogBucket = catalogBucket;
		this.statCost = statCost;
		this.partNumber = partNumber;
		this.invoiceDate = invoiceDate1;
		this.docNumber = docNumber;
		this.gaapSalesLevelized = gaapSalesLevelized;
		this.glJeSourceName = glJeSourceName;
		this.headerDescription = headerDescription;
		this.icLe = icLe;
		this.icMe = icMe;
		this.ofsEventStartDate = ofsEventStartDate1;
		this.ofsEventEndDate = ofsEventEndDate1;
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
	}

	@Column(name = "SRC_CODE")
	public String getSrcCode() {
		return this.srcCode;
	}

	public void setSrcCode(String srcCode) {
		this.srcCode = srcCode;
	}

	@Column(name = "TRAN_NUM", nullable = false, scale = 0)
	public BigDecimal getTranNum() {
		return this.tranNum;
	}

	public void setTranNum(BigDecimal tranNum) {
		this.tranNum = tranNum;
	}

	@Column(name = "PROJ_NUM")
	public String getProjNum() {
		return this.projNum;
	}

	public void setProjNum(String projNum) {
		this.projNum = projNum;
	}

	@Column(name = "TSK_NUM")
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

	@Column(name = "CUST_NUM")
	public String getCustNum() {
		return this.custNum;
	}

	public void setCustNum(String custNum) {
		this.custNum = custNum;
	}

	@Column(name = "BILL_TO_SITE_TEXT")
	public String getBillToSiteText() {
		return this.billToSiteText;
	}

	public void setBillToSiteText(String billToSiteText) {
		this.billToSiteText = billToSiteText;
	}

	@Column(name = "SHP_TO_SITE_TEXT")
	public String getShpToSiteText() {
		return this.shpToSiteText;
	}

	public void setShpToSiteText(String shpToSiteText) {
		this.shpToSiteText = shpToSiteText;
	}

	@Column(name = "AGRMNT_ID")
	public String getAgrmntId() {
		return this.agrmntId;
	}

	public void setAgrmntId(String agrmntId) {
		this.agrmntId = agrmntId;
	}

	@Column(name = "AGRMNT_NAME")
	public String getAgrmntName() {
		return this.agrmntName;
	}

	public void setAgrmntName(String agrmntName) {
		this.agrmntName = agrmntName;
	}

	@Column(name = "ST_ID")
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

	@Column(name = "EAM_LOC_CD")
	public String getEamLocCd() {
		return this.eamLocCd;
	}

	public void setEamLocCd(String eamLocCd) {
		this.eamLocCd = eamLocCd;
	}

	@Column(name = "LGL_ENTY")
	public String getLglEnty() {
		return this.lglEnty;
	}

	public void setLglEnty(String lglEnty) {
		this.lglEnty = lglEnty;
	}

	@Column(name = "MGMT_ENTY")
	public String getMgmtEnty() {
		return this.mgmtEnty;
	}

	public void setMgmtEnty(String mgmtEnty) {
		this.mgmtEnty = mgmtEnty;
	}

	@Column(name = "P_AND_L_CD")
	public String getPAndLCd() {
		return this.pAndLCd;
	}

	public void setPAndLCd(String pAndLCd) {
		this.pAndLCd = pAndLCd;
	}

	@Column(name = "BUC_CD")
	public String getBucCd() {
		return this.bucCd;
	}

	public void setBucCd(String bucCd) {
		this.bucCd = bucCd;
	}

	@Column(name = "CPM_FL_NAME")
	public String getCpmFlName() {
		return this.cpmFlName;
	}

	public void setCpmFlName(String cpmFlName) {
		this.cpmFlName = cpmFlName;
	}

	@Column(name = "CPM_OHR_ID")
	public String getCpmOhrId() {
		return this.cpmOhrId;
	}

	public void setCpmOhrId(String cpmOhrId) {
		this.cpmOhrId = cpmOhrId;
	}

	@Column(name = "OTR_FL_NAME")
	public String getOtrFlName() {
		return this.otrFlName;
	}

	public void setOtrFlName(String otrFlName) {
		this.otrFlName = otrFlName;
	}

	@Column(name = "OTR_OHR_ID")
	public String getOtrOhrId() {
		return this.otrOhrId;
	}

	public void setOtrOhrId(String otrOhrId) {
		this.otrOhrId = otrOhrId;
	}

	@Column(name = "PRTFOLIO_FL_NAME")
	public String getPrtfolioFlName() {
		return this.prtfolioFlName;
	}

	public void setPrtfolioFlName(String prtfolioFlName) {
		this.prtfolioFlName = prtfolioFlName;
	}

	@Column(name = "PRTFOLIO_OHR_ID")
	public String getPrtfolioOhrId() {
		return this.prtfolioOhrId;
	}

	public void setPrtfolioOhrId(String prtfolioOhrId) {
		this.prtfolioOhrId = prtfolioOhrId;
	}

	@Column(name = "PROJ_TYPE")
	public String getProjType() {
		return this.projType;
	}

	public void setProjType(String projType) {
		this.projType = projType;
	}

	@Column(name = "ITM_NUM")
	public String getItmNum() {
		return this.itmNum;
	}

	public void setItmNum(String itmNum) {
		this.itmNum = itmNum;
	}

	@Column(name = "ITM_DESC")
	public String getItmDesc() {
		return this.itmDesc;
	}

	public void setItmDesc(String itmDesc) {
		this.itmDesc = itmDesc;
	}

	@Column(name = "CRNCY_CD")
	public String getCrncyCd() {
		return this.crncyCd;
	}

	public void setCrncyCd(String crncyCd) {
		this.crncyCd = crncyCd;
	}

	@Column(name = "LN_TYPE")
	public String getLnType() {
		return this.lnType;
	}

	public void setLnType(String lnType) {
		this.lnType = lnType;
	}

	@Column(name = "PRCHS_ORDR_NUM")
	public String getPrchsOrdrNum() {
		return this.prchsOrdrNum;
	}

	public void setPrchsOrdrNum(String prchsOrdrNum) {
		this.prchsOrdrNum = prchsOrdrNum;
	}

	@Column(name = "PRCHS_ORDR_LN_NUM")
	public String getPrchsOrdrLnNum() {
		return this.prchsOrdrLnNum;
	}

	public void setPrchsOrdrLnNum(String prchsOrdrLnNum) {
		this.prchsOrdrLnNum = prchsOrdrLnNum;
	}

	@Column(name = "TRAN_SRC")
	public String getTranSrc() {
		return this.tranSrc;
	}

	public void setTranSrc(String tranSrc) {
		this.tranSrc = tranSrc;
	}

	@Column(name = "EXPNDTR_CTGRY_DESC")
	public String getExpndtrCtgryDesc() {
		return this.expndtrCtgryDesc;
	}

	public void setExpndtrCtgryDesc(String expndtrCtgryDesc) {
		this.expndtrCtgryDesc = expndtrCtgryDesc;
	}

	@Column(name = "PA_EXPNDTR_TYPE")
	public String getPaExpndtrType() {
		return this.paExpndtrType;
	}

	public void setPaExpndtrType(String paExpndtrType) {
		this.paExpndtrType = paExpndtrType;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "EXPNDTR_DATE")
	public Date getExpndtrDate() {
		return this.expndtrDate;
	}

	public void setExpndtrDate(Date expndtrDate1) {
		this.expndtrDate = expndtrDate1;
	}

	@Column(name = "RAW_CST", scale = 0)
	public BigDecimal getRawCst() {
		return this.rawCst;
	}

	public void setRawCst(BigDecimal rawCst) {
		this.rawCst = rawCst;
	}

	@Column(name = "CST_ACCT_DBT")
	public String getCstAcctDbt() {
		return this.cstAcctDbt;
	}

	public void setCstAcctDbt(String cstAcctDbt) {
		this.cstAcctDbt = cstAcctDbt;
	}

	@Column(name = "CST_CCID_DBT", scale = 0)
	public BigDecimal getCstCcidDbt() {
		return this.cstCcidDbt;
	}

	public void setCstCcidDbt(BigDecimal cstCcidDbt) {
		this.cstCcidDbt = cstCcidDbt;
	}

	@Column(name = "CST_ACCT_CRDT")
	public String getCstAcctCrdt() {
		return this.cstAcctCrdt;
	}

	public void setCstAcctCrdt(String cstAcctCrdt) {
		this.cstAcctCrdt = cstAcctCrdt;
	}

	@Column(name = "CST_CCID_CR", scale = 0)
	public BigDecimal getCstCcidCr() {
		return this.cstCcidCr;
	}

	public void setCstCcidCr(BigDecimal cstCcidCr) {
		this.cstCcidCr = cstCcidCr;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CST_PA_DATE")
	public Date getCstPaDate() {
		return this.cstPaDate;
	}

	public void setCstPaDate(Date cstPaDate1) {
		this.cstPaDate = cstPaDate1;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CST_GL_DATE")
	public Date getCstGlDate() {
		return this.cstGlDate;
	}

	public void setCstGlDate(Date cstGlDate1) {
		this.cstGlDate = cstGlDate1;
	}

	@Column(name = "CST_PA_PRD")
	public String getCstPaPrd() {
		return this.cstPaPrd;
	}

	public void setCstPaPrd(String cstPaPrd) {
		this.cstPaPrd = cstPaPrd;
	}

	@Column(name = "CST_GL_PRD")
	public String getCstGlPrd() {
		return this.cstGlPrd;
	}

	public void setCstGlPrd(String cstGlPrd) {
		this.cstGlPrd = cstGlPrd;
	}

	@Column(name = "EVNT_TYPE")
	public String getEvntType() {
		return this.evntType;
	}

	public void setEvntType(String evntType) {
		this.evntType = evntType;
	}

	@Column(name = "SLS_AMT", scale = 0)
	public BigDecimal getSlsAmt() {
		return this.slsAmt;
	}

	public void setSlsAmt(BigDecimal slsAmt) {
		this.slsAmt = slsAmt;
	}

	@Column(name = "SLS_ACCT_DR")
	public String getSlsAcctDr() {
		return this.slsAcctDr;
	}

	public void setSlsAcctDr(String slsAcctDr) {
		this.slsAcctDr = slsAcctDr;
	}

	@Column(name = "SLS_CCID_DR", scale = 0)
	public BigDecimal getSlsCcidDr() {
		return this.slsCcidDr;
	}

	public void setSlsCcidDr(BigDecimal slsCcidDr) {
		this.slsCcidDr = slsCcidDr;
	}

	@Column(name = "SLS_ACCT_CR")
	public String getSlsAcctCr() {
		return this.slsAcctCr;
	}

	public void setSlsAcctCr(String slsAcctCr) {
		this.slsAcctCr = slsAcctCr;
	}

	@Column(name = "SLS_CCID_CRDT", scale = 0)
	public BigDecimal getSlsCcidCrdt() {
		return this.slsCcidCrdt;
	}

	public void setSlsCcidCrdt(BigDecimal slsCcidCrdt) {
		this.slsCcidCrdt = slsCcidCrdt;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SLS_PA_DATE")
	public Date getSlsPaDate() {
		return this.slsPaDate;
	}

	public void setSlsPaDate(Date slsPaDate1) {
		this.slsPaDate = slsPaDate1;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SLS_GL_DATE")
	public Date getSlsGlDate() {
		return this.slsGlDate;
	}

	public void setSlsGlDate(Date slsGlDate1) {
		this.slsGlDate = slsGlDate1;
	}

	@Column(name = "REV_PA_PRD")
	public String getRevPaPrd() {
		return this.revPaPrd;
	}

	public void setRevPaPrd(String revPaPrd) {
		this.revPaPrd = revPaPrd;
	}

	@Column(name = "REV_GL_PRD")
	public String getRevGlPrd() {
		return this.revGlPrd;
	}

	public void setRevGlPrd(String revGlPrd) {
		this.revGlPrd = revGlPrd;
	}

	@Column(name = "CM_AMT", scale = 0)
	public BigDecimal getCmAmt() {
		return this.cmAmt;
	}

	public void setCmAmt(BigDecimal cmAmt) {
		this.cmAmt = cmAmt;
	}

	@Column(name = "CM_PCT")
	public String getCmPct() {
		return this.cmPct;
	}

	public void setCmPct(String cmPct) {
		this.cmPct = cmPct;
	}

	@Column(name = "FSCL_YR")
	public String getFsclYr() {
		return this.fsclYr;
	}

	public void setFsclYr(String fsclYr) {
		this.fsclYr = fsclYr;
	}

	@Column(name = "TIEBCK_FLG")
	public String getTiebckFlg() {
		return this.tiebckFlg;
	}

	public void setTiebckFlg(String tiebckFlg) {
		this.tiebckFlg = tiebckFlg;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "TIEBCK_DATE")
	public Date getTiebckDate() {
		return this.tiebckDate;
	}

	public void setTiebckDate(Date tiebckDate1) {
		this.tiebckDate = tiebckDate1;
	}

	@Column(name = "GL_JRNL_ENTRY_HDR_ID", scale = 0)
	public BigDecimal getGlJrnlEntryHdrId() {
		return this.glJrnlEntryHdrId;
	}

	public void setGlJrnlEntryHdrId(BigDecimal glJrnlEntryHdrId) {
		this.glJrnlEntryHdrId = glJrnlEntryHdrId;
	}

	@Column(name = "GL_JRNL_ENTRY_BTCH_ID", scale = 0)
	public BigDecimal getGlJrnlEntryBtchId() {
		return this.glJrnlEntryBtchId;
	}

	public void setGlJrnlEntryBtchId(BigDecimal glJrnlEntryBtchId) {
		this.glJrnlEntryBtchId = glJrnlEntryBtchId;
	}

	@Column(name = "GL_JE_LN_ID", scale = 0)
	public BigDecimal getGlJeLnId() {
		return this.glJeLnId;
	}

	public void setGlJeLnId(BigDecimal glJeLnId) {
		this.glJeLnId = glJeLnId;
	}

	@Column(name = "GL_JRNL_BTCH_NAME")
	public String getGlJrnlBtchName() {
		return this.glJrnlBtchName;
	}

	public void setGlJrnlBtchName(String glJrnlBtchName) {
		this.glJrnlBtchName = glJrnlBtchName;
	}

	@Column(name = "GL_SWEEP_LNK_DESC")
	public String getGlSweepLnkDesc() {
		return this.glSweepLnkDesc;
	}

	public void setGlSweepLnkDesc(String glSweepLnkDesc) {
		this.glSweepLnkDesc = glSweepLnkDesc;
	}

	@Column(name = "GL_BTCH_CNTRL_DESC")
	public String getGlBtchCntrlDesc() {
		return this.glBtchCntrlDesc;
	}

	public void setGlBtchCntrlDesc(String glBtchCntrlDesc) {
		this.glBtchCntrlDesc = glBtchCntrlDesc;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "LST_FETCH_DATE")
	public Date getLstFetchDate() {
		return this.lstFetchDate;
	}

	public void setLstFetchDate(Date lstFetchDate1) {
		this.lstFetchDate = lstFetchDate1;
	}

	@Column(name = "PRTS_ORDR_NUM")
	public String getPrtsOrdrNum() {
		return this.prtsOrdrNum;
	}

	public void setPrtsOrdrNum(String prtsOrdrNum) {
		this.prtsOrdrNum = prtsOrdrNum;
	}

	@Column(name = "PRTS_LN_NUM")
	public String getPrtsLnNum() {
		return this.prtsLnNum;
	}

	public void setPrtsLnNum(String prtsLnNum) {
		this.prtsLnNum = prtsLnNum;
	}

	@Column(name = "TRBN_SER_NUM")
	public String getTrbnSerNum() {
		return this.trbnSerNum;
	}

	public void setTrbnSerNum(String trbnSerNum) {
		this.trbnSerNum = trbnSerNum;
	}

	@Column(name = "AP_INV_NUM")
	public String getApInvNum() {
		return this.apInvNum;
	}

	public void setApInvNum(String apInvNum) {
		this.apInvNum = apInvNum;
	}

	@Column(name = "PR_LIST_DESC")
	public String getPrListDesc() {
		return this.prListDesc;
	}

	public void setPrListDesc(String prListDesc) {
		this.prListDesc = prListDesc;
	}

	@Column(name = "LIST_PR_NUM", scale = 0)
	public BigDecimal getListPrNum() {
		return this.listPrNum;
	}

	public void setListPrNum(BigDecimal listPrNum) {
		this.listPrNum = listPrNum;
	}

	@Column(name = "CUST_PRCHS_ORDR_NUM")
	public String getCustPrchsOrdrNum() {
		return this.custPrchsOrdrNum;
	}

	public void setCustPrchsOrdrNum(String custPrchsOrdrNum) {
		this.custPrchsOrdrNum = custPrchsOrdrNum;
	}

	@Column(name = "CUST_PRCHS_ORDR_LN")
	public String getCustPrchsOrdrLn() {
		return this.custPrchsOrdrLn;
	}

	public void setCustPrchsOrdrLn(String custPrchsOrdrLn) {
		this.custPrchsOrdrLn = custPrchsOrdrLn;
	}

	@Column(name = "BTCH_ID", scale = 0)
	public BigDecimal getBtchId() {
		return this.btchId;
	}

	public void setBtchId(BigDecimal btchId) {
		this.btchId = btchId;
	}

	@Column(name = "QTY_NUM", scale = 0)
	public BigDecimal getQtyNum() {
		return this.qtyNum;
	}

	public void setQtyNum(BigDecimal qtyNum) {
		this.qtyNum = qtyNum;
	}

	@Column(name = "FRM_SZ_TEXT")
	public String getFrmSzText() {
		return this.frmSzText;
	}

	public void setFrmSzText(String frmSzText) {
		this.frmSzText = frmSzText;
	}

	@Column(name = "PRTS_LN_TYPE_DESC")
	public String getPrtsLnTypeDesc() {
		return this.prtsLnTypeDesc;
	}

	public void setPrtsLnTypeDesc(String prtsLnTypeDesc) {
		this.prtsLnTypeDesc = prtsLnTypeDesc;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CST_TRNSFR_DATE")
	public Date getCstTrnsfrDate() {
		return this.cstTrnsfrDate;
	}

	public void setCstTrnsfrDate(Date cstTrnsfrDate1) {
		this.cstTrnsfrDate = cstTrnsfrDate1;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SLS_TRNSFR_DATE")
	public Date getSlsTrnsfrDate() {
		return this.slsTrnsfrDate;
	}

	public void setSlsTrnsfrDate(Date slsTrnsfrDate1) {
		this.slsTrnsfrDate = slsTrnsfrDate1;
	}

	@Column(name = "BILLERS_CNTCT_INFO_DESC")
	public String getBillersCntctInfoDesc() {
		return this.billersCntctInfoDesc;
	}

	public void setBillersCntctInfoDesc(String billersCntctInfoDesc) {
		this.billersCntctInfoDesc = billersCntctInfoDesc;
	}

	@Column(name = "BILLERS_BUC_CD")
	public String getBillersBucCd() {
		return this.billersBucCd;
	}

	public void setBillersBucCd(String billersBucCd) {
		this.billersBucCd = billersBucCd;
	}

	@Column(name = "DEL_NUM", scale = 0)
	public BigDecimal getDelNum() {
		return this.delNum;
	}

	public void setDelNum(BigDecimal delNum) {
		this.delNum = delNum;
	}

	@Column(name = "RCVRS_BUC_CD")
	public String getRcvrsBucCd() {
		return this.rcvrsBucCd;
	}

	public void setRcvrsBucCd(String rcvrsBucCd) {
		this.rcvrsBucCd = rcvrsBucCd;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRTD_DATE", nullable = false)
	public Date getCrtdDate() {
		return this.crtdDate;
	}

	public void setCrtdDate(Date crtdDate1) {
		this.crtdDate = crtdDate1;
	}

	@Column(name = "CRTD_BY", nullable = false)
	public String getCrtdBy() {
		return this.crtdBy;
	}

	public void setCrtdBy(String crtdBy) {
		this.crtdBy = crtdBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "LST_UPDT_DATE", nullable = false)
	public Date getLstUpdtDate() {
		return this.lstUpdtDate;
	}

	public void setLstUpdtDate(Date lstUpdtDate1) {
		this.lstUpdtDate = lstUpdtDate1;
	}

	@Column(name = "LST_UPDTD_BY", nullable = false)
	public String getLstUpdtdBy() {
		return this.lstUpdtdBy;
	}

	public void setLstUpdtdBy(String lstUpdtdBy) {
		this.lstUpdtdBy = lstUpdtdBy;
	}

	@Column(name = "USE_TAX", scale = 0)
	public BigDecimal getUseTax() {
		return this.useTax;
	}

	public void setUseTax(BigDecimal useTax) {
		this.useTax = useTax;
	}

	@Column(name = "PROJECT_CATEGORY")
	public String getProjectCategory() {
		return this.projectCategory;
	}

	public void setProjectCategory(String projectCategory) {
		this.projectCategory = projectCategory;
	}

	@Column(name = "CONTRACT_NUMBER")
	public String getContractNumber() {
		return this.contractNumber;
	}

	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}

	@Column(name = "EXPENDITURE_CATEGORY")
	public String getExpenditureCategory() {
		return this.expenditureCategory;
	}

	public void setExpenditureCategory(String expenditureCategory) {
		this.expenditureCategory = expenditureCategory;
	}

	@Column(name = "ACTION_STATUS")
	public String getActionStatus() {
		return this.actionStatus;
	}

	public void setActionStatus(String actionStatus) {
		this.actionStatus = actionStatus;
	}

	@Column(name = "AP_BILLER_BUC")
	public String getApBillerBuc() {
		return this.apBillerBuc;
	}

	public void setApBillerBuc(String apBillerBuc) {
		this.apBillerBuc = apBillerBuc;
	}

	@Column(name = "AR_INVOICE_NUMBER")
	public String getArInvoiceNumber() {
		return this.arInvoiceNumber;
	}

	public void setArInvoiceNumber(String arInvoiceNumber) {
		this.arInvoiceNumber = arInvoiceNumber;
	}

	@Column(name = "BUSINESS_REASON")
	public String getBusinessReason() {
		return this.businessReason;
	}

	public void setBusinessReason(String businessReason) {
		this.businessReason = businessReason;
	}

	@Column(name = "CS_REGION")
	public String getCsRegion() {
		return this.csRegion;
	}

	public void setCsRegion(String csRegion) {
		this.csRegion = csRegion;
	}

	@Column(name = "EQUIPMENT_FAMILY")
	public String getEquipmentFamily() {
		return this.equipmentFamily;
	}

	public void setEquipmentFamily(String equipmentFamily) {
		this.equipmentFamily = equipmentFamily;
	}

	@Column(name = "EVENT_DESCRIPTION")
	public String getEventDescription() {
		return this.eventDescription;
	}

	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}

	@Column(name = "GE_FIFO_COST", scale = 0)
	public BigDecimal getGeFifoCost() {
		return this.geFifoCost;
	}

	public void setGeFifoCost(BigDecimal geFifoCost) {
		this.geFifoCost = geFifoCost;
	}

	@Column(name = "LINE_COMMENT")
	public String getLineComment() {
		return this.lineComment;
	}

	public void setLineComment(String lineComment) {
		this.lineComment = lineComment;
	}

	@Column(name = "MODEL_BUCKET")
	public String getModelBucket() {
		return this.modelBucket;
	}

	public void setModelBucket(String modelBucket) {
		this.modelBucket = modelBucket;
	}

	@Column(name = "ORIG_TRANSACTION_NUMBER", scale = 0)
	public BigDecimal getOrigTransactionNumber() {
		return this.origTransactionNumber;
	}

	public void setOrigTransactionNumber(BigDecimal origTransactionNumber) {
		this.origTransactionNumber = origTransactionNumber;
	}

	@Column(name = "PO_DESCRIPTION")
	public String getPoDescription() {
		return this.poDescription;
	}

	public void setPoDescription(String poDescription) {
		this.poDescription = poDescription;
	}

	@Column(name = "PUSH_TYPE")
	public String getPushType() {
		return this.pushType;
	}

	public void setPushType(String pushType) {
		this.pushType = pushType;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SOURCE_DATE_CREATED")
	public Date getSourceDateCreated() {
		return this.sourceDateCreated;
	}

	public void setSourceDateCreated(Date sourceDateCreated1) {
		this.sourceDateCreated = sourceDateCreated1;
	}

	@Column(name = "SUBREGION")
	public String getSubRegion() {
		return this.subRegion;
	}

	public void setSubRegion(String subregion) {
		this.subRegion = subregion;
	}

	@Column(name = "TP_ADDER", scale = 0)
	public BigDecimal getTpAdder() {
		return this.tpAdder;
	}

	public void setTpAdder(BigDecimal tpAdder) {
		this.tpAdder = tpAdder;
	}

	@Column(name = "TP_PERCENT", scale = 0)
	public BigDecimal getTpPercent() {
		return this.tpPercent;
	}

	public void setTpPercent(BigDecimal tpPercent) {
		this.tpPercent = tpPercent;
	}

	@Column(name = "BILL_TO_STATE")
	public String getBillToState() {
		return this.billToState;
	}

	public void setBillToState(String billToState) {
		this.billToState = billToState;
	}

	@Column(name = "BILL_TO_COUNTRY")
	public String getBillToCountry() {
		return this.billToCountry;
	}

	public void setBillToCountry(String billToCountry) {
		this.billToCountry = billToCountry;
	}

	@Column(name = "SHIP_TO_STATE")
	public String getShipToState() {
		return this.shipToState;
	}

	public void setShipToState(String shipToState) {
		this.shipToState = shipToState;
	}

	@Column(name = "SHIP_TO_COUNTRY")
	public String getShipToCountry() {
		return this.shipToCountry;
	}

	public void setShipToCountry(String shipToCountry) {
		this.shipToCountry = shipToCountry;
	}

	@Column(name = "CATALOG_BUCKET")
	public String getCatalogBucket() {
		return this.catalogBucket;
	}

	public void setCatalogBucket(String catalogBucket) {
		this.catalogBucket = catalogBucket;
	}

	@Column(name = "STAT_COST", scale = 0)
	public BigDecimal getStatCost() {
		return this.statCost;
	}

	public void setStatCost(BigDecimal statCost) {
		this.statCost = statCost;
	}

	@Column(name = "PART_NUMBER")
	public String getPartNumber() {
		return this.partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "INVOICE_DATE")
	public Date getInvoiceDate() {
		return this.invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate1) {
		this.invoiceDate = invoiceDate1;
	}

	@Column(name = "DOC_NUMBER", scale = 0)
	public BigDecimal getDocNumber() {
		return this.docNumber;
	}

	public void setDocNumber(BigDecimal docNumber) {
		this.docNumber = docNumber;
	}

	@Column(name = "GAAP_SALES_LEVELIZED", scale = 0)
	public BigDecimal getGaapSalesLevelized() {
		return this.gaapSalesLevelized;
	}

	public void setGaapSalesLevelized(BigDecimal gaapSalesLevelized) {
		this.gaapSalesLevelized = gaapSalesLevelized;
	}

	@Column(name = "GL_JE_SOURCE_NAME")
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

	@Column(name = "IC_LE")
	public String getIcLe() {
		return this.icLe;
	}

	public void setIcLe(String icLe) {
		this.icLe = icLe;
	}

	@Column(name = "IC_ME")
	public String getIcMe() {
		return this.icMe;
	}

	public void setIcMe(String icMe) {
		this.icMe = icMe;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "OFS_EVENT_START_DATE")
	public Date getOfsEventStartDate() {
		return this.ofsEventStartDate;
	}

	public void setOfsEventStartDate(Date ofsEventStartDate1) {
		this.ofsEventStartDate = ofsEventStartDate1;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "OFS_EVENT_END_DATE")
	public Date getOfsEventEndDate() {
		return this.ofsEventEndDate;
	}

	public void setOfsEventEndDate(Date ofsEventEndDate1) {
		this.ofsEventEndDate = ofsEventEndDate1;
	}

	@Column(name = "ICAM_MARGIN_RATE_GAAP", scale = 0)
	public BigDecimal getIcamMarginRateGaap() {
		return this.icamMarginRateGaap;
	}

	public void setIcamMarginRateGaap(BigDecimal icamMarginRateGaap) {
		this.icamMarginRateGaap = icamMarginRateGaap;
	}

	@Column(name = "ICAM_MARGIN_RATE_STAT", scale = 0)
	public BigDecimal getIcamMarginRateStat() {
		return this.icamMarginRateStat;
	}

	public void setIcamMarginRateStat(BigDecimal icamMarginRateStat) {
		this.icamMarginRateStat = icamMarginRateStat;
	}

	@Column(name = "ICAM_PERSISTENT_ID")
	public String getIcamPersistentId() {
		return this.icamPersistentId;
	}

	public void setIcamPersistentId(String icamPersistentId) {
		this.icamPersistentId = icamPersistentId;
	}

	@Column(name = "IDENTIFIER_KEY", scale = 0)
	public BigDecimal getIdentifierKey() {
		return this.identifierKey;
	}

	public void setIdentifierKey(BigDecimal identifierKey) {
		this.identifierKey = identifierKey;
	}

	@Column(name = "JE_HEADER_LINE")
	public String getJeHeaderLine() {
		return this.jeHeaderLine;
	}

	public void setJeHeaderLine(String jeHeaderLine) {
		this.jeHeaderLine = jeHeaderLine;
	}

	@Column(name = "JOB_FSR_NUMBER")
	public String getJobFsrNumber() {
		return this.jobFsrNumber;
	}

	public void setJobFsrNumber(String jobFsrNumber) {
		this.jobFsrNumber = jobFsrNumber;
	}

	@Column(name = "OFS_EVENT_ID", scale = 0)
	public BigDecimal getOfsEventId() {
		return this.ofsEventId;
	}

	public void setOfsEventId(BigDecimal ofsEventId) {
		this.ofsEventId = ofsEventId;
	}

	@Column(name = "OFS_EVENT_TYPE")
	public String getOfsEventType() {
		return this.ofsEventType;
	}

	public void setOfsEventType(String ofsEventType) {
		this.ofsEventType = ofsEventType;
	}

	@Column(name = "ORG_ID", scale = 0)
	public BigDecimal getOrgId() {
		return this.orgId;
	}

	public void setOrgId(BigDecimal orgId) {
		this.orgId = orgId;
	}

	@Column(name = "PO_NUMBER")
	public String getPoNumber() {
		return this.poNumber;
	}

	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}

	@Column(name = "PRICE_LIST")
	public String getPriceList() {
		return this.priceList;
	}

	public void setPriceList(String priceList) {
		this.priceList = priceList;
	}

	@Column(name = "PROJECT_ID", scale = 0)
	public BigDecimal getProjectId() {
		return this.projectId;
	}

	public void setProjectId(BigDecimal projectId) {
		this.projectId = projectId;
	}

	@Column(name = "REFER")
	public String getRefer() {
		return this.refer;
	}

	public void setRefer(String refer) {
		this.refer = refer;
	}

	@Column(name = "SERVICES_CM")
	public String getServicesCm() {
		return this.servicesCm;
	}

	public void setServicesCm(String servicesCm) {
		this.servicesCm = servicesCm;
	}

	@Column(name = "SUPPLIER_NAME")
	public String getSupplierName() {
		return this.supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	@Column(name = "VENDOR_NAME")
	public String getVendorName() {
		return this.vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	@Column(name = "AMOUNT", scale = 0)
	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Column(name = "BASE_AMOUNT", scale = 0)
	public BigDecimal getBaseAmount() {
		return this.baseAmount;
	}

	public void setBaseAmount(BigDecimal baseAmount) {
		this.baseAmount = baseAmount;
	}

	@Column(name = "BASE_INVOICE_AMOUNT", scale = 0)
	public BigDecimal getBaseInvoiceAmount() {
		return this.baseInvoiceAmount;
	}

	public void setBaseInvoiceAmount(BigDecimal baseInvoiceAmount) {
		this.baseInvoiceAmount = baseInvoiceAmount;
	}

	@Column(name = "LINE_FEE_TYPE")
	public String getLineFeeType() {
		return this.lineFeeType;
	}

	public void setLineFeeType(String lineFeeType) {
		this.lineFeeType = lineFeeType;
	}

	@Column(name = "INVOICE_AMOUNT", scale = 0)
	public BigDecimal getInvoiceAmount() {
		return this.invoiceAmount;
	}

	public void setInvoiceAmount(BigDecimal invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	@Column(name = "INVOICE_NUMBER")
	public String getInvoiceNumber() {
		return this.invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	@Column(name = "SUB_FEE_TYPE")
	public String getSubFeeType() {
		return this.subFeeType;
	}

	public void setSubFeeType(String subFeeType) {
		this.subFeeType = subFeeType;
	}

	@Column(name = "TASK_NAME")
	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	@Column(name = "LINE_NUMBER")
	public String getLineNumber() {
		return this.lineNumber;
	}

	public void setLineNumber(String lineNumber) {
		this.lineNumber = lineNumber;
	}

	@Column(name = "OFS_EVENT_DESC")
	public String getOfsEventDesc() {
		return this.ofsEventDesc;
	}

	public void setOfsEventDesc(String ofsEventDesc) {
		this.ofsEventDesc = ofsEventDesc;
	}

	@Column(name = "GAAP_SALES__LEVELIZED", scale = 0)
	public BigDecimal getGaapSalesLevelized1() {
		return this.gaapSalesLevelized1;
	}

	public void setGaapSalesLevelized1(BigDecimal gaapSalesLevelized1) {
		this.gaapSalesLevelized1 = gaapSalesLevelized1;
	}

	@Column(name = "CS_PO_NUMBER", scale = 0)
	public BigDecimal getCsPoNumber() {
		return this.csPoNumber;
	}

	public void setCsPoNumber(BigDecimal csPoNumber) {
		this.csPoNumber = csPoNumber;
	}

	@Column(name = "PROCESS_FLG")
	public String getProcessFlg() {
		return this.processFlg;
	}

	public void setProcessFlg(String processFlg) {
		this.processFlg = processFlg;
	}

	@Column(name = "TAX_AMT", scale = 0)
	public BigDecimal getTaxAmt() {
		return this.taxAmt;
	}

	public void setTaxAmt(BigDecimal taxAmt) {
		this.taxAmt = taxAmt;
	}

	@Column(name = "BASE_TAX_AMT", scale = 0)
	public BigDecimal getBaseTaxAmt() {
		return this.baseTaxAmt;
	}

	public void setBaseTaxAmt(BigDecimal baseTaxAmt) {
		this.baseTaxAmt = baseTaxAmt;
	}

	@Column(name = "INV_LINE_NUM")
	public String getInvLineNum() {
		return this.invLineNum;
	}

	public void setInvLineNum(String invLineNum) {
		this.invLineNum = invLineNum;
	}

	@Column(name = "CM_SERV_AMT")
	public String getCmServAmt() {
		return this.cmServAmt;
	}

	public void setCmServAmt(String cmServAmt) {
		this.cmServAmt = cmServAmt;
	}

	/*
	 * public boolean equals(Object other) { if ((this == other)) return true;
	 * if ((other == null)) return false; if (!(other instanceof CserpStgngId))
	 * return false; CserpStgngId castOther = (CserpStgngId) other;
	 * 
	 * return ((this.getSrcCode() == castOther.getSrcCode()) || (this
	 * .getSrcCode() != null && castOther.getSrcCode() != null &&
	 * this.getSrcCode().equals( castOther.getSrcCode()))) &&
	 * ((this.getTranNum() == castOther.getTranNum()) || (this .getTranNum() !=
	 * null && castOther.getTranNum() != null && this.getTranNum()
	 * .equals(castOther.getTranNum()))) && ((this.getProjNum() ==
	 * castOther.getProjNum()) || (this .getProjNum() != null &&
	 * castOther.getProjNum() != null && this.getProjNum()
	 * .equals(castOther.getProjNum()))) && ((this.getTskNum() ==
	 * castOther.getTskNum()) || (this .getTskNum() != null &&
	 * castOther.getTskNum() != null && this.getTskNum()
	 * .equals(castOther.getTskNum()))) && ((this.getCustName() ==
	 * castOther.getCustName()) || (this .getCustName() != null &&
	 * castOther.getCustName() != null && this
	 * .getCustName().equals(castOther.getCustName()))) && ((this.getCustNum()
	 * == castOther.getCustNum()) || (this .getCustNum() != null &&
	 * castOther.getCustNum() != null && this.getCustNum()
	 * .equals(castOther.getCustNum()))) && ((this.getBillToSiteText() ==
	 * castOther.getBillToSiteText()) || (this .getBillToSiteText() != null &&
	 * castOther.getBillToSiteText() != null && this
	 * .getBillToSiteText().equals( castOther.getBillToSiteText()))) &&
	 * ((this.getShpToSiteText() == castOther.getShpToSiteText()) || (this
	 * .getShpToSiteText() != null && castOther.getShpToSiteText() != null &&
	 * this .getShpToSiteText() .equals(castOther.getShpToSiteText()))) &&
	 * ((this.getAgrmntId() == castOther.getAgrmntId()) || (this .getAgrmntId()
	 * != null && castOther.getAgrmntId() != null && this
	 * .getAgrmntId().equals(castOther.getAgrmntId()))) &&
	 * ((this.getAgrmntName() == castOther.getAgrmntName()) || (this
	 * .getAgrmntName() != null && castOther.getAgrmntName() != null && this
	 * .getAgrmntName().equals(castOther.getAgrmntName()))) && ((this.getStId()
	 * == castOther.getStId()) || (this.getStId() != null && castOther.getStId()
	 * != null && this.getStId() .equals(castOther.getStId()))) &&
	 * ((this.getStName() == castOther.getStName()) || (this .getStName() !=
	 * null && castOther.getStName() != null && this.getStName()
	 * .equals(castOther.getStName()))) && ((this.getEamLocCd() ==
	 * castOther.getEamLocCd()) || (this .getEamLocCd() != null &&
	 * castOther.getEamLocCd() != null && this
	 * .getEamLocCd().equals(castOther.getEamLocCd()))) && ((this.getLglEnty()
	 * == castOther.getLglEnty()) || (this .getLglEnty() != null &&
	 * castOther.getLglEnty() != null && this.getLglEnty()
	 * .equals(castOther.getLglEnty()))) && ((this.getMgmtEnty() ==
	 * castOther.getMgmtEnty()) || (this .getMgmtEnty() != null &&
	 * castOther.getMgmtEnty() != null && this
	 * .getMgmtEnty().equals(castOther.getMgmtEnty()))) && ((this.getPAndLCd()
	 * == castOther.getPAndLCd()) || (this .getPAndLCd() != null &&
	 * castOther.getPAndLCd() != null && this.getPAndLCd()
	 * .equals(castOther.getPAndLCd()))) && ((this.getBucCd() ==
	 * castOther.getBucCd()) || (this .getBucCd() != null &&
	 * castOther.getBucCd() != null && this.getBucCd()
	 * .equals(castOther.getBucCd()))) && ((this.getCpmFlName() ==
	 * castOther.getCpmFlName()) || (this .getCpmFlName() != null &&
	 * castOther.getCpmFlName() != null && this
	 * .getCpmFlName().equals(castOther.getCpmFlName()))) &&
	 * ((this.getCpmOhrId() == castOther.getCpmOhrId()) || (this .getCpmOhrId()
	 * != null && castOther.getCpmOhrId() != null && this
	 * .getCpmOhrId().equals(castOther.getCpmOhrId()))) && ((this.getOtrFlName()
	 * == castOther.getOtrFlName()) || (this .getOtrFlName() != null &&
	 * castOther.getOtrFlName() != null && this
	 * .getOtrFlName().equals(castOther.getOtrFlName()))) &&
	 * ((this.getOtrOhrId() == castOther.getOtrOhrId()) || (this .getOtrOhrId()
	 * != null && castOther.getOtrOhrId() != null && this
	 * .getOtrOhrId().equals(castOther.getOtrOhrId()))) &&
	 * ((this.getPrtfolioFlName() == castOther.getPrtfolioFlName()) || (this
	 * .getPrtfolioFlName() != null && castOther.getPrtfolioFlName() != null &&
	 * this .getPrtfolioFlName().equals( castOther.getPrtfolioFlName()))) &&
	 * ((this.getPrtfolioOhrId() == castOther.getPrtfolioOhrId()) || (this
	 * .getPrtfolioOhrId() != null && castOther.getPrtfolioOhrId() != null &&
	 * this .getPrtfolioOhrId() .equals(castOther.getPrtfolioOhrId()))) &&
	 * ((this.getProjType() == castOther.getProjType()) || (this .getProjType()
	 * != null && castOther.getProjType() != null && this
	 * .getProjType().equals(castOther.getProjType()))) && ((this.getItmNum() ==
	 * castOther.getItmNum()) || (this .getItmNum() != null &&
	 * castOther.getItmNum() != null && this.getItmNum()
	 * .equals(castOther.getItmNum()))) && ((this.getItmDesc() ==
	 * castOther.getItmDesc()) || (this .getItmDesc() != null &&
	 * castOther.getItmDesc() != null && this.getItmDesc()
	 * .equals(castOther.getItmDesc()))) && ((this.getCrncyCd() ==
	 * castOther.getCrncyCd()) || (this .getCrncyCd() != null &&
	 * castOther.getCrncyCd() != null && this.getCrncyCd()
	 * .equals(castOther.getCrncyCd()))) && ((this.getLnType() ==
	 * castOther.getLnType()) || (this .getLnType() != null &&
	 * castOther.getLnType() != null && this.getLnType()
	 * .equals(castOther.getLnType()))) && ((this.getPrchsOrdrNum() ==
	 * castOther.getPrchsOrdrNum()) || (this .getPrchsOrdrNum() != null &&
	 * castOther.getPrchsOrdrNum() != null && this
	 * .getPrchsOrdrNum().equals(castOther.getPrchsOrdrNum()))) &&
	 * ((this.getPrchsOrdrLnNum() == castOther.getPrchsOrdrLnNum()) || (this
	 * .getPrchsOrdrLnNum() != null && castOther.getPrchsOrdrLnNum() != null &&
	 * this .getPrchsOrdrLnNum().equals( castOther.getPrchsOrdrLnNum()))) &&
	 * ((this.getTranSrc() == castOther.getTranSrc()) || (this .getTranSrc() !=
	 * null && castOther.getTranSrc() != null && this.getTranSrc()
	 * .equals(castOther.getTranSrc()))) && ((this.getExpndtrCtgryDesc() ==
	 * castOther .getExpndtrCtgryDesc()) || (this.getExpndtrCtgryDesc() != null
	 * && castOther.getExpndtrCtgryDesc() != null && this
	 * .getExpndtrCtgryDesc().equals( castOther.getExpndtrCtgryDesc()))) &&
	 * ((this.getPaExpndtrType() == castOther.getPaExpndtrType()) || (this
	 * .getPaExpndtrType() != null && castOther.getPaExpndtrType() != null &&
	 * this .getPaExpndtrType() .equals(castOther.getPaExpndtrType()))) &&
	 * ((this.getExpndtrDate() == castOther.getExpndtrDate()) || (this
	 * .getExpndtrDate() != null && castOther.getExpndtrDate() != null && this
	 * .getExpndtrDate().equals(castOther.getExpndtrDate()))) &&
	 * ((this.getRawCst() == castOther.getRawCst()) || (this .getRawCst() !=
	 * null && castOther.getRawCst() != null && this.getRawCst()
	 * .equals(castOther.getRawCst()))) && ((this.getCstAcctDbt() ==
	 * castOther.getCstAcctDbt()) || (this .getCstAcctDbt() != null &&
	 * castOther.getCstAcctDbt() != null && this
	 * .getCstAcctDbt().equals(castOther.getCstAcctDbt()))) &&
	 * ((this.getCstCcidDbt() == castOther.getCstCcidDbt()) || (this
	 * .getCstCcidDbt() != null && castOther.getCstCcidDbt() != null && this
	 * .getCstCcidDbt().equals(castOther.getCstCcidDbt()))) &&
	 * ((this.getCstAcctCrdt() == castOther.getCstAcctCrdt()) || (this
	 * .getCstAcctCrdt() != null && castOther.getCstAcctCrdt() != null && this
	 * .getCstAcctCrdt().equals(castOther.getCstAcctCrdt()))) &&
	 * ((this.getCstCcidCr() == castOther.getCstCcidCr()) || (this
	 * .getCstCcidCr() != null && castOther.getCstCcidCr() != null && this
	 * .getCstCcidCr().equals(castOther.getCstCcidCr()))) &&
	 * ((this.getCstPaDate() == castOther.getCstPaDate()) || (this
	 * .getCstPaDate() != null && castOther.getCstPaDate() != null && this
	 * .getCstPaDate().equals(castOther.getCstPaDate()))) &&
	 * ((this.getCstGlDate() == castOther.getCstGlDate()) || (this
	 * .getCstGlDate() != null && castOther.getCstGlDate() != null && this
	 * .getCstGlDate().equals(castOther.getCstGlDate()))) &&
	 * ((this.getCstPaPrd() == castOther.getCstPaPrd()) || (this .getCstPaPrd()
	 * != null && castOther.getCstPaPrd() != null && this
	 * .getCstPaPrd().equals(castOther.getCstPaPrd()))) && ((this.getCstGlPrd()
	 * == castOther.getCstGlPrd()) || (this .getCstGlPrd() != null &&
	 * castOther.getCstGlPrd() != null && this
	 * .getCstGlPrd().equals(castOther.getCstGlPrd()))) && ((this.getEvntType()
	 * == castOther.getEvntType()) || (this .getEvntType() != null &&
	 * castOther.getEvntType() != null && this
	 * .getEvntType().equals(castOther.getEvntType()))) && ((this.getSlsAmt() ==
	 * castOther.getSlsAmt()) || (this .getSlsAmt() != null &&
	 * castOther.getSlsAmt() != null && this.getSlsAmt()
	 * .equals(castOther.getSlsAmt()))) && ((this.getSlsAcctDr() ==
	 * castOther.getSlsAcctDr()) || (this .getSlsAcctDr() != null &&
	 * castOther.getSlsAcctDr() != null && this
	 * .getSlsAcctDr().equals(castOther.getSlsAcctDr()))) &&
	 * ((this.getSlsCcidDr() == castOther.getSlsCcidDr()) || (this
	 * .getSlsCcidDr() != null && castOther.getSlsCcidDr() != null && this
	 * .getSlsCcidDr().equals(castOther.getSlsCcidDr()))) &&
	 * ((this.getSlsAcctCr() == castOther.getSlsAcctCr()) || (this
	 * .getSlsAcctCr() != null && castOther.getSlsAcctCr() != null && this
	 * .getSlsAcctCr().equals(castOther.getSlsAcctCr()))) &&
	 * ((this.getSlsCcidCrdt() == castOther.getSlsCcidCrdt()) || (this
	 * .getSlsCcidCrdt() != null && castOther.getSlsCcidCrdt() != null && this
	 * .getSlsCcidCrdt().equals(castOther.getSlsCcidCrdt()))) &&
	 * ((this.getSlsPaDate() == castOther.getSlsPaDate()) || (this
	 * .getSlsPaDate() != null && castOther.getSlsPaDate() != null && this
	 * .getSlsPaDate().equals(castOther.getSlsPaDate()))) &&
	 * ((this.getSlsGlDate() == castOther.getSlsGlDate()) || (this
	 * .getSlsGlDate() != null && castOther.getSlsGlDate() != null && this
	 * .getSlsGlDate().equals(castOther.getSlsGlDate()))) &&
	 * ((this.getRevPaPrd() == castOther.getRevPaPrd()) || (this .getRevPaPrd()
	 * != null && castOther.getRevPaPrd() != null && this
	 * .getRevPaPrd().equals(castOther.getRevPaPrd()))) && ((this.getRevGlPrd()
	 * == castOther.getRevGlPrd()) || (this .getRevGlPrd() != null &&
	 * castOther.getRevGlPrd() != null && this
	 * .getRevGlPrd().equals(castOther.getRevGlPrd()))) && ((this.getCmAmt() ==
	 * castOther.getCmAmt()) || (this .getCmAmt() != null &&
	 * castOther.getCmAmt() != null && this.getCmAmt()
	 * .equals(castOther.getCmAmt()))) && ((this.getCmPct() ==
	 * castOther.getCmPct()) || (this .getCmPct() != null &&
	 * castOther.getCmPct() != null && this.getCmPct()
	 * .equals(castOther.getCmPct()))) && ((this.getFsclYr() ==
	 * castOther.getFsclYr()) || (this .getFsclYr() != null &&
	 * castOther.getFsclYr() != null && this.getFsclYr()
	 * .equals(castOther.getFsclYr()))) && ((this.getTiebckFlg() ==
	 * castOther.getTiebckFlg()) || (this .getTiebckFlg() != null &&
	 * castOther.getTiebckFlg() != null && this
	 * .getTiebckFlg().equals(castOther.getTiebckFlg()))) &&
	 * ((this.getTiebckDate() == castOther.getTiebckDate()) || (this
	 * .getTiebckDate() != null && castOther.getTiebckDate() != null && this
	 * .getTiebckDate().equals(castOther.getTiebckDate()))) &&
	 * ((this.getGlJrnlEntryHdrId() == castOther .getGlJrnlEntryHdrId()) ||
	 * (this.getGlJrnlEntryHdrId() != null && castOther.getGlJrnlEntryHdrId() !=
	 * null && this .getGlJrnlEntryHdrId().equals(
	 * castOther.getGlJrnlEntryHdrId()))) && ((this.getGlJrnlEntryBtchId() ==
	 * castOther .getGlJrnlEntryBtchId()) || (this .getGlJrnlEntryBtchId() !=
	 * null && castOther.getGlJrnlEntryBtchId() != null && this
	 * .getGlJrnlEntryBtchId().equals( castOther.getGlJrnlEntryBtchId()))) &&
	 * ((this.getGlJeLnId() == castOther.getGlJeLnId()) || (this .getGlJeLnId()
	 * != null && castOther.getGlJeLnId() != null && this
	 * .getGlJeLnId().equals(castOther.getGlJeLnId()))) &&
	 * ((this.getGlJrnlBtchName() == castOther.getGlJrnlBtchName()) || (this
	 * .getGlJrnlBtchName() != null && castOther.getGlJrnlBtchName() != null &&
	 * this .getGlJrnlBtchName().equals( castOther.getGlJrnlBtchName()))) &&
	 * ((this.getGlSweepLnkDesc() == castOther.getGlSweepLnkDesc()) || (this
	 * .getGlSweepLnkDesc() != null && castOther.getGlSweepLnkDesc() != null &&
	 * this .getGlSweepLnkDesc().equals( castOther.getGlSweepLnkDesc()))) &&
	 * ((this.getGlBtchCntrlDesc() == castOther .getGlBtchCntrlDesc()) ||
	 * (this.getGlBtchCntrlDesc() != null && castOther.getGlBtchCntrlDesc() !=
	 * null && this .getGlBtchCntrlDesc().equals(
	 * castOther.getGlBtchCntrlDesc()))) && ((this.getLstFetchDate() ==
	 * castOther.getLstFetchDate()) || (this .getLstFetchDate() != null &&
	 * castOther.getLstFetchDate() != null && this
	 * .getLstFetchDate().equals(castOther.getLstFetchDate()))) &&
	 * ((this.getPrtsOrdrNum() == castOther.getPrtsOrdrNum()) || (this
	 * .getPrtsOrdrNum() != null && castOther.getPrtsOrdrNum() != null && this
	 * .getPrtsOrdrNum().equals(castOther.getPrtsOrdrNum()))) &&
	 * ((this.getPrtsLnNum() == castOther.getPrtsLnNum()) || (this
	 * .getPrtsLnNum() != null && castOther.getPrtsLnNum() != null && this
	 * .getPrtsLnNum().equals(castOther.getPrtsLnNum()))) &&
	 * ((this.getTrbnSerNum() == castOther.getTrbnSerNum()) || (this
	 * .getTrbnSerNum() != null && castOther.getTrbnSerNum() != null && this
	 * .getTrbnSerNum().equals(castOther.getTrbnSerNum()))) &&
	 * ((this.getApInvNum() == castOther.getApInvNum()) || (this .getApInvNum()
	 * != null && castOther.getApInvNum() != null && this
	 * .getApInvNum().equals(castOther.getApInvNum()))) &&
	 * ((this.getPrListDesc() == castOther.getPrListDesc()) || (this
	 * .getPrListDesc() != null && castOther.getPrListDesc() != null && this
	 * .getPrListDesc().equals(castOther.getPrListDesc()))) &&
	 * ((this.getListPrNum() == castOther.getListPrNum()) || (this
	 * .getListPrNum() != null && castOther.getListPrNum() != null && this
	 * .getListPrNum().equals(castOther.getListPrNum()))) &&
	 * ((this.getCustPrchsOrdrNum() == castOther .getCustPrchsOrdrNum()) ||
	 * (this.getCustPrchsOrdrNum() != null && castOther.getCustPrchsOrdrNum() !=
	 * null && this .getCustPrchsOrdrNum().equals(
	 * castOther.getCustPrchsOrdrNum()))) && ((this.getCustPrchsOrdrLn() ==
	 * castOther .getCustPrchsOrdrLn()) || (this.getCustPrchsOrdrLn() != null &&
	 * castOther.getCustPrchsOrdrLn() != null && this
	 * .getCustPrchsOrdrLn().equals( castOther.getCustPrchsOrdrLn()))) &&
	 * ((this.getBtchId() == castOther.getBtchId()) || (this .getBtchId() !=
	 * null && castOther.getBtchId() != null && this.getBtchId()
	 * .equals(castOther.getBtchId()))) && ((this.getQtyNum() ==
	 * castOther.getQtyNum()) || (this .getQtyNum() != null &&
	 * castOther.getQtyNum() != null && this.getQtyNum()
	 * .equals(castOther.getQtyNum()))) && ((this.getFrmSzText() ==
	 * castOther.getFrmSzText()) || (this .getFrmSzText() != null &&
	 * castOther.getFrmSzText() != null && this
	 * .getFrmSzText().equals(castOther.getFrmSzText()))) &&
	 * ((this.getPrtsLnTypeDesc() == castOther.getPrtsLnTypeDesc()) || (this
	 * .getPrtsLnTypeDesc() != null && castOther.getPrtsLnTypeDesc() != null &&
	 * this .getPrtsLnTypeDesc().equals( castOther.getPrtsLnTypeDesc()))) &&
	 * ((this.getCstTrnsfrDate() == castOther.getCstTrnsfrDate()) || (this
	 * .getCstTrnsfrDate() != null && castOther.getCstTrnsfrDate() != null &&
	 * this .getCstTrnsfrDate() .equals(castOther.getCstTrnsfrDate()))) &&
	 * ((this.getSlsTrnsfrDate() == castOther.getSlsTrnsfrDate()) || (this
	 * .getSlsTrnsfrDate() != null && castOther.getSlsTrnsfrDate() != null &&
	 * this .getSlsTrnsfrDate() .equals(castOther.getSlsTrnsfrDate()))) &&
	 * ((this.getBillersCntctInfoDesc() == castOther .getBillersCntctInfoDesc())
	 * || (this .getBillersCntctInfoDesc() != null &&
	 * castOther.getBillersCntctInfoDesc() != null && this
	 * .getBillersCntctInfoDesc().equals( castOther.getBillersCntctInfoDesc())))
	 * && ((this.getBillersBucCd() == castOther.getBillersBucCd()) || (this
	 * .getBillersBucCd() != null && castOther.getBillersBucCd() != null && this
	 * .getBillersBucCd().equals(castOther.getBillersBucCd()))) &&
	 * ((this.getDelNum() == castOther.getDelNum()) || (this .getDelNum() !=
	 * null && castOther.getDelNum() != null && this.getDelNum()
	 * .equals(castOther.getDelNum()))) && ((this.getRcvrsBucCd() ==
	 * castOther.getRcvrsBucCd()) || (this .getRcvrsBucCd() != null &&
	 * castOther.getRcvrsBucCd() != null && this
	 * .getRcvrsBucCd().equals(castOther.getRcvrsBucCd()))) &&
	 * ((this.getCrtdDate() == castOther.getCrtdDate()) || (this .getCrtdDate()
	 * != null && castOther.getCrtdDate() != null && this
	 * .getCrtdDate().equals(castOther.getCrtdDate()))) && ((this.getCrtdBy() ==
	 * castOther.getCrtdBy()) || (this .getCrtdBy() != null &&
	 * castOther.getCrtdBy() != null && this.getCrtdBy()
	 * .equals(castOther.getCrtdBy()))) && ((this.getLstUpdtDate() ==
	 * castOther.getLstUpdtDate()) || (this .getLstUpdtDate() != null &&
	 * castOther.getLstUpdtDate() != null && this
	 * .getLstUpdtDate().equals(castOther.getLstUpdtDate()))) &&
	 * ((this.getLstUpdtdBy() == castOther.getLstUpdtdBy()) || (this
	 * .getLstUpdtdBy() != null && castOther.getLstUpdtdBy() != null && this
	 * .getLstUpdtdBy().equals(castOther.getLstUpdtdBy()))) &&
	 * ((this.getUseTax() == castOther.getUseTax()) || (this .getUseTax() !=
	 * null && castOther.getUseTax() != null && this.getUseTax()
	 * .equals(castOther.getUseTax()))) && ((this.getProjectCategory() ==
	 * castOther .getProjectCategory()) || (this.getProjectCategory() != null &&
	 * castOther.getProjectCategory() != null && this
	 * .getProjectCategory().equals( castOther.getProjectCategory()))) &&
	 * ((this.getContractNumber() == castOther.getContractNumber()) || (this
	 * .getContractNumber() != null && castOther.getContractNumber() != null &&
	 * this .getContractNumber().equals( castOther.getContractNumber()))) &&
	 * ((this.getExpenditureCategory() == castOther .getExpenditureCategory())
	 * || (this .getExpenditureCategory() != null &&
	 * castOther.getExpenditureCategory() != null && this
	 * .getExpenditureCategory().equals( castOther.getExpenditureCategory())))
	 * && ((this.getActionStatus() == castOther.getActionStatus()) || (this
	 * .getActionStatus() != null && castOther.getActionStatus() != null && this
	 * .getActionStatus().equals(castOther.getActionStatus()))) &&
	 * ((this.getApBillerBuc() == castOther.getApBillerBuc()) || (this
	 * .getApBillerBuc() != null && castOther.getApBillerBuc() != null && this
	 * .getApBillerBuc().equals(castOther.getApBillerBuc()))) &&
	 * ((this.getArInvoiceNumber() == castOther .getArInvoiceNumber()) ||
	 * (this.getArInvoiceNumber() != null && castOther.getArInvoiceNumber() !=
	 * null && this .getArInvoiceNumber().equals(
	 * castOther.getArInvoiceNumber()))) && ((this.getBusinessReason() ==
	 * castOther.getBusinessReason()) || (this .getBusinessReason() != null &&
	 * castOther.getBusinessReason() != null && this
	 * .getBusinessReason().equals( castOther.getBusinessReason()))) &&
	 * ((this.getCsRegion() == castOther.getCsRegion()) || (this .getCsRegion()
	 * != null && castOther.getCsRegion() != null && this
	 * .getCsRegion().equals(castOther.getCsRegion()))) &&
	 * ((this.getEquipmentFamily() == castOther .getEquipmentFamily()) ||
	 * (this.getEquipmentFamily() != null && castOther.getEquipmentFamily() !=
	 * null && this .getEquipmentFamily().equals(
	 * castOther.getEquipmentFamily()))) && ((this.getEventDescription() ==
	 * castOther .getEventDescription()) || (this.getEventDescription() != null
	 * && castOther.getEventDescription() != null && this
	 * .getEventDescription().equals( castOther.getEventDescription()))) &&
	 * ((this.getGeFifoCost() == castOther.getGeFifoCost()) || (this
	 * .getGeFifoCost() != null && castOther.getGeFifoCost() != null && this
	 * .getGeFifoCost().equals(castOther.getGeFifoCost()))) &&
	 * ((this.getLineComment() == castOther.getLineComment()) || (this
	 * .getLineComment() != null && castOther.getLineComment() != null && this
	 * .getLineComment().equals(castOther.getLineComment()))) &&
	 * ((this.getModelBucket() == castOther.getModelBucket()) || (this
	 * .getModelBucket() != null && castOther.getModelBucket() != null && this
	 * .getModelBucket().equals(castOther.getModelBucket()))) &&
	 * ((this.getOrigTransactionNumber() == castOther
	 * .getOrigTransactionNumber()) || (this .getOrigTransactionNumber() != null
	 * && castOther.getOrigTransactionNumber() != null && this
	 * .getOrigTransactionNumber().equals(
	 * castOther.getOrigTransactionNumber()))) && ((this.getPoDescription() ==
	 * castOther.getPoDescription()) || (this .getPoDescription() != null &&
	 * castOther.getPoDescription() != null && this .getPoDescription()
	 * .equals(castOther.getPoDescription()))) && ((this.getPushType() ==
	 * castOther.getPushType()) || (this .getPushType() != null &&
	 * castOther.getPushType() != null && this
	 * .getPushType().equals(castOther.getPushType()))) &&
	 * ((this.getSourceDateCreated() == castOther .getSourceDateCreated()) ||
	 * (this .getSourceDateCreated() != null && castOther.getSourceDateCreated()
	 * != null && this .getSourceDateCreated().equals(
	 * castOther.getSourceDateCreated()))) && ((this.getSubregion() ==
	 * castOther.getSubregion()) || (this .getSubregion() != null &&
	 * castOther.getSubregion() != null && this
	 * .getSubregion().equals(castOther.getSubregion()))) && ((this.getTpAdder()
	 * == castOther.getTpAdder()) || (this .getTpAdder() != null &&
	 * castOther.getTpAdder() != null && this.getTpAdder()
	 * .equals(castOther.getTpAdder()))) && ((this.getTpPercent() ==
	 * castOther.getTpPercent()) || (this .getTpPercent() != null &&
	 * castOther.getTpPercent() != null && this
	 * .getTpPercent().equals(castOther.getTpPercent()))) &&
	 * ((this.getBillToState() == castOther.getBillToState()) || (this
	 * .getBillToState() != null && castOther.getBillToState() != null && this
	 * .getBillToState().equals(castOther.getBillToState()))) &&
	 * ((this.getBillToCountry() == castOther.getBillToCountry()) || (this
	 * .getBillToCountry() != null && castOther.getBillToCountry() != null &&
	 * this .getBillToCountry() .equals(castOther.getBillToCountry()))) &&
	 * ((this.getShipToState() == castOther.getShipToState()) || (this
	 * .getShipToState() != null && castOther.getShipToState() != null && this
	 * .getShipToState().equals(castOther.getShipToState()))) &&
	 * ((this.getShipToCountry() == castOther.getShipToCountry()) || (this
	 * .getShipToCountry() != null && castOther.getShipToCountry() != null &&
	 * this .getShipToCountry() .equals(castOther.getShipToCountry()))) &&
	 * ((this.getCatalogBucket() == castOther.getCatalogBucket()) || (this
	 * .getCatalogBucket() != null && castOther.getCatalogBucket() != null &&
	 * this .getCatalogBucket() .equals(castOther.getCatalogBucket()))) &&
	 * ((this.getStatCost() == castOther.getStatCost()) || (this .getStatCost()
	 * != null && castOther.getStatCost() != null && this
	 * .getStatCost().equals(castOther.getStatCost()))) &&
	 * ((this.getPartNumber() == castOther.getPartNumber()) || (this
	 * .getPartNumber() != null && castOther.getPartNumber() != null && this
	 * .getPartNumber().equals(castOther.getPartNumber()))) &&
	 * ((this.getInvoiceDate() == castOther.getInvoiceDate()) || (this
	 * .getInvoiceDate() != null && castOther.getInvoiceDate() != null && this
	 * .getInvoiceDate().equals(castOther.getInvoiceDate()))) &&
	 * ((this.getDocNumber() == castOther.getDocNumber()) || (this
	 * .getDocNumber() != null && castOther.getDocNumber() != null && this
	 * .getDocNumber().equals(castOther.getDocNumber()))) &&
	 * ((this.getGaapSalesLevelized() == castOther .getGaapSalesLevelized()) ||
	 * (this .getGaapSalesLevelized() != null &&
	 * castOther.getGaapSalesLevelized() != null && this
	 * .getGaapSalesLevelized().equals( castOther.getGaapSalesLevelized()))) &&
	 * ((this.getGlJeSourceName() == castOther.getGlJeSourceName()) || (this
	 * .getGlJeSourceName() != null && castOther.getGlJeSourceName() != null &&
	 * this .getGlJeSourceName().equals( castOther.getGlJeSourceName()))) &&
	 * ((this.getHeaderDescription() == castOther .getHeaderDescription()) ||
	 * (this .getHeaderDescription() != null && castOther.getHeaderDescription()
	 * != null && this .getHeaderDescription().equals(
	 * castOther.getHeaderDescription()))) && ((this.getIcLe() ==
	 * castOther.getIcLe()) || (this.getIcLe() != null && castOther.getIcLe() !=
	 * null && this.getIcLe() .equals(castOther.getIcLe()))) && ((this.getIcMe()
	 * == castOther.getIcMe()) || (this.getIcMe() != null && castOther.getIcMe()
	 * != null && this.getIcMe() .equals(castOther.getIcMe()))) &&
	 * ((this.getOfsEventStartDate() == castOther .getOfsEventStartDate()) ||
	 * (this .getOfsEventStartDate() != null && castOther.getOfsEventStartDate()
	 * != null && this .getOfsEventStartDate().equals(
	 * castOther.getOfsEventStartDate()))) && ((this.getOfsEventEndDate() ==
	 * castOther .getOfsEventEndDate()) || (this.getOfsEventEndDate() != null &&
	 * castOther.getOfsEventEndDate() != null && this
	 * .getOfsEventEndDate().equals( castOther.getOfsEventEndDate()))) &&
	 * ((this.getIcamMarginRateGaap() == castOther .getIcamMarginRateGaap()) ||
	 * (this .getIcamMarginRateGaap() != null &&
	 * castOther.getIcamMarginRateGaap() != null && this
	 * .getIcamMarginRateGaap().equals( castOther.getIcamMarginRateGaap()))) &&
	 * ((this.getIcamMarginRateStat() == castOther .getIcamMarginRateStat()) ||
	 * (this .getIcamMarginRateStat() != null &&
	 * castOther.getIcamMarginRateStat() != null && this
	 * .getIcamMarginRateStat().equals( castOther.getIcamMarginRateStat()))) &&
	 * ((this.getIcamPersistentId() == castOther .getIcamPersistentId()) ||
	 * (this.getIcamPersistentId() != null && castOther.getIcamPersistentId() !=
	 * null && this .getIcamPersistentId().equals(
	 * castOther.getIcamPersistentId()))) && ((this.getIdentifierKey() ==
	 * castOther.getIdentifierKey()) || (this .getIdentifierKey() != null &&
	 * castOther.getIdentifierKey() != null && this .getIdentifierKey()
	 * .equals(castOther.getIdentifierKey()))) && ((this.getJeHeaderLine() ==
	 * castOther.getJeHeaderLine()) || (this .getJeHeaderLine() != null &&
	 * castOther.getJeHeaderLine() != null && this
	 * .getJeHeaderLine().equals(castOther.getJeHeaderLine()))) &&
	 * ((this.getJobFsrNumber() == castOther.getJobFsrNumber()) || (this
	 * .getJobFsrNumber() != null && castOther.getJobFsrNumber() != null && this
	 * .getJobFsrNumber().equals(castOther.getJobFsrNumber()))) &&
	 * ((this.getOfsEventId() == castOther.getOfsEventId()) || (this
	 * .getOfsEventId() != null && castOther.getOfsEventId() != null && this
	 * .getOfsEventId().equals(castOther.getOfsEventId()))) &&
	 * ((this.getOfsEventType() == castOther.getOfsEventType()) || (this
	 * .getOfsEventType() != null && castOther.getOfsEventType() != null && this
	 * .getOfsEventType().equals(castOther.getOfsEventType()))) &&
	 * ((this.getOrgId() == castOther.getOrgId()) || (this .getOrgId() != null
	 * && castOther.getOrgId() != null && this.getOrgId()
	 * .equals(castOther.getOrgId()))) && ((this.getPoNumber() ==
	 * castOther.getPoNumber()) || (this .getPoNumber() != null &&
	 * castOther.getPoNumber() != null && this
	 * .getPoNumber().equals(castOther.getPoNumber()))) && ((this.getPriceList()
	 * == castOther.getPriceList()) || (this .getPriceList() != null &&
	 * castOther.getPriceList() != null && this
	 * .getPriceList().equals(castOther.getPriceList()))) &&
	 * ((this.getProjectId() == castOther.getProjectId()) || (this
	 * .getProjectId() != null && castOther.getProjectId() != null && this
	 * .getProjectId().equals(castOther.getProjectId()))) && ((this.getRefer()
	 * == castOther.getRefer()) || (this .getRefer() != null &&
	 * castOther.getRefer() != null && this.getRefer()
	 * .equals(castOther.getRefer()))) && ((this.getServicesCm() ==
	 * castOther.getServicesCm()) || (this .getServicesCm() != null &&
	 * castOther.getServicesCm() != null && this
	 * .getServicesCm().equals(castOther.getServicesCm()))) &&
	 * ((this.getSupplierName() == castOther.getSupplierName()) || (this
	 * .getSupplierName() != null && castOther.getSupplierName() != null && this
	 * .getSupplierName().equals(castOther.getSupplierName()))) &&
	 * ((this.getVendorName() == castOther.getVendorName()) || (this
	 * .getVendorName() != null && castOther.getVendorName() != null && this
	 * .getVendorName().equals(castOther.getVendorName()))) &&
	 * ((this.getAmount() == castOther.getAmount()) || (this .getAmount() !=
	 * null && castOther.getAmount() != null && this.getAmount()
	 * .equals(castOther.getAmount()))) && ((this.getBaseAmount() ==
	 * castOther.getBaseAmount()) || (this .getBaseAmount() != null &&
	 * castOther.getBaseAmount() != null && this
	 * .getBaseAmount().equals(castOther.getBaseAmount()))) &&
	 * ((this.getBaseInvoiceAmount() == castOther .getBaseInvoiceAmount()) ||
	 * (this .getBaseInvoiceAmount() != null && castOther.getBaseInvoiceAmount()
	 * != null && this .getBaseInvoiceAmount().equals(
	 * castOther.getBaseInvoiceAmount()))) && ((this.getLineFeeType() ==
	 * castOther.getLineFeeType()) || (this .getLineFeeType() != null &&
	 * castOther.getLineFeeType() != null && this
	 * .getLineFeeType().equals(castOther.getLineFeeType()))) &&
	 * ((this.getInvoiceAmount() == castOther.getInvoiceAmount()) || (this
	 * .getInvoiceAmount() != null && castOther.getInvoiceAmount() != null &&
	 * this .getInvoiceAmount() .equals(castOther.getInvoiceAmount()))) &&
	 * ((this.getInvoiceNumber() == castOther.getInvoiceNumber()) || (this
	 * .getInvoiceNumber() != null && castOther.getInvoiceNumber() != null &&
	 * this .getInvoiceNumber() .equals(castOther.getInvoiceNumber()))) &&
	 * ((this.getSubFeeType() == castOther.getSubFeeType()) || (this
	 * .getSubFeeType() != null && castOther.getSubFeeType() != null && this
	 * .getSubFeeType().equals(castOther.getSubFeeType()))) &&
	 * ((this.getTaskName() == castOther.getTaskName()) || (this .getTaskName()
	 * != null && castOther.getTaskName() != null && this
	 * .getTaskName().equals(castOther.getTaskName()))) &&
	 * ((this.getLineNumber() == castOther.getLineNumber()) || (this
	 * .getLineNumber() != null && castOther.getLineNumber() != null && this
	 * .getLineNumber().equals(castOther.getLineNumber()))) &&
	 * ((this.getOfsEventDesc() == castOther.getOfsEventDesc()) || (this
	 * .getOfsEventDesc() != null && castOther.getOfsEventDesc() != null && this
	 * .getOfsEventDesc().equals(castOther.getOfsEventDesc()))) &&
	 * ((this.getGaapSalesLevelized1() == castOther .getGaapSalesLevelized1())
	 * || (this .getGaapSalesLevelized1() != null &&
	 * castOther.getGaapSalesLevelized1() != null && this
	 * .getGaapSalesLevelized1().equals( castOther.getGaapSalesLevelized1())))
	 * && ((this.getCsPoNumber() == castOther.getCsPoNumber()) || (this
	 * .getCsPoNumber() != null && castOther.getCsPoNumber() != null && this
	 * .getCsPoNumber().equals(castOther.getCsPoNumber()))) &&
	 * ((this.getProcessFlg() == castOther.getProcessFlg()) || (this
	 * .getProcessFlg() != null && castOther.getProcessFlg() != null && this
	 * .getProcessFlg().equals(castOther.getProcessFlg()))) &&
	 * ((this.getTaxAmt() == castOther.getTaxAmt()) || (this .getTaxAmt() !=
	 * null && castOther.getTaxAmt() != null && this.getTaxAmt()
	 * .equals(castOther.getTaxAmt()))) && ((this.getBaseTaxAmt() ==
	 * castOther.getBaseTaxAmt()) || (this .getBaseTaxAmt() != null &&
	 * castOther.getBaseTaxAmt() != null && this
	 * .getBaseTaxAmt().equals(castOther.getBaseTaxAmt()))) &&
	 * ((this.getInvLineNum() == castOther.getInvLineNum()) || (this
	 * .getInvLineNum() != null && castOther.getInvLineNum() != null && this
	 * .getInvLineNum().equals(castOther.getInvLineNum()))) &&
	 * ((this.getCmServAmt() == castOther.getCmServAmt()) || (this
	 * .getCmServAmt() != null && castOther.getCmServAmt() != null && this
	 * .getCmServAmt().equals(castOther.getCmServAmt()))); }
	 */

	/*
	 * public int hashCode() { int result = 17;
	 * 
	 * result = 37 * result + (getSrcCode() == null ? 0 :
	 * this.getSrcCode().hashCode()); result = 37 * result + (getTranNum() ==
	 * null ? 0 : this.getTranNum().hashCode()); result = 37 * result +
	 * (getProjNum() == null ? 0 : this.getProjNum().hashCode()); result = 37 *
	 * result + (getTskNum() == null ? 0 : this.getTskNum().hashCode()); result
	 * = 37 * result + (getCustName() == null ? 0 :
	 * this.getCustName().hashCode()); result = 37 * result + (getCustNum() ==
	 * null ? 0 : this.getCustNum().hashCode()); result = 37 result +
	 * (getBillToSiteText() == null ? 0 : this.getBillToSiteText() .hashCode());
	 * result = 37 result + (getShpToSiteText() == null ? 0 :
	 * this.getShpToSiteText() .hashCode()); result = 37 * result +
	 * (getAgrmntId() == null ? 0 : this.getAgrmntId().hashCode()); result = 37
	 * result + (getAgrmntName() == null ? 0 : this.getAgrmntName()
	 * .hashCode()); result = 37 * result + (getStId() == null ? 0 :
	 * this.getStId().hashCode()); result = 37 * result + (getStName() == null ?
	 * 0 : this.getStName().hashCode()); result = 37 * result + (getEamLocCd()
	 * == null ? 0 : this.getEamLocCd().hashCode()); result = 37 * result +
	 * (getLglEnty() == null ? 0 : this.getLglEnty().hashCode()); result = 37 *
	 * result + (getMgmtEnty() == null ? 0 : this.getMgmtEnty().hashCode());
	 * result = 37 * result + (getPAndLCd() == null ? 0 :
	 * this.getPAndLCd().hashCode()); result = 37 * result + (getBucCd() == null
	 * ? 0 : this.getBucCd().hashCode()); result = 37 * result + (getCpmFlName()
	 * == null ? 0 : this.getCpmFlName().hashCode()); result = 37 * result +
	 * (getCpmOhrId() == null ? 0 : this.getCpmOhrId().hashCode()); result = 37
	 * * result + (getOtrFlName() == null ? 0 : this.getOtrFlName().hashCode());
	 * result = 37 * result + (getOtrOhrId() == null ? 0 :
	 * this.getOtrOhrId().hashCode()); result = 37 result + (getPrtfolioFlName()
	 * == null ? 0 : this.getPrtfolioFlName() .hashCode()); result = 37 result +
	 * (getPrtfolioOhrId() == null ? 0 : this.getPrtfolioOhrId() .hashCode());
	 * result = 37 * result + (getProjType() == null ? 0 :
	 * this.getProjType().hashCode()); result = 37 * result + (getItmNum() ==
	 * null ? 0 : this.getItmNum().hashCode()); result = 37 * result +
	 * (getItmDesc() == null ? 0 : this.getItmDesc().hashCode()); result = 37 *
	 * result + (getCrncyCd() == null ? 0 : this.getCrncyCd().hashCode());
	 * result = 37 * result + (getLnType() == null ? 0 :
	 * this.getLnType().hashCode()); result = 37 result + (getPrchsOrdrNum() ==
	 * null ? 0 : this.getPrchsOrdrNum() .hashCode()); result = 37 result +
	 * (getPrchsOrdrLnNum() == null ? 0 : this.getPrchsOrdrLnNum() .hashCode());
	 * result = 37 * result + (getTranSrc() == null ? 0 :
	 * this.getTranSrc().hashCode()); result = 37 result +
	 * (getExpndtrCtgryDesc() == null ? 0 : this
	 * .getExpndtrCtgryDesc().hashCode()); result = 37 result +
	 * (getPaExpndtrType() == null ? 0 : this.getPaExpndtrType() .hashCode());
	 * result = 37 result + (getExpndtrDate() == null ? 0 :
	 * this.getExpndtrDate() .hashCode()); result = 37 * result + (getRawCst()
	 * == null ? 0 : this.getRawCst().hashCode()); result = 37 result +
	 * (getCstAcctDbt() == null ? 0 : this.getCstAcctDbt() .hashCode()); result
	 * = 37 result + (getCstCcidDbt() == null ? 0 : this.getCstCcidDbt()
	 * .hashCode()); result = 37 result + (getCstAcctCrdt() == null ? 0 :
	 * this.getCstAcctCrdt() .hashCode()); result = 37 * result +
	 * (getCstCcidCr() == null ? 0 : this.getCstCcidCr().hashCode()); result =
	 * 37 * result + (getCstPaDate() == null ? 0 :
	 * this.getCstPaDate().hashCode()); result = 37 * result + (getCstGlDate()
	 * == null ? 0 : this.getCstGlDate().hashCode()); result = 37 * result +
	 * (getCstPaPrd() == null ? 0 : this.getCstPaPrd().hashCode()); result = 37
	 * * result + (getCstGlPrd() == null ? 0 : this.getCstGlPrd().hashCode());
	 * result = 37 * result + (getEvntType() == null ? 0 :
	 * this.getEvntType().hashCode()); result = 37 * result + (getSlsAmt() ==
	 * null ? 0 : this.getSlsAmt().hashCode()); result = 37 * result +
	 * (getSlsAcctDr() == null ? 0 : this.getSlsAcctDr().hashCode()); result =
	 * 37 * result + (getSlsCcidDr() == null ? 0 :
	 * this.getSlsCcidDr().hashCode()); result = 37 * result + (getSlsAcctCr()
	 * == null ? 0 : this.getSlsAcctCr().hashCode()); result = 37 result +
	 * (getSlsCcidCrdt() == null ? 0 : this.getSlsCcidCrdt() .hashCode());
	 * result = 37 * result + (getSlsPaDate() == null ? 0 :
	 * this.getSlsPaDate().hashCode()); result = 37 * result + (getSlsGlDate()
	 * == null ? 0 : this.getSlsGlDate().hashCode()); result = 37 * result +
	 * (getRevPaPrd() == null ? 0 : this.getRevPaPrd().hashCode()); result = 37
	 * * result + (getRevGlPrd() == null ? 0 : this.getRevGlPrd().hashCode());
	 * result = 37 * result + (getCmAmt() == null ? 0 :
	 * this.getCmAmt().hashCode()); result = 37 * result + (getCmPct() == null ?
	 * 0 : this.getCmPct().hashCode()); result = 37 * result + (getFsclYr() ==
	 * null ? 0 : this.getFsclYr().hashCode()); result = 37 * result +
	 * (getTiebckFlg() == null ? 0 : this.getTiebckFlg().hashCode()); result =
	 * 37 result + (getTiebckDate() == null ? 0 : this.getTiebckDate()
	 * .hashCode()); result = 37 result + (getGlJrnlEntryHdrId() == null ? 0 :
	 * this .getGlJrnlEntryHdrId().hashCode()); result = 37 result +
	 * (getGlJrnlEntryBtchId() == null ? 0 : this
	 * .getGlJrnlEntryBtchId().hashCode()); result = 37 * result +
	 * (getGlJeLnId() == null ? 0 : this.getGlJeLnId().hashCode()); result = 37
	 * result + (getGlJrnlBtchName() == null ? 0 : this.getGlJrnlBtchName()
	 * .hashCode()); result = 37 result + (getGlSweepLnkDesc() == null ? 0 :
	 * this.getGlSweepLnkDesc() .hashCode()); result = 37 result +
	 * (getGlBtchCntrlDesc() == null ? 0 : this.getGlBtchCntrlDesc()
	 * .hashCode()); result = 37 result + (getLstFetchDate() == null ? 0 :
	 * this.getLstFetchDate() .hashCode()); result = 37 result +
	 * (getPrtsOrdrNum() == null ? 0 : this.getPrtsOrdrNum() .hashCode());
	 * result = 37 * result + (getPrtsLnNum() == null ? 0 :
	 * this.getPrtsLnNum().hashCode()); result = 37 result + (getTrbnSerNum() ==
	 * null ? 0 : this.getTrbnSerNum() .hashCode()); result = 37 * result +
	 * (getApInvNum() == null ? 0 : this.getApInvNum().hashCode()); result = 37
	 * result + (getPrListDesc() == null ? 0 : this.getPrListDesc()
	 * .hashCode()); result = 37 * result + (getListPrNum() == null ? 0 :
	 * this.getListPrNum().hashCode()); result = 37 result +
	 * (getCustPrchsOrdrNum() == null ? 0 : this
	 * .getCustPrchsOrdrNum().hashCode()); result = 37 result +
	 * (getCustPrchsOrdrLn() == null ? 0 : this.getCustPrchsOrdrLn()
	 * .hashCode()); result = 37 * result + (getBtchId() == null ? 0 :
	 * this.getBtchId().hashCode()); result = 37 * result + (getQtyNum() == null
	 * ? 0 : this.getQtyNum().hashCode()); result = 37 * result +
	 * (getFrmSzText() == null ? 0 : this.getFrmSzText().hashCode()); result =
	 * 37 result + (getPrtsLnTypeDesc() == null ? 0 : this.getPrtsLnTypeDesc()
	 * .hashCode()); result = 37 result + (getCstTrnsfrDate() == null ? 0 :
	 * this.getCstTrnsfrDate() .hashCode()); result = 37 result +
	 * (getSlsTrnsfrDate() == null ? 0 : this.getSlsTrnsfrDate() .hashCode());
	 * result = 37 result + (getBillersCntctInfoDesc() == null ? 0 : this
	 * .getBillersCntctInfoDesc().hashCode()); result = 37 result +
	 * (getBillersBucCd() == null ? 0 : this.getBillersBucCd() .hashCode());
	 * result = 37 * result + (getDelNum() == null ? 0 :
	 * this.getDelNum().hashCode()); result = 37 result + (getRcvrsBucCd() ==
	 * null ? 0 : this.getRcvrsBucCd() .hashCode()); result = 37 * result +
	 * (getCrtdDate() == null ? 0 : this.getCrtdDate().hashCode()); result = 37
	 * * result + (getCrtdBy() == null ? 0 : this.getCrtdBy().hashCode());
	 * result = 37 result + (getLstUpdtDate() == null ? 0 :
	 * this.getLstUpdtDate() .hashCode()); result = 37 result + (getLstUpdtdBy()
	 * == null ? 0 : this.getLstUpdtdBy() .hashCode()); result = 37 * result +
	 * (getUseTax() == null ? 0 : this.getUseTax().hashCode()); result = 37
	 * result + (getProjectCategory() == null ? 0 : this.getProjectCategory()
	 * .hashCode()); result = 37 result + (getContractNumber() == null ? 0 :
	 * this.getContractNumber() .hashCode()); result = 37 result +
	 * (getExpenditureCategory() == null ? 0 : this
	 * .getExpenditureCategory().hashCode()); result = 37 result +
	 * (getActionStatus() == null ? 0 : this.getActionStatus() .hashCode());
	 * result = 37 result + (getApBillerBuc() == null ? 0 :
	 * this.getApBillerBuc() .hashCode()); result = 37 result +
	 * (getArInvoiceNumber() == null ? 0 : this.getArInvoiceNumber()
	 * .hashCode()); result = 37 result + (getBusinessReason() == null ? 0 :
	 * this.getBusinessReason() .hashCode()); result = 37 * result +
	 * (getCsRegion() == null ? 0 : this.getCsRegion().hashCode()); result = 37
	 * result + (getEquipmentFamily() == null ? 0 : this.getEquipmentFamily()
	 * .hashCode()); result = 37 result + (getEventDescription() == null ? 0 :
	 * this .getEventDescription().hashCode()); result = 37 result +
	 * (getGeFifoCost() == null ? 0 : this.getGeFifoCost() .hashCode()); result
	 * = 37 result + (getLineComment() == null ? 0 : this.getLineComment()
	 * .hashCode()); result = 37 result + (getModelBucket() == null ? 0 :
	 * this.getModelBucket() .hashCode()); result = 37 result +
	 * (getOrigTransactionNumber() == null ? 0 : this
	 * .getOrigTransactionNumber().hashCode()); result = 37 result +
	 * (getPoDescription() == null ? 0 : this.getPoDescription() .hashCode());
	 * result = 37 * result + (getPushType() == null ? 0 :
	 * this.getPushType().hashCode()); result = 37 result +
	 * (getSourceDateCreated() == null ? 0 : this
	 * .getSourceDateCreated().hashCode()); result = 37 * result +
	 * (getSubregion() == null ? 0 : this.getSubregion().hashCode()); result =
	 * 37 * result + (getTpAdder() == null ? 0 : this.getTpAdder().hashCode());
	 * result = 37 * result + (getTpPercent() == null ? 0 :
	 * this.getTpPercent().hashCode()); result = 37 result + (getBillToState()
	 * == null ? 0 : this.getBillToState() .hashCode()); result = 37 result +
	 * (getBillToCountry() == null ? 0 : this.getBillToCountry() .hashCode());
	 * result = 37 result + (getShipToState() == null ? 0 :
	 * this.getShipToState() .hashCode()); result = 37 result +
	 * (getShipToCountry() == null ? 0 : this.getShipToCountry() .hashCode());
	 * result = 37 result + (getCatalogBucket() == null ? 0 :
	 * this.getCatalogBucket() .hashCode()); result = 37 * result +
	 * (getStatCost() == null ? 0 : this.getStatCost().hashCode()); result = 37
	 * result + (getPartNumber() == null ? 0 : this.getPartNumber()
	 * .hashCode()); result = 37 result + (getInvoiceDate() == null ? 0 :
	 * this.getInvoiceDate() .hashCode()); result = 37 * result +
	 * (getDocNumber() == null ? 0 : this.getDocNumber().hashCode()); result =
	 * 37 result + (getGaapSalesLevelized() == null ? 0 : this
	 * .getGaapSalesLevelized().hashCode()); result = 37 result +
	 * (getGlJeSourceName() == null ? 0 : this.getGlJeSourceName() .hashCode());
	 * result = 37 result + (getHeaderDescription() == null ? 0 : this
	 * .getHeaderDescription().hashCode()); result = 37 * result + (getIcLe() ==
	 * null ? 0 : this.getIcLe().hashCode()); result = 37 * result + (getIcMe()
	 * == null ? 0 : this.getIcMe().hashCode()); result = 37 result +
	 * (getOfsEventStartDate() == null ? 0 : this
	 * .getOfsEventStartDate().hashCode()); result = 37 result +
	 * (getOfsEventEndDate() == null ? 0 : this.getOfsEventEndDate()
	 * .hashCode()); result = 37 result + (getIcamMarginRateGaap() == null ? 0 :
	 * this .getIcamMarginRateGaap().hashCode()); result = 37 result +
	 * (getIcamMarginRateStat() == null ? 0 : this
	 * .getIcamMarginRateStat().hashCode()); result = 37 result +
	 * (getIcamPersistentId() == null ? 0 : this
	 * .getIcamPersistentId().hashCode()); result = 37 result +
	 * (getIdentifierKey() == null ? 0 : this.getIdentifierKey() .hashCode());
	 * result = 37 result + (getJeHeaderLine() == null ? 0 :
	 * this.getJeHeaderLine() .hashCode()); result = 37 result +
	 * (getJobFsrNumber() == null ? 0 : this.getJobFsrNumber() .hashCode());
	 * result = 37 result + (getOfsEventId() == null ? 0 : this.getOfsEventId()
	 * .hashCode()); result = 37 result + (getOfsEventType() == null ? 0 :
	 * this.getOfsEventType() .hashCode()); result = 37 * result + (getOrgId()
	 * == null ? 0 : this.getOrgId().hashCode()); result = 37 * result +
	 * (getPoNumber() == null ? 0 : this.getPoNumber().hashCode()); result = 37
	 * * result + (getPriceList() == null ? 0 : this.getPriceList().hashCode());
	 * result = 37 * result + (getProjectId() == null ? 0 :
	 * this.getProjectId().hashCode()); result = 37 * result + (getRefer() ==
	 * null ? 0 : this.getRefer().hashCode()); result = 37 result +
	 * (getServicesCm() == null ? 0 : this.getServicesCm() .hashCode()); result
	 * = 37 result + (getSupplierName() == null ? 0 : this.getSupplierName()
	 * .hashCode()); result = 37 result + (getVendorName() == null ? 0 :
	 * this.getVendorName() .hashCode()); result = 37 * result + (getAmount() ==
	 * null ? 0 : this.getAmount().hashCode()); result = 37 result +
	 * (getBaseAmount() == null ? 0 : this.getBaseAmount() .hashCode()); result
	 * = 37 result + (getBaseInvoiceAmount() == null ? 0 : this
	 * .getBaseInvoiceAmount().hashCode()); result = 37 result +
	 * (getLineFeeType() == null ? 0 : this.getLineFeeType() .hashCode());
	 * result = 37 result + (getInvoiceAmount() == null ? 0 :
	 * this.getInvoiceAmount() .hashCode()); result = 37 result +
	 * (getInvoiceNumber() == null ? 0 : this.getInvoiceNumber() .hashCode());
	 * result = 37 result + (getSubFeeType() == null ? 0 : this.getSubFeeType()
	 * .hashCode()); result = 37 * result + (getTaskName() == null ? 0 :
	 * this.getTaskName().hashCode()); result = 37 result + (getLineNumber() ==
	 * null ? 0 : this.getLineNumber() .hashCode()); result = 37 result +
	 * (getOfsEventDesc() == null ? 0 : this.getOfsEventDesc() .hashCode());
	 * result = 37 result + (getGaapSalesLevelized1() == null ? 0 : this
	 * .getGaapSalesLevelized1().hashCode()); result = 37 result +
	 * (getCsPoNumber() == null ? 0 : this.getCsPoNumber() .hashCode()); result
	 * = 37 result + (getProcessFlg() == null ? 0 : this.getProcessFlg()
	 * .hashCode()); result = 37 * result + (getTaxAmt() == null ? 0 :
	 * this.getTaxAmt().hashCode()); result = 37 result + (getBaseTaxAmt() ==
	 * null ? 0 : this.getBaseTaxAmt() .hashCode()); result = 37 result +
	 * (getInvLineNum() == null ? 0 : this.getInvLineNum() .hashCode()); result
	 * = 37 * result + (getCmServAmt() == null ? 0 :
	 * this.getCmServAmt().hashCode()); return result; }
	 */
}