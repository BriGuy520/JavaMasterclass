package InheritanceChallenge.src;

public class Employee extends Worker {
  
  private long employeeId;
  private String hireDate;

  public Employee(String birthDate, String endDate, long employeeId, String hireDate){
    super(birthDate, endDate);
    this.employeeId = employeeId;
    this.hireDate = hireDate;
  }

  public Employee(long employeeId, String hireDate){

    this.employeeId = employeeId;
    this.hireDate = hireDate;
  }
}
