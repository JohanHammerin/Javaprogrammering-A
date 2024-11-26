package se.johan_hammerin.w3Schools.o_User_Input.Uppgift_1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            System.out.print("Ange ditt namn:");
            String name = input.next();
            System.out.println(name);
        }
    }
}
