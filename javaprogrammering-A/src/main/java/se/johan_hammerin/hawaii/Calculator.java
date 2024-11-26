package se.johan_hammerin.hawaii;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Calculator {
    public static void main(String[] args) {
        try {
            // Open the calculator application
            Runtime.getRuntime().exec("calc"); // For Windows

            // Give some time for the calculator to open (adjust if needed)
            Thread.sleep(2000);

            // Create a Robot instance
            Robot robot = new Robot();

            // Press 2
            robot.keyPress(KeyEvent.VK_2);
            robot.keyRelease(KeyEvent.VK_2);

            // Press +
            robot.keyPress(KeyEvent.VK_ADD); // Windows calculator uses VK_ADD for "+"
            robot.keyRelease(KeyEvent.VK_ADD);

            // Press 5
            robot.keyPress(KeyEvent.VK_3);
            robot.keyRelease(KeyEvent.VK_3);

            // Press Enter to get the result
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

            //

            /*
            HUR KAN VI ÖKA KOMPLEXITETEN??



            */
        } catch (Exception e) {
            System.out.println("Fel");
        }
    }
}
