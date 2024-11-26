package se.johan_hammerin.w3Schools.d_Class_Methods.Uppgift_1;

public class Calculator {

    static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        int sum = addNumbers(10,2);
        System.out.println(sum);
    }

}


