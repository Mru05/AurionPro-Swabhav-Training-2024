package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Cricket;

public class CricketTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Cricket  players[] = new Cricket[3];
		System.out.println("Welcome to cricket player details app :");
		for(int i =0; i<players.length;i++) {
		
		System.out.println("please enter the details of the player");
		System.out.println("\n Enter player Id");
		int playerId = scn.nextInt();
		System.out.println("Enter Name of the player");
		String name = scn.next();
		System.out.println("Enter number of matches he played ");
		int noMatches = scn.nextInt();
		System.out.println("Enter runs he made ");
		int runs = scn.nextInt();
		System.out.println("Enter number of wickets");
		int wickets = scn.nextInt();
		
		players[i]= new Cricket(playerId, name, noMatches, runs, wickets);
		}
		for(int i=0;i<players.length;i++)
		{
			System.out.println("the detailes u entered are ");
			System.out.println(players[i]);
			System.out.println(players[i].average());
		}
		
//		System.out.println("the detailes u entered are ");
//		System.out.println("PlayerId "+playerId);
//		System.out.println("Player Name "+name);
//		System.out.println("Matches played "+noMatches);
//		System.out.println("Total runs "+runs);
//		System.out.println("Total wickets "+wickets);
//		Cricket c = new Cricket(playerId, name, noMatches, runs, wickets);

		
		

	}

}
