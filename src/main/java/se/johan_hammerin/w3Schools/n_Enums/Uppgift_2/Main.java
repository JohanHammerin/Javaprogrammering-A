package se.johan_hammerin.w3Schools.n_Enums.Uppgift_2;

public class Main {
    public static void main(String[] args) {
        Level difficulty = Level.HIGH;

        switch (difficulty) {
            case LOW, MEDIUM, HIGH:
                System.out.println("You have selected: " + difficulty + " level");
                break;
        }
    }
}
