package org.example.account.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.account.entity.Customer;
import org.example.account.repository.CustomerRepository;
import org.example.account.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getById(Long customerId) {
        return customerRepository
                .findById(customerId)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
    }
}
