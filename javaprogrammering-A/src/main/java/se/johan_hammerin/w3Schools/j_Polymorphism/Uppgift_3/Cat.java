package se.johan_hammerin.w3Schools.j_Polymorphism.Uppgift_3;

public class Cat extends Animal {

    //Method
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.print(" meowed\n");
    }
}
