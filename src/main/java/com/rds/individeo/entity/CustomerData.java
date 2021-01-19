package com.rds.individeo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name = "customerdata")
public class CustomerData {

	@Id
	@Column(name = "uid")
	private String uid;

	@Column(name = "client_type")
	private String client_type;

	@Column(name = "policy_holder_name")
	private String policy_holder_name;

	@Column(name = "life_assured")
	private String life_assured;

	@Column(name = "policy_holder_date_of_birth")
	@Temporal(TemporalType.DATE)
	private Date policy_holder_date_of_birth;

	@Column(name = "policy_holder_date_of_birth_life_assured")
	@Temporal(TemporalType.DATE)
	private Date policy_holder_date_of_birth_life_assured;

	@Column(name = "policy_number")
	private String policy_number;

	@Column(name = "code_frequency")
	private String code_frequency;

	@Column(name = "payment_frequency")
	private String payment_frequency;

	@Column(name = "code_payment_method")
	private String code_payment_method;

	@Column(name = "payment_method")
	private String payment_method;

	@Column(name = "agent_name")
	private String agent_name;

	@Column(name = "policy_holder_phone_number")
	private String policy_holder_phone_number;

	@Column(name = "email_policy_holder_name")
	private String email_policy_holder_name;

	@Column(name = "code_component_description")
	private String code_component_description;

	@Column(name = "component_description")
	private String component_description;

	@Column(name = "landing_page")
	private String landing_page;

	@Column(name = "created_date")
	@Temporal(TemporalType.DATE)
	private Date created_date;

}
