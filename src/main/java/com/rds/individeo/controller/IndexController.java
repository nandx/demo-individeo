package com.rds.individeo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.rds.individeo.entity.CustomerData;
import com.rds.individeo.service.CustomerDataService;

@Controller
public class IndexController {

	@Autowired
	private CustomerDataService customerDataService;

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/video/{uid}")
	public String uid(@PathVariable("uid") String uid, Model model) {
		CustomerData data = customerDataService.getCustomerData(uid);
		if (data == null)
			return "index";

		model.addAttribute("data", data);
		return "video";
	}

}
