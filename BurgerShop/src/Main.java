package BurgerShop.src;

public class Main {

  public static void main(String[] args) {
    
    // Order myOrder = new Side();

    // myOrder.getCurrentOrder();

    Meal standard = new Meal();

    Toppings lettuce = new Toppings("Lettuce", 0.25);
    Toppings onions = new Toppings("Onions", 0.25);
    Toppings tomatoes = new Toppings("Tomotoes", 0.50);
    Toppings mushrooms = new Toppings("Mushrooms", 0.75);
    Toppings cheese = new Toppings("Cheese", 1.00);
    Toppings mayo = new Toppings("Mayo", 0.50);
    Toppings ketchup = new Toppings("Ketchup", 0.00);

    standard.getCurrentMeal();

    standard.totalPrice();

    Burger deluxeBurger = new Burger("Deluxe", 8.50);
    Item taterTots = new Item("Side", "Tater Tots", "Medium");
    Item drPepper = new Item("Drink", "Dr. Pepper", "Large");

    Meal deluxeMeal = new Meal(deluxeBurger, taterTots, drPepper);

    deluxeMeal.getCurrentMeal();
    deluxeMeal.totalPrice();
    

    standard.getBurger().addTopping(onions);
    standard.getBurger().addTopping(mushrooms);
    standard.getBurger().addTopping(ketchup);

    standard.totalPrice();
  }

}
