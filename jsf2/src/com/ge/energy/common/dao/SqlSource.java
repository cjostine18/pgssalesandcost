/**
 * Project:      PGS - AA
 * Component:    SqlSource.java
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
package com.ge.energy.common.dao;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Defining an annotation 
 * @author 373903
 *
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SqlSource {
	String[] value() default "/sql.xml";
}
