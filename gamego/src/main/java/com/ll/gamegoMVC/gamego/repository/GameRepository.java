package com.ll.gamegoMVC.gamego.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ll.gamegoMVC.gamego.dao.GameDAO;
@Repository
@Component
public interface GameRepository extends CrudRepository<GameDAO, String> {
    
}
