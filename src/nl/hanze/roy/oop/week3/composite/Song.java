package nl.hanze.roy.oop.week3.composite;

public class Song implements SongComponent {

    String songName;
    String bandName;
    int releaseYear;

    public Song(String newSongName, String newBandName, int newReleaseYear){
        songName = newSongName;
        bandName = newBandName;
        releaseYear = newReleaseYear;
    }

    public String getSongName() { return songName; }
    public String getBandName() { return bandName; }
    public int getReleaseYear() { return releaseYear; }

    public void displaySongInfo(){
        System.out.println(getSongName() + " was recorded by " +
                getBandName() + " in " + getReleaseYear());
    }

    @Override
    public void add(SongComponent newSongComponent) { throw new UnsupportedOperationException(); }

    @Override
    public void remove(SongComponent newSongComponent) { throw new UnsupportedOperationException(); }

    @Override
    public SongComponent getComponent(int componentIndex) { throw new UnsupportedOperationException(); }

}
