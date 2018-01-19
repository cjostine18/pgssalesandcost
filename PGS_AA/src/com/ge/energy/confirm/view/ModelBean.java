package com.ge.energy.confirm.view;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ModelBean {
	private static final Log LOGGER = LogFactory.getLog(ModelBean.class);
	public String mainPage(){
		LOGGER.info("In the mainPage method of ModelBean.");

		return "main";
	}

}
