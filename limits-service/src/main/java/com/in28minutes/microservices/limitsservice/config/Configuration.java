package com.in28minutes.microservices.limitsservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("limits.service")
public class Configuration {
	private int max;
	private int min;
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	
}
