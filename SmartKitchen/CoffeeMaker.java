package SmartKitchen;

public class CoffeeMaker {

  private boolean hasWorkToDo;  

  public void setHasWorkToDo(boolean hasWorkToDo){
    this.hasWorkToDo = hasWorkToDo;
  }

  public void brewCoffee(){
    if(hasWorkToDo){
      System.out.println("The coffee maker is doing work");
      hasWorkToDo = false;
    }
  }
  
}
