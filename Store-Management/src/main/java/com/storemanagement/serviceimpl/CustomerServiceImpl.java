package com.storemanagement.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.storemanagement.entity.Customer;
import com.storemanagement.repository.CustomerRepository;
import com.storemanagement.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerRepository cr;

	@Override
	public Customer saveCust(Customer customer) {
		
		return cr.save(customer);
	}

	@Override
	public List<Customer> getAllCust() {
		
		return cr.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Customer getCustById(long id) {
		
		return cr.getById(id);
	}

	@Override
	public Customer updateCustById(Customer customer, long id) {
		
		@SuppressWarnings("deprecation")
		Customer existuser = cr.getById(id);
		
		//set new value
		existuser.setCustomer_name(customer.getCustomer_name());
		existuser.setCustomer_contactNo(customer.getCustomer_contactNo());
		cr.save(existuser);
		return existuser;
		
	}

	@SuppressWarnings("deprecation")
	@Override
	public void deleteCustById(long id) {
		cr.getById(id);
		cr.deleteById(id);
		
	}

	@Override
	public List<Customer> getCustByName(String customer_name) {
		
		return cr.getCustByName(customer_name);
	}

	@Override
	public Customer getCustByPhone(long customer_contactNo) {
	
		return cr.getCustByPhone(customer_contactNo);
	}



}
