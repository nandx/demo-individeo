package com.rds.individeo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rds.individeo.common.CommonUtils;
import com.rds.individeo.entity.CustomerData;
import com.rds.individeo.repository.CustomerDataRepository;

@Service
public class CustomerDataService {

	@Autowired
	private CustomerDataRepository customerDataRepository;

	public CustomerData getCustomerData(String uid) {
		if (CommonUtils.isNotEmpty(uid))
			return customerDataRepository.findByUid(uid);
		return null;
	}

}
