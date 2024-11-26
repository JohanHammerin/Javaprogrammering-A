package se.johan_hammerin.w3Schools.g_Encapsulation.Uppgift_3;

import java.time.Year;

public class Car {

    private String make;
    private String model;
    private int year;
    private double mileage;


    //methods
    public void drive(double distance) {
        if (distance <= 0) {
            System.out.println("Måste ange ett giltigt avstånd");
        } else {
            setMileage(getMileage() + distance);
        }
    }

    //getters & setters
    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        if (year > Year.now().getValue()) {
            System.out.println("Måste ange ett giltigt år");
        } else {
            this.year = year;
        }
    }

    public double getMileage() {
        return this.mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    //toString
    @Override
    public String toString() {
        return "make = " + getMake() + "\n" +
                "model = " + getModel() + "\n" +
                "year = " + getYear() + "\n" +
                "mileage = " + getMileage() + "km";
    }

}
