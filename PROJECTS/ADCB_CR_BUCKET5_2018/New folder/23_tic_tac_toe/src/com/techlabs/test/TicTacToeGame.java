package com.techlabs.test;

import com.techlabs.model.Facade;

public class TicTacToeGame {
	public static void main(String[] args) {
		System.out.println("Welcome to TIC TAC TOE 3x3 board game. Let's playy!");
        Facade facade = new Facade();
        facade.startGame();
    }

}
