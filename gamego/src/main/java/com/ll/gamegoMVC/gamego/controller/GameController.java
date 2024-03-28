package com.ll.gamegoMVC.gamego.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.ll.gamegoMVC.gamego.dao.GameDAO;
import com.ll.gamegoMVC.gamego.service.*;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
public class GameController {
    @Autowired
    private GameService gameService;

    //add, update, get, delete
    @GetMapping("game/{id}")      
    public GameDAO getGame(@PathVariable String id){
        GameDAO game = gameService.getGameId(id);
        return game;
    }

    @RequestMapping("game") 
    public List<GameDAO> getAllGames() {
        return gameService.getAllGames();
    }
    
    @PostMapping("game")
    public void addGame(@RequestBody GameDAO game) {                
        gameService.addGame(game);
    }
    
    @PutMapping("game/{id}")
    public void updateGame(@PathVariable String id, @RequestBody GameDAO game) {        
        gameService.updateGame(id,game);
        
    }

    @DeleteMapping("game/{id}")
    public void delete(@PathVariable String id){
        gameService.removeGame(id);
    }
}
