package com.vijay.actuatorswager.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class HystrixTst {

	
	@RequestMapping("/hystrixEx")
	@HystrixCommand(fallbackMethod="hystrixFallBack",commandProperties= {@HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="1000")})
	public String hystrix()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "hystrix";
	}
	
	public String hystrixFallBack()
	{
		return "fallback is invoked";
	}
}
