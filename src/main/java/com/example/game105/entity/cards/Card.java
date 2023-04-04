package com.example.game105.entity.cards;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;



@Getter
@Setter
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Card {

    Integer id;

    CardRank name;

    CardSuit cardSuit;

    CardProperties cardProperties;

    CardColor cardColor;
}
