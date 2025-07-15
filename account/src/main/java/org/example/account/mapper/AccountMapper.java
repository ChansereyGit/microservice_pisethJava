package org.example.account.mapper;

import org.example.account.dto.AccountDTO;
import org.example.account.entity.Account;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class AccountMapper {

    public Account toAccount(AccountDTO dto) {
        Account account = new Account();
        account.setAccountNumber(dto.getAccountNumber());
        account.setAccountType(dto.getAccountType());
        account.setBranchAddress(dto.getBranchAddress());
        account.setCreateDate(dto.getCreateDate());
        //account.setCustomerId(dto.getCustomerId());
        return account;
    }
}
