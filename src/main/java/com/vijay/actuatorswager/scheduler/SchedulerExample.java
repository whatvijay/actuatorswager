package com.vijay.actuatorswager.scheduler;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@EnableScheduling
@Component
public class SchedulerExample {
	
	@Scheduled(fixedRate=1000)
	public void fixedRateMessages()
	{
		System.out.println("time now"+System.currentTimeMillis());
	}
	

}
