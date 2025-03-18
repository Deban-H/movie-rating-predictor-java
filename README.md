---

# Movie Rating Predictor 

This project is a simple **Movie Rating Prediction** system developed in **Java**. The goal is to predict movie ratings based on factors such as **director**, **movie name**, **genre**, and **release year**, using a dataset of Indian movies.

It’s designed as a beginner-friendly machine learning project without external libraries—just core Java!

---

## Features

- Predicts movie ratings using:
  - **Director's average movie rating**
  - **Genre-based average ratings**
- Basic data preprocessing
- Simple feature engineering (director success rate, genre averages)
- Works with a **CSV dataset** of movies

---

## Project Structure

```
MovieRatingPredictor/
├── data/
│   └── movies.csv           # Dataset used for training/testing
├── src/
│   ├── Movie.java           # Movie class (data model)
│   └── MoviePredictor.java  # Main prediction logic
|   |___Main.java          #Main class
|   |___MovieDataset.java   # Dataset tracking logic

```

---

##  Dataset

- **Source**: [IMDb India Movies Dataset](https://www.kaggle.com/datasets/adrianmcmahon/imdb-india-movies)
- File: `movies.csv`
- Ensure the CSV is placed in the `data/` folder inside your project directory.

---

## Prerequisites

- Java Development Kit (JDK) 8 or later
- An IDE (like IntelliJ IDEA or Eclipse) or any text editor
- Basic understanding of Java 

---

## How to Run the Project

### 1. Clone the repository
```
git clone https://github.com/Deban-H/movie-rating-predictor-java.git
```

### 2. Open in your IDE
- Open **IntelliJ IDEA**, **Eclipse**, or any IDE you prefer.
- Open the `MovieRatingPredictor` folder as a project.

### 3. Add the CSV Dataset
- Place `movies.csv` file inside the `/data/` folder.

### 4. Run the code
- Compile and run `MoviePredictor.java`
- The code will load the dataset and allow to predict ratings.

Example:
```java
MoviePredictor predictor = new MoviePredictor(movies);
double rating = predictor.predictRating("Rajkumar Hirani", "Drama", 2018);
System.out.println("Predicted rating: " + rating);
```

---

## How It Works
- The program reads the dataset and processes each movie.
- It calculates:
  - The director's success rate (average rating of their past movies).
  - The average rating for the given genre.
- Combines both factors to predict a rating.

---

## Example Output
```
![Prediction Example]Screenshot 2025-03-18 203055.png
```

---

##  License
This project is open-source and available under the **MIT License**.

---


##  Acknowledgments
- Dataset: Kaggle (IMDb India Movies)
  
