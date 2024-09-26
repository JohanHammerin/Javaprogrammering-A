package se.johan_hammerin.w3Schools.a_OOP.Uppgift_4;

public class Animal {

        private String name;


        //Methods
        public void makeSound() {
            System.out.print(getClass().getSimpleName());
        }

        //Getters & Setters
        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }



