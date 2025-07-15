package org.example.loan.service.impl;

import org.example.loan.entity.Card;
import org.example.loan.repository.CardRepository;
import org.example.loan.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    private CardRepository cardRepository;

    @Override
    public Card save(Card card) {
        return cardRepository.save(card);
    }

    @Override
    public List<Card> getList() {
        return cardRepository.findAll();
    }

//    @Override
//    public Loan getById(Long loanNumber) {
//        return null;
//    }
}
