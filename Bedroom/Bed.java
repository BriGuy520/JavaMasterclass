package Bedroom;

public class Bed {

  private int quilt;
  private int sheets;
  private int pillows;
  private int height;
  private String style;

  public Bed(String style, int quilt, int sheets, int pillows, int height){
    this.style = style;
    this.quilt = quilt;
    this.sheets = sheets;
    this.pillows = pillows;
    this.height = height;
  }

  public void makeBed(){
    System.out.println("The bed is being made...");
  }

  public int getQuilt(){
    return quilt;
  }
  public int getSheets(){
    return sheets;
  }

  public int getPillows(){
    return pillows;
  }

  public int getHeight(){
    return height;
  }

  public String getStyle(){
    return style;
  }
  
}
