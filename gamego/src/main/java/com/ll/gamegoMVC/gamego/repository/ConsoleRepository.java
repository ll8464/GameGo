package com.ll.gamegoMVC.gamego.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ll.gamegoMVC.gamego.dao.ConsoleDAO;

@Repository
public interface ConsoleRepository extends CrudRepository<ConsoleDAO, String>{
    
}
