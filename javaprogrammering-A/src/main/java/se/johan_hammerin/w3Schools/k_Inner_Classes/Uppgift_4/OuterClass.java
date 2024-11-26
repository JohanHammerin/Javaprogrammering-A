package se.johan_hammerin.w3Schools.k_Inner_Classes.Uppgift_4;

public class OuterClass {
    //Attribute
    int x = 10;

    //Method
    public void outerMethod() {
        System.out.println(this.x);
    }

    //Class
    public class InnerClass {

        //Method
        public void outerMethod() {
            OuterClass.this.outerMethod();
        }
    }


}
