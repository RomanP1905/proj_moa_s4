package com.example.roman.project5tourguideapp.adapter;

/**
 * Created by Roman on 04-Apr-18.
 */

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.roman.project5tourguideapp.R;
import com.example.roman.project5tourguideapp.model.Tour;

import java.util.ArrayList;


public class ItemAdapter extends ArrayAdapter<Tour> {

    private Context mContext;

    public ItemAdapter(Context context, ArrayList<Tour> tourItemArrayList) {
        super(context, 0, tourItemArrayList);
        mContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Tour tourItem = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.tour_list_item, parent, false);
        }

        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageview_lv);
        TextView titleTextView = (TextView) convertView.findViewById(R.id.title_textview_lv);
        TextView descTextView = (TextView) convertView.findViewById(R.id.desc_textview_lv);
        TextView locTextView = (TextView) convertView.findViewById(R.id.loc_textview_lv);

        imageView.setImageResource(tourItem.getImage());
        titleTextView.setText(tourItem.getTitle());
        descTextView.setText(tourItem.getEventDesc());
        locTextView.setText(tourItem.getLocation());

        return convertView;
    }
}