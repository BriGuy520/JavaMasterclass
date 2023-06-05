package Polymorphism.Car.src;

public class Main {

  public static void main(String[] args) {

    Car theCar = Car.getCar("Electric", "Tesla");

    Car gas = new GasPoweredCar("Ford F-150");

    gas.startEngine();

    theCar.drive();    
  }
  
}
