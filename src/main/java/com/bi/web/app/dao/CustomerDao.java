package com.bi.web.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bi.web.app.customer.model.Model;

@Repository
public interface CustomerDao extends JpaRepository<Model, Integer>{
	
	public Model findModelByEmail(String email);
	
	public Model findCustomerById(int id);
	
	public List<Model> existsModelById(int id);
	
}
