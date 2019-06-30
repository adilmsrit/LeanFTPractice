package Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class JukeBox1 {

    ArrayList<Song> songList = new ArrayList<Song>();

    ArrayList<Song> songs = new ArrayList<Song>();


    public static void main(String[] args) {
        new JukeBox1().go();
    }

    public void go() {
        getSongs();
        System.out.println(songList);
        //Collections.sort(songList);
        System.out.println(songList);
    }


    public void getSongs() {
        try {
            File file = new File("D:\\Adil.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line = null;

            while ((line = reader.readLine()) != null) {
                addSong(line);
            }

        } catch (Exception e) {
            e.getCause();
        }
    }


    void addSong(String lineToParse) {

        String[] tokens = lineToParse.split("/");
        //songList.add(tokens[0]);

        Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
        songList.add(nextSong);

    }


}
