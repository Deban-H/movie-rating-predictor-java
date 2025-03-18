# Movie Rating Predictor (Java)

## Objective
Predict movie ratings based on director, genre, and release year.

## Dataset
IMDB India Movies Dataset from Kaggle.

## Features
- Predicts movie ratings based on:
  - Feature engineering (director success rate, average rating of similar movies)
  - Genre average rating
- Handles missing data and preprocessing(encoding)
- Machine learning model (Linear Regression)
- Model evaluation (MSE, accuracy)

## Requirements
- Java 8 or higher
- Apache Commons CSV (for CSV reading)
- JAMA (for matrix operations in regression)

## How to Run
1. Clone the repository
2. Import into IntelliJ as a Maven project
3. Run `Main.java`
4. Enter movie details and get predicted rating

## Technologies
- Java
- Maven
- OpenCSV
