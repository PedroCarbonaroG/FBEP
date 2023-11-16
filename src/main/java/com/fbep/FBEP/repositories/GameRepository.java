package com.fbep.FBEP.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fbep.FBEP.entities.Game;

public interface GameRepository extends JpaRepository<Game, Short> {
    
}
