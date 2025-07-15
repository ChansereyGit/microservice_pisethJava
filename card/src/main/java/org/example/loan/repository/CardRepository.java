package org.example.loan.repository;

import org.example.loan.entity.Card;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CardRepository extends MongoRepository<Card, Long> {

}
