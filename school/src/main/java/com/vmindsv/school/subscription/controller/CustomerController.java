package com.vmindsv.school.subscription.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.vmindsv.school.subscription.model.Customer;
import com.vmindsv.school.subscription.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

  
    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    
    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public boolean saveCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }

  
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public boolean deleteCustomer(@PathVariable Long id) {
        return customerService.deleteCustomer(id);
    }
}
