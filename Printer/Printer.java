package Printer;

public class Printer {

  private int tonerLevel;
  private int pagesPrinted;
  private boolean duplex;

  public Printer(int tonerLevel, boolean duplex){
    this(tonerLevel, 0, duplex);
  }

  public Printer(int tonerLevel, int pagesPrinted, boolean duplex){
    this.tonerLevel = (tonerLevel > 100 || tonerLevel <= 0) ? -1 : tonerLevel;
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

    int jobPages = duplex ? (pages / 2) + (pages % 2) : pages; 

    pagesPrinted += jobPages;
    
    return jobPages;
  }

  public void duplexPrinter(){

    if(duplex){
      System.out.println("This is a duplex printer");
    }
  }

  public int getPagesPrinted(){
    return pagesPrinted;
  }

  public int getTonerLevel(){
    return tonerLevel;
  }
  
}
