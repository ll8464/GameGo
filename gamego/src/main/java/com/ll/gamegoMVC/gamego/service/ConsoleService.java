package com.ll.gamegoMVC.gamego.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ll.gamegoMVC.gamego.dao.ConsoleDAO;
import com.ll.gamegoMVC.gamego.dao.GameDAO;
import com.ll.gamegoMVC.gamego.repository.ConsoleRepository;

@Service
public class ConsoleService {
    @Autowired
    private ConsoleRepository consoleRepository;
    
    public List<ConsoleDAO> getAllConsoles(){
        List<ConsoleDAO> consoles = new ArrayList<>();
        consoleRepository.findAll().forEach(consoles::add);

        return consoles;
    }
    
    public ConsoleDAO getConsoleId(String id){
        ConsoleDAO console = consoleRepository.findById(id).get();
        return console;
    }

    public void addConsole(ConsoleDAO console){
        consoleRepository.save(console);
    }

    public void updateConsole(String id,ConsoleDAO console){
        consoleRepository.save(console);
    }

    public void removeConsole(String id){
        consoleRepository.deleteById(id);
    }

    public void addGameToConsole(GameDAO game, String consoleId){
        
        ConsoleDAO console = getConsoleId(consoleId);               
        
        console.setGameDAOList(game, console.getGameDAOList());
       
    }
    
}
