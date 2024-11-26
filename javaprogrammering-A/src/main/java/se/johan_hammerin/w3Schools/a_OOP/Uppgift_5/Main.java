package se.johan_hammerin.w3Schools.a_OOP.Uppgift_5;

public class Main {
    public static void main(String[] args) {
        Fruit fruit = new Banana("tasty");
        fruit.describe();
    }

    /*
    När jag skapar t.e.x en banan är det som att jag skapar ett barn från fruktklassen. Om jav vill kan bananen
    även ärva saker från sin förälder som i detta fall är klassen "Fruit".
     */
}
