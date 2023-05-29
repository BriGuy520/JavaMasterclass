package SmartKitchen;

public class Main {

  public static void main(String[] args) {
    
    SmartKitchen myKitchen = new SmartKitchen();

    myKitchen.setApplianceState(true, false, true);

    myKitchen.getRefrigerator().orderFood();
    myKitchen.getCoffeeMaker().brewCoffee();
    myKitchen.getDishWasher().doDishes();

      
  }
  
}
