package se.johan_hammerin.Tärningsspelet;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int playerCount = getPlayerCount(input);
            Game game = initializeGame(input, playerCount);
            game.start();
        } catch (InputMismatchException e) {
            System.out.println("Felaktig inmatning, vänligen ange ett heltal.");
        } catch (InterruptedException e) {
            System.out.println("Spelet avbröts oväntat.");
        }
    }

    private static int getPlayerCount(Scanner input) {
        int playerCount = 0;
        while (playerCount != 1 && playerCount != 2) {
            System.out.println("Ange antalet spelare: (1 för att spela mot datorn, 2 för att spela mot en annan person)");
            try {
                playerCount = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Felaktig inmatning, vänligen ange ett heltal.");
                input.next();
            }
        }
        return playerCount;
    }

    private static Game initializeGame(Scanner input, int playerCount) {
        input.nextLine(); // Rensa Scanner
        System.out.print("Ange förste spelarens namn: ");
        Player firstPlayer = new Player(input.nextLine());

        Player secondPlayer = (playerCount == 1) ? new Player("Datorn") : getSecondPlayer(input);
        return new Game(firstPlayer, secondPlayer);
    }

    private static Player getSecondPlayer(Scanner input) {
        System.out.print("Ange andre spelarens namn: ");
        return new Player(input.nextLine());
    }
}
