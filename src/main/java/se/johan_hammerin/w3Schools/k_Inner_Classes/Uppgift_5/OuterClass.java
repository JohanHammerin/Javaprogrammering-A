package se.johan_hammerin.w3Schools.k_Inner_Classes.Uppgift_5;

public class OuterClass {
    int x = 110;
    //Classes
    public static class StaticClass {
        //Method
        public void staticInnerMethod() {
            System.out.println("Detta kommer från en statisk klass");
        }


    }

    public class NotStaticClass {
        //Method
        public void nonStaticInnerMethod() {
            System.out.println(x);
        }


    }
}
