package se.johan_hammerin.w3Schools.m_Interface.Uppgift_5;

public class MusicPlayer implements Playable, Recordable {

    //Methods
    @Override
    public void play() {
        System.out.println("Playing current song.");
    }

    @Override
    public void record() {
        System.out.println("Recording.");
    }
}
