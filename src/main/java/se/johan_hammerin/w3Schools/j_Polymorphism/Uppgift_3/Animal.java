package se.johan_hammerin.w3Schools.j_Polymorphism.Uppgift_3;

abstract class Animal {

    //Method
    public void makeSound() {
        System.out.print(getClass().getSimpleName());
    }
}
