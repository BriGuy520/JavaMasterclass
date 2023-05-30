package Printer;

public class Printer {

  private int tonerLevel;
  private int pagesPrinted;
  private boolean duplex;

  public Printer(int tonerLevel, int pagesPrinted, boolean duplex){
    if(tonerLevel > 100){
      this.tonerLevel = 100;
    } else if(tonerLevel <= 0){
      this.tonerLevel = 1;
    } else {
      this.tonerLevel = tonerLevel;
    }
    this.pagesPrinted = pagesPrinted;
    this.duplex = duplex;
  }

  public int addToner(int tonerAmount){
    int newTonerLevel = tonerLevel + tonerAmount;

    if(newTonerLevel > 100 || newTonerLevel <= 0){
      return -1;
    } else {

      tonerLevel = newTonerLevel;

      return tonerLevel;
    }
  }

  public int printPages(int pages){

    if(duplex){
      pages = pages / 2;

      pagesPrinted = pagesPrinted + pages;

      return pagesPrinted;
    } else {

      pagesPrinted = pagesPrinted + pages;

      return pagesPrinted;
    }
  }

  public void duplexPrinter(){

    if(duplex){
      System.out.println("This is a duplex printer");
    }
  }

  public int getTonerLevel(){
    return tonerLevel;
  }
  
}
