package BurgerShop.src;

public class Meal {

  private Burger burger;
  private Item side;
  private Item drink;


  public Meal(){
    burger = new Burger();
    side = new Item("Side", "Fries", "Small");
    drink = new Item("Drink", "Diet", "Small");
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
    System.out.printf("The current side is %s, drink is %s and burger is %s", side.getType(), drink.getType(), burger.getType());
  }
}
