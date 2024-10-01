package se.johan_hammerin.w3Schools.m_Interface.Uppgift_3;

public class Bicycle implements Constants {
    private int speed;

    //Methods
    public void increaseSpeed() {
        if (getSpeed() < MAX_SPEED) {
            setSpeed(getSpeed() + 5);
            System.out.printf("Current speed: %d Max speed(%d)\n", getSpeed(), MAX_SPEED);
        } else {
            System.out.printf("Already att max speed! (%d)\n", MAX_SPEED);
        }
    }

    public void decreaseSpeed() {
        if (getSpeed() > MIN_SPEED) {
            setSpeed(getSpeed() - 5);
            System.out.printf("Current speed: %d Min speed(%d)\n", getSpeed(), MIN_SPEED);
        } else {
            System.out.printf("Already at min speed! (%d)\n", MIN_SPEED);
        }
    }


    //Getter & Setter
    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
