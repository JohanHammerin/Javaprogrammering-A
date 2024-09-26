package se.johan_hammerin.lektion_10;

import java.util.Scanner;

public class Övning_3 {
    public static void main(String[] args) {
        int sum = 0;
        try (Scanner input = new Scanner(System.in)) {
            int myNum;
            do {
                System.out.println("sum=" + sum);

                myNum = input.nextInt();
                if(myNum < 0) {
                    break;
                }
                sum += myNum;
            } while (myNum > 0);
            {
                System.out.println("sum=" + sum);
            }
        }
    }
}
