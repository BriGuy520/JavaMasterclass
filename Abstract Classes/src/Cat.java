public abstract class Cat extends Animal {

    public Cat(String type, String size, double weight){
        super(type, size, weight);
    }

    // @Override
    // public void makeNoise(){

    //     if(type == "Tiger"){
    //         System.out.println("GROWL!");
    //     } else {
    //         System.out.println("MEOW");
    //     }
    // }

    // @Override
    // public void move(String speed){

    //     System.out.printf("The %s %s is a %s mover", this.getSize(), getClass().getSimpleName(), speed);
    // }

    public abstract boolean hasStripes(boolean stripes);
    
}
