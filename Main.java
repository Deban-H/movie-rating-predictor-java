package com.moviepredictor;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MovieDataset dataset = new MovieDataset();
        dataset.loadDataset("data/movies.csv");

        MoviePredictor predictor = new MoviePredictor(dataset.getMovies());

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Director Name:");
        String director = scanner.nextLine();
        System.out.println("Enter Movie name:");
        String name = scanner.nextLine();

        System.out.println("Enter Genre:");
        String genre = scanner.nextLine();

        System.out.println("Enter Release Year:");
        int year = scanner.nextInt();

        double predictedRating = predictor.predictRating(director, name,genre, year);

        System.out.println("Predicted Movie Rating: " + predictedRating);
    }
}
