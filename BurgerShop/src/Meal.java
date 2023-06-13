package BurgerShop.src;

import java.util.ArrayList;

public class Meal {

  private Burger burger;
  private Item side;
  private Item drink;


  public Meal(){
    burger = new Burger();
    side = new Item("Side", "Fries", "Small");
    drink = new Item("Drink", "Diet", "Small");
  }

  public Meal(Burger burger, Item side, Item drink){
    this.burger = burger;
    this.side = side;
    this.drink = drink;
  }

  public Burger getBurger(){
    return burger;
  }

  public Item getSide(){
    return side;
  }

  public Item getDrink(){
    return drink;
  }

  public void getCurrentMeal(){

    String currentToppings = burger.getToppings().size() > 0 ? String.join(", ", burger.getToppings()) : "no";

    System.out.printf("The current side is a %s %s, drink is a %s %s and burger is %s with %s toppings. %n", side.getSize(), side.getType(), drink.getSize(), drink.getType(), burger.getType(), currentToppings);
  }


  public void totalPrice(){

    System.out.printf("The total of the meal is %.2f%n", drink.getPrice() + side.getPrice() + burger.getPrice());
  }
}
