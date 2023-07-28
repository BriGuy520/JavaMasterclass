public class Dog extends Animal {

    public Dog(String type, String size, double weight){
        super(type, size, weight);
    }

    @Override
    public void makeNoise(){

        if(type == "Wolf"){
            System.out.println("HOWL!");
        } else {
            System.out.println("WOOF");
        }
    }

    @Override
    public void move(String speed){

        System.out.printf("The %s %s is a %s mover", getSize(), getClass().getSimpleName(), speed);
    }
    
}
