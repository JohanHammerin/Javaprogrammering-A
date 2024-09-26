package se.johan_hammerin.lektion_6.Övning_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User("bob", "password");
        try (Scanner input = new Scanner(System.in)) {
            while (true) {
                System.out.print("Username:");
                String username = input.nextLine();
                System.out.print("password:");
                String password = input.nextLine();


                if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
                    System.out.println("Du är inloggad!");
                    break;
                } else {
                    System.out.println("Fel användarnamn eller lösenord.");
                }
            }
        }
    }
}
