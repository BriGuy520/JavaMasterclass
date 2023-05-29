package ComputerFactory;

public class Motherboard extends Product {  

  private int ramSlots;
  private int cardSlots;
  private String bios;

  public Motherboard(String model, String manufacturer){
    super(model, manufacturer);
  }

  public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios){
    super(model, manufacturer);

    this.ramSlots = ramSlots;
    this.cardSlots = cardSlots;
    this.bios = bios;
  }

  public void loadProgram(String programName){
    System.out.printf("%s is loading...%n", programName);
  }
}
