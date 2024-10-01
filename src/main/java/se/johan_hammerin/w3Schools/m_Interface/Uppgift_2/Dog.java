package se.johan_hammerin.w3Schools.m_Interface.Uppgift_2;

public class Dog implements Movable, Soundable {

    //Methods
    @Override
    public void move() {
        System.out.println("The dog runs.");
    }

    @Override
    public void makeSound() {
        System.out.println("The dog barks: Woof Woof!");
    }
}
