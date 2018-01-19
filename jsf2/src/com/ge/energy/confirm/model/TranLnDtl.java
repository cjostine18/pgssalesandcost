/**
 * Project:      PGS - AA
 * Component:    TranLnDtl.java
 * Date-Written: Jun 28, 2012
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
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//import org.hibernate.annotations.Cache;
//import org.hibernate.annotations.CacheConcurrencyStrategy;
//import org.hibernate.annotations.Immutable;

/**
 * TranLnDtl entity.
 */
@Entity
//@Immutable
@SequenceGenerator(name = "trandtlSEQ", sequenceName = "SEQ_TRAN_ID", allocationSize = 1)
@org.hibernate.annotations.Entity(dynamicUpdate = true, dynamicInsert = true)
@Table(name = "CNFM_TRAN_LN_DTL", schema = "CNFM")
public class TranLnDtl extends BaseEntity {

	private static final long serialVersionUID = -8959871221665856283L;
	private Long tranId;
	private FeeType feeType;
	private SubFeeType subFeeType;
	private EwWrkBusrsn ewWrkBusrsn;
	private ExpndtrCtgryLkp expndtrCtgryLkp;
	private Equipment equipment;
	private MdlBukt mdlBukt;
	private Project project;
	private MgmtEnty mgmtEnty;
	private PrchsOrdr prchsOrdr;
	private TskCd tskCd;
	private CtlgBukt ctlgBukt;
	private InvCtgry invCtgry;
	private String tranNum;
	private Double gaapSlsAmt;
	private Double gaapCstAmt;
	private Double statSlsAmt;
	private Double statCstAmt;
	private Double cstMrgnNum;
	private Double gaapCmAmt;
	private Double statCmAmt;
	private String prtsSlsOrdrNum;
	private String prtsLnNum;
	private String acctRcvblInvNum;
	private String itmDesc;
	private BigDecimal jobFldSrvcRqstNum;
	private String ofsEventTypeName;
	private String erpEvntDesc;
	private String erpTranSttsVal;
	private String acctPyblInvNum;
	private BigDecimal orgId;
	private BigDecimal origTranNum;
	private String cntrctlSrvcsBusLnCd;
	private String tranSrcDesc;
	private String slsAcctDbtAmt;
	private String slsAcctCrdtAmt;
	private String cstAcctDbtAmt;
	private String cstAcctCrdtAmt;
	private BigDecimal apBillerBucCd;
	private String bucName;
	private String prtsShpFrmLeCd;
	private String extWrkShpToStDnsId;
	private String trnsfrPrAdderAmt;
	private BigDecimal trnsfrPrPct;
	private BigDecimal listPrAmt;
	private String prListId;
	private String pushTypeCd;
	private String glJrnlEntryLnId;
	private String glJrnlEntryHdrId;
	private String jrnlEntryHdrLnCd;
	private String glJrnlSrcName;
	private BigDecimal qtyNum;
	private String billToStateDesc;
	private String billToCntryDesc;
	private String shpToStateDesc;
	private String shpToCntryDesc;
	private Date expndtrItmDate;
	private String glBtchName;
	private String csRgnDesc;
	private String csSubrgnDesc;
	private String billerCntctInfoDesc;
	private BigDecimal docNum;
	private String ctgryDesc;
	private String hdrDesc;
	private String refDesc;
	private String vndrName;
	private BigDecimal trnsfrPrAmt;
	private BigDecimal useTaxAmt;
	private Date tranDate;
	private BigDecimal bsNum;
	private String escltnDesc;
	private String slsTaxAmt;
	private String blngCd;
	private String glQtrDesc;
	private String tchnlgyCd;
	private String actnCd;
	private String actnSttsDesc;
	private String crtdBy;
	private Date crtnDate;
	private Date lstUpdtdDate;
	private String lstUpdtdBy;
	private BigDecimal csPoNum;
	private String custPoNum;
	private Double icamMrgnRtAmt;
	private String marginReviewFlag;
	private String csLineType;
	private Date glCostDate;
	private Date glSalesDate;
	private String icLe;
	private String icMe;
	private Date ofsEventStartDate;
	private Date ofsEventEndDate;
	private BigDecimal icamMarginRateStat;
	private String icamPersistentId;
	private BigDecimal identifierKey;
	private String jeHeaderLine;
	private String jobFsrNumber;
	private String lineComment;
	private BigDecimal ofsEventId;
	private String ofsEventType;
	private String ofsEventDesc;
	private String paExpndtrType;
	private String partNumber;
	private String poDescription;
	private String poNumber;
	private BigDecimal servicesCm;
	private String srcCode;
	private Date sourceDateCreated;
	private String supplierName;
	private BigDecimal amount;
	private BigDecimal baseInvoiceAmount;
	private BigDecimal invoiceAmount;
	private Date invoiceDate;
	private String invoiceNumber;
	private String lineNumber;
	private String taskName;
	private String contractNumber;
	private String icamContractCm;
	private String origExpndtrCtgry;
	private String supplierInvoiceNum;
	private String saleTax;
	private String fallOutInd;
	private String cpmComment;
	private String financeComment;
	private String opnItmExistFlg;
	private String actItmExistFlg;
	private String outInInd;
	private String isLocked;
	private String riskAnalystComment;
	private String reviewComplete;
	private String glSalesQtr;
	private String glCostQtr;
	private Set<CmntType> cmntTypes = new HashSet<CmntType>(0);
	private Set<OpnItm> opnItms = new HashSet<OpnItm>(0);
	private Set<ActnItm> actnItms = new HashSet<ActnItm>(0);

	private BigDecimal escalation;
	private String histErpFlg;

	/** default constructor */
	public TranLnDtl() {
	}

	public TranLnDtl(Long tranId, FeeType feeType, SubFeeType subFeeType,
			EwWrkBusrsn ewWrkBusrsn, ExpndtrCtgryLkp expndtrCtgryLkp,
			Equipment equipment, MdlBukt mdlBukt, Project project,
			MgmtEnty mgmtEnty, PrchsOrdr prchsOrdr, TskCd tskCd,
			CtlgBukt ctlgBukt, InvCtgry invCtgry, String tranNum,
			Double gaapSlsAmt, Double gaapCstAmt, Double statSlsAmt,
			Double statCstAmt, Double cstMrgnNum, Double gaapCmAmt,
			Double statCmAmt, String prtsSlsOrdrNum, String prtsLnNum,
			String acctRcvblInvNum, String itmDesc,
			BigDecimal jobFldSrvcRqstNum, String ofsEventTypeName,
			String erpEvntDesc, String erpTranSttsVal, String acctPyblInvNum,
			BigDecimal orgId, BigDecimal origTranNum,
			String cntrctlSrvcsBusLnCd, String tranSrcDesc,
			String slsAcctDbtAmt, String slsAcctCrdtAmt, String cstAcctDbtAmt,
			String cstAcctCrdtAmt, BigDecimal apBillerBucCd, String bucName,
			String prtsShpFrmLeCd, String extWrkShpToStDnsId,
			String trnsfrPrAdderAmt, BigDecimal trnsfrPrPct,
			BigDecimal listPrAmt, String prListId, String pushTypeCd,
			String glJrnlEntryLnId, String glJrnlEntryHdrId,
			String jrnlEntryHdrLnCd, String glJrnlSrcName, BigDecimal qtyNum,
			String billToStateDesc, String billToCntryDesc,
			String shpToStateDesc, String shpToCntryDesc, Date expndtrItmDate,
			String glBtchName, String csRgnDesc, String csSubrgnDesc,
			String billerCntctInfoDesc, BigDecimal docNum, String ctgryDesc,
			String hdrDesc, String refDesc, String vndrName,
			BigDecimal trnsfrPrAmt, BigDecimal useTaxAmt, Date tranDate,
			BigDecimal bsNum, String escltnDesc, String slsTaxAmt,
			String blngCd, String glQtrDesc, String tchnlgyCd, String actnCd,
			String actnSttsDesc, String crtdBy, Date crtnDate,
			Date lstUpdtdDate, String lstUpdtdBy, BigDecimal csPoNum,
			String custPoNum, Double icamMrgnRtAmt, String marginReviewFlag,
			String csLineType, Date glCostDate, Date glSalesDate, String icLe,
			String icMe, Date ofsEventStartDate, Date ofsEventEndDate,
			BigDecimal icamMarginRateStat, String icamPersistentId,
			BigDecimal identifierKey, String jeHeaderLine, String jobFsrNumber,
			String lineComment, BigDecimal ofsEventId, String ofsEventType,
			String ofsEventDesc, String paExpndtrType, String partNumber,
			String poDescription, String poNumber, BigDecimal servicesCm,
			String srcCode, Date sourceDateCreated, String supplierName,
			BigDecimal amount, BigDecimal baseInvoiceAmount,
			BigDecimal invoiceAmount, Date invoiceDate, String invoiceNumber,
			String lineNumber, String taskName, String contractNumber,
			String icamContractCm, String origExpndtrCtgry,
			String supplierInvoiceNum, String saleTax, String fallOutInd,
			String cpmComment, String financeComment, String opnItmExistFlg,
			String actItmExistFlg, String outInInd, Set<CmntType> cmntTypes,
			Set<OpnItm> opnItms, Set<ActnItm> actnItms, BigDecimal escalation,
			String histErpFlg) {
		super();
		this.tranId = tranId;
		this.feeType = feeType;
		this.subFeeType = subFeeType;
		this.ewWrkBusrsn = ewWrkBusrsn;
		this.expndtrCtgryLkp = expndtrCtgryLkp;
		this.equipment = equipment;
		this.mdlBukt = mdlBukt;
		this.project = project;
		this.mgmtEnty = mgmtEnty;
		this.prchsOrdr = prchsOrdr;
		this.tskCd = tskCd;
		this.ctlgBukt = ctlgBukt;
		this.invCtgry = invCtgry;
		this.tranNum = tranNum;
		this.gaapSlsAmt = gaapSlsAmt;
		this.gaapCstAmt = gaapCstAmt;
		this.statSlsAmt = statSlsAmt;
		this.statCstAmt = statCstAmt;
		this.cstMrgnNum = cstMrgnNum;
		this.gaapCmAmt = gaapCmAmt;
		this.statCmAmt = statCmAmt;
		this.prtsSlsOrdrNum = prtsSlsOrdrNum;
		this.prtsLnNum = prtsLnNum;
		this.acctRcvblInvNum = acctRcvblInvNum;
		this.itmDesc = itmDesc;
		this.jobFldSrvcRqstNum = jobFldSrvcRqstNum;
		this.ofsEventTypeName = ofsEventTypeName;
		this.erpEvntDesc = erpEvntDesc;
		this.erpTranSttsVal = erpTranSttsVal;
		this.acctPyblInvNum = acctPyblInvNum;
		this.orgId = orgId;
		this.origTranNum = origTranNum;
		this.cntrctlSrvcsBusLnCd = cntrctlSrvcsBusLnCd;
		this.tranSrcDesc = tranSrcDesc;
		this.slsAcctDbtAmt = slsAcctDbtAmt;
		this.slsAcctCrdtAmt = slsAcctCrdtAmt;
		this.cstAcctDbtAmt = cstAcctDbtAmt;
		this.cstAcctCrdtAmt = cstAcctCrdtAmt;
		this.apBillerBucCd = apBillerBucCd;
		this.bucName = bucName;
		this.prtsShpFrmLeCd = prtsShpFrmLeCd;
		this.extWrkShpToStDnsId = extWrkShpToStDnsId;
		this.trnsfrPrAdderAmt = trnsfrPrAdderAmt;
		this.trnsfrPrPct = trnsfrPrPct;
		this.listPrAmt = listPrAmt;
		this.prListId = prListId;
		this.pushTypeCd = pushTypeCd;
		this.glJrnlEntryLnId = glJrnlEntryLnId;
		this.glJrnlEntryHdrId = glJrnlEntryHdrId;
		this.jrnlEntryHdrLnCd = jrnlEntryHdrLnCd;
		this.glJrnlSrcName = glJrnlSrcName;
		this.qtyNum = qtyNum;
		this.billToStateDesc = billToStateDesc;
		this.billToCntryDesc = billToCntryDesc;
		this.shpToStateDesc = shpToStateDesc;
		this.shpToCntryDesc = shpToCntryDesc;
		this.expndtrItmDate = expndtrItmDate;
		this.glBtchName = glBtchName;
		this.csRgnDesc = csRgnDesc;
		this.csSubrgnDesc = csSubrgnDesc;
		this.billerCntctInfoDesc = billerCntctInfoDesc;
		this.docNum = docNum;
		this.ctgryDesc = ctgryDesc;
		this.hdrDesc = hdrDesc;
		this.refDesc = refDesc;
		this.vndrName = vndrName;
		this.trnsfrPrAmt = trnsfrPrAmt;
		this.useTaxAmt = useTaxAmt;
		this.tranDate = tranDate;
		this.bsNum = bsNum;
		this.escltnDesc = escltnDesc;
		this.slsTaxAmt = slsTaxAmt;
		this.blngCd = blngCd;
		this.glQtrDesc = glQtrDesc;
		this.tchnlgyCd = tchnlgyCd;
		this.actnCd = actnCd;
		this.actnSttsDesc = actnSttsDesc;
		this.crtdBy = crtdBy;
		this.crtnDate = crtnDate;
		this.lstUpdtdDate = lstUpdtdDate;
		this.lstUpdtdBy = lstUpdtdBy;
		this.csPoNum = csPoNum;
		this.custPoNum = custPoNum;
		this.icamMrgnRtAmt = icamMrgnRtAmt;
		this.marginReviewFlag = marginReviewFlag;
		this.csLineType = csLineType;
		this.glCostDate = glCostDate;
		this.glSalesDate = glSalesDate;
		this.icLe = icLe;
		this.icMe = icMe;
		this.ofsEventStartDate = ofsEventStartDate;
		this.ofsEventEndDate = ofsEventEndDate;
		this.icamMarginRateStat = icamMarginRateStat;
		this.icamPersistentId = icamPersistentId;
		this.identifierKey = identifierKey;
		this.jeHeaderLine = jeHeaderLine;
		this.jobFsrNumber = jobFsrNumber;
		this.lineComment = lineComment;
		this.ofsEventId = ofsEventId;
		this.ofsEventType = ofsEventType;
		this.ofsEventDesc = ofsEventDesc;
		this.paExpndtrType = paExpndtrType;
		this.partNumber = partNumber;
		this.poDescription = poDescription;
		this.poNumber = poNumber;
		this.servicesCm = servicesCm;
		this.srcCode = srcCode;
		this.sourceDateCreated = sourceDateCreated;
		this.supplierName = supplierName;
		this.amount = amount;
		this.baseInvoiceAmount = baseInvoiceAmount;
		this.invoiceAmount = invoiceAmount;
		this.invoiceDate = invoiceDate;
		this.invoiceNumber = invoiceNumber;
		this.lineNumber = lineNumber;
		this.taskName = taskName;
		this.contractNumber = contractNumber;
		this.icamContractCm = icamContractCm;
		this.origExpndtrCtgry = origExpndtrCtgry;
		this.supplierInvoiceNum = supplierInvoiceNum;
		this.saleTax = saleTax;
		this.fallOutInd = fallOutInd;
		this.cpmComment = cpmComment;
		this.financeComment = financeComment;
		this.opnItmExistFlg = opnItmExistFlg;
		this.actItmExistFlg = actItmExistFlg;
		this.outInInd = outInInd;
		this.cmntTypes = cmntTypes;
		this.opnItms = opnItms;
		this.actnItms = actnItms;
		this.escalation = escalation;
		this.histErpFlg = histErpFlg;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "trandtlSEQ")
	@Column(name = "TRAN_ID", unique = true, nullable = false, precision = 10, scale = 0)
	public Long getTranId() {
		return this.tranId;
	}

	public void setTranId(Long tranId) {
		this.tranId = tranId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EXPNDTR_CTGRY_ID", nullable = false)
	public ExpndtrCtgryLkp getExpndtrCtgryLkp() {
		return this.expndtrCtgryLkp;
	}

	public void setExpndtrCtgryLkp(ExpndtrCtgryLkp expndtrCtgryLkp) {
		this.expndtrCtgryLkp = expndtrCtgryLkp;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EQPMNT_ID")
	public Equipment getEquipment() {
		return this.equipment;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MDL_BUKT_ID", nullable = false)
	public MdlBukt getMdlBukt() {
		return this.mdlBukt;
	}

	public void setMdlBukt(MdlBukt mdlBukt) {
		this.mdlBukt = mdlBukt;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PROJ_ID", nullable = false)
	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MGMT_ENTY_ID", nullable = false)
	public MgmtEnty getMgmtEnty() {
		return this.mgmtEnty;
	}

	public void setMgmtEnty(MgmtEnty mgmtEnty) {
		this.mgmtEnty = mgmtEnty;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRCHS_ORDR_ID", nullable = false)
	public PrchsOrdr getPrchsOrdr() {
		return this.prchsOrdr;
	}

	public void setPrchsOrdr(PrchsOrdr prchsOrdr) {
		this.prchsOrdr = prchsOrdr;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TSK_CD_ID", nullable = false)
	public TskCd getTskCd() {
		return this.tskCd;
	}

	public void setTskCd(TskCd tskCd) {
		this.tskCd = tskCd;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "INV_CTGRY_ID", nullable = true)
	public InvCtgry getInvCtgry() {
		return invCtgry;
	}

	public void setInvCtgry(InvCtgry invCtgry) {
		this.invCtgry = invCtgry;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CTLG_BUKT_ID", nullable = false)
	public CtlgBukt getCtlgBukt() {
		return this.ctlgBukt;
	}

	public void setCtlgBukt(CtlgBukt ctlgBukt) {
		this.ctlgBukt = ctlgBukt;
	}

	@Column(name = "TRAN_NUM")
	public String getTranNum() {
		return this.tranNum;
	}

	public void setTranNum(String tranNum) {
		this.tranNum = tranNum;
	}

	@Column(name = "GAAP_SLS_AMT")
	public Double getGaapSlsAmt() {
		return this.gaapSlsAmt;
	}

	public void setGaapSlsAmt(Double gaapSlsAmt) {
		this.gaapSlsAmt = gaapSlsAmt;
	}

	@Column(name = "GAAP_CST_AMT")
	public Double getGaapCstAmt() {
		return this.gaapCstAmt;
	}

	public void setGaapCstAmt(Double gaapCstAmt) {
		this.gaapCstAmt = gaapCstAmt;
	}

	@Column(name = "STAT_SLS_AMT")
	public Double getStatSlsAmt() {
		return this.statSlsAmt;
	}

	public void setStatSlsAmt(Double statSlsAmt) {
		this.statSlsAmt = statSlsAmt;
	}

	@Column(name = "STAT_CST_AMT")
	public Double getStatCstAmt() {
		return this.statCstAmt;
	}

	public void setStatCstAmt(Double statCstAmt) {
		this.statCstAmt = statCstAmt;
	}

	@Column(name = "CST_MRGN_NUM")
	public Double getCstMrgnNum() {
		return this.cstMrgnNum;
	}

	public void setCstMrgnNum(Double cstMrgnNum) {
		this.cstMrgnNum = cstMrgnNum;
	}

	@Column(name = "GAAP_CM_AMT")
	public Double getGaapCmAmt() {
		return this.gaapCmAmt;
	}

	public void setGaapCmAmt(Double gaapCmAmt) {
		this.gaapCmAmt = gaapCmAmt;
	}

	@Column(name = "STAT_CM_AMT")
	public Double getStatCmAmt() {
		return this.statCmAmt;
	}

	public void setStatCmAmt(Double statCmAmt) {
		this.statCmAmt = statCmAmt;
	}

	@Column(name = "PRTS_SLS_ORDR_NUM")
	public String getPrtsSlsOrdrNum() {
		return this.prtsSlsOrdrNum;
	}

	public void setPrtsSlsOrdrNum(String prtsSlsOrdrNum) {
		this.prtsSlsOrdrNum = prtsSlsOrdrNum;
	}

	@Column(name = "PRTS_LN_NUM")
	public String getPrtsLnNum() {
		return this.prtsLnNum;
	}

	public void setPrtsLnNum(String prtsLnNum) {
		this.prtsLnNum = prtsLnNum;
	}

	@Column(name = "ACCT_RCVBL_INV_NUM")
	public String getAcctRcvblInvNum() {
		return this.acctRcvblInvNum;
	}

	public void setAcctRcvblInvNum(String acctRcvblInvNum) {
		this.acctRcvblInvNum = acctRcvblInvNum;
	}

	@Column(name = "ITM_DESC")
	public String getItmDesc() {
		return this.itmDesc;
	}

	public void setItmDesc(String itmDesc) {
		this.itmDesc = itmDesc;
	}

	@Column(name = "JOB_FLD_SRVC_RQST_NUM", scale = 0)
	public BigDecimal getJobFldSrvcRqstNum() {
		return this.jobFldSrvcRqstNum;
	}

	public void setJobFldSrvcRqstNum(BigDecimal jobFldSrvcRqstNum) {
		this.jobFldSrvcRqstNum = jobFldSrvcRqstNum;
	}

	@Column(name = "OFS_EVENT_TYPE_NAME")
	public String getOfsEventTypeName() {
		return this.ofsEventTypeName;
	}

	public void setOfsEventTypeName(String ofsEventTypeName) {
		this.ofsEventTypeName = ofsEventTypeName;
	}

	@Column(name = "ERP_EVNT_DESC")
	public String getErpEvntDesc() {
		return this.erpEvntDesc;
	}

	public void setErpEvntDesc(String erpEvntDesc) {
		this.erpEvntDesc = erpEvntDesc;
	}

	@Column(name = "ERP_TRAN_STTS_VAL")
	public String getErpTranSttsVal() {
		return this.erpTranSttsVal;
	}

	public void setErpTranSttsVal(String erpTranSttsVal) {
		this.erpTranSttsVal = erpTranSttsVal;
	}

	@Column(name = "ACCT_PYBL_INV_NUM")
	public String getAcctPyblInvNum() {
		return this.acctPyblInvNum;
	}

	public void setAcctPyblInvNum(String acctPyblInvNum) {
		this.acctPyblInvNum = acctPyblInvNum;
	}

	@Column(name = "ORG_ID", scale = 0)
	public BigDecimal getOrgId() {
		return this.orgId;
	}

	public void setOrgId(BigDecimal orgId) {
		this.orgId = orgId;
	}

	@Column(name = "ORIG_TRAN_NUM", scale = 0)
	public BigDecimal getOrigTranNum() {
		return this.origTranNum;
	}

	public void setOrigTranNum(BigDecimal origTranNum) {
		this.origTranNum = origTranNum;
	}

	@Column(name = "CNTRCTL_SRVCS_BUS_LN_CD")
	public String getCntrctlSrvcsBusLnCd() {
		return this.cntrctlSrvcsBusLnCd;
	}

	public void setCntrctlSrvcsBusLnCd(String cntrctlSrvcsBusLnCd) {
		this.cntrctlSrvcsBusLnCd = cntrctlSrvcsBusLnCd;
	}

	@Column(name = "TRAN_SRC_DESC")
	public String getTranSrcDesc() {
		return this.tranSrcDesc;
	}

	public void setTranSrcDesc(String tranSrcDesc) {
		this.tranSrcDesc = tranSrcDesc;
	}

	@Column(name = "SLS_ACCT_DBT_AMT")
	public String getSlsAcctDbtAmt() {
		return this.slsAcctDbtAmt;
	}

	public void setSlsAcctDbtAmt(String slsAcctDbtAmt) {
		this.slsAcctDbtAmt = slsAcctDbtAmt;
	}

	@Column(name = "SLS_ACCT_CRDT_AMT")
	public String getSlsAcctCrdtAmt() {
		return this.slsAcctCrdtAmt;
	}

	public void setSlsAcctCrdtAmt(String slsAcctCrdtAmt) {
		this.slsAcctCrdtAmt = slsAcctCrdtAmt;
	}

	@Column(name = "CST_ACCT_DBT_AMT")
	public String getCstAcctDbtAmt() {
		return this.cstAcctDbtAmt;
	}

	public void setCstAcctDbtAmt(String cstAcctDbtAmt) {
		this.cstAcctDbtAmt = cstAcctDbtAmt;
	}

	@Column(name = "CST_ACCT_CRDT_AMT")
	public String getCstAcctCrdtAmt() {
		return this.cstAcctCrdtAmt;
	}

	public void setCstAcctCrdtAmt(String cstAcctCrdtAmt) {
		this.cstAcctCrdtAmt = cstAcctCrdtAmt;
	}

	@Column(name = "AP_BILLER_BUC_CD", scale = 0)
	public BigDecimal getApBillerBucCd() {
		return this.apBillerBucCd;
	}

	public void setApBillerBucCd(BigDecimal apBillerBucCd) {
		this.apBillerBucCd = apBillerBucCd;
	}

	@Column(name = "BUC_NAME")
	public String getBucName() {
		return this.bucName;
	}

	public void setBucName(String bucName) {
		this.bucName = bucName;
	}

	@Column(name = "PRTS_SHP_FRM_LE_CD")
	public String getPrtsShpFrmLeCd() {
		return this.prtsShpFrmLeCd;
	}

	public void setPrtsShpFrmLeCd(String prtsShpFrmLeCd) {
		this.prtsShpFrmLeCd = prtsShpFrmLeCd;
	}

	@Column(name = "EXT_WRK_SHP_TO_ST_DNS_ID")
	public String getExtWrkShpToStDnsId() {
		return this.extWrkShpToStDnsId;
	}

	public void setExtWrkShpToStDnsId(String extWrkShpToStDnsId) {
		this.extWrkShpToStDnsId = extWrkShpToStDnsId;
	}

	@Column(name = "TRNSFR_PR_ADDER_AMT")
	public String getTrnsfrPrAdderAmt() {
		return this.trnsfrPrAdderAmt;
	}

	public void setTrnsfrPrAdderAmt(String trnsfrPrAdderAmt) {
		this.trnsfrPrAdderAmt = trnsfrPrAdderAmt;
	}

	@Column(name = "TRNSFR_PR_PCT", scale = 0)
	public BigDecimal getTrnsfrPrPct() {
		return this.trnsfrPrPct;
	}

	public void setTrnsfrPrPct(BigDecimal trnsfrPrPct) {
		this.trnsfrPrPct = trnsfrPrPct;
	}

	@Column(name = "LIST_PR_AMT", scale = 0)
	public BigDecimal getListPrAmt() {
		return this.listPrAmt;
	}

	public void setListPrAmt(BigDecimal listPrAmt) {
		this.listPrAmt = listPrAmt;
	}

	@Column(name = "PR_LIST_ID")
	public String getPrListId() {
		return this.prListId;
	}

	public void setPrListId(String prListId) {
		this.prListId = prListId;
	}

	@Column(name = "PUSH_TYPE_CD")
	public String getPushTypeCd() {
		return this.pushTypeCd;
	}

	public void setPushTypeCd(String pushTypeCd) {
		this.pushTypeCd = pushTypeCd;
	}

	@Column(name = "GL_JRNL_ENTRY_LN_ID")
	public String getGlJrnlEntryLnId() {
		return this.glJrnlEntryLnId;
	}

	public void setGlJrnlEntryLnId(String glJrnlEntryLnId) {
		this.glJrnlEntryLnId = glJrnlEntryLnId;
	}

	@Column(name = "GL_JRNL_ENTRY_HDR_ID")
	public String getGlJrnlEntryHdrId() {
		return this.glJrnlEntryHdrId;
	}

	public void setGlJrnlEntryHdrId(String glJrnlEntryHdrId) {
		this.glJrnlEntryHdrId = glJrnlEntryHdrId;
	}

	@Column(name = "JRNL_ENTRY_HDR_LN_CD")
	public String getJrnlEntryHdrLnCd() {
		return this.jrnlEntryHdrLnCd;
	}

	public void setJrnlEntryHdrLnCd(String jrnlEntryHdrLnCd) {
		this.jrnlEntryHdrLnCd = jrnlEntryHdrLnCd;
	}

	@Column(name = "GL_JRNL_SRC_NAME")
	public String getGlJrnlSrcName() {
		return this.glJrnlSrcName;
	}

	public void setGlJrnlSrcName(String glJrnlSrcName) {
		this.glJrnlSrcName = glJrnlSrcName;
	}

	@Column(name = "QTY_NUM", scale = 0)
	public BigDecimal getQtyNum() {
		return this.qtyNum;
	}

	public void setQtyNum(BigDecimal qtyNum) {
		this.qtyNum = qtyNum;
	}

	@Column(name = "BILL_TO_STATE_DESC")
	public String getBillToStateDesc() {
		return this.billToStateDesc;
	}

	public void setBillToStateDesc(String billToStateDesc) {
		this.billToStateDesc = billToStateDesc;
	}

	@Column(name = "BILL_TO_CNTRY_DESC")
	public String getBillToCntryDesc() {
		return this.billToCntryDesc;
	}

	public void setBillToCntryDesc(String billToCntryDesc) {
		this.billToCntryDesc = billToCntryDesc;
	}

	@Column(name = "SHP_TO_STATE_DESC")
	public String getShpToStateDesc() {
		return this.shpToStateDesc;
	}

	public void setShpToStateDesc(String shpToStateDesc) {
		this.shpToStateDesc = shpToStateDesc;
	}

	@Column(name = "SHP_TO_CNTRY_DESC")
	public String getShpToCntryDesc() {
		return this.shpToCntryDesc;
	}

	public void setShpToCntryDesc(String shpToCntryDesc) {
		this.shpToCntryDesc = shpToCntryDesc;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "EXPNDTR_ITM_DATE")
	public Date getExpndtrItmDate() {
		// if(this.getExpndtrItmDate()!=null){
		// return new Date(this.expndtrItmDate.getTime());
		// }else{
		// return null;
		// }
		return expndtrItmDate;
	}

	public void setExpndtrItmDate(Date expndtrItmDate) {
		this.expndtrItmDate = expndtrItmDate;
	}

	@Column(name = "GL_BTCH_NAME")
	public String getGlBtchName() {
		return this.glBtchName;
	}

	public void setGlBtchName(String glBtchName) {
		this.glBtchName = glBtchName;
	}

	@Column(name = "CS_RGN_DESC")
	public String getCsRgnDesc() {
		return this.csRgnDesc;
	}

	public void setCsRgnDesc(String csRgnDesc) {
		this.csRgnDesc = csRgnDesc;
	}

	@Column(name = "CS_SUBRGN_DESC")
	public String getCsSubrgnDesc() {
		return this.csSubrgnDesc;
	}

	public void setCsSubrgnDesc(String csSubrgnDesc) {
		this.csSubrgnDesc = csSubrgnDesc;
	}

	@Column(name = "BILLER_CNTCT_INFO_DESC")
	public String getBillerCntctInfoDesc() {
		return this.billerCntctInfoDesc;
	}

	public void setBillerCntctInfoDesc(String billerCntctInfoDesc) {
		this.billerCntctInfoDesc = billerCntctInfoDesc;
	}

	@Column(name = "DOC_NUM", scale = 0)
	public BigDecimal getDocNum() {
		return this.docNum;
	}

	public void setDocNum(BigDecimal docNum) {
		this.docNum = docNum;
	}

	@Column(name = "CTGRY_DESC")
	public String getCtgryDesc() {
		return this.ctgryDesc;
	}

	public void setCtgryDesc(String ctgryDesc) {
		this.ctgryDesc = ctgryDesc;
	}

	@Column(name = "HDR_DESC")
	public String getHdrDesc() {
		return this.hdrDesc;
	}

	public void setHdrDesc(String hdrDesc) {
		this.hdrDesc = hdrDesc;
	}

	@Column(name = "REF_DESC")
	public String getRefDesc() {
		return this.refDesc;
	}

	public void setRefDesc(String refDesc) {
		this.refDesc = refDesc;
	}

	@Column(name = "VNDR_NAME")
	public String getVndrName() {
		return this.vndrName;
	}

	public void setVndrName(String vndrName) {
		this.vndrName = vndrName;
	}

	@Column(name = "TRNSFR_PR_AMT", scale = 0)
	public BigDecimal getTrnsfrPrAmt() {
		return this.trnsfrPrAmt;
	}

	public void setTrnsfrPrAmt(BigDecimal trnsfrPrAmt) {
		this.trnsfrPrAmt = trnsfrPrAmt;
	}

	@Column(name = "USE_TAX_AMT", scale = 0)
	public BigDecimal getUseTaxAmt() {
		return this.useTaxAmt;
	}

	public void setUseTaxAmt(BigDecimal useTaxAmt) {
		this.useTaxAmt = useTaxAmt;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "TRAN_DATE")
	public Date getTranDate() {
		// if(this.getTranDate()!=null)
		// return new Date(this.tranDate.getTime());
		// else
		// return null;
		return tranDate;
	}

	public void setTranDate(Date tranDate) {
		this.tranDate = tranDate;
	}

	@Column(name = "BS_NUM", scale = 0)
	public BigDecimal getBsNum() {
		return this.bsNum;
	}

	public void setBsNum(BigDecimal bsNum) {
		this.bsNum = bsNum;
	}

	@Column(name = "ESCLTN_DESC")
	public String getEscltnDesc() {
		return this.escltnDesc;
	}

	public void setEscltnDesc(String escltnDesc) {
		this.escltnDesc = escltnDesc;
	}

	@Column(name = "SLS_TAX_AMT")
	public String getSlsTaxAmt() {
		return this.slsTaxAmt;
	}

	public void setSlsTaxAmt(String slsTaxAmt) {
		this.slsTaxAmt = slsTaxAmt;
	}

	@Column(name = "BLNG_CD")
	public String getBlngCd() {
		return this.blngCd;
	}

	public void setBlngCd(String blngCd) {
		this.blngCd = blngCd;
	}

	@Column(name = "GL_QTR_DESC")
	public String getGlQtrDesc() {
		return this.glQtrDesc;
	}

	public void setGlQtrDesc(String glQtrDesc) {
		this.glQtrDesc = glQtrDesc;
	}

	@Column(name = "TCHNLGY_CD")
	public String getTchnlgyCd() {
		return this.tchnlgyCd;
	}

	public void setTchnlgyCd(String tchnlgyCd) {
		this.tchnlgyCd = tchnlgyCd;
	}

	@Column(name = "ACTN_CD")
	public String getActnCd() {
		return this.actnCd;
	}

	public void setActnCd(String actnCd) {
		this.actnCd = actnCd;
	}

	@Column(name = "ACTN_STTS_DESC")
	public String getActnSttsDesc() {
		return this.actnSttsDesc;
	}

	public void setActnSttsDesc(String actnSttsDesc) {
		this.actnSttsDesc = actnSttsDesc;
	}

	@Column(name = "CRTD_BY", nullable = false)
	public String getCrtdBy() {
		return this.crtdBy;
	}

	public void setCrtdBy(String crtdBy) {
		this.crtdBy = crtdBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRTN_DATE", nullable = false)
	public Date getCrtnDate() {
		// if(this.getCrtnDate()!=null){
		// return new Date(this.crtnDate.getTime());
		// }else{
		// return null;
		// }
		return crtnDate;
	}

	public void setCrtnDate(Date crtnDate) {
		this.crtnDate = crtnDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "LST_UPDTD_DATE", nullable = false)
	public Date getLstUpdtdDate() {
		// if(this.getLstUpdtdDate()!=null){
		// return new Date(this.lstUpdtdDate.getTime());
		// }else{
		// return null;
		// }
		return lstUpdtdDate;
	}

	public void setLstUpdtdDate(Date lstUpdtdDate) {
		this.lstUpdtdDate = lstUpdtdDate;
	}

	@Column(name = "LST_UPDTD_BY", nullable = false)
	public String getLstUpdtdBy() {
		return this.lstUpdtdBy;
	}

	public void setLstUpdtdBy(String lstUpdtdBy) {
		this.lstUpdtdBy = lstUpdtdBy;
	}

	@Column(name = "CS_PO_NUM", scale = 0)
	public BigDecimal getCsPoNum() {
		return this.csPoNum;
	}

	public void setCsPoNum(BigDecimal csPoNum) {
		this.csPoNum = csPoNum;
	}

	@Column(name = "CUST_PO_NUM")
	public String getCustPoNum() {
		return this.custPoNum;
	}

	public void setCustPoNum(String custPoNum) {
		this.custPoNum = custPoNum;
	}

	@Column(name = "ICAM_MRGN_RT_AMT")
	public Double getIcamMrgnRtAmt() {
		return this.icamMrgnRtAmt;
	}

	public void setIcamMrgnRtAmt(Double icamMrgnRtAmt) {
		this.icamMrgnRtAmt = icamMrgnRtAmt;
	}

	@Column(name = "MARGIN_REVIEW_FLAG")
	public String getMarginReviewFlag() {
		return this.marginReviewFlag;
	}

	public void setMarginReviewFlag(String marginReviewFlag) {
		this.marginReviewFlag = marginReviewFlag;
	}

	@Column(name = "CS_LINE_TYPE")
	public String getCsLineType() {
		return this.csLineType;
	}

	public void setCsLineType(String csLineType) {
		this.csLineType = csLineType;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "GL_COST_DATE")
	public Date getGlCostDate() {
		// if(this.getGlCostDate()!=null){
		// return new Date(this.glCostDate.getTime());
		// }else{
		// return null;
		// }
		return glCostDate;
	}

	public void setGlCostDate(Date glCostDate) {
		this.glCostDate = glCostDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "GL_SALES_DATE")
	public Date getGlSalesDate() {
		// if(this.getGlSalesDate()!=null){
		// return new Date(this.glSalesDate.getTime());
		// }else{
		// return null;
		// }
		return glSalesDate;
	}

	public void setGlSalesDate(Date glSalesDate) {
		this.glSalesDate = glSalesDate;
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
		// if(this.getOfsEventStartDate()!=null)
		// return new Date(this.ofsEventStartDate.getTime());
		// else
		// return null;
		return ofsEventStartDate;
	}

	public void setOfsEventStartDate(Date ofsEventStartDate) {
		this.ofsEventStartDate = ofsEventStartDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "OFS_EVENT_END_DATE")
	public Date getOfsEventEndDate() {
		// if(this.getOfsEventEndDate()!=null)
		// return new Date(this.ofsEventEndDate.getTime());
		// else
		// return null;
		return ofsEventEndDate;
	}

	public void setOfsEventEndDate(Date ofsEventEndDate) {
		this.ofsEventEndDate = ofsEventEndDate;
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

	@Column(name = "LINE_COMMENT")
	public String getLineComment() {
		return this.lineComment;
	}

	public void setLineComment(String lineComment) {
		this.lineComment = lineComment;
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

	@Column(name = "OFS_EVENT_DESC")
	public String getOfsEventDesc() {
		return this.ofsEventDesc;
	}

	public void setOfsEventDesc(String ofsEventDesc) {
		this.ofsEventDesc = ofsEventDesc;
	}

	@Column(name = "PA_EXPNDTR_TYPE")
	public String getPaExpndtrType() {
		return this.paExpndtrType;
	}

	public void setPaExpndtrType(String paExpndtrType) {
		this.paExpndtrType = paExpndtrType;
	}

	@Column(name = "PART_NUMBER")
	public String getPartNumber() {
		return this.partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	@Column(name = "PO_DESCRIPTION")
	public String getPoDescription() {
		return this.poDescription;
	}

	public void setPoDescription(String poDescription) {
		this.poDescription = poDescription;
	}

	@Column(name = "PO_NUMBER")
	public String getPoNumber() {
		return this.poNumber;
	}

	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}

	@Column(name = "SERVICES_CM", scale = 0)
	public BigDecimal getServicesCm() {
		return this.servicesCm;
	}

	public void setServicesCm(BigDecimal servicesCm) {
		this.servicesCm = servicesCm;
	}

	@Column(name = "SRC_CODE")
	public String getSrcCode() {
		return this.srcCode;
	}

	public void setSrcCode(String srcCode) {
		this.srcCode = srcCode;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SOURCE_DATE_CREATED")
	public Date getSourceDateCreated() {
		// if(this.getSourceDateCreated()!=null)
		// return new Date(this.getSourceDateCreated().getTime());
		// else
		// return null;
		return sourceDateCreated;
	}

	public void setSourceDateCreated(Date sourceDateCreated) {
		this.sourceDateCreated = sourceDateCreated;
	}

	@Column(name = "SUPPLIER_NAME")
	public String getSupplierName() {
		return this.supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	@Column(name = "AMOUNT", scale = 0)
	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Column(name = "BASE_INVOICE_AMOUNT", scale = 0)
	public BigDecimal getBaseInvoiceAmount() {
		return this.baseInvoiceAmount;
	}

	public void setBaseInvoiceAmount(BigDecimal baseInvoiceAmount) {
		this.baseInvoiceAmount = baseInvoiceAmount;
	}

	@Column(name = "INVOICE_AMOUNT", scale = 0)
	public BigDecimal getInvoiceAmount() {
		return this.invoiceAmount;
	}

	public void setInvoiceAmount(BigDecimal invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "INVOICE_DATE")
	public Date getInvoiceDate() {
		// if(this.getInvoiceDate()!=null)
		// return new Date(this.invoiceDate.getTime());
		// else
		// return null;
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	@Column(name = "INVOICE_NUMBER")
	public String getInvoiceNumber() {
		return this.invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	@Column(name = "LINE_NUMBER")
	public String getLineNumber() {
		return this.lineNumber;
	}

	public void setLineNumber(String lineNumber) {
		this.lineNumber = lineNumber;
	}

	@Column(name = "TASK_NAME")
	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	@Column(name = "CONTRACT_NUMBER")
	public String getContractNumber() {
		return this.contractNumber;
	}

	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}

	@Column(name = "ICAM_CONTRACT_CM")
	public String getIcamContractCm() {
		return this.icamContractCm;
	}

	public void setIcamContractCm(String icamContractCm) {
		this.icamContractCm = icamContractCm;
	}

	@Column(name = "ORIG_EXPNDTR_CTGRY")
	public String getOrigExpndtrCtgry() {
		return this.origExpndtrCtgry;
	}

	public void setOrigExpndtrCtgry(String origExpndtrCtgry) {
		this.origExpndtrCtgry = origExpndtrCtgry;
	}

	@Column(name = "SUPPLIER_INVOICE_NUM")
	public String getSupplierInvoiceNum() {
		return this.supplierInvoiceNum;
	}

	public void setSupplierInvoiceNum(String supplierInvoiceNum) {
		this.supplierInvoiceNum = supplierInvoiceNum;
	}

	@Column(name = "SALE_TAX")
	public String getSaleTax() {
		return this.saleTax;
	}

	public void setSaleTax(String saleTax) {
		this.saleTax = saleTax;
	}

	@Column(name = "FALL_OUT_IND", nullable = false)
	public String getFallOutInd() {
		return fallOutInd;
	}

	public void setFallOutInd(String fallOutInd) {
		this.fallOutInd = fallOutInd;
	}

	@Column(name = "CPM_COMMENT")
	public String getCpmComment() {
		return this.cpmComment;
	}

	public void setCpmComment(String cpmComment) {
		this.cpmComment = cpmComment;
	}

	@Column(name = "FINANCE_COMMENT")
	public String getFinanceComment() {
		return this.financeComment;
	}

	public void setFinanceComment(String financeComment) {
		this.financeComment = financeComment;
	}

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "CNFM.CNFM_TRAN_CMNT", joinColumns = { @JoinColumn(name = "TRAN_ID") }, inverseJoinColumns = { @JoinColumn(name = "CMNTS_TYPE_ID") })
	public Set<CmntType> getCmntTypes() {
		return cmntTypes;
	}

	public void setCmntTypes(Set<CmntType> cmntTypes) {
		this.cmntTypes = cmntTypes;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EXTWRK_BUS_RSN_ID")
	public EwWrkBusrsn getEwWrkBusrsn() {
		return ewWrkBusrsn;
	}

	@ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY, mappedBy = "tranDtls")
	public Set<ActnItm> getActnItms() {
		return actnItms;
	}

	@ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY, mappedBy = "tranDtls")
	public Set<OpnItm> getOpnItms() {
		return opnItms;
	}

	public void setEwWrkBusrsn(EwWrkBusrsn ewWrkBusrsn) {
		this.ewWrkBusrsn = ewWrkBusrsn;
	}

	public void setOpnItms(Set<OpnItm> opnItms) {
		this.opnItms = opnItms;
	}

	public void setActnItms(Set<ActnItm> actnItms) {
		this.actnItms = actnItms;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FEE_TYPE_ID")
	public FeeType getFeeType() {
		return feeType;
	}

	public void setFeeType(FeeType feeType) {
		this.feeType = feeType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SUB_FEE_TYPE_ID")
	public SubFeeType getSubFeeType() {
		return subFeeType;
	}

	public void setSubFeeType(SubFeeType subFeeType) {
		this.subFeeType = subFeeType;
	}

	@Column(name = "OPN_ITM_EXIST_FLG")
	public String getOpnItmExistFlg() {
		return this.opnItmExistFlg;
	}

	public void setOpnItmExistFlg(String opnItmExistFlg) {
		this.opnItmExistFlg = opnItmExistFlg;
	}

	@Column(name = "ACT_ITM_EXIST_FLG")
	public String getActItmExistFlg() {
		return this.actItmExistFlg;
	}

	public void setActItmExistFlg(String actItmExistFlg) {
		this.actItmExistFlg = actItmExistFlg;
	}

	@Column(name = "ESCALATION", scale = 0)
	public BigDecimal getEscalation() {
		return this.escalation;
	}

	public void setEscalation(BigDecimal escalation) {
		this.escalation = escalation;
	}

	@Column(name = "HIST_ERP_FLG")
	public String getHistErpFlg() {
		return this.histErpFlg;
	}

	public void setHistErpFlg(String histErpFlg) {
		this.histErpFlg = histErpFlg;
	}

	@Column(name = "OUT_IN_IND")
	public String getOutInInd() {
		return this.outInInd;
	}

	public void setOutInInd(String outInInd) {
		this.outInInd = outInInd;
	}

	@Column(name = "IS_LOCKED", length = 1)
	public String getIsLocked() {
		return this.isLocked;
	}

	public void setIsLocked(String isLocked) {
		this.isLocked = isLocked;
	}

	@Column(name = "RISK_ANALYST_COMMENT", length = 200)
	public String getRiskAnalystComment() {
		return this.riskAnalystComment;
	}

	public void setRiskAnalystComment(String riskAnalystComment) {
		this.riskAnalystComment = riskAnalystComment;
	}

	@Column(name = "REVIEW_COMPLETE", length = 1)
	public String getReviewComplete() {
		return this.reviewComplete;
	}

	public void setReviewComplete(String reviewComplete) {
		this.reviewComplete = reviewComplete;
	}

	@Column(name = "GL_SALES_QTR")
	public String getGlSalesQtr() {
		return glSalesQtr;
	}

	public void setGlSalesQtr(String glSalesQtr) {
		this.glSalesQtr = glSalesQtr;
	}

	@Column(name = "GL_COST_QTR")
	public String getGlCostQtr() {
		return glCostQtr;
	}

	public void setGlCostQtr(String glCostQtr) {
		this.glCostQtr = glCostQtr;
	}

}