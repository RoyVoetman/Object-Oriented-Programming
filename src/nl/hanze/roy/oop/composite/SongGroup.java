package nl.hanze.roy.oop.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class SongGroup implements SongComponent {

    ArrayList<Object> songComponents = new ArrayList<>();

    String groupName;
    String groupDescription;

    public SongGroup(String newGroupName, String newGroupDescription){

        groupName = newGroupName;
        groupDescription = newGroupDescription;

    }

    public String getGroupName() { return groupName; }
    public String getGroupDescription() { return groupDescription; }

    public void add(SongComponent newSongComponent) {

        songComponents.add(newSongComponent);

    }

    public void remove(SongComponent newSongComponent) {

        songComponents.remove(newSongComponent);

    }

    public SongComponent getComponent(int componentIndex) {

        return (SongComponent)songComponents.get(componentIndex);

    }

    public void displaySongInfo(){

        System.out.println(getGroupName() + " " +
                getGroupDescription() + "\n");

        Iterator<Object> songIterator = songComponents.iterator();

        while (songIterator.hasNext()) {
            SongComponent songInfo = (SongComponent) songIterator.next();
            songInfo.displaySongInfo();
        }

    }

    @Override
    public String getSongName() { throw new UnsupportedOperationException(); }

    @Override
    public String getBandName() { throw new UnsupportedOperationException(); }

    @Override
    public int getReleaseYear() { throw new UnsupportedOperationException(); }
}
