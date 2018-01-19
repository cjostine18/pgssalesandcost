/**
 * Project:      PGS - AA
 * Component:    FeeTypeDAO.java
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

package com.ge.energy.confirm.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.ge.energy.common.dao.SqlSource;
import com.ge.energy.confirm.model.FeeType;

/**
 * @author Zhengjiang Chu(520704)
 * @version 1.0
 */
@Repository
@SqlSource("Query-sql.xml")
public class FeeTypeDAO extends BaseDAO implements IFeeTypeDAO {

	/**
	 * <p>
	 * Title: findFeeTypeExceptNull
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @return
	 * @see com.ge.energy.confirm.dao.IFeeTypeDAO#findFeeTypeExceptNull()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<FeeType> findFeeTypeExceptNull() {
		String queryString = getSql();
		Query fetchQuery = super.getHibernateTemplate().getSessionFactory()
				.getCurrentSession().createQuery(queryString);
		return fetchQuery.list();
	}

	/**
	 * <p>
	 * Title: findFeeTypeById
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param id
	 * @return
	 * @see com.ge.energy.confirm.dao.IFeeTypeDAO#findFeeTypeById(java.math.BigDecimal)
	 */
	@Override
	public FeeType findFeeTypeById(Long id) {
		String queryString = getSql();
		Query fetchQuery = super.getHibernateTemplate().getSessionFactory()
				.getCurrentSession().createQuery(queryString);
		fetchQuery.setParameter(0, id);
		return (FeeType) fetchQuery.uniqueResult();
	}

}
