package nl.hanze.roy.oop.composite;

public interface SongComponent {

    // We throw UnsupportedOperationException so that if
    // it doesn't make sense for a song, or song group
    // to inherit a method they can just inherit the
    // default implementation

    public void add(SongComponent newSongComponent);

    public void remove(SongComponent newSongComponent);

    public SongComponent getComponent(int componentIndex);

    public String getSongName();

    public String getBandName();

    public int getReleaseYear();

    public void displaySongInfo();

}
