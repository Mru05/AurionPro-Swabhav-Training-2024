package com.techlabs.structural.facade.model;

public class SoundSystem implements Status{
	
	private int volume;
	
	public SoundSystem( int volume) {
		super();
		
		this.volume = volume;
	}
	public SoundSystem(String string) {
		
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SoundSystem [volume=" + volume + "]";
	}
	
	public int getvolume() {
		return volume;
	}
	public void setvolume(int  i) {
		this.volume = i;
	}
	@Override
	public void getstatus() {
		// TODO Auto-generated method stub
		System.out.println("SoundSystem is on");
		
	}

}
