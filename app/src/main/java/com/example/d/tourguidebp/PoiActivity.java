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
                add(new TouristItem(R.drawable.poi_gb, "Tomb of Gul Baba", "Old Ottoman tomb with a rosegarden.", 47.5160017, 19.033817));
                add(new TouristItem(R.drawable.poi_gb, "Tomb of Gul Baba", "Old Ottoman tomb with a rosegarden.", 47.5160017, 19.033817));
                add(new TouristItem(R.drawable.poi_gb, "Tomb of Gul Baba", "Old Ottoman tomb with a rosegarden.", 47.5160017, 19.033817));
            }
        };

        //setting up a touristadapter to connect this POI list with the listview.
        TouristAdapter touristAdapter = new TouristAdapter(this, destinations, R.color.category_poi);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(touristAdapter);

        //setting up listeners for icon clicks.

    }
}