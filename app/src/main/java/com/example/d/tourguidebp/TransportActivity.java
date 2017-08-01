package com.example.d.tourguidebp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * TransportActivity. populates public transport list, sets up adapter for listview.
 * Created by d on 7/30/2017.
 */

public class TransportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourist_list);

        //populating the transport list
        final ArrayList<TouristItem> destinations = new ArrayList<TouristItem>() {
            {
                add(new TouristItem(R.drawable.tra_br, getString(R.string.biker_rental), getString(R.string.biker_rental_desc), getString(R.string.biker_rental_ph), getString(R.string.biker_rental_www)));
                add(new TouristItem(R.drawable.tra_pt, getString(R.string.public_transport), getString(R.string.public_transport_desc), getString(R.string.public_transport_ph), getString(R.string.public_transport_www)));
                add(new TouristItem(R.drawable.tra_wt, getString(R.string.walking_tours), getString(R.string.walking_tours_desc), getString(R.string.walking_tours_ph), getString(R.string.walking_tours_www)));
                add(new TouristItem(R.drawable.tra_ta, getString(R.string.taxi), getString(R.string.taxi_desc), getString(R.string.taxi_ph), getString(R.string.taxi_www)));
            }
        };

        //setting up a touristadapter to connect this transport list with the listview.
        TouristAdapter touristAdapter = new TouristAdapter(this, destinations, R.color.category_transport);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(touristAdapter);

    }
}