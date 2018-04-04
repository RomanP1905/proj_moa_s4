package com.example.roman.project5tourguideapp.ui;

/**
 * Created by Roman on 04-Apr-18.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.roman.project5tourguideapp.R;
import com.example.roman.project5tourguideapp.adapter.ItemAdapter;
import com.example.roman.project5tourguideapp.model.Tour;

import java.util.ArrayList;



public class Winkel extends Fragment {

    public static final String NAME = "Winkels";

    public Winkel() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.view_winkel, container, false);

        ArrayList<Tour> tourItems = new ArrayList<>();

        tourItems.add(new Tour(getString(R.string.winkel_vijfhoek_name), "", getString(R.string.winkel_vijfhoek_addr), R.drawable.vijfhoek));
        tourItems.add(new Tour(getString(R.string.winkel_driehoek_name), "", getString(R.string.winkel_driehoek_addr), R.drawable.driehoek));

        ListView listView = (ListView) rootView.findViewById(R.id.winkel_lv);
        ItemAdapter tourAdapter = new ItemAdapter(rootView.getContext(), tourItems);
        listView.setAdapter(tourAdapter);

        return rootView;
    }

}
