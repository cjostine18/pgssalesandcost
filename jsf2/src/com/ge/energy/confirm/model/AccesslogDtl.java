package com.ge.energy.confirm.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * AccesslogDtl entity.
 */
@Entity
@Table(name = "CNFM_ACCESSLOG_DTL", schema = "CNFM")
@SequenceGenerator(name = "accessLog_dtl_seq", sequenceName = "Cnfm_AccessLog_dtl_seq", allocationSize = 1)
public class AccesslogDtl extends BaseEntity {

	private static final long serialVersionUID = 1L;
	private Long logId;
	private String ssoId;
	private String functionDesc;
	private Timestamp requestStartTime;
	private Timestamp requestEndTime;
	private String ip;
	private double timeTaken;

	public AccesslogDtl() {
	}

	public AccesslogDtl(Long logId) {
		this.logId = logId;
	}

	public AccesslogDtl(Long logId, String ssoId, String functionDesc,
			Timestamp requeststarttime, Timestamp requestendtime, String ip,
			double timeTaken) {
		this.logId = logId;
		this.ssoId = ssoId;
		this.functionDesc = functionDesc;
		this.requestStartTime = requeststarttime;
		this.requestEndTime = requestendtime;
		this.ip = ip;
		this.timeTaken = timeTaken;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "accessLog_dtl_seq")
	@Column(name = "LOG_ID", unique = true, nullable = false, precision = 22, scale = 0)
	public Long getLogId() {
		return this.logId;
	}

	public void setLogId(Long logId) {
		this.logId = logId;
	}

	@Column(name = "SSO_ID", length = 50)
	public String getSsoId() {
		return this.ssoId;
	}

	public void setSsoId(String ssoId) {
		this.ssoId = ssoId;
	}

	@Column(name = "FUNCTION_DESC", length = 200)
	public String getFunctionDesc() {
		return this.functionDesc;
	}

	public void setFunctionDesc(String functionDesc) {
		this.functionDesc = functionDesc;
	}

	@Column(name = "REQUEST_START_TIME", length = 11)
	public Timestamp getRequestStartTime() {
		return this.requestStartTime;
	}

	public void setRequestStartTime(Timestamp requestStartTime) {
		this.requestStartTime = requestStartTime;
	}

	@Column(name = "REQUEST_END_TIME", length = 11)
	public Timestamp getRequestEndTime() {
		return this.requestEndTime;
	}

	public void setRequestEndTime(Timestamp requestEndTime) {
		this.requestEndTime = requestEndTime;
	}

	@Column(name = "IP", length = 20)
	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Column(name = "TIME_TAKEN", precision = 10, scale = 4)
	public double getTimeTaken() {
		return this.timeTaken;
	}

	public void setTimeTaken(double timeTaken) {
		this.timeTaken = timeTaken;
	}

}