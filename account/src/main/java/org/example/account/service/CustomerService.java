package org.example.account.service;

import org.example.account.entity.Customer;

import java.util.List;

public interface CustomerService {
    Customer save(Customer customer);

    List<Customer> getCustomers();

    Customer getById(Long customerId);
}
