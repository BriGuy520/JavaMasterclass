package SmartKitchen;

public class DishWasher {

  private boolean hasWorkToDo;  

  public void setHasWorkToDo(boolean hasWorkToDo){
    this.hasWorkToDo = hasWorkToDo;
  }

  public void doDishes(){
    if(hasWorkToDo){
      System.out.println("The dish washer is doing work");
      hasWorkToDo = false;
    }
  }
}
