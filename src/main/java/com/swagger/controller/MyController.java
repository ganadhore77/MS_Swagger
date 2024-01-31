package com.swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/getData")
	public String getData() {

		return "getData";
	}

	@PostMapping("/postData")
	public String postData() {

		return "postData";
	}
}
