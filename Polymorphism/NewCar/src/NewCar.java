package Polymorphism.NewCar.src;

public class NewCar {

  private boolean engine = true;
  private int cylinders;
  private String name;
  private int wheels = 4;

  public NewCar(int cylinders, String name){
    this.cylinders = cylinders;
    this.name = name;
  }

  public String getName(){

    return name;
  }

  public int getCylinders(){
    
    return cylinders;
  }

  public String startEngine(){
    return this.getClass().getSimpleName() + " engine has started";
  }

  public String accelerate(){
    return this.getClass().getSimpleName() + " is accelerating";
  }

  public String brake(){
    return this.getClass().getSimpleName() + " is braking";
  }
}
