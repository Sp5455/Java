package com.storemanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.storemanagement.entity.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
	// fetching user details using user name
	@Query("select u from Customer u where u.customer_name=?1")
	List<Customer> getCustByName(String customer_name);
	
	//fetching user details using user phone
	@Query("select u from Customer u where u.customer_contactNo=?1")
	Customer getCustByPhone(long customer_contactNo);
}
