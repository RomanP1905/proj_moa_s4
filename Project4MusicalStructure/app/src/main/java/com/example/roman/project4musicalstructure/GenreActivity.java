package com.example.roman.project4musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class GenreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre);
        MakeGenreList();
    }

    public void MakeGenreList(){
        //Maak arraylists aan
        ArrayList<String> myGenreArray = new ArrayList<String>();
        ArrayList<Song> songsHolder = MainActivity.getSongList();
        //Voeg unieke albums toe aan array
        for(int i = 0; i < songsHolder.size(); i++){

            if(!(myGenreArray.contains(songsHolder.get(i).getGenre()))){

                myGenreArray.add(songsHolder.get(i).getGenre());

            }

        }

        myGenreArray.add("End of List");




        //ArrayAdapter aanmaken voor de myGenreArray arraylist
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, myGenreArray);

        //Zet de arrayadapter inhoud in een listview
        ListView listView = (ListView) findViewById(R.id.list_view_genre);
        listView.setAdapter(adapter);
    }
}
