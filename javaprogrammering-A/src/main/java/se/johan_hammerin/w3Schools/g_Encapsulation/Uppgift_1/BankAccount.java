package se.johan_hammerin.w3Schools.g_Encapsulation.Uppgift_1;

public class BankAccount {
    private String accountNumber;
    private double balance;

    //methods
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Du måste ange en positiv summa");
        } else {
            this.balance = getBalance() + amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > getBalance()) {
            System.out.println("För lågt saldo");
        } else {
            this.balance = getBalance() - amount;

        }
    }

    //getters & setters
    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

}
