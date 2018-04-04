package com.example.roman.project4musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Objects;

import static java.lang.System.in;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);
        MakeAlbumList();


    }

    public void MakeAlbumList(){
        ArrayList<String> myAlbumArray = new ArrayList<String>();
        ArrayList<Song> songsHolder = MainActivity.getSongList();

        for(int i = 0; i < songsHolder.size(); i++){

                    if(!(myAlbumArray.contains(songsHolder.get(i).getAlbum()))){

                        myAlbumArray.add(songsHolder.get(i).getAlbum());

                    }

        }

        myAlbumArray.add("End of List");





        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, myAlbumArray);


        ListView listView = (ListView) findViewById(R.id.list_view_album);
        listView.setAdapter(adapter);
    }
}

