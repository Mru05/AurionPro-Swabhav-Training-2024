package com.techlabs.structural.facade.test;

import com.techlabs.structural.facade.model.MovieFacade;

public class MovieTest {
	public static void main(String[] args) {
		MovieFacade movieFacade = new  MovieFacade();
		System.out.println(movieFacade);
		movieFacade.watchMovie();
	}

}
