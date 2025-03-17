package com.moviepredictor;
public class Movie {
    private String title;
    private String director;
    private String genre;
    private double rating;
    private int year;

    public Movie(String title, String director, String genre, double rating, int year) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.rating = rating;
        this.year = year;
    }

    public String getDirector() { return director; }
    public String getGenre() { return genre; }
    public double getRating() { return rating; }
    public int getYear() { return year; }
}
