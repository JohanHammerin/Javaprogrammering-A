package se.johan_hammerin.Tärningsspelet;

import java.util.Random;

public class Dice {
    private static final Random random = new Random();

    //Methods
    public int rollWithAnimation(Player player) throws InterruptedException {
        System.out.print(player.getName() + " kastar tärningen");
        printWithDelay();
        int roll = random.nextInt(6) + 1;
        System.out.print(" " + roll);
        System.out.println();
        player.updateScore(roll);
        return roll;
    }

    public void printWithDelay() throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            Thread.sleep(700);
        }
    }
}
