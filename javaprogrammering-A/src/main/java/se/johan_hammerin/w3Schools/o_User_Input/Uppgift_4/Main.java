package se.johan_hammerin.w3Schools.o_User_Input.Uppgift_4;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            System.out.println("Tycker du programmering är roligt?\n" +
                    "(true/false)");
            try {
                boolean isFun = input.nextBoolean();
                System.out.println(isFun);
            } catch (InputMismatchException e) {
                System.out.println("Du får bara ange (true/false)");
            }
        }
    }
}
