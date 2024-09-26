package se.johan_hammerin.tärningsspelet;

public class Game {
    //Attributes
    private final Player firstPlayer;
    private final Player secondPlayer;
    private final Dice dice;

    //Constructor
    public Game(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
        this.dice = new Dice();
    }

    //Methods
    public void start() throws InterruptedException {
        int firstPlayerScore = playTurn(firstPlayer);
        int secondPlayerScore = playTurn(secondPlayer);
        showScores();
        determineWinner(firstPlayerScore, secondPlayerScore);
    }

    private int playTurn(Player player) throws InterruptedException {
        System.out.println(player.getName() + "'s tur:");
        int totalScore = dice.rollWithAnimation(player);
        totalScore += dice.rollWithAnimation(player);
        return totalScore;
    }

    private void showScores() {
        System.out.printf("%s totala poäng: %d%n", firstPlayer.getName(), firstPlayer.getScore());
        System.out.printf("%s totala poäng: %d%n", secondPlayer.getName(), secondPlayer.getScore());
    }

    private void determineWinner(int firstScore, int secondScore) throws InterruptedException {
        System.out.print("Räknar ihop resultaten");
        dice.printWithDelay();

        if (firstScore > secondScore) {
            System.out.println(firstPlayer.getName() + " vinner!");
        } else if (secondScore > firstScore) {
            System.out.println(secondPlayer.getName() + " vinner!");
        } else {
            System.out.println("Det är oavgjort!");
        }
    }
}
