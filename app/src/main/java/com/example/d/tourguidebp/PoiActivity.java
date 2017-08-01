package com.example.d.tourguidebp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by d on 7/30/2017.
 */

public class PoiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourist_list);

        //populating the POI list
        final ArrayList<TouristItem> destinations = new ArrayList<TouristItem>() {
            {
                add(new TouristItem(R.drawable.poi_gb, getString(R.string.gul_baba), getString(R.string.gul_baba_desc), "https://www.google.com/maps/search/?api=1&query=47.515641, 19.034901"));
                add(new TouristItem(R.drawable.poi_hs, getString(R.string.heroes_square), getString(R.string.heroes_square_desc), "https://www.google.com/maps/search/?api=1&query=47.514914, 19.077774"));
                add(new TouristItem(R.drawable.poi_ss, getString(R.string.st_stephens), getString(R.string.st_stephens_desc), "https://www.google.com/maps/search/?api=1&query=47.500801, 19.054003"));
                add(new TouristItem(R.drawable.poi_bc, getString(R.string.buda_castle), getString(R.string.buda_castle_desc), "https://www.google.com/maps/search/?api=1&query=47.496596, 19.039223"));
                add(new TouristItem(R.drawable.poi_sb, getString(R.string.szechenyi_bath), getString(R.string.szechenyi_bath_desc), "https://www.google.com/maps/search/?api=1&query=47.519030, 19.081611"));
            }
        };

        //setting up a touristadapter to connect this POI list with the listview.
        TouristAdapter touristAdapter = new TouristAdapter(this, destinations, R.color.category_poi);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(touristAdapter);

        //setting up listeners for icon clicks.

    }
}