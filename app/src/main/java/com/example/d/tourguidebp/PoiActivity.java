package com.example.d.tourguidebp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * PoiActivity. populates Points of Interest list, sets up adapter for listview.
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
                add(new TouristItem(R.drawable.poi_gb, getString(R.string.gul_baba), getString(R.string.gul_baba_desc), getString(R.string.gul_baba_map)));
                add(new TouristItem(R.drawable.poi_hs, getString(R.string.heroes_square), getString(R.string.heroes_square_desc), getString(R.string.heroes_square_map)));
                add(new TouristItem(R.drawable.poi_ss, getString(R.string.st_stephens), getString(R.string.st_stephens_desc), getString(R.string.st_stephens_map)));
                add(new TouristItem(R.drawable.poi_bc, getString(R.string.buda_castle), getString(R.string.buda_castle_desc), getString(R.string.buda_castle_map)));
                add(new TouristItem(R.drawable.poi_sb, getString(R.string.szechenyi_bath), getString(R.string.szechenyi_bath_desc), getString(R.string.szechenyi_baths_map)));
            }
        };

        //setting up a touristadapter to connect this POI list with the listview.
        TouristAdapter touristAdapter = new TouristAdapter(this, destinations, R.color.category_poi);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(touristAdapter);

        //setting up listeners for icon clicks.

    }
}