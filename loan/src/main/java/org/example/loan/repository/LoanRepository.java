package org.example.loan.repository;

import org.example.loan.entity.Loan;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LoanRepository extends MongoRepository<Loan, Long> {

}
