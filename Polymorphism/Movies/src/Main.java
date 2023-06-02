package Polymorphism.Movies.src;

public class Main {
    public static void main(String[] args) {
        
        Movie theMovie = Movie.getMovie("Adventure", "Star Wars");
        theMovie.watchMovie();

        Movie adventureMovie = new Adventure("Lord of the Rings");

        adventureMovie.watchMovie();
    }
}
