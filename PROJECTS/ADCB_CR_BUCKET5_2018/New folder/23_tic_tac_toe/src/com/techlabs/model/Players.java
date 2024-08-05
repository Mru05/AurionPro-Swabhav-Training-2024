package com.techlabs.model;

public class Players {
	
	private char symbol;     //stores the symbols of players in this case this is obviously X O

    public Players(char symbol) {
        this.symbol = symbol;        //if i'll be making a new  player
    }

    public char getSymbol() {
        return symbol;    //get symbol whether X or O
    }

}
