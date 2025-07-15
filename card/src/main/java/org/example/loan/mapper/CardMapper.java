package org.example.loan.mapper;

import org.example.loan.dto.CardDTO;
import org.example.loan.entity.Card;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CardMapper {

    Card toCard(CardDTO dto);
}
