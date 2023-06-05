package Polymorphism.Car.src;

public class ElectricCar extends Car {


  private double avgKmPerCharge;
  private int batterySize;

  public ElectricCar(String description){
    super(description);
  }

  @Override
  public void drive(){
    super.drive();
  } 

  @Override
  public void startEngine(){
    super.startEngine();
  } 

}