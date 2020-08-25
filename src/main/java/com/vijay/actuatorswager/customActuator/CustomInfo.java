package com.vijay.actuatorswager.customActuator;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.web.WebEndpointResponse;
import org.springframework.boot.actuate.endpoint.web.annotation.EndpointWebExtension;
import org.springframework.boot.actuate.info.InfoEndpoint;
import org.springframework.stereotype.Component;

@Component
@EndpointWebExtension(endpoint=InfoEndpoint.class)
public class CustomInfo {

	@Autowired
	private InfoEndpoint info2;
	@ReadOperation
	public WebEndpointResponse<Map> info()
	{
		Map<String,Object> info= new HashMap();
		info.put("name","vijay");
		info.put("timeStamp",System.currentTimeMillis());
		info.put("memory",Runtime.getRuntime().freeMemory());
		info.put("info",info2.info());
		return new WebEndpointResponse<>(info,200);
	}
}
