package com.techlabs.model;

public class Board {
	    private char[][] grid;

	    public Board() {
	        grid = new char[3][3];
	        initializeBoard();
	    }
     //for initializing board
	    private void initializeBoard() {
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                grid[i][j] = '-';
	            }
	        }
	    }
       //to check if the player is making a valid move should be between 0-2(0,1,2)
	    public boolean isValidMove(int row, int col) {
	        return row >= 0 && row < 3 && col >= 0 && col < 3 && grid[row][col] == '-';
	    }
        //upgrade the grid as per the choices of player
	    public void makeMove(int row, int col, char player) {
	        grid[row][col] = player;
	    }
       //this method does nothing but checks if there is blank space
	    public boolean isFull() {
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (grid[i][j] == '-') return false;
	            }
	        }
	        return true;
	    }
       //this is for printing the grid after playing or before playing like how it looks like
	    public void print() {
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(grid[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
       //this basically checks if the player having X O is winning or no checks vertical, horizontal as well as diagonals
	    public boolean checkWin(char player) {
	       
	        for (int i = 0; i < 3; i++) {
	            if (grid[i][0] == player && grid[i][1] == player && grid[i][2] == player) return true;      //horizontal
	            if (grid[0][i] == player && grid[1][i] == player && grid[2][i] == player) return true;      //vertical
	        }
	        if (grid[0][0] == player && grid[1][1] == player && grid[2][2] == player) return true;          //left diagonal
	        if (grid[0][2] == player && grid[1][1] == player && grid[2][0] == player) return true;          //right diagonal
	        return false;
	    }
	}


