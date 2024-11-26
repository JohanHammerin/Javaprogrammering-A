package se.johan_hammerin.w3Schools.j_Polymorphism.Uppgift_4;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        PayPal payPal = new PayPal();

        creditCard.processPayment();
        payPal.processPayment();
    }
}
