package com.example.game105.entity.games;


import com.example.game105.entity.State;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;


@Entity
@Getter
@Setter
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Enumerated(EnumType.STRING)
    State state;

    String players;
}
