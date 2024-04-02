package com.ll.gamegoMVC.gamego.dao;



import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class ConsoleDAO {
    @Id
    private String id;
    private String name;
    private float cost;
    @OneToMany
    private List<GameDAO> gameDAOList;

    @ManyToOne
    private GameDAO gameDAO;



    
    
    
    public ConsoleDAO(){}
    
    public ConsoleDAO(String id, String name, float cost) {
        super();
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    public ConsoleDAO(String id, String name, float cost, String gameId) {
        super();
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.gameDAO = new GameDAO(gameId,"",0);
        this.gameDAOList = new ArrayList<GameDAO>();
       
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getCost() {
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    public GameDAO getGameDAO() {
        return gameDAO;
    }
    
    public void setGameDAO(GameDAO gameDAO) {
        this.gameDAO = gameDAO;
    }
    public List<GameDAO> getGameDAOList() {
        return gameDAOList;
    }

    // public void setGameDAOList(List<GameDAO> gameDAOList) {

    //     this.gameDAOList = gameDAOList;
    // }
    public void setGameDAOList(GameDAO game, List<GameDAO> gameDAOList) {
        gameDAOList.add(game);        
        this.gameDAOList = gameDAOList;
        System.out.println(gameDAOList);
    }
    
    
}
