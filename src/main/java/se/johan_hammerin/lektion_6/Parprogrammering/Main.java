package se.johan_hammerin.lektion_6.Parprogrammering;

public class Main {
    public static void main(String[] args) {
        Product firstProduct = new Product("Solbulle",100.0);
        Product secondProduct = new Product("Solbulle",150.0);
        Product thirdProduct = new Product("Solbulle",10.0);

        Product[] products = {firstProduct,secondProduct,thirdProduct};
        Customer customer = new Customer("Johan","Johan.hammerin@sti.stud.se");
        Order myOrder = new Order(customer,products);
        System.out.println("Summan av kardemumman = " + myOrder.getTotal() + " kr");

        System.out.println(myOrder.getLowestPrice(products));
        System.out.println(myOrder.getHighestPrice(products));

    }
}
