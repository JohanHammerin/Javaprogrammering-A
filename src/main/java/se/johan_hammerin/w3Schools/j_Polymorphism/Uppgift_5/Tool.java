package se.johan_hammerin.w3Schools.j_Polymorphism.Uppgift_5;

abstract class Tool {

    //Method
    protected void useTool() {
        System.out.println("Using " + getClass().getSimpleName());
    }

}
