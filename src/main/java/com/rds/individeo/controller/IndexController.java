package com.rds.individeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

	@GetMapping("/")
	public String index() {
		return "index";
	}

//	@GetMapping("/video/{id}")
//	public String uid(@PathVariable("id") String id, Model model) {
//		model.addAttribute("nama", id);
//		return "index";
//	}

	@GetMapping("/video")
	public String uid(@RequestParam("uid") String uid, Model model) {
		System.out.println("uid ::: " + uid);
		// query to database

		
		//nama
		//no polis
		//premi
		// data dari database to html
		model.addAttribute("nama", "Nanda");
		return "index";
	}

}
