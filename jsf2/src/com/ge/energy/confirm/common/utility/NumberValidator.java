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
public class NumberValidator implements Validator {
	private static final String NUM_REGEX = "[-+]?[0-9]*\\.?[0-9]*";

	/**
	 * Validate the number value
	 */
	@Override
	public void validate(FacesContext arg0, UIComponent arg1, Object value)
			throws ValidatorException {
		Pattern mask = null;
		mask = Pattern.compile(NUM_REGEX);
		String numValue = String.valueOf(value);
		Matcher matcher = mask.matcher(numValue);
		if (!matcher.matches()) {
			FacesMessage message = new FacesMessage();
			message.setSummary("Value should be a number");
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(message);
		}
	}
}
