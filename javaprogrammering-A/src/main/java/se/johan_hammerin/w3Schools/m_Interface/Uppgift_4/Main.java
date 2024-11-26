package se.johan_hammerin.w3Schools.m_Interface.Uppgift_4;

public class Main {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine();
        Television television = new Television();

        washingMachine.turnOn();
        washingMachine.turnOff();

        television.turnOn();
        television.turnOff();
    }
}
