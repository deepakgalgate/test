package com.in28minutes.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.limitsservice.bean.LimitConfig;
import com.in28minutes.microservices.limitsservice.config.Configuration;

/**
 * 
 * @author deepakgalgate
 *
 */
 

@RestController
public class LimitConfigController {
	@Autowired
	private Configuration config;
	@Value("${minimum}")
	private int min;
	
	@GetMapping("/limits")
	public LimitConfig retrieveLimitsFromConfig() {
		return new LimitConfig(config.getMax(),min);
	}
	
}
