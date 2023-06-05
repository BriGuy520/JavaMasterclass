package Polymorphism.Car.src;

public class GasPoweredCar extends Car {

  private double avgKmPerLitre;
  private int cylinders;

  public GasPoweredCar(String description){
    super(description);
  }
  
  @Override
  public void drive(){
    super.drive();
  } 
  
}
