package BurgerShop.src;

public class Item {
  
  private String name;
  protected String type;
  private String size;
  protected double price;

  Item(String name, String type, String size){
    this.name = name;
    this.type = type;
    this.size = size;
    this.setPrice();
  }

  public void setPrice(){

    if(name == "Side"){

      if(size == "Small"){
        this.price = 1.50;
      } else if(size == "Medium"){
        this.price = 2.25;
      } else {
        this.price = 2.75;
      }

    } else if(name == "Drink"){

      if(size == "Small"){
        this.price = 2.00;
      } else if(size == "Medium"){
        this.price = 2.75;
      } else {
        this.price = 3.25;
      }

    }
  }

  public String getType(){
    return type;
  }

  public double getPrice(){
    return price;
  }

}
