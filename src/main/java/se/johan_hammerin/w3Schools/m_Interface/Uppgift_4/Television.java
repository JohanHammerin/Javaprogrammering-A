package se.johan_hammerin.w3Schools.m_Interface.Uppgift_4;

public class Television implements Appliance {

    //Methods
    @Override
    public void turnOff() {
        System.out.println("Television is now OFF");
    }

    @Override
    public void turnOn() {
        System.out.println("Television is now ON");
    }
}
