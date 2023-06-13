package BurgerShop.src;

import java.util.ArrayList;

public class Burger {

  private String type;
  private double price;
  private ArrayList<String> toppings = new ArrayList<>();


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

  public double getPrice(){
    return price;
  } 

  public ArrayList<String> getToppings(){
    return toppings;
  }

  public void addTopping(Toppings topping){

    toppings.add(topping.getType());

    this.price += topping.getPrice();

  }
}
