package com.ll.gamegoMVC.gamego.repository;

import org.springframework.data.repository.CrudRepository;

import com.ll.gamegoMVC.gamego.dao.GameDAO;

public interface GameRepository extends CrudRepository<GameDAO, String> {
    
}
