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
                add(new TouristItem(R.drawable.poi_gb, "Tomb of Gul Baba", "Old Ottoman tomb with a rosegarden.", "https://www.google.com/maps/search/?api=1&query=47.515641, 19.034901"));
                add(new TouristItem(R.drawable.poi_hs, "Heroes Square", "Statues of kings, next to parks and galleries.", "https://www.google.com/maps/search/?api=1&query=47.514914, 19.077774"));
                add(new TouristItem(R.drawable.poi_ss, "St. Stephen's Basilica", "Biggest church in Hungary amazing views from the dome.", "https://www.google.com/maps/search/?api=1&query=47.500801, 19.054003"));
                add(new TouristItem(R.drawable.poi_bc, "Buda Castle", "Castle complex on the hill with amazing views over the city.", "https://www.google.com/maps/search/?api=1&query=47.496596, 19.039223"));
                add(new TouristItem(R.drawable.poi_sb, "Szechenyi Baths", "Classical bath complex with the world famous thermal water.", "https://www.google.com/maps/search/?api=1&query=47.519030, 19.081611"));
            }
        };

        //setting up a touristadapter to connect this POI list with the listview.
        TouristAdapter touristAdapter = new TouristAdapter(this, destinations, R.color.category_poi);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(touristAdapter);

        //setting up listeners for icon clicks.

    }
}