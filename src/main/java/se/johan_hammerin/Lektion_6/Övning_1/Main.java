package se.johan_hammerin.Lektion_6.Övning_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Namn:");
            String name = input.nextLine();

            System.out.print("Ålder:");
            int age = input.nextInt();
            input.nextLine(); //Måste ha om man går från int till string men inte tvärtom

            System.out.print("Jobb:");
            String job = input.nextLine();
            Person person = new Person(name, age, job);
            System.out.println(person);
            System.out.println("Vill du byta yrke?\n1.ja\n2.nej");

            while (true) {
                String inputforNewJob = input.nextLine();
                if (inputforNewJob.equalsIgnoreCase("ja")) {
                    System.out.print("Ange nytt jobb:");
                    person.setJob(input.nextLine());
                    System.out.println(person);
                    System.out.println("Programmet stängs av...");
                    break;
                } else if (inputforNewJob.equalsIgnoreCase("nej")) {
                    System.out.println("Programmet stängs av...");
                    break;
                } else {
                    System.out.println("Du måste ange ett riktigt svar, ja eller nej");
                }
            }
        }
    }
}
