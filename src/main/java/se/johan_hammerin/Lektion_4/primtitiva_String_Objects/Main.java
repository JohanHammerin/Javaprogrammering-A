package se.johan_hammerin.Lektion_4.primtitiva_String_Objects;

public class Main {
    public static void main(String[] args) {
        String s1 = "hej";
        String s2 = s1;
        s2 = "test";
        System.out.println(s2);
        System.out.println("-".repeat(50));
        String s = "Hej";
        ändraSträng(s);
        System.out.println(s);

    }

    public static void ändraSträng(String text) {
        text = "Ny sträng";
    }
}
