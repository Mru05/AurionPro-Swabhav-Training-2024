package com.techlabs.structural.facade.model;


public class MovieFacade {
    private DVD dvd;
    private SoundSystem soundSystem;
    private Projector projector;

    public MovieFacade() {
        dvd = new DVD("Hum Aapke Hain Kaun");
        soundSystem = new SoundSystem("Sony");
        projector = new Projector();
    }

    public void watchMovie() {
        projector.getstatus();
        soundSystem.getstatus();
        soundSystem.setvolume(10);
        dvd.getMovies();
        dvd.getstatus();
    }

	@Override
	public String toString() {
		return "MovieFacade [dvd=" + dvd + ", \nsoundSystem=" + soundSystem + ", \nprojector=" + projector + "]";
	}

   
}

