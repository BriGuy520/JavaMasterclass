package BurgerShop.src;

public class Meal {

  private Burger burger;
  private Side side;
  private Drink drink;


  public Meal(){
    burger = new Burger();
    side = new Side();
    drink = new Drink();
  }

  public Burger getBurger(){
    return burger;
  }

  public Side getSide(){
    return side;
  }

  public Drink getDrink(){
    return drink;
  }

  public void getCurrentMeal(){
    System.out.printf("The current side is %s, drink is %s and burger is %s", side.getType(), drink.getType(), burger.getType());
  }
}
