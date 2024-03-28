package com.ll.gamegoMVC.gamego.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ConsoleDAO {
    @Id
    private String id;
    private String name;
    private float cost;



    public ConsoleDAO(){}
    
    public ConsoleDAO(String id, String name, float cost) {
        super();
        this.id = id;
        this.name = name;
        this.cost = cost;
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


}
