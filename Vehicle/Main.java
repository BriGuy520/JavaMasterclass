package Vehicle;

public class Main {


  public static void main(String args[]){

    Vehicle volvo = new Vehicle();

    System.out.println(volvo);

    Vehicle porsche = new Vehicle("911", "black");

    System.out.println(porsche);

    Vehicle toyota = new Car("Toyota", "Camry", 4, "white", "V4");

    System.out.println(toyota);

    Vehicle ford = new Car("Ford", "F-150", "Hemi");

    System.out.println(ford);

  }
  
}
