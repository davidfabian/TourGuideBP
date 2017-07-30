package com.example.d.tourguidebp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
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
                add(new TouristItem(R.drawable.poi_ss, "Saint Stephen Basilica", "Biggest church in Hungary, tallest dome in the country.", 47.500828, 19.053952, "+36122022021", "www.saintstephensbasilica.hu"));
                add(new TouristItem(R.drawable.poi_ss, "Saint Stephen Basilica", "Biggest church in Hungary, tallest dome in the country.", 47.500828, 19.053952, "+36122022021", "www.saintstephensbasilica.hu"));
                add(new TouristItem(R.drawable.poi_ss, "Saint Stephen Basilica", "Biggest church in Hungary, tallest dome in the country.", 47.500828, 19.053952, "+36122022021", "www.saintstephensbasilica.hu"));
                add(new TouristItem(R.drawable.poi_ss, "Saint Stephen Basilica", "Biggest church in Hungary, tallest dome in the country.", 47.500828, 19.053952, "+36122022021", "www.saintstephensbasilica.hu"));
            }
        };

        //setting up a touristadapter to connect this restaurant list with the listview.
        TouristAdapter touristAdapter = new TouristAdapter(this, destinations, R.color.category_restaurants);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(touristAdapter);

    }
}