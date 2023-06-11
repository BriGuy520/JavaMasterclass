package BurgerShop.src;

public class Main {

  public static void main(String[] args) {
    
    // Order myOrder = new Side();

    // myOrder.getCurrentOrder();

    Meal standard = new Meal();

    Burger lettuce = new Toppings("Lettuce", 0.25);
    Burger onions = new Toppings("Onions", 0.25);
    Burger tomatoes = new Toppings("Tomotoes", 0.50);
    Burger mushrooms = new Toppings("Mushrooms", 0.75);
    Burger cheese = new Toppings("Cheese", 1.00);
    Burger mayo = new Toppings("Mayo", 0.50);
    Burger ketchup = new Toppings("Ketchup", 0.00);

    standard.getCurrentMeal();

    standard.totalPrice();

    Burger deluxeBurger = new Burger("Deluxe", 8.50);
    Item taterTots = new Item("Side", "Tater Tots", "Medium");
    Item drPepper = new Item("Drink", "Dr. Pepper", "Large");

    Meal deluxeMeal = new Meal(deluxeBurger, taterTots, drPepper);

    deluxeMeal.getCurrentMeal();
    deluxeMeal.totalPrice();

  }
  
}
