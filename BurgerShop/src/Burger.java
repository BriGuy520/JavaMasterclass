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

    final int toppingsCount =  getToppings().size();

    if(this.getType() == "Deluxe" && toppingsCount < 2){

      toppings.add(topping.getType());
    
    } else if(this.getType() != "Deluxe" && toppingsCount < 3){

      toppings.add(topping.getType());
    
    } else {

      System.out.println("Cannot add anymore toppings.");
    }


    if(this.getType() != "Deluxe" && toppingsCount < 3){

      this.price += topping.getPrice();
    }


  }
}
