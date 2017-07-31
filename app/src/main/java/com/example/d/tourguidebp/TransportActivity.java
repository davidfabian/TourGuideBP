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
                add(new TouristItem(R.drawable.tra_br, "Bike Rental", "BuBi Bike Sharing operated by the Public Transport Co.", "+3613255255", "https://molbubi.bkk.hu/"));
                add(new TouristItem(R.drawable.tra_pt, "Public Transport", "BKV the Public Transport Company. Trams, Buses, Metros and more.", "+3613255255", "http://www.bkk.hu/en/timetables/"));
                add(new TouristItem(R.drawable.tra_wt, "Walking Tours", "Guided walking tours around the city.", "+36203409217", "http://www.triptobudapest.hu/"));
                add(new TouristItem(R.drawable.tra_ta, "Taxi", "FoTaxi, the biggest and oldest cab company in the city.", "+3612222222", "www.fotaxi.hu"));
            }
        };

        //setting up a touristadapter to connect this transport list with the listview.
        TouristAdapter touristAdapter = new TouristAdapter(this, destinations, R.color.category_transport);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(touristAdapter);

    }
}