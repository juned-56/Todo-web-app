package com.bi.web.app.service;

import java.util.List;

import com.bi.web.app.customer.model.Model;

public interface CustomerService {
	
	public Model update(Model mdl);
	
	public void deleteCustomer(int id);
	
	public Model getCustomerDetail(int id);
	
	public List<Model> getCustomerDetails();
	
	public Model findModelById(int id);

	String saveCustomerDetails(Model mdl);
}
