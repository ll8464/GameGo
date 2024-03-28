package com.ll.gamegoMVC.gamego.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ll.gamegoMVC.gamego.dao.ConsoleDAO;
import com.ll.gamegoMVC.gamego.dao.GameDAO;
import com.ll.gamegoMVC.gamego.service.ConsoleService;

@RestController
public class ConsoleController {
     @Autowired
    private ConsoleService consoleService;

    //add, update, get, delete
    @GetMapping("console/{id}")      
    public ConsoleDAO getConsole(@PathVariable String id){
        ConsoleDAO console = consoleService.getConsoleId(id);
        return console;
    }

    @RequestMapping("console") 
    public List<ConsoleDAO> getAllConsoles() {
        return consoleService.getAllConsoles();
    }
    
    @PostMapping("console")
    public void addConsole(@RequestBody ConsoleDAO console) {                
        consoleService.addConsole(console);
    }

    @PostMapping("console/{gameId}")
    public void addConsoleWithGame(@RequestBody ConsoleDAO console, @PathVariable String gameId) {
        console.setGameDAO(new GameDAO(gameId, "", 0));                
        consoleService.addConsole(console);
    }
    
    @PutMapping("console/{id}")
    public void updateConsole(@PathVariable String id, @RequestBody ConsoleDAO console) {        
        consoleService.updateConsole(id,console);
        
    }

    @DeleteMapping("console/{id}")
    public void delete(@PathVariable String id){
        consoleService.removeConsole(id);
    }
}
