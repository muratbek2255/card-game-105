package com.example.game105.entity;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;



@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Card {

    Integer id;

    CardRank name;

    CardSuit cardSuit;

    CardProperties cardProperties;

    CardColor cardColor;
}
