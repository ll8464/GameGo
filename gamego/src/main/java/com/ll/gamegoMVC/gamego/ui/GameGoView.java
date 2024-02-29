package com.ll.gamegoMVC.gamego.ui;



public class GameGoView {
    private UserIO io;

    public GameGoView(UserIO io){
        this.io = io;
    }

    public int printMenu(){
        io.print("Main Menu");
        return io.readInt("Please select from the above choices", 1,5);
    }
}
