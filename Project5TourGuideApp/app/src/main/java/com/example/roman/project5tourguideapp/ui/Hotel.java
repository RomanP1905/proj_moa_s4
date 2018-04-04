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

public class Hotel extends Fragment {

    public static final String NAME = "Hotels";

    public Hotel() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.view_hotel, container, false);

        ArrayList<Tour> tourItems = new ArrayList<>();

        tourItems.add(new Tour(getString(R.string.hotel_erve_name), "", getString(R.string.hotel_erve_addr)));
        tourItems.add(new Tour(getString(R.string.hotel_kruisselt_name), "", getString(R.string.hotel_kruisselt_addr)));

        ListView listView = (ListView) rootView.findViewById(R.id.hotel_lv);
        ItemAdapter tourAdapter = new ItemAdapter(rootView.getContext(), tourItems);
        listView.setAdapter(tourAdapter);

        return rootView;
    }

}
