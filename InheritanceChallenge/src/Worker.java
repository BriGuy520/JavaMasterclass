package InheritanceChallenge.src;

import java.time.Period;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Worker {
  
  private String name;
  private String birthDate;
  protected String endDate;

  public Worker(){
    this("Brian Falasz", "1990-05-20", "2023-05-23");
  }

  public Worker(String name, String endDate){
    this(name, "1991-05-20", endDate);
  }

  public Worker(String name, String birthDate, String endDate){
    this.name = name;
    this.birthDate = birthDate;
    this.endDate = endDate;
  }


  public int getAge(){

    LocalDate currentDate = LocalDate.now();

    LocalDate birthDateLocal = LocalDate.parse(birthDate, DateTimeFormatter.ISO_DATE);

    Period age = Period.between(birthDateLocal, currentDate);

    return age.getYears();
  }

  public double collectPay(){
    return 0.0;
  }

  public void terminate(String endDate){
    this.endDate = endDate;
  }
}
