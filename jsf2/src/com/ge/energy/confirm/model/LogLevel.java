package com.ge.energy.confirm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * LogLevel entity..
 */
@Entity
@Table(name = "CNFM_LOG_LEVEL", schema = "CNFM")
public class LogLevel extends BaseEntity {

	/**
	 * serialVersionUID long
	 */
	private static final long serialVersionUID = 7448218464919033465L;

	private String islogenabled;

	/** default constructor */
	public LogLevel() {
	}

	/** full constructor */
	public LogLevel(String islogenabled) {
		this.islogenabled = islogenabled;
	}

	@Id
	@Column(name = "ISLOGENABLED", length = 10)
	public String getIslogenabled() {
		return this.islogenabled;
	}

	public void setIslogenabled(String islogenabled) {
		this.islogenabled = islogenabled;
	}

}