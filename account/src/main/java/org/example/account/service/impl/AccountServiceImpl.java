package org.example.account.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.account.entity.Account;
import org.example.account.entity.Customer;
import org.example.account.repository.AccountRepository;
import org.example.account.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    @Override
    public Account save(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public List<Account> getAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public Account getById(Long customerId) {
        return accountRepository
                .findById(customerId)
                .orElseThrow(() -> new RuntimeException("Account not found"));
    }
}
