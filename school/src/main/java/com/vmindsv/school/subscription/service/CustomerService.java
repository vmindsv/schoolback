package com.vmindsv.school.subscription.service;

import com.vmindsv.school.subscription.model.Customer;

import java.util.List;

public interface CustomerService {
	List<Customer> getCustomers();

    boolean deleteCustomer(Long id);

    boolean saveCustomer(Customer customer);
}
