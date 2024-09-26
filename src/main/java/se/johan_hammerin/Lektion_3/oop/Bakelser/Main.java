package se.johan_hammerin.Lektion_3.oop.Bakelser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("1. Solbulle\n2. Bullängd");
            int valAvBakelse = input.nextInt();

            input.nextLine(); // Consume newline left-over
            if (valAvBakelse == 1) {
                Solbulle solbulle = new Solbulle();
                angeEgenskaper(solbulle, input);

                System.out.println("Ange mängden vaniljkräm (dl)");
                solbulle.setVaniljKräm(input.nextInt());

                input.nextLine(); // Consume newline left-over
                System.out.println("Skriv true om du vill ha socker på toppen och false om du inte är lagd på det sättet");
                solbulle.setSocker(Boolean.parseBoolean(input.nextLine().toLowerCase())); // Lowercase to ensure correct parsing

                if (solbulle.isSocker()) {
                    System.out.println("Ange hur mycket socker du vill ha (dl)");
                    solbulle.setSockerPåTopp(input.nextInt());
                    input.nextLine(); // Consume newline after nextInt
                }

                System.out.println(solbulle); // Printing the final object
            }
        }
    }

    private static void angeEgenskaper(Solbulle solbulle, Scanner input) {
        System.out.println("Ange namnet på din bakelse:");
        solbulle.setName(input.nextLine());

        System.out.println("Ange formen:");
        solbulle.setForm(input.nextLine());

        System.out.println("Ange smak:");
        solbulle.setSmak(input.nextLine());

        System.out.println("Ange textur:");
        solbulle.setTextur(input.nextLine());

        System.out.println("Ange pris:");
        solbulle.setPris(input.nextInt());
        input.nextLine(); // Consume newline after nextInt
    }
}
