package se.johan_hammerin.Tärningsspelet;

public class Player {
    //Attributes
    private String name;
    private int score;

    // Constructor
    public Player(String name) {
        setName(name);
        setScore(0);
    }

    //Method
    public void updateScore(int points) {
        setScore(getScore() + points);
    }

    // Getters & Setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
