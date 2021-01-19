package com.rds.individeo.initial;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rds.individeo.entity.CustomerData;
import com.rds.individeo.repository.CustomerDataRepository;

@Component
public class CustomerDataInitial {

	@Autowired
	private CustomerDataRepository customerDataRepository;

	@PostConstruct
	public void init() {

		CustomerData customer1 = new CustomerData();
		customer1.setUid("ZurPro8122221");
		customer1.setClient_type("P");
		customer1.setPolicy_holder_name("YANUAR HAMZAH");
		customer1.setLife_assured("YANUAR HAMZAH");
		customer1.setPolicy_number("1911111");
		init(customer1);

		CustomerData customer2 = new CustomerData();
		customer2.setUid("ZurPro8121212");
		customer2.setClient_type("P");
		customer2.setPolicy_holder_name("GIGIH SU GIGIH");
		customer2.setLife_assured("GIGIH SU GIGIH");
		customer2.setPolicy_number("1922222");
		init(customer2);
	}

	public void init(CustomerData customer) {
		customerDataRepository.save(customer);
	}

}
