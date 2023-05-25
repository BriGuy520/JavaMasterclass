package Vehicle;

public class Vehicle {

  protected String make;
  protected String model;
  protected int wheels;
  protected String color;


  public Vehicle(){
    this("Volvo", "XC90", 4, "Navy");
  }

  public Vehicle(String model, String color){
    this("Porsche", model, 4, color);
  }


  public Vehicle(String make, String model, int wheels, String color){
    this.make = make;
    this.model = model;
    this.wheels = wheels;
    this.color = color;
  }

  public String getMake(){
    return make;
  }

  @Override
  public String toString() {
    return "{ make: " + make + " model: " + model + " wheels: " + wheels + " color: " + color + " }";
  }
}
