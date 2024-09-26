package se.johan_hammerin.lektion_3.methods;

public class MethodExercise {

    public static void main(String[] args) {
        printGreeting();
        printPersonalGreeting("Johan");
        printSum(10,2);

        int multipliedNumbers = multiplyNumbers(5,2);
        System.out.println(multipliedNumbers);

        String fullName = createFullName("Johan", "Hammerin");
        System.out.println("fullName = " + fullName);
    }

    public static String createFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public static int multiplyNumbers(int num1, int num2) {
        return num1 * num2;
    }

    public static void printSum(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public static void printGreeting() {
        System.out.println("Välkommen till Java!");
    }

    public static void printPersonalGreeting(String name) {
        System.out.println("Hej, " + name);
    }
}


