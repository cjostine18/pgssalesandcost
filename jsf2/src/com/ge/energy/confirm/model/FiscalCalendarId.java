/**
 * Project:      PGS - AA
 * Component:    
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

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * FiscalCalendarId entity.
 */
@Embeddable
public class FiscalCalendarId implements java.io.Serializable {

	/**
	 * serialVersionUID long
	 */
	private static final long serialVersionUID = 1L;
	private Date caldate;
	private Date fiscdate;
	private String fisccen;
	private String fiscyr;
	private String fisccenYr;
	private String fiscqtr;
	private String fiscmo;
	private String fiscwk;
	private String fiscday;
	private String dayOfWeek;
	private Date qtrEndFiscdate;
	private Date nextQtrEndFiscdate;

	/** default constructor */
	public FiscalCalendarId() {
	}

	/** full constructor */
	public FiscalCalendarId(Date caldate, Date fiscdate, String fisccen,
			String fiscyr, String fisccenYr, String fiscqtr, String fiscmo,
			String fiscwk, String fiscday, String dayOfWeek,
			Date qtrEndFiscdate, Date nextQtrEndFiscdate) {
		this.caldate = caldate;
		this.fiscdate = fiscdate;
		this.fisccen = fisccen;
		this.fiscyr = fiscyr;
		this.fisccenYr = fisccenYr;
		this.fiscqtr = fiscqtr;
		this.fiscmo = fiscmo;
		this.fiscwk = fiscwk;
		this.fiscday = fiscday;
		this.dayOfWeek = dayOfWeek;
		this.qtrEndFiscdate = qtrEndFiscdate;
		this.nextQtrEndFiscdate = nextQtrEndFiscdate;
	}

	@Column(name = "CALDATE", nullable = false, length = 7)
	public Date getCaldate() {
		return this.caldate;
	}

	public void setCaldate(Date caldate) {
		this.caldate = caldate;
	}

	@Column(name = "FISCDATE", nullable = false, length = 7)
	public Date getFiscdate() {
		return this.fiscdate;
	}

	public void setFiscdate(Date fiscdate) {
		this.fiscdate = fiscdate;
	}

	@Column(name = "FISCCEN", nullable = false, length = 2)
	public String getFisccen() {
		return this.fisccen;
	}

	public void setFisccen(String fisccen) {
		this.fisccen = fisccen;
	}

	@Column(name = "FISCYR", nullable = false, length = 2)
	public String getFiscyr() {
		return this.fiscyr;
	}

	public void setFiscyr(String fiscyr) {
		this.fiscyr = fiscyr;
	}

	@Column(name = "FISCCEN_YR", nullable = false, length = 4)
	public String getFisccenYr() {
		return this.fisccenYr;
	}

	public void setFisccenYr(String fisccenYr) {
		this.fisccenYr = fisccenYr;
	}

	@Column(name = "FISCQTR", nullable = false, length = 1)
	public String getFiscqtr() {
		return this.fiscqtr;
	}

	public void setFiscqtr(String fiscqtr) {
		this.fiscqtr = fiscqtr;
	}

	@Column(name = "FISCMO", nullable = false, length = 2)
	public String getFiscmo() {
		return this.fiscmo;
	}

	public void setFiscmo(String fiscmo) {
		this.fiscmo = fiscmo;
	}

	@Column(name = "FISCWK", nullable = false, length = 2)
	public String getFiscwk() {
		return this.fiscwk;
	}

	public void setFiscwk(String fiscwk) {
		this.fiscwk = fiscwk;
	}

	@Column(name = "FISCDAY", nullable = false, length = 2)
	public String getFiscday() {
		return this.fiscday;
	}

	public void setFiscday(String fiscday) {
		this.fiscday = fiscday;
	}

	@Column(name = "DAY_OF_WEEK", nullable = false, length = 1)
	public String getDayOfWeek() {
		return this.dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	@Column(name = "QTR_END_FISCDATE", nullable = false, length = 7)
	public Date getQtrEndFiscdate() {
		return this.qtrEndFiscdate;
	}

	public void setQtrEndFiscdate(Date qtrEndFiscdate) {
		this.qtrEndFiscdate = qtrEndFiscdate;
	}

	@Column(name = "NEXT_QTR_END_FISCDATE", nullable = false, length = 7)
	public Date getNextQtrEndFiscdate() {
		return this.nextQtrEndFiscdate;
	}

	public void setNextQtrEndFiscdate(Date nextQtrEndFiscdate) {
		this.nextQtrEndFiscdate = nextQtrEndFiscdate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof FiscalCalendarId))
			return false;
		FiscalCalendarId castOther = (FiscalCalendarId) other;

		return ((this.getCaldate() == castOther.getCaldate()) || (this
				.getCaldate() != null && castOther.getCaldate() != null))
				&& ((this.getFiscdate() == castOther.getFiscdate()) || (this
						.getFiscdate() != null && castOther.getFiscdate() != null))
				&& ((this.getFisccen() != null
						&& castOther.getFisccen() != null && this.getFisccen()
						.equals(castOther.getFisccen())))
				&& ((this.getFiscyr() != null && castOther.getFiscyr() != null && this
						.getFiscyr().equals(castOther.getFiscyr())))
				&& ((this.getFisccenYr() != null
						&& castOther.getFisccenYr() != null && this
						.getFisccenYr().equals(castOther.getFisccenYr())))
				&& ((this.getFiscqtr() != null
						&& castOther.getFiscqtr() != null && this.getFiscqtr()
						.equals(castOther.getFiscqtr())))
				&& ((this.getFiscmo() != null && castOther.getFiscmo() != null && this
						.getFiscmo().equals(castOther.getFiscmo())))
				&& ((this.getFiscwk() != null && castOther.getFiscwk() != null && this
						.getFiscwk().equals(castOther.getFiscwk())))
				&& ((this.getFiscday() != null
						&& castOther.getFiscday() != null && this.getFiscday()
						.equals(castOther.getFiscday())))
				&& ((this.getDayOfWeek() != null
						&& castOther.getDayOfWeek() != null && this
						.getDayOfWeek().equals(castOther.getDayOfWeek())))
				&& ((this.getQtrEndFiscdate() == castOther.getQtrEndFiscdate()) || (this
						.getQtrEndFiscdate() != null && castOther
						.getQtrEndFiscdate() != null))
				&& ((this.getNextQtrEndFiscdate() == castOther
						.getNextQtrEndFiscdate()) || (this
						.getNextQtrEndFiscdate() != null && castOther
						.getNextQtrEndFiscdate() != null));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCaldate() == null ? 0 : this.getCaldate().hashCode());
		result = 37 * result
				+ (getFiscdate() == null ? 0 : this.getFiscdate().hashCode());
		result = 37 * result
				+ (getFisccen() == null ? 0 : this.getFisccen().hashCode());
		result = 37 * result
				+ (getFiscyr() == null ? 0 : this.getFiscyr().hashCode());
		result = 37 * result
				+ (getFisccenYr() == null ? 0 : this.getFisccenYr().hashCode());
		result = 37 * result
				+ (getFiscqtr() == null ? 0 : this.getFiscqtr().hashCode());
		result = 37 * result
				+ (getFiscmo() == null ? 0 : this.getFiscmo().hashCode());
		result = 37 * result
				+ (getFiscwk() == null ? 0 : this.getFiscwk().hashCode());
		result = 37 * result
				+ (getFiscday() == null ? 0 : this.getFiscday().hashCode());
		result = 37 * result
				+ (getDayOfWeek() == null ? 0 : this.getDayOfWeek().hashCode());
		result = 37
				* result
				+ (getQtrEndFiscdate() == null ? 0 : this.getQtrEndFiscdate()
						.hashCode());
		result = 37
				* result
				+ (getNextQtrEndFiscdate() == null ? 0 : this
						.getNextQtrEndFiscdate().hashCode());
		return result;
	}

}