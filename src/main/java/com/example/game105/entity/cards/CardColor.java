package com.example.game105.entity.cards;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CardColor {
    public static final Map<String, String> colors;
    static {
        Map<String, String> colorsMap = new HashMap<String, String>();
        colorsMap.put("Hearts", "Red");
        colorsMap.put("Diamonds", "Red");
        colorsMap.put("Clubs", "Black");
        colorsMap.put("Spades", "Black");
        colors = Collections.unmodifiableMap(colorsMap);
    }
}
