package com.pers.crm.service;

import java.util.List;

import com.pers.crm.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

}
