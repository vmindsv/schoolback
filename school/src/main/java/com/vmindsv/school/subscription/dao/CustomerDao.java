package com.vmindsv.school.subscription.dao;

import com.vmindsv.school.subscription.model.Customer;

import java.util.List;

public interface CustomerDao {
    List<Customer> getCustomers();

    boolean deleteCustomer(Long id);

    boolean saveCustomer(Customer customer);
}
