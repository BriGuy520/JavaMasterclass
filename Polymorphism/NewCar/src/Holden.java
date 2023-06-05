package Polymorphism.NewCar.src;

public class Holden extends NewCar {

  public Holden(int cylinders, String name){
    super(cylinders, name);
  }
  
  @Override
  public String startEngine(){
    super.startEngine();

    return getClass().getSimpleName() + " engine has started";
  }

  @Override
  public String accelerate(){
    super.accelerate();

    return getClass().getSimpleName() + " is accelerating";
  }

  @Override
  public String brake(){
    super.brake();

    return getClass().getSimpleName() + " is braking";
  }
}
