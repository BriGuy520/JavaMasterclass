package Vehicle;

public class Car extends Vehicle {

  private String engine;

  public Car(String make, String model, String engine){
    super(make, model, 4, "green");
    this.engine = engine;
  }
  
  public Car(String make, String model, int wheels, String color, String engine){
    super(make, model, wheels, color);
    this.engine = engine;
  }

  
  @Override
  public String toString() {
    return "{ make: " + make + " model: " + model + " Engine: " + engine + " wheels: " + wheels + " color: " + color + " }";
  }
}
