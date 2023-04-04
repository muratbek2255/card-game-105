package com.example.game105.entity.cards;


import com.example.game105.entity.Hand;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.List;


@Getter
@Setter
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CardHolder {

    List<CardDeck> decks;

    List<Hand> hands;


}
