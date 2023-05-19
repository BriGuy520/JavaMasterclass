public class BankAccount {

  private int AccountNumber;
  private double AccountBalance;
  private String CustomerName;
  private String Email;
  private String PhoneNumber;

  /* Getter Methods */

  public int getAccountNumber(){
    return this.AccountNumber;
  }
  
  public double getAccountBalance(){
    return this.AccountBalance;
  }

  public String getCustomerName(){
    return this.CustomerName;
  }

  public String getEmail(){
    return this.Email;
  }

  public String getPhoneNumber(){
    return this.PhoneNumber;
  }

  /* Setter Methods */

  public void setAccountNumber(int AccountNumber){
    this.AccountNumber = AccountNumber;
  }
  
  public void setAccountBalance(double AccountBalance){
    this.AccountBalance = AccountBalance;
  }

  public void setCustomerName(String CustomerName){
    this.CustomerName = CustomerName;
  }

  public void setEmail(String Email){
    this.Email = Email;
  }

 public void setPhoneNumber(String PhoneNumber){
    this.PhoneNumber = PhoneNumber;
  }

  /* Deposit and Withdrawal Methods */

  public void deposit(double DepositAmount){

    this.AccountBalance = this.AccountBalance + DepositAmount;
  }

  public void withdraw(double WithdrawalAmount){

    double newBalance = this.AccountBalance - WithdrawalAmount;

    if(newBalance >= 0){
      this.AccountBalance = newBalance;
    } else {
      System.out.println("You do not have enough funds to make the withdrawal");
    }
  }

}