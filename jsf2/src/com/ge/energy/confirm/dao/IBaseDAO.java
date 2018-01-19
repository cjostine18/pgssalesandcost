/**
 * Project:      PGS - AA
 * Component:    IBaseDao.java
 * Date-Written: Jul 10, 2012 5:19:38 PM
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

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.ge.energy.confirm.exception.TechnicalExectpion;

/**
 * @author Zhengjiang Chu(520704)
 * @version 1.0
 */
public interface IBaseDAO {
	/**
	 * <p>
	 * Title: save
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param entity
	 * 
	 * @throws TechnicalExectpion
	 * 
	 * @see com.ge.energy.confirm.dao.IBaseDAO#save(java.lang.Object)
	 */
	public void save(Object entity) throws TechnicalExectpion;

	/**
	 * <p>
	 * Title: delete
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param entity
	 * 
	 * @throws TechnicalExectpion
	 * 
	 * @see com.ge.energy.confirm.dao.IBaseDAO#delete(java.lang.Object)
	 */
	public void delete(Object entity) throws TechnicalExectpion;

	/**
	 * 
	 * <p>
	 * Title: deleteByProperty
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param entity
	 * @param propertyName
	 * @param value
	 * @return
	 * @throws TechnicalExectpion
	 * @return int
	 */
	public int deleteByProperty(Object entity, String propertyName, Object value)
			throws TechnicalExectpion;

	/**
	 * <p>
	 * Title: update
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param entity
	 * 
	 * @throws TechnicalExectpion
	 * 
	 * @see com.ge.energy.confirm.dao.IBaseDAO#update(java.lang.Object)
	 */
	public void update(Object entity) throws TechnicalExectpion;

	/**
	 * <p>
	 * Title: saveOrUpdate
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param entity
	 * 
	 * @throws TechnicalExectpion
	 * 
	 * @see com.ge.energy.confirm.dao.IBaseDAO#saveOrUpdate(java.lang.Object)
	 */
	public void saveOrUpdate(Object entity) throws TechnicalExectpion;

	/**
	 * <p>
	 * Title: findByEntity
	 * </p>
	 * <p>
	 * Description:Get all data by entity.
	 * </p>
	 * 
	 * @param Entity
	 * 
	 * @return java.util.List
	 * 
	 * @throws TechnicalExectpion
	 * 
	 * @see com.ge.energy.confirm.dao.IBaseDAO#findByEntity(java.lang.Object)
	 */
	public List<?> findByEntity(Object entiey) throws TechnicalExectpion;

	/**
	 * <p>
	 * Title: findByEntityOrderBy
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param entity
	 * @param propertyName
	 * @param value
	 * @param orderBy
	 * 
	 * @param descasc
	 * 
	 * @return
	 * 
	 * @throws TechnicalExectpion
	 * 
	 * @see com.ge.energy.confirm.dao.IBaseDAO#findByEntityOrderBy(java.lang.Object,
	 *      java.lang.String,java.lang.Object,java.lang.String,
	 *      java.lang.String)
	 */
	public List<?> findByEntityOrderBy(Object entiey, String propertyName,
			Object value, String orderBy, String descasc)
			throws TechnicalExectpion;

	/**
	 * <p>
	 * Title: findByProperty
	 * </p>
	 * <p>
	 * Description:Get data by property.
	 * </p>
	 * 
	 * @param propertyName
	 * 
	 * @param value
	 * 
	 * @return
	 * 
	 * @throws TechnicalExectpion
	 * 
	 * @see com.ge.energy.confirm.dao.IBaseDAO#findByProperty(java.lang.String,
	 *      java.lang.Object)
	 */
	public List<?> findByProperty(Object entity, String propertyName,
			Object value) throws TechnicalExectpion;

	/**
	 * 
	 * <p>
	 * Title: findByProperty
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param entity
	 * @param propertyName
	 * @param value
	 * @param notation
	 * @throws TechnicalExectpion
	 * @return List<?>
	 */
	public List<?> findByProperty(Object entity, String propertyName,
			Object value, String notation) throws TechnicalExectpion;

	/**
	 * <p>
	 * Title: findById
	 * </p>
	 * <p>
	 * o Description:
	 * </p>
	 * 
	 * @param entityId
	 * 
	 * @return
	 * 
	 * @throws TechnicalExectpion
	 * 
	 * @see com.ge.energy.confirm.dao.IBaseDao#findById(java.io.Serializable)
	 */
	public Object findById(Object entity, long entityId)
			throws TechnicalExectpion;

	/**
	 * @param entity
	 * @param fields
	 * @param wheres
	 * @return List<Object>
	 * @throws TechnicalExectpion
	 */
	public List<Object> findProperty(Object entity, String[] fields,
			Map<String, Object> wheres) throws TechnicalExectpion;

	/**
	 * 
	 * @param entity
	 * @param tranId
	 * @return
	 * @throws TechnicalExectpion
	 */
	Object findEByBigDelId(Object entity, BigDecimal tranId)
			throws TechnicalExectpion;

}
