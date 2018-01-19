package com.ge.energy.confirm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ge.energy.confirm.exception.CnfmException;
import com.ge.energy.confirm.model.FeeType;


public interface IDataTableService {
	List<FeeType> loadFeeTypes() throws CnfmException;
}
