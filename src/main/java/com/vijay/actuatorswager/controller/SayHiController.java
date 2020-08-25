package com.vijay.actuatorswager.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHiController {

	@RequestMapping("/sayHi")
	public String sayHi()
	{
		return "say hello";
	}
	
	@RequestMapping(value="/sayBi")
	public String sayBi()
	{
		return "sayBI";
	}
}
