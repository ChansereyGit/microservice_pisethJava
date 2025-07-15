package org.example.account.service;

import org.example.account.entity.Account;
import org.example.account.entity.Customer;

import java.util.List;

public interface AccountService {
    Account save(Account account);

    List<Account> getAccounts();

    Account getById(Long accountId);
}
