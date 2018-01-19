package com.ge.energy.confirm.controller;

import java.util.List;

import javax.faces.event.ActionEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ge.energy.confirm.exception.CnfmException;
import com.ge.energy.confirm.model.FeeType;
import com.ge.energy.confirm.service.DataTableService;
import com.ge.energy.confirm.service.IDataTableService;

@Controller
public class DataTableBean {
	
	@Autowired
	private IDataTableService dataTableService;
	
	private List<FeeType> feeTypes;

	
	public void loadFeeTypes(ActionEvent event) throws CnfmException {
		System.out.println("dataTableService:" + dataTableService);
		feeTypes = dataTableService.loadFeeTypes();
		System.out.println(feeTypes.size());
	}

	public IDataTableService getDataTableService() {
		return dataTableService;
	}

	public void setDataTableService(IDataTableService dataTableService) {
		this.dataTableService = dataTableService;
	}

	public List<FeeType> getFeeTypes() {
		return feeTypes;
	}

	public void setFeeTypes(List<FeeType> feeTypes) {
		this.feeTypes = feeTypes;
	}

}
