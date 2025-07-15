package org.example.loan.service;

import org.example.loan.entity.Card;

import java.util.List;

public interface CardService {
    Card save(Card card);
    List<Card> getList();

//    Loan getById(Long loanNumber);
}
