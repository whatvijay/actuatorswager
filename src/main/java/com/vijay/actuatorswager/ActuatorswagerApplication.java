package com.vijay.actuatorswager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrix
@EnableHystrixDashboard
public class ActuatorswagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActuatorswagerApplication.class, args);
	}

}
