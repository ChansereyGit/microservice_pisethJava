package org.example.account.controller;

import org.example.account.dto.AccountDTO;
import org.example.account.dto.CustomerDTO;
import org.example.account.entity.Account;
import org.example.account.entity.Customer;
import org.example.account.mapper.AccountMapper;
import org.example.account.mapper.CustomerMapper;
import org.example.account.service.AccountService;
import org.example.account.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;
    @Autowired
    private AccountMapper accountMapper;

    @PostMapping
    public ResponseEntity<Account> save(@RequestBody AccountDTO accountDTO) {
        Account account = accountMapper.toAccount(accountDTO);
        accountService.save(account);
        return ResponseEntity.ok(account);
    }

    @GetMapping
    public ResponseEntity<?> getAccounts() {
        return ResponseEntity.ok(accountService.getAccounts());
    }

    @GetMapping("{accountId}")
    public ResponseEntity<?> getAccount(@PathVariable Long accountId) {
        return ResponseEntity.ok(accountService.getById(accountId));
    }
}
