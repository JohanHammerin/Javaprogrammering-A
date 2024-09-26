package se.johan_hammerin.w3Schools.i_Inheritance.Uppgift_6;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.balance = 100;
        savingsAccount.addInterest();
        System.out.println(savingsAccount.balance);
    }
}
