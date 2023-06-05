package Polymorphism.NewCar.src;

public class Mitsubishi extends NewCar {

  public Mitsubishi(int cylinders, String name){
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
