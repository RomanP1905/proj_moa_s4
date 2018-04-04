package com.example.roman.project4musicalstructure;

/**
 * Created by Roman on 04-Apr-18.
 */

public class Song {

    private String Song_Name;
    private String Artist;
    private String Album;
    private String Genre;


    Song( String song_nameC, String artistC, String albumC, String genreC){
        Song_Name = song_nameC;
        Artist = artistC;
        Album = albumC;
        Genre = genreC;

    }

    public String getSong_Name(){
        return Song_Name;
    }

    public String getArtist(){
        return Artist;
    }

    public String getAlbum(){
        return Album;
    }

    public String getGenre(){
        return Genre;
    }




}
