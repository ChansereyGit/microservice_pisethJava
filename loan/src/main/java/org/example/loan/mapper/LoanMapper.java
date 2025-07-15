package org.example.loan.mapper;

import org.example.loan.dto.LoanDTO;
import org.example.loan.entity.Loan;
import org.springframework.stereotype.Component;

@Component
public class LoanMapper {

    public Loan toLoan(LoanDTO dto) {
        Loan loan = new Loan();
        loan.setAmountPaid(dto.getAmountPaid());
        loan.setCustomerId(dto.getCustomerId());
        loan.setLoanNumber(dto.getLoanNumber());
        loan.setLoanType(dto.getLoanType());
        loan.setCreateDate(dto.getCreateDate());
        loan.setTotalLoan(dto.getTotalLoan());
        loan.setOutstandingAmount(dto.getOutstandingAmount());
        loan.setStartDate(dto.getStartDate());
        return loan;
    }
}
