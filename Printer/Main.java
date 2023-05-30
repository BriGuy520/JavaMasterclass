package Printer;

public class Main {

  public static void main(String[] args) {
    
    Printer printer = new Printer(50, 0, true);

    System.out.println(printer.getTonerLevel());

    printer.addToner(43);

    System.out.println(printer.printPages(4));

    printer.addToner(43);

    System.out.println(printer.getTonerLevel());
  }
  
}
