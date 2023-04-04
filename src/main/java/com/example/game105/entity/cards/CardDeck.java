package com.example.game105.entity.cards;


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
public class CardDeck {
    List<Card> decks;

    public void add(Card card) {
        decks.add(card);
    }
}
