package se.johan_hammerin.w3Schools.g_Encapsulation.Uppgift_1;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println(bankAccount.getBalance());
        bankAccount.deposit(120);
        System.out.println(bankAccount.getBalance());
        bankAccount.withdraw(100);
        System.out.println(bankAccount.getBalance());

    }
}
