package org.example.loan.controller;

import org.example.loan.dto.LoanDTO;
import org.example.loan.entity.Loan;
import org.example.loan.mapper.LoanMapper;
import org.example.loan.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/loans")
public class LoanController {

    @Autowired
    private LoanService loanService;

    @Autowired
    private LoanMapper loanMapper;

    @PostMapping
    public ResponseEntity<?> saveLoan(@RequestBody LoanDTO dto) {
        Loan loan = loanService.save(loanMapper.toLoan(dto));
        return ResponseEntity.status(HttpStatus.CREATED).body(loan);
    }

    @GetMapping
    public ResponseEntity<?> list() {
        return ResponseEntity.status(HttpStatus.OK).body(loanService.getList());
    }
}
