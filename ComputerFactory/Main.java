package ComputerFactory;

public class Main {

  public static void main(String[] args) {
    
    ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
    Monitor theMonitor = new Monitor("The Beast 27in", "Acer", 27, "2540 x 1440");
    Motherboard theMotherboard = new Motherboard("BJ-200", "Acer", 2, 5, "v2.24");

    PersonalComputer myPC = new PersonalComputer("2208", "Dell", theCase, theMonitor, theMotherboard);

    myPC.getMonitor().drawPixelAt(10, 12, "red");
    myPC.getMotherboard().loadProgram("Window OS");
  }
  
}
