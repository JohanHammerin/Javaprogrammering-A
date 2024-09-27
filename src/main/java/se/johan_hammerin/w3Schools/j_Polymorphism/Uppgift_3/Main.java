package se.johan_hammerin.w3Schools.j_Polymorphism.Uppgift_3;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        dog.makeSound();
        cat.makeSound();
        cow.makeSound();
    }
}
