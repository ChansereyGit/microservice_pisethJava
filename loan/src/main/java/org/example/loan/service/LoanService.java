package org.example.loan.service;

import org.example.loan.entity.Loan;

import java.util.List;

public interface LoanService {
    Loan save(Loan loan);
    List<Loan> getList();

//    Loan getById(Long loanNumber);
}
