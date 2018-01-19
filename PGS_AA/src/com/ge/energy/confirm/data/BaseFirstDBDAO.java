/**
 * Copyright (C) 2011 General Electric Company
 * All rights reserved
 */
package com.ge.energy.confirm.data;

/**
 * Spring Base DAO
 *
 */
public class BaseFirstDBDAO {
	
	DataHibernateTemplate hibernateTemplate;

	public DataHibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(DataHibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	
}
