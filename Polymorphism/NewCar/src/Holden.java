package Polymorphism.NewCar.src;

public class Holden extends NewCar {

  public Holden(int cylinders, String name){
    super(cylinders, name);
  }
  
  @Override
  public void startEngine(){
    super.startEngine();
    
    System.out.println(getClass().getSimpleName() + " engine has started");
  }

  @Override
  public void accelerate(){
    super.accelerate();

    System.out.println(getClass().getSimpleName() + " is accelerating");
  }

  @Override
  public void brake(){
    super.brake();

    System.out.println(getClass().getSimpleName() + " is braking");
  }
}
