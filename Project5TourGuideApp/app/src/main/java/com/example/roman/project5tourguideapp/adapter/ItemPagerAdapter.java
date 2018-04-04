package com.example.roman.project5tourguideapp.adapter;

/**
 * Created by Roman on 04-Apr-18.
 */

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.roman.project5tourguideapp.ui.Hotel;
import com.example.roman.project5tourguideapp.ui.Winkel;
import com.example.roman.project5tourguideapp.ui.Restaurant;


public class ItemPagerAdapter extends FragmentPagerAdapter {

    private final int PAGE_COUNT = 3;

    private String tabTitles[] = new String[]{
            Hotel.NAME,
            Winkel.NAME,
            Restaurant.NAME};

    private Context mContext;

    public ItemPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = Fragment.instantiate(mContext, Hotel.class.getName());
                break;
            case 1:
                fragment = Fragment.instantiate(mContext, Winkel.class.getName());
                break;
            case 2:
                fragment = Fragment.instantiate(mContext, Restaurant.class.getName());
                break;
            case 3:

        }
        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
