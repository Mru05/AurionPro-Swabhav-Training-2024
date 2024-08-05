package com.techlabs.model;

import java.util.Scanner;

public class Game {
	
	 private Board board;
	    private Players player1;
	    private Players player2;
	    private Players currentPlayer;

	    public Game() {
	        board = new Board();
	        player1 = new Players('X');
	        player2 = new Players('O');
	        currentPlayer = player1;
	    }

	    public void play() {
	        Scanner scanner = new Scanner(System.in);
	        boolean gameWon = false;

	        while (!gameWon && !board.isFull()) {
	            board.print();
	            System.out.println("Player " + currentPlayer.getSymbol() + ", enter row (0-2) and column (0-2):");
	            int row = scanner.nextInt();
	            int col = scanner.nextInt();

	            if (board.isValidMove(row, col)) {
	                board.makeMove(row, col, currentPlayer.getSymbol());
	                gameWon = board.checkWin(currentPlayer.getSymbol());
	                if (!gameWon) {
	                    switchPlayer();
	                }
	            } else {
	                System.out.println("Invalid move. Please enter valid move it should be between rows(0-2) and columns (0-2) Try again.");
	            }
	        }

	        board.print();
	        if (gameWon) {
	            System.out.println("Player " + currentPlayer.getSymbol() + " wins!. Congratulations!!!!! Loser player better luck next time :) " );
	        } else {
	            System.out.println("It's a draw! Oopsies!! Lets play again");
	        }
	        scanner.close();
	    }

	    private void switchPlayer() {
	        if (currentPlayer == player1) {
	            currentPlayer = player2;
	        } else {
	            currentPlayer = player1;
	        }
	    }
	}


