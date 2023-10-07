package com.bi.web.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bi.web.app.customer.model.Model;
import com.bi.web.app.service.CustomerService;

@RestController
@RequestMapping("/v1")
public class Controller {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/save")  // http//:localhost:9999/v1/save
	public String saveCustomer(@RequestBody Model mdl) {
		customerService.saveCustomerDetails(mdl);
		return "Customer added";
	}
}
