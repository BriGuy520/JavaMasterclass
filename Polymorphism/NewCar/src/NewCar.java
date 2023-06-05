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

  public void startEngine(){
    System.out.println(this.getClass().getSimpleName() + " engine has started");
  }

  public void accelerate(){
    System.out.println(this.getClass().getSimpleName() + " is accelerating");
  }

  public void brake(){
    System.out.println(this.getClass().getSimpleName() + " is braking");
  }
}
