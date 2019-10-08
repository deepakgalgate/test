package com.in28minutes.microservices.limitsservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.limitsservice.bean.LimitConfig;

@RestController
public class LimitConfigController {

	@GetMapping("/limits")
	public LimitConfig retrieveLimitsFromConfig() {
		return new LimitConfig(100,1);
	}
	
}
