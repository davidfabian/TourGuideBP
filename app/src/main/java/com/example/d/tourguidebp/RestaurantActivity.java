package com.example.d.tourguidebp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * RestaurantActivity. populates restaurant list, sets up adapter for listview.
 * Created by d on 7/30/2017.
 */

public class RestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourist_list);

        //populating the restaurant list
        final ArrayList<TouristItem> destinations = new ArrayList<TouristItem>() {
            {
                add(new TouristItem(R.drawable.res_ma, getString(R.string.mazi), getString(R.string.mazi_desc), getString(R.string.mazi_map), getString(R.string.mazi_ph), getString(R.string.mazi_www)));
                add(new TouristItem(R.drawable.res_sp, getString(R.string.spiler), getString(R.string.spiler_desc), getString(R.string.spiler_map), getString(R.string.spiler_ph), getString(R.string.spiler_www)));
                add(new TouristItem(R.drawable.res_ba, getString(R.string.babel), getString(R.string.babel_desc), getString(R.string.babel_map), getString(R.string.babel_ph), getString(R.string.babel_www)));
                add(new TouristItem(R.drawable.res_la, getString(R.string.langos), getString(R.string.langos_desc), getString(R.string.langos_map), getString(R.string.langos_ph), getString(R.string.langos_www)));
                add(new TouristItem(R.drawable.res_me, getString(R.string.menza), getString(R.string.menza_desc), getString(R.string.menza_map), getString(R.string.menza_ph), getString(R.string.menza_www)));
            }
        };

        //setting up a touristadapter to connect this restaurant list with the listview.
        TouristAdapter touristAdapter = new TouristAdapter(this, destinations, R.color.category_restaurants);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(touristAdapter);

    }
}