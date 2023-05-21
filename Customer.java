public class Customer {

  private String name;
  private double creditLimit;
  private String emailAddress;

  public Customer(String name, double creditLimit, String emailAddress){
    this.name = name; 
    this.creditLimit = creditLimit;
    this.emailAddress = emailAddress;
  }

  public Customer(String customerName, String customerEmail){
    this(customerName, 2000.00, customerEmail); 
  }
  
  public Customer(){
    this("Brian Falasz", "brian@example.com");
  }

  

  public String getName(){
    return name;
  }

  public double getCreditLimit(){
    return creditLimit;
  }

  public String getEmailAddress(){
    return emailAddress;
  }
}