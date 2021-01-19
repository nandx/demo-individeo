package com.rds.individeo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rds.individeo.entity.CustomerData;

@Repository
public interface CustomerDataRepository extends JpaRepository<CustomerData, String> {

	public CustomerData findByUid(String uid);

}
