package se.johan_hammerin.w3Schools.k_Inner_Classes.Uppgift_5;

public class Main {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.StaticClass staticClass = new OuterClass.StaticClass();
        OuterClass.NotStaticClass nonStaticClass = outerClass.new NotStaticClass();

        staticClass.staticInnerMethod();
        nonStaticClass.nonStaticInnerMethod();
    }
}
