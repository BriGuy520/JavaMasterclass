package Polymorphism.Movies.src;

public class Movie {
 
    private String title;

    public Movie(String title){
        this.title = title;
    }

    public void watchMovie(){

        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }

    public static Movie getMovie(String type, String title){

        return switch (type.toUpperCase().charAt(0)){
            default -> new Movie(title);
        };
    }
}

class Adventure extends Movie {

    public Adventure(String title){
        super(title);
    }

    @Override
    public void watchMovie(){
        super.watchMovie();
        System.out.printf("... %s%n".repeat(3),
        "Pleasent Scene",
        "Scary Music", 
        "Something Bad Happens");
    }
}

class Comedy extends Movie {

    public Comedy(String title){
        super(title);
    }

    @Override
    public void watchMovie(){
        super.watchMovie();
        System.out.printf("... %s%n".repeat(3),
        "Funny Scene",
        "Another Funny Scene", 
        "Happy Ending");
    }
}

class ScienceFiction extends Movie {

    public ScienceFiction(String title){
        super(title);
    }

    @Override
    public void watchMovie(){
        super.watchMovie();
        System.out.printf("... %s%n".repeat(3),
        "Aliens do bad stuff",
        "Heros attack aliens", 
        "The world is saved");
    }
}