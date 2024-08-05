package com.techlabs.model;

public class Facade {
	 private Game game;

	    public Facade() {
	        game = new Game();
	    }

	    public void startGame() {
	        game.play();
	    }
	}

	
