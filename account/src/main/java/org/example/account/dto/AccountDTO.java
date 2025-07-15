package org.example.account.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class AccountDTO {
    private Long accountNumber;
    private Long customerId;
    private String accountType;
    private String branchAddress;
    private LocalDate createDate;
}
