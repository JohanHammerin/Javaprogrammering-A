package se.johan_hammerin.w3Schools.a_OOP.Uppgift_4;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        System.out.println();
        Animal cat = new Cat();
        cat.makeSound();
        System.out.println();
        Animal cow = new Cow();
        cow.makeSound();


        /*
        Ett objekt t.e.x Dog är en instans av klassen animal. Då den ärver metoden "Makesound()" från Animal
        klassen.
         */
    }
}
