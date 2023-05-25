package InheritanceChallenge.src;

public class SalariedEmployee extends Employee {

  private double annualSalary;
  private boolean isRetired;

  
  

  public void retire(){
    this.isRetired = true;
  }
  
}
