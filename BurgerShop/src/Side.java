package BurgerShop.src;

public class Side {
  
  private String type;
  private double price;

  public Side(){
    this("Fries", 1.50);
  }

  public Side(String type, double price){
    this.type = type;
    this.price = price;
  }

  public String getType(){
    return type;
  }

  public double getPrice(){
    return price;
  }

  public void sideSize(String selectedSize){

    if(selectedSize == "S"){
      this.price = 1.50;
    } else if(selectedSize == "M"){
      this.price = 2.25;
    } else {
      this.price = 2.75;
    }
  }
}
