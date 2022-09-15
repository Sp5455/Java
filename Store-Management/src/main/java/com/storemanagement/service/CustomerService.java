package com.storemanagement.service;

import java.util.List;

import com.storemanagement.entity.Customer;

//user service interface
public interface CustomerService {
	
	// inserting user details in table 
		Customer saveCust(Customer customer);
		
		// fetching all user details from table
		List<Customer> getAllCust();
		
		//fetching user details from table based on user id
		Customer getCustById(long id);
		
		//modifying user details from table based on user id
		Customer updateCustById(Customer customer, long id);
		
		// remove user details from table based on user id
		void deleteCustById(long id);
		
		//fetching user details based on user name
		List<Customer> getCustByName(String customer_name); 
		
		//fetching user details based on user phone
		Customer getCustByPhone(long customer_contactNo); 


}
