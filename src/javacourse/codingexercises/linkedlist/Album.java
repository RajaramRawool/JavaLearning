package javacourse.codingexercises.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private String name;
    private String artist;
    private SongList songs;
//    private ArrayList<Song> songs;     //  before creating inner class


   /* public static void main(String[] args) {
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
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed king", playList);  // Does not exist
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(8, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList);  // There is no track 24
//        Iterator<Album> iteratorAlbum = albums.iterator();
//        while (iteratorAlbum.hasNext()) {
//            Album albumNew = iteratorAlbum.next();
//            System.out.println(albumNew.name + " " + albumNew.artist);
//            Iterator<Song> iteratorSong = albumNew.songs.iterator();
//            while (iteratorSong.hasNext()) {
//                System.out.println(iteratorSong.next().getTitle());
//            }
//        }

    *//*    LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed king", playList);  // Does not exist
//        albums.get(0).addToPlayList(9, playList);
//        albums.get(1).addToPlayList(3, playList);
//        albums.get(1).addToPlayList(2, playList);
//        albums.get(1).addToPlayList(24, playList);  // There is no track 24

        for (Song song : playList) {
            System.out.println(song);
        }
*//*

    }*/


    public static class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            songs = new ArrayList<Song>();
        }

        private boolean add(Song song) {
            /*if (findSong(songTitle) == null) {
                Song newSong = new Song(songTitle, durationOfSong);
                this.songArrayList.add(newSong);
                return true;
            }
            System.out.println(findSong(songTitle).getTitle() + " Already Exists .............");
            return false;*/
            if (!this.songs.contains(song)) {
                this.songs.add(song);
                return true;
            }
            return false;
        }

        private Song findSong(String songTitle) {
            ListIterator<Song> iterator = this.songs.listIterator();
            while (iterator.hasNext()) {
                if (iterator.next().getTitle().equalsIgnoreCase(songTitle)) {
                    return iterator.previous();
                }
            }
            return null;
        }

        private Song findSong (int trackNumber) {
            int index = trackNumber - 1;
            if ((index >= 0) && (index < this.songs.size())) {
                return this.songs.get(index);
            }
            return null;
        }
    }


    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
//        songs = new ArrayList<Song>();      //  before creating inner class
    }


    public boolean addSong(String songTitle, double durationOfSong) {
        Song checkedSong = this.songs.findSong(songTitle);

        if (checkedSong == null) {
            Song newSong = new Song(songTitle, durationOfSong);
            this.songs.add(newSong);

            return true;
        }
        System.out.println(checkedSong.getTitle() + " Already Exists .............");
        return false;
    }

   /* private Song findSong(String songTitle) {                      //  before creating inner class
        ListIterator<Song> iterator = this.songs.listIterator();   //  before creating inner class
        while (iterator.hasNext()) {
            if (iterator.next().getTitle().equalsIgnoreCase(songTitle)) {
                return iterator.previous();
            }
        }
        return null;
    }*/

    public boolean addToPlayList(int trackNumber, LinkedList<Song> song) {
        /*int index = trackNumber - 1;
        if ((index >= 0) && (index < this.songs.size())) {         //  before creating inner class
            song.add(this.songs.get(index));
            return true;
        }*/
        Song checkedSong = this.songs.findSong(trackNumber);
        if (checkedSong != null) {
            song.add(checkedSong);
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> song) {
       /* if ((findSong(songTitle) != null)) {                       //  before creating inner class
            song.add(findSong(songTitle));
            return true;
        }*/

        Song checkedSong = this.songs.findSong(songTitle);
        if (checkedSong != null) {
            song.add(checkedSong);
            return true;
        }
        System.out.println( "This album " + songTitle + " is not in this album");
        return false;
    }
}
