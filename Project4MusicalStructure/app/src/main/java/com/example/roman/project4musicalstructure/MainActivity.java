package com.example.roman.project4musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Geef alle buttons een variabel

        Button artistbutton = (Button) findViewById(R.id.button_artist);
        Button albumbutton = (Button) findViewById(R.id.button_album);
        Button genrebutton = (Button) findViewById(R.id.button_genre);
        Button playlistbutton = (Button) findViewById(R.id.button_playlist);

        //Voeg een onclicklistener toe zodat er code loopt wanneer er op de knoppen wordt geklikt
        artistbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Assign een intent aan een variabel
                Intent Album = new Intent(view.getContext(), ArtistActivity.class);
                //Voer de variabel in een startActivity methode, dit opent de intent opgeslagen in de variabel
                startActivity(Album);
            }
        });

        albumbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Artist = new Intent(view.getContext(), AlbumActivity.class);
                startActivity(Artist);

            }
        });

        genrebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Genre = new Intent(view.getContext(), GenreActivity.class);
                startActivity(Genre);
            }
        });

        playlistbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Playlist = new Intent(view.getContext(), PlaylistActivity.class);
                startActivity(Playlist);
            }
        });
    }

    public static ArrayList<Song> getSongList(){
        ArrayList<Song> songList = new ArrayList<Song>();

        Song s1 = new Song("Safe and Sound", "Justice", "Woman", "Electro House");
        Song s2 = new Song("Barefoot Desert", "King Gizzard and The Lizard Wizard", "Gumboot Soup", "Alternative/Indie");
        Song s3 = new Song("Rattlesnake", "King Gizzard and The Lizard Wizard", "Flying Microtonal Banana", "Experimental Rock");
        Song s4 = new Song("Robot Stop", "King Gizzard and The Lizard Wizard", "Nonagun Infinity", "Experimental Rock");
        Song s5 = new Song("Big Fig Wasp", "King Gizzard and The Lizard Wizard", "Nonagun Infinity", "Experimental Rock");


        songList.add(s1);
        songList.add(s2);
        songList.add(s3);
        songList.add(s4);
        songList.add(s5);

        return songList;
    }


}
