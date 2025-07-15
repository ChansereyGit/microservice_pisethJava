package org.example.account.controller;

import org.example.account.dto.CustomerDTO;
import org.example.account.entity.Customer;
import org.example.account.mapper.CustomerMapper;
import org.example.account.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @Autowired
    private CustomerMapper customerMapper;

    @PostMapping
    public ResponseEntity<Customer> save(@RequestBody CustomerDTO customerDTO) {
        Customer customer = customerMapper.toCustomer(customerDTO);
        customerService.save(customer);
        return ResponseEntity.ok(customer);
    }

    @GetMapping
    public ResponseEntity<?> getCustomers() {
        return ResponseEntity.ok(customerService.getCustomers());
    }

    @GetMapping("{customerId}")
    public ResponseEntity<?> getCustomers(@PathVariable Long customerId) {
        return ResponseEntity.ok(customerService.getById(customerId));
    }
}
