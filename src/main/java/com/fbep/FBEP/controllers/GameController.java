package com.fbep.FBEP.controllers;

import java.util.List;

import com.fbep.FBEP.dto.GameDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fbep.FBEP.dto.GameMinDTO;
import com.fbep.FBEP.services.GameService;

@RestController
@RequestMapping(value = "/games") /* defining the URL request */
public class GameController {
    
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll() {
        return gameService.findAll();
    }

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable short id) {
        return gameService.findById(id);
    }
}
