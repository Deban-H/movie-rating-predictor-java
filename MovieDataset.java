package com.moviepredictor;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class MovieDataset {
    private List<Movie> movies = new ArrayList<>();

    public void loadDataset(String filePath) {
        try {
            CSVReader reader = new CSVReader(new FileReader(filePath));
            String[] nextLine;
            reader.readNext(); // skip header

            while ((nextLine = reader.readNext()) != null) {
                String name = nextLine[0].trim();
                String yearStr = nextLine[1].trim().replaceAll("[^0-9]", "");
                String duration = nextLine[2].trim();
                String genre = nextLine[3].trim();
                String ratingStr = nextLine[4].trim();
                String director = nextLine[6].trim();

                // Handle missing rating
                if (ratingStr.isEmpty()) continue;

                double rating = Double.parseDouble(ratingStr);
                int year = yearStr.isEmpty() ? 0 : Integer.parseInt(yearStr);

                movies.add(new Movie(name, director, genre, rating, year));
            }

            reader.close();
            System.out.println("Dataset loaded! Total movies: " + movies.size());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Movie> getMovies() {
        return movies;
    }
}
