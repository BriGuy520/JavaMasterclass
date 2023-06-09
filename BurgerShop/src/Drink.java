package BurgerShop.src;

public class Drink {

  private String type;
  private String size;
  private double price;

  public Drink(){
    this("Diet", "S", 1.50);
  }
  
  public Drink(String type, String size, double price){
    this.type = type;
    this.size = size;
    this.price = price;
  }

  public String getType(){
    return type;
  }
}
