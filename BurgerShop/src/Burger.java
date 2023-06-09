package BurgerShop.src;

public class Burger {

  private String type;
  private double price;

  public Burger(){
    this("Regular", 4.50);
  }
  
  public Burger(String type, double price){
    this.type = type;
    this.price = price;
  }

  public String getType(){
    return type;
  }
}
