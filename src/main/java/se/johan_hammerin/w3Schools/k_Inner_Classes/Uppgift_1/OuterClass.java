package se.johan_hammerin.w3Schools.k_Inner_Classes.Uppgift_1;

public class OuterClass {
    //Attributes
    private int x;

    //Getter & Setter
    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    //Class

    public class InnerClass {
        //Attributes
        private int y;

        //Getter & Setter
        public int getY() {
            return this.y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

}
