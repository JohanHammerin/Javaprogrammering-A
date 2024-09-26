package se.johan_hammerin.w3Schools.a_OOP.Uppgift_3;

public class Uppgift_3 {

    /*
    DRY = "Don't Repeat Yourself". Denna metod är viktig för att man inte ska upprepa kod hela tiden.
        Ex utan DRY:
     */

    public class Main {
        public void main(String[] args) {
            //Utan DRY:
            String firstPersonName = "Olle";
            int firstPersonAge = 50;
            String secondPersonName = "Ted";
            int secondPersonAge = 25;

            //Med DRY:
            Person firstPerson = new Person("Olle", 50);
            Person secondPerson = new Person("Ted", 25);


        }
    }

    //Ex med DRY:
    public class Person {
        private String name;
        private int age;


        //Constructor
        Person(String name, int age) {
            setName(name);
            setAge(age);
        }


        //Getters & Setters
        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return this.age;
        }

        public void setAge(int age) {
            this.age = age;
        }

    }
}
