package SmartKitchen;

public class Refrigerator {

  private boolean hasWorkToDo;  

  public void setHasWorkToDo(boolean hasWorkToDo){
    this.hasWorkToDo = hasWorkToDo;
  }

  public void orderFood(){
    if(hasWorkToDo){
      System.out.println("The refrigerator is doing work");
      hasWorkToDo = false;
    }
  }
  
}
