package org.example.loan.service.impl;

import org.example.loan.entity.Loan;
import org.example.loan.repository.LoanRepository;
import org.example.loan.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanServiceImpl implements LoanService {

    @Autowired
    private LoanRepository loanRepository;

    @Override
    public Loan save(Loan loan) {
        return loanRepository.save(loan);
    }

    @Override
    public List<Loan> getList() {
        return loanRepository.findAll();
    }

//    @Override
//    public Loan getById(Long loanNumber) {
//        return null;
//    }
}
