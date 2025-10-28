package day_7.oops.banking_app;

public class BankDemo {
    public static void main(String[] args) {
        BankAccount account1 = new SavingsAccount("S123", 1000, 5);
        BankAccount account2 = new CurrentAccount("C456", 2000, 500);

        account1.withdraw(200);
        account2.withdraw(2000);

//        account1.addInterest();
        SavingsAccount savingsAccount = (SavingsAccount) account1;
        savingsAccount.addInterest();

//        account1 = savingsAccount;


        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
    }
}
