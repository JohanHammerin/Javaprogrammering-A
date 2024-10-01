package se.johan_hammerin.w3Schools.m_Interface.Uppgift_1;

public class Car implements Vehicle {

    //Methods
    @Override
    public void startEngine() {
        System.out.println("Engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine stopped.");
    }
}
