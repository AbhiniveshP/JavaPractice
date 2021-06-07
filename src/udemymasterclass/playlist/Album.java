package udemymasterclass.playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name, artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        Song song = findSong(title);
        if (song != null) return false;
        this.songs.add(new Song(title, duration));
        return true;
    }

    private Song findSong(String title) {
        for(int i = 0; i < this.songs.size(); i++) {
            Song song = this.songs.get(i);
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1;
        if((index >= 0) && (index < this.songs.size())) {
            playList.add(this.songs.get(index));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song song = findSong(title);
        if (song == null) return false;
        playList.add(song);
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Album> albums = new ArrayList<>();

        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        System.out.println(albums.get(0).addToPlayList("You can't do it right", playList));
        System.out.println(albums.get(0).addToPlayList("Holy man", playList));
        System.out.println(albums.get(0).addToPlayList("Speed king", playList));  // Does not exist
        System.out.println(albums.get(0).addToPlayList(9, playList));
        System.out.println(albums.get(1).addToPlayList(3, playList));
        System.out.println(albums.get(1).addToPlayList(2, playList));
        System.out.println(albums.get(1).addToPlayList(24, playList));  // There is no track 24

    }

}
