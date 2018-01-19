/**
 * Project:      PGS - AA
 * Component:    FiscalCalendar.java
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

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * CnfmFiscalCalendar entity.
 */
@Entity
@Table(name = "CNFM_FISCAL_CALENDAR", schema = "CNFM")
public class FiscalCalendar extends BaseEntity {

	/**
	 * serialVersionUID long
	 */
	private static final long serialVersionUID = -2077754627907213097L;
	private FiscalCalendarId id;

	/** default constructor */
	public FiscalCalendar() {
	}

	/** full constructor */
	public FiscalCalendar(FiscalCalendarId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "caldate", column = @Column(name = "CALDATE", nullable = false, length = 7)),
			@AttributeOverride(name = "fiscdate", column = @Column(name = "FISCDATE", nullable = false, length = 7)),
			@AttributeOverride(name = "fisccen", column = @Column(name = "FISCCEN", nullable = false, length = 2)),
			@AttributeOverride(name = "fiscyr", column = @Column(name = "FISCYR", nullable = false, length = 2)),
			@AttributeOverride(name = "fisccenYr", column = @Column(name = "FISCCEN_YR", nullable = false, length = 4)),
			@AttributeOverride(name = "fiscqtr", column = @Column(name = "FISCQTR", nullable = false, length = 1)),
			@AttributeOverride(name = "fiscmo", column = @Column(name = "FISCMO", nullable = false, length = 2)),
			@AttributeOverride(name = "fiscwk", column = @Column(name = "FISCWK", nullable = false, length = 2)),
			@AttributeOverride(name = "fiscday", column = @Column(name = "FISCDAY", nullable = false, length = 2)),
			@AttributeOverride(name = "dayOfWeek", column = @Column(name = "DAY_OF_WEEK", nullable = false, length = 1)),
			@AttributeOverride(name = "qtrEndFiscdate", column = @Column(name = "QTR_END_FISCDATE", nullable = false, length = 7)),
			@AttributeOverride(name = "nextQtrEndFiscdate", column = @Column(name = "NEXT_QTR_END_FISCDATE", nullable = false, length = 7)) })
	public FiscalCalendarId getId() {
		return this.id;
	}

	public void setId(FiscalCalendarId id) {
		this.id = id;
	}

}