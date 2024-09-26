package se.johan_hammerin.w3Schools.c_Class_Attributes.Uppgift_4;

public class Main {
    public static void main(String[] args) {
        Animal firstAnimal = new Animal();
        Animal secondAnimal = new Animal();
        secondAnimal.species = "cat";

        System.out.println("firstAnimal = " + firstAnimal.species);
        System.out.println("secondAnimal = " + secondAnimal.species);

    }
}
