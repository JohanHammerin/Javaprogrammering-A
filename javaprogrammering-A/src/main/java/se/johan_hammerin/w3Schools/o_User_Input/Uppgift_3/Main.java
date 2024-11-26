package se.johan_hammerin.w3Schools.o_User_Input.Uppgift_3;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            System.out.print("Ange din ålder:");
            try {
                int age = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("Du måste ange ett heltal");
            }
        }
    }
}
