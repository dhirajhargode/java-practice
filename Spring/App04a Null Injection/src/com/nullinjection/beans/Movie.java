package com.nullinjection.beans;

public class Movie {
	private int movieId;
	private String movieName;
	private String hero;
	private String heroine;

	public Movie(int movieId, String movieName, String hero, String heroine) {

		this.movieId = movieId;
		this.movieName = movieName;
		this.hero = hero;
		this.heroine = heroine;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", hero=" + hero + ", heroine=" + heroine
				+ "]";
	}

}
