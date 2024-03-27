package com.ll.gamegoMVC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.ll.gamegoMVC.gamego.repository")
@ComponentScan("com.ll.gamegoMVC.gamego.controller")
@ComponentScan("com.ll.gamegoMVC.gamego.dao")
@ComponentScan("com.ll.gamegoMVC.gamego.service")
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);

		
	}

}
