package com.fbep.FBEP.services;

import java.util.List;

import com.fbep.FBEP.dto.GameDTO;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fbep.FBEP.dto.GameMinDTO;

import com.fbep.FBEP.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        return gameRepository.findAll().stream().map(x -> new GameMinDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findById(short id) {
        return new GameDTO(gameRepository.findById(id).get());
    }

}
