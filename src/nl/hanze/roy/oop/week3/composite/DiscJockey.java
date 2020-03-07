package nl.hanze.roy.oop.week3.composite;

public class DiscJockey {

    SongComponent songList;

    public DiscJockey(SongComponent newSongList){
        songList = newSongList;
    }

    public void getSongList(){
        songList.displaySongInfo();
    }

}