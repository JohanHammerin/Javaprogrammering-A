package se.johan_hammerin.lektion_9.associationer.Övning_2;

public class Main {
    public static void main(String[] args) {
        Publisher publisher = new Publisher("Johan Hammerin");
        Magazine magazine = new Magazine("Aftonbladet",39,publisher);
        System.out.println(magazine.getPublisher().getName());
    }
}
