package com.techlabs.model;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BoardTest {
	 private Board board;
	 @BeforeEach
	    void init() {
	        board = new Board();
	    }
	 @AfterEach
	 void status() {
		 System.out.println("Task Executed");
	 }

	    @Test
	    void testInitialBoardIsEmpty() {
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                assertTrue(board.isValidMove(i, j), "Initially the board should be empty");
	            }
	        }
	    }

	    @Test
	    void testValidMove() {
	        assertTrue(board.isValidMove(0, 0), "Move to empty cell should be valid");
	        board.makeMove(0, 0, 'X');
	        assertFalse(board.isValidMove(0, 0), "Move to occupied cell should be invalid");
	    }

	    @Test
	    void testInvalidMove() {
	        assertFalse(board.isValidMove(3, 3), "Move outside board should be invalid");
	        assertFalse(board.isValidMove(-1, 0), "Move with negative index should be invalid");
	    }

	    @Test
	    void testWinningCondition() {
	        // Test row win
	        board.makeMove(0, 0, 'X');
	        board.makeMove(0, 1, 'X');
	        board.makeMove(0, 2, 'X');
	        assertTrue(board.checkWin('X'), "Row win should be detected");

	        // Reset board
	        board = new Board();

	        // Test column win
	        board.makeMove(0, 0, 'O');
	        board.makeMove(1, 0, 'O');
	        board.makeMove(2, 0, 'O');
	        assertTrue(board.checkWin('O'), "Column win should be detected");

	        // Reset board
	        board = new Board();

	        // Test diagonal win
	        board.makeMove(0, 0, 'X');
	        board.makeMove(1, 1, 'X');
	        board.makeMove(2, 2, 'X');
	        assertTrue(board.checkWin('X'), "Left Diagonal win should be detected");
	        
	        board.makeMove(0, 2, 'X');
	        board.makeMove(1, 1, 'X');
	        board.makeMove(2, 0, 'X');
	        assertTrue(board.checkWin('X'), "Right Diagonal win should be detected");
	    }

	    @Test
	    void testBoardFull() {
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                board.makeMove(i, j, 'X');
	            }
	        }
	        assertTrue(board.isFull(), "Board should be full");

}
}
