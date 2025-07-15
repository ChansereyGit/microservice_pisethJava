package org.example.loan.controller;

import org.example.loan.dto.CardDTO;
import org.example.loan.entity.Card;
import org.example.loan.mapper.CardMapper;
import org.example.loan.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/cards")
public class CardController {

    @Autowired
    private CardService cardService;

    @Autowired
    private CardMapper cardMapper;

    @PostMapping
    public ResponseEntity<?> saveLoan(@RequestBody CardDTO dto) {
        Card card = cardService.save(cardMapper.toCard(dto));
        return ResponseEntity.status(HttpStatus.CREATED).body(card);
    }

    @GetMapping
    public ResponseEntity<?> list() {
        return ResponseEntity.status(HttpStatus.OK).body(cardService.getList());
    }
}
