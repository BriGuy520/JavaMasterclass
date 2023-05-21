public class Main {

  public static void main(String args[]){


    for(int i = 1; i <= 5; i++){

      Student students = new Student(
        "192838", 
        switch(i){
          case 1 -> "Madeleine";
          case 2 -> "Brian";
          case 3 -> "Hayes";
          case 4 -> "Cosmo";
          case 5 -> "Harry"; 
          default -> "Anonymous";
        },
        "04/20/1990",
        "Programming"
      );


      System.out.println(students);
    }


    
    // BankAccount myBankAccount = new BankAccount();

    // myBankAccount.setAccountNumber(1929499);
    // myBankAccount.setAccountBalance(20000.12);
    // myBankAccount.setCustomerName("Brian Falasz");
    // myBankAccount.setEmail("brian@test.com");
    // myBankAccount.setPhoneNumber("555-555-5555");

    // System.out.println(myBankAccount.getCustomerName() + " has a bank account with a balance of " + String.format("%.02f", myBankAccount.getAccountBalance()));

    // myBankAccount.deposit(4500.82);

    // System.out.println(myBankAccount.getCustomerName() + " has a bank account with a balance of " + String.format("%.02f", myBankAccount.getAccountBalance()));

    // myBankAccount.withdraw(3499.29);

    // System.out.println(myBankAccount.getCustomerName() + " has a bank account with a balance of " + String.format("%.02f", myBankAccount.getAccountBalance()));

    // myBankAccount.withdraw(23499.29);

    // System.out.println(myBankAccount.getCustomerName() + " has a bank account with a balance of " + String.format("%.02f", myBankAccount.getAccountBalance()));

    // SimpleCalculator calculator = new SimpleCalculator();

    // calculator.setFirstNumber(11);
    // calculator.setSecondNumber(33);

    // System.out.println(calculator.getSecondNumber());

    // System.out.println(calculator.getAdditionResult());

    // Person brian = new Person();

    // System.out.println(brian.getFullName());

    // brian.setFirstName("Brian");

    // System.out.println(brian.getFullName());

    // brian.setFirstName("Falasz");

    // System.out.println(brian.getFullName());

    // brian.setAge(33);

    // Customer brian = new Customer();

    // System.out.println(brian.getName());

    // System.out.println(brian.getCreditLimit());

    // Customer madeleine = new Customer("Madeleine", "madeleine@example.com");

    // System.out.println(madeleine.getCreditLimit());
    

  }
}