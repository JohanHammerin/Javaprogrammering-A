package se.johan_hammerin.w3Schools.p_Date.Uppgift_2;
import java.time.LocalTime;
public class Main {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        System.out.printf("%02d:%02d:%02d",currentTime.getHour(), currentTime.getMinute(),currentTime.getSecond());
    }
}
