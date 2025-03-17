package com.moviepredictor;

import java.util.List;

public class MoviePredictor {

    private List<Movie> dataset;
    private double overallAvgRating;

    public MoviePredictor(List<Movie> dataset) {
        this.dataset = dataset;
        this.overallAvgRating = calculateOverallAverageRating();
    }


    private double calculateOverallAverageRating() {
        if (dataset == null || dataset.isEmpty()) {
            System.out.println("Dataset is empty!");
            return 5.0;
        }

        double total = 0.0;
        int count = 0;

        for (Movie movie : dataset) {
            total += movie.getRating();
            count++;
        }

        double average = count > 0 ? total / count : 5.0;
        System.out.println("Overall dataset average rating: " + average);
        return average;
    }

    public double predictRating(String director, String name, String genre, int year) {
        if (dataset == null || dataset.isEmpty()) {
            System.out.println("Dataset is empty! Can't predict.");
            return overallAvgRating;
        }


        double directorRatingSum = 0.0;
        int directorMovieCount = 0;

        for (Movie movie : dataset) {
            if (movie.getDirector().equalsIgnoreCase(director)) {
                directorRatingSum += movie.getRating();
                directorMovieCount++;
            }
        }

        double directorAvgRating = directorMovieCount > 0
                ? directorRatingSum / directorMovieCount
                : overallAvgRating;


        double genreRatingSum = 0.0;
        int genreMovieCount = 0;

        for (Movie movie : dataset) {
            if (movie.getGenre().equalsIgnoreCase(genre)) {
                genreRatingSum += movie.getRating();
                genreMovieCount++;
            }
        }

        double genreAvgRating = genreMovieCount > 0
                ? genreRatingSum / genreMovieCount
                : overallAvgRating;


        double predictedRating = (directorAvgRating * 0.6) + (genreAvgRating * 0.4);


        predictedRating = Math.max(0.0, Math.min(predictedRating, 10.0));

        System.out.println("Director Avg: " + directorAvgRating);
        System.out.println("Genre Avg: " + genreAvgRating);
        System.out.println("Predicted Rating: " + predictedRating);

        return predictedRating;
    }
}
