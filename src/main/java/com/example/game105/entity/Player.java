package com.example.game105.entity;


import com.example.game105.entity.cards.Card;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;


@Getter
@Setter
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Player {

    String name;
    int discardCounter;
    Card pickedCard;
    Hand hand;
    int point;

    public Player(String name) {
        this.name = name;
        this.discardCounter = 0;
        this.pickedCard = null;
        this.hand = new Hand();
        this.point = 0;
    }
}
