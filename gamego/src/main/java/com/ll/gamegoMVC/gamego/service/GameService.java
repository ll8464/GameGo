package com.ll.gamegoMVC.gamego.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ll.gamegoMVC.gamego.dao.GameDAO;
import com.ll.gamegoMVC.gamego.repository.GameRepository;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;
    
    public List<GameDAO> getAllGames(){
        List<GameDAO> games = new ArrayList<>();
        gameRepository.findAll().forEach(games::add);

        return games;
    }
}
