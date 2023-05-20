public class BankAccount {

  private int accountNumber;
  private double accountBalance;
  private String customerName;
  private String customerEmail;
  private String customerPhoneNumber;

  /* Getter Methods */

  public int getAccountNumber(){
    return this.accountNumber;
  }
  
  public double getAccountBalance(){
    return this.accountBalance;
  }

  public String getCustomerName(){
    return this.customerName;
  }

  public String getEmail(){
    return this.customerEmail;
  }

  public String getPhoneNumber(){
    return this.customerPhoneNumber;
  }

  /* Setter Methods */

  public void setAccountNumber(int accountNumber){
    this.accountNumber = accountNumber;
  }
  
  public void setAccountBalance(double accountBalance){
    this.accountBalance = accountBalance;
  }

  public void setCustomerName(String customerName){
    this.customerName = customerName;
  }

  public void setEmail(String customerEmail){
    this.customerEmail = customerEmail;
  }

 public void setPhoneNumber(String customerPhoneNumber){
    this.customerPhoneNumber = customerPhoneNumber;
  }

  /* Deposit and Withdrawal Methods */

  public void deposit(double DepositAmount){

    this.accountBalance = accountBalance + DepositAmount;
  }

  public void withdraw(double WithdrawalAmount){

    double newBalance = accountBalance - WithdrawalAmount;

    if(newBalance >= 0){
      this.accountBalance = newBalance;
    } else {
      System.out.println("You do not have enough funds to make the withdrawal");
    }
  }

}