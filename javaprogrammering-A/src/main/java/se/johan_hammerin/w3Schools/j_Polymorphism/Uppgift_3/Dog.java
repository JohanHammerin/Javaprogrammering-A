package se.johan_hammerin.w3Schools.j_Polymorphism.Uppgift_3;

public class Dog extends Animal {

    //Method
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.print(" barked\n");
    }
}
