package com.example.game105.repository;


import com.example.game105.entity.games.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Integer> {
}
