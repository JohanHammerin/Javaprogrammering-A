package se.johan_hammerin.w3Schools.o_User_Input.Uppgift_2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            System.out.print("Ange namn:");
            String name = input.next();

            System.out.print("Ange ålder:");
            int age = input.nextInt();

            System.out.print("Ange lön:");
            double income = input.nextDouble();

            System.out.println("name: " + name + "\n" +
                    "age: " + age + "\n" +
                    "income: " + income);
        }
    }
}
