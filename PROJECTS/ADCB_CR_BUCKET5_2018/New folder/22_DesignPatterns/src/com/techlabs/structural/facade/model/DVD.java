package com.techlabs.structural.facade.model;

public class DVD implements Status{
	
	private String movies;
	@Override
	public String toString() {
		return "DVD [ movies=" + movies + "]";
	}
	
	public DVD( String movies) {
		super();
		
		this.movies = movies;
	}
	public String getMovies() {
		return movies;
	}
	public void setMovies(String movies) {
		this.movies = movies;
	}

	@Override
	public void getstatus() {
		// TODO Auto-generated method stub
		System.out.println("DVD is on");
		
	}
	
	

}
