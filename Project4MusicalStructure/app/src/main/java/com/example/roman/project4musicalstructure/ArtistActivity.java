package com.example.roman.project4musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);
        MakeArtistList();
    }

    public void MakeArtistList(){
        ArrayList<String> myArtistArray = new ArrayList<String>();
        ArrayList<Song> songsHolder = MainActivity.getSongList();

        for(int i = 0; i < songsHolder.size(); i++){

            if(!(myArtistArray.contains(songsHolder.get(i).getArtist()))){

                myArtistArray.add(songsHolder.get(i).getArtist());

            }

        }

        myArtistArray.add("End of List");





        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, myArtistArray);


        ListView listView = (ListView) findViewById(R.id.list_view_artist);
        listView.setAdapter(adapter);
    }
}
