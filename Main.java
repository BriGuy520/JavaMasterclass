public class Main {

  public static void main(String args[]){
    
    BankAccount myBankAccount = new BankAccount();

    myBankAccount.setAccountNumber(1929499);
    myBankAccount.setAccountBalance(20000.12);
    myBankAccount.setCustomerName("Brian Falasz");
    myBankAccount.setEmail("brian@test.com");
    myBankAccount.setPhoneNumber("555-555-5555");

    System.out.println(myBankAccount.getCustomerName() + " has a bank account with a balance of " + String.format("%.02f", myBankAccount.getAccountBalance()));

    myBankAccount.deposit(4500.82);

    System.out.println(myBankAccount.getCustomerName() + " has a bank account with a balance of " + String.format("%.02f", myBankAccount.getAccountBalance()));

    myBankAccount.withdraw(3499.29);

    System.out.println(myBankAccount.getCustomerName() + " has a bank account with a balance of " + String.format("%.02f", myBankAccount.getAccountBalance()));

    myBankAccount.withdraw(23499.29);

    System.out.println(myBankAccount.getCustomerName() + " has a bank account with a balance of " + String.format("%.02f", myBankAccount.getAccountBalance()));
  }
}