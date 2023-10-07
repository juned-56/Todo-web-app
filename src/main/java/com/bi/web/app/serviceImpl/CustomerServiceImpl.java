package com.bi.web.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bi.web.app.customer.model.Model;
import com.bi.web.app.dao.CustomerDao;
import com.bi.web.app.service.CustomerService;

import jakarta.transaction.Transactional;

@Transactional
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerDao customerDao;
	

	@Override
	public String saveCustomerDetails(Model mdl) {
		Model ml = new Model();
		if(customerDao.existsById(ml.getId())) {
			return "This Customer is already Exists System couldn't add!!!!";
		}
		else {
			customerDao.save(mdl);
			return "Customer Added Successfully";
		}
	}

	@Override
	public Model update(Model mdl) {
		return null;
	}

	@Override
	public void deleteCustomer(int id) {
		
	}

	@Override
	public Model getCustomerDetail(int id) {
		return null;
	}

	@Override
	public List<Model> getCustomerDetails() {
		return null;
	}

	@Override
	public Model findModelById(int id) {
		return null;
	}

}
