package Burgers.src;

public class DeluxeBurger extends Hamburger {

  
  public DeluxeBurger(){
    super("Deluxe Burger", "Beef", "White", 14.54);
  }

  @Override 
  public void addHamburgerAddition1(String name, double price){
    super.addHamburgerAddition1("Chips", 2.75);
  }

  @Override 
  public void addHamburgerAddition2(String name, double price){
    super.addHamburgerAddition2("Drink", 1.81);
  }
}
