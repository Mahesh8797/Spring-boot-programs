package com.movie.info.model;

public class Movie {

	private String movie;
	private int movieId;
	
	
	public Movie(String movie, int movieId) {
		super();
		this.movie = movie;
		this.movieId = movieId;
	}
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	
}
