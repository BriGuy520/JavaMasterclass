package Polymorphism.Car.src;

public class Car {

  private String description;

  public Car(String description){
    this.description = description;
  }

  public static Car getCar(String carType, String description){

    return switch(carType.toUpperCase().charAt(0)){
      case 'E' -> new ElectricCar(description);
      case 'H' -> new HypbridCar(description);
      case 'G' -> new GasPoweredCar(description);
      default -> new Car(description);
    };

  }

  public void startEngine(){
    System.out.println("Starting the " + description + " " + this.getClass().getSimpleName() +  " engine ");

  }

  public void drive(){

    runEngine();
  }

  protected void runEngine(){
    System.out.println("Running the " + description + " " + this.getClass().getSimpleName() +  " engine ");
  }
}
