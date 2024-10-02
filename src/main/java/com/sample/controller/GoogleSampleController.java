package com.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoogleSampleController {

	@GetMapping("/welcome")
	public String welcomeMessage(@RequestParam("name") String name) {
		return "Hello "+name +"!" + " Welcome to the Family";
	}
}
