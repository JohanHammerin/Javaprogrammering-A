package se.johan_hammerin.w3Schools.j_Polymorphism.Uppgift_4;

public class PayPal extends PaymentMethod {

    //Method
    @Override
    public void processPayment() {
        System.out.println("PayPal...");
    }
}
