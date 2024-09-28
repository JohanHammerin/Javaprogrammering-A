package se.johan_hammerin.w3Schools.k_Inner_Classes.Uppgift_1;

public class Main {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.setX(2);
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.setY(2);

        System.out.println(outerClass.getX() + innerClass.getY());
    }
}
