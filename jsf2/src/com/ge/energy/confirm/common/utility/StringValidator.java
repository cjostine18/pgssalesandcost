/**
 * Project:      PGS - AA
 * Component:    NumberValidator.java
 * Date-Written: Oct 15, 2012
 * Security:     GE-Confidential
 * Restrictions: GE PROPRIETARY INFORMATION, FOR GE USE ONLY
 *
 *     ****************************************************
 *     *  Copyright (C) 2012 General Electric Company     *
 *     *           All rights reserved                    *
 *     ****************************************************
 *
 */
package com.ge.energy.confirm.common.utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * 
 * @author : 806101
 * 
 */
public class StringValidator implements Validator {
	private static final String STR_REGEX = "^[^\u4e00-\u9fa5]*$";

	/**
	 * Validate the number value
	 */
	@Override
	public void validate(FacesContext arg0, UIComponent arg1, Object value)
			throws ValidatorException {
		Pattern mask = null;
		mask = Pattern.compile(STR_REGEX);
		String strValue = (String) value;
		Matcher matcher = mask.matcher(strValue);
		if (!matcher.matches()) {
			FacesMessage message = new FacesMessage();
			message.setDetail("Value should be a String");
			message.setSummary("Value should be a String");
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(message);
		}
	}
}
