package SmartKitchen;

public class SmartKitchen {
 
  private CoffeeMaker brewMaster;
  private DishWasher dishMaster;
  private Refrigerator freshMaster;

  public SmartKitchen(){
    brewMaster = new CoffeeMaker();
    dishMaster = new DishWasher();
    freshMaster = new Refrigerator();
  }


  public CoffeeMaker getCoffeeMaker(){
    return brewMaster;
  }

  public DishWasher getDishWasher(){
    return dishMaster;
  }

  public Refrigerator getRefrigerator(){
    return freshMaster;
  }

  public void setApplianceState(boolean coffeeMakerState, boolean dishWasherState, boolean rerigeratorState){

    brewMaster.setHasWorkToDo(coffeeMakerState);
    dishMaster.setHasWorkToDo(dishWasherState);
    freshMaster.setHasWorkToDo(rerigeratorState);

  }

}
