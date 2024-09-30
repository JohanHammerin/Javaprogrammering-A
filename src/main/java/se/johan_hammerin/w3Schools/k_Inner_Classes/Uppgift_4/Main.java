package se.johan_hammerin.w3Schools.k_Inner_Classes.Uppgift_4;

public class Main {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();

        outerClass.outerMethod();
        innerClass.outerMethod();
    }
}
