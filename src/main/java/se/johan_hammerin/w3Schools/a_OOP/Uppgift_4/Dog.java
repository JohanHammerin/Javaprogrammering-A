package se.johan_hammerin.w3Schools.a_OOP.Uppgift_4;

public class Dog extends Animal {

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.print(" barked!");
    }
}
