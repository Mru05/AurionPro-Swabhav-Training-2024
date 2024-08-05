package com.techlabs.model;

public class Cricket {
	private int playerId;
	private String name;
	private int matchesPlayed;
	private int runs;
	private int wicketes;
	private int avg;
	
	public Cricket(int playedId, String name,int matchesPlayed,int runs,int wickets)
	{
		this.playerId=playedId;
		this.name= name;
		this.matchesPlayed=matchesPlayed;
		this.runs=runs;
		this.wicketes=wickets;
		
	}
	public int getplayerId() {
		return this.playerId;
		
	}
	public String getname() {
		return this.name;
	}
	public int matchesPlayed() {
		return this.matchesPlayed;
	}
	public int getruns() {
		return this.runs;
	}
	public int getwickets() {
		return this.wicketes;
	}
  public int average() {
	  avg = runs/matchesPlayed;
	  return avg;
	  
  }
}
