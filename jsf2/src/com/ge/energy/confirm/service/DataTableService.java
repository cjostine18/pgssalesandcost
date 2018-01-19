package com.ge.energy.confirm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ge.energy.confirm.dao.IFeeTypeDAO;
import com.ge.energy.confirm.exception.CnfmException;
import com.ge.energy.confirm.model.FeeType;

@Service("dataTableService")
public class DataTableService implements IDataTableService {
	@Autowired
	private IFeeTypeDAO feeTypeDAO;

	@Override
	public List<FeeType> loadFeeTypes() throws CnfmException {
		System.out.println("feeTypeDAO: "+feeTypeDAO);
		return feeTypeDAO.findFeeTypeExceptNull();
	}

	public IFeeTypeDAO getFeeTypeDAO() {
		return feeTypeDAO;
	}

	public void setFeeTypeDAO(IFeeTypeDAO feeTypeDAO) {
		this.feeTypeDAO = feeTypeDAO;
	}

	public DataTableService(){
		System.out.println("dataTableService Initialized");
	}
}
