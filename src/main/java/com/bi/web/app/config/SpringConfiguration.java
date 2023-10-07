package com.bi.web.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bi.web.app.service.CustomerService;
import com.bi.web.app.serviceImpl.CustomerServiceImpl;

@Configuration
public class SpringConfiguration {

	@Bean
	public CustomerService customerService() {
		return new CustomerServiceImpl();
	}
}
