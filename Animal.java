public class Animal {

  private String name;
  private int legs;
  private boolean fur;

  public Animal(){
    
  }

  public Animal(String name, int legs, boolean fur){
    this.name = name;
    this.legs = legs;
    this.fur  = fur;
  }

  public void animalInfo(){
    System.out.println(name + " has " + legs + " legs and " + (fur ? "fur" : "no fur"));
  }

  public void animalNoise(String noise){
    System.out.println(name + " says " + noise);
  }
  
}
