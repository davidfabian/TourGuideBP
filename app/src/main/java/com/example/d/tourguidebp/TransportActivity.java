package com.example.d.tourguidebp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
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
                add(new TouristItem(R.drawable.poi_hs, "Heroes Square", "Statues around a square between two galleries", "+36123023023", "www.hosoktere.hu"));
                add(new TouristItem(R.drawable.poi_hs, "Heroes Square", "Statues around a square between two galleries", "+36123023023", "www.hosoktere.hu"));
                add(new TouristItem(R.drawable.poi_hs, "Heroes Square", "Statues around a square between two galleries", "+36123023023", "www.hosoktere.hu"));
            }
        };

        //setting up a touristadapter to connect this transport list with the listview.
        TouristAdapter touristAdapter = new TouristAdapter(this, destinations, R.color.category_transport);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(touristAdapter);

    }
}