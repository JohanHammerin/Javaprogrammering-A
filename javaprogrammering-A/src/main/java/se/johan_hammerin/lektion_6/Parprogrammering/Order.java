package se.johan_hammerin.lektion_6.Parprogrammering;

public class Order {
    Customer customer;
    Product[] products;

    //Constructor
    Order(Customer customer, Product[] products) {
        this.customer = customer;
        this.products = products;
    }


    //methods
    public double getTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public double getLowestPrice(Product[] products) {
        double lowestPrice = Integer.MAX_VALUE;
        for (Product product : products) {
            lowestPrice = Math.min(lowestPrice, product.getPrice());
        }
        return lowestPrice;
    }


    public double getHighestPrice(Product[] products) {
        double highestPrice = Integer.MIN_VALUE;
        for (Product product : products) {
            highestPrice = Math.max(highestPrice, product.getPrice());
        }
        return highestPrice;
    }

    //getters
    public Customer getCustomer() {
        return this.customer;
    }

    public Product[] getProducts() {
        return this.products;
    }
}
