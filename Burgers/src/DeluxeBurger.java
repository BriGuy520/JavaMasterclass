package Burgers.src;

public class DeluxeBurger extends Hamburger {

  private double addition1Price;
  private double addition2Price;
  
  public DeluxeBurger(){
    super("Deluxe Burger", "Sausage & Bacon", 14.54, "White");

    super.addHamburgerAddition1("Chips", 2.75);
    super.addHamburgerAddition2("Drink", 1.81);

    super.itemizeHamburger();
  }

  @Override 
  public void addHamburgerAddition1(String name, double price){
    
    return;
  }
  
  @Override 
  public void addHamburgerAddition2(String name, double price){
    
    return;
  }
  
  @Override
  public void addHamburgerAddition3(String addition3Name, double addition3Price){
    
    return;
  }
  
  public void addHamburgerAddition4(String addition4Name, double addition4Price){
    
    return;
  }  
}
