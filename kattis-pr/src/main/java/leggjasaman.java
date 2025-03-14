import java.util.Scanner;

public class leggjasaman {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int sum = input.nextInt();
            System.out.println(sum + input.nextInt());
        }
    }
}
