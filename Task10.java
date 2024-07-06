import com.sun.source.tree.Scope;

import javax.xml.transform.Source;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Song{
    String title, artist, genre;

    Song(String title, String artist, String genre){
        this.title = title;
        this.artist = artist;
        this.genre = genre;
    }
}
class MusicPlayer{
    ArrayList<Song> song_obj = new ArrayList<>();

    void add(Song obj){
        for (Song song : song_obj){
            if (obj.title.equals(song.title)){
                System.out.println("Song Already exist");
                return ;
            }
        }
        song_obj.add(obj);
        System.out.println("Song added Successfully");
    }
    void remove(String title){
        for (Song song : song_obj){
            if (title.equals(song.title)){
                System.out.println("Song Removed Successfully");
                song_obj.remove(song);
                return ;
            }
        }
    }
    void suffle(){
        Collections.shuffle(song_obj);
        System.out.println("Playlist Shuffle Successfully");
    }
    void play(String title) {
        for (Song song : song_obj) {

            if (title.equals(song.title)) {


                String filename = title + ".mp3";  // Assuming MP3 format
                String command = "cmd /c start wmplayer " + filename ; // Using Windows Media Player
                try {
                    Runtime.getRuntime().exec(command);
                    System.out.println("Now playing: " + song.title + " by " + song.artist);
                } catch (IOException e) {
                    System.out.println("Error playing the song: " + e.getMessage());
                }
                return;
            }
        }
        System.out.println("Song not found");
    }

    void genre(){

    }
}




public class Task10 {
    public static void main(String[]args) throws IOException {
        System.out.println("-----Music Playlist-----");
        MusicPlayer playlist = new MusicPlayer();
        Scanner user = new Scanner(System.in);
        String userchoice;
        do{
            System.out.print("What you want to do ? (Add/Remove/Shuffle/play/Genre): ");
            String choice=user.next().toLowerCase();
            switch (choice){
                case "add":
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Song Title: ");
                    String title = scanner.nextLine();


                    System.out.print("Artist Name: ");
                    String artist = scanner.nextLine();
                    System.out.print("Song Genre: ");
                    String genre = scanner.nextLine();

                    Song userSong = new Song(title, artist, genre);
                    playlist.add(userSong);
                    break;
                case "remove":
                    System.out.print("Song Title: ");
                    String removeSongTitle = user.nextLine();
                    playlist.remove(removeSongTitle);
                    break;
                case "shuffle":
                    playlist.suffle();
                    break;
                case "play":
                    Scanner playSong = new Scanner(System.in);
                    System.out.print("Song Title : ");
                    String playSongTitle = playSong.nextLine();


                    playlist.play(playSongTitle);
                    break;
                case "genre":
                    playlist.genre();
                    break;
                default:
                    System.out.println("Invalid Command");

            }
            System.out.print("Do you want to Continue (y or n):  ");
            userchoice=user.next().toLowerCase();
        } while (userchoice.equals("y"));
        System.out.println("Thanks");
    }
}
