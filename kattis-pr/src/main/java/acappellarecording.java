import java.util.Arrays;
import java.util.Scanner;

public class acappellarecording {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int totalNotes = input.nextInt();
            int largestDiff = input.nextInt();

            int[] notes = new int[totalNotes];

            for(int i = 0; i < totalNotes; i++) {
                notes[i] = input.nextInt();
            }

            Arrays.sort(notes);


            int recordings = 0;
            int i = 0;

            while(i < totalNotes) {
                int startNote = notes[i];
                recordings++;

                do {
                    i++;
                } while (i < totalNotes && notes[i] - startNote <= largestDiff);
            }

            System.out.println(recordings);

        }
    }
}
