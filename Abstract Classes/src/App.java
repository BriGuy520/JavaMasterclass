import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Dog dog = new Dog("Wolf", "Large", 100);

        ArrayList<Animal> animalArray = new ArrayList<>();

        animalArray.add(dog);
        animalArray.add(new Dog("Pug", "Small", 20));
        animalArray.add(new Tiger("Small", 11));
        animalArray.add(new Tiger("Bengal", "Large", 200));



        for(Animal animal : animalArray){
            doAnimalStuff(animal);
        }



    }


    public static void doAnimalStuff(Animal animal){

        animal.makeNoise();
        animal.move("slow");
    }
}
