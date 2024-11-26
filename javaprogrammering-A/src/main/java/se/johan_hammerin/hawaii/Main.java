package se.johan_hammerin.hawaii;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int alarmH = 10;
        int alarmM = 35;
        int alarmS = 40;

        while (true) {
            LocalDateTime currentTime = LocalDateTime.now();

            // Beräkna timmar, minuter och sekunder från totalSeconds
            int hours = currentTime.getHour();
            int minutes = currentTime.getMinute();
            int seconds = currentTime.getSecond();


            // Formatera och visa tiden
            String time = String.format("%02d:%02d:%02d", hours, minutes, seconds);
            System.out.print("\r" + time);
            if (alarmH == hours && alarmM == minutes && alarmS == seconds) {
                System.out.println(" - Dags att vakna!");
                playSound("hej");
            }

            // Vänta i 1 sekund
            Thread.sleep(1000);

        }
    }

    public static void playSound(String soundFile) {
        try {
            File soundPath = new File(soundFile);
            if (soundPath.exists()) {
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(soundPath));
                clip.start();
            } else {
                System.out.println("Ljudfilen hittades inte.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
