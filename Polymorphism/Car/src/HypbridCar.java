package Polymorphism.Car.src;

public class HypbridCar extends Car {

  private double avgKmPerLitre;
  private int batterySize;
  private int cylinders;

  public HypbridCar(String description){
    super(description);
  }
  
  @Override
  public void drive(){
    super.drive();
  } 
  
}
