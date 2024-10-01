package se.johan_hammerin.w3Schools.m_Interface.Uppgift_4;

public class WashingMachine implements Appliance {

    //Methods
    @Override
    public void turnOff() {
        System.out.println("Washing machine is now OFF");
    }

    @Override
    public void turnOn() {
        System.out.println("Washing machine is now ON");
    }
}
