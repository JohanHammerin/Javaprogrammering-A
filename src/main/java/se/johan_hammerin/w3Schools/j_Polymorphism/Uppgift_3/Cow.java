package se.johan_hammerin.w3Schools.j_Polymorphism.Uppgift_3;

public class Cow extends Animal {

    //Method
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.print(" muuuuuu\n");
    }
}
