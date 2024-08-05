package com.techlabs.test;

import com.techlabs.model.CricketPlayer;
import java.util.Scanner;

public class CricketPlayerTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of players: ");
		int n = scanner.nextInt();
		CricketPlayer[] players = new CricketPlayer[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter details for player " + (i + 1) + ":");
			System.out.print("Player ID: ");
			int playerId = scanner.nextInt();
			System.out.print("Name: ");
			String name = scanner.next();
			System.out.print("Matches: ");
			int matches = scanner.nextInt();
			System.out.print("Runs: ");
			int runs = scanner.nextInt();
			System.out.print("Wickets: ");
			int wickets = scanner.nextInt();

			players[i] = new CricketPlayer(playerId, name, matches, runs, wickets);

			// Display players
			System.out.println("Entered details for player " + (i + 1) + ":");
			displayPlayer(players[i]);
		}

		scanner.close();

		System.out.println("\nPlayer with Maximum Average:");
		CricketPlayer maxAvgPlayer = getMaximumAveragePlayer(players);
		displayPlayer(maxAvgPlayer);

		System.out.println("\nPlayers in Ascending Order of Average:");
		sortPlayersByAverage(players);
		displayPlayers(players);
	}

	private static CricketPlayer getMaximumAveragePlayer(CricketPlayer[] players) {
		CricketPlayer maxAvgPlayer = players[0];
		for (int i = 0; i < players.length; i++) {
		    CricketPlayer player = players[i];
		    displayPlayer(player);
		}

		return maxAvgPlayer;
	}

	private static void sortPlayersByAverage(CricketPlayer[] players) { //bubble sort
		for (int i = 0; i < players.length - 1; i++) {
			for (int j = 0; j < players.length - 1 - i; j++) {
				if (players[j].calculateAverage() > players[j + 1].calculateAverage()) {
					CricketPlayer temp = players[j];
					players[j] = players[j + 1];
					players[j + 1] = temp;
				}
			}
		}
	}

	private static void displayPlayers(CricketPlayer[] players) {
		for (int i = 0; i < players.length; i++) {
		    CricketPlayer player = players[i];
		    displayPlayer(player);
		}

	}

	private static void displayPlayer(CricketPlayer player) {
		System.out.println("Player ID: " + player.getPlayerId() + ", \nName: " + player.getName() +
			", \nMatches: " + player.getMatches() + ", \nRuns: " + player.getRuns() + ", \nWickets: " + player.getWickets() +
			", \nAverage: " + player.calculateAverage());
	}
}
