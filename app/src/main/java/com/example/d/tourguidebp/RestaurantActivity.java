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
                add(new TouristItem(R.drawable.res_ma, getString(R.string.mazi), getString(R.string.mazi_desc), "https://www.google.com/maps/search/?api=1&query=47.507391, 19.0503484", "+3617945853", "https://www.facebook.com/mazigreekkitchen/"));
                add(new TouristItem(R.drawable.res_sp, getString(R.string.spiler), getString(R.string.spiler_desc), "https://www.google.com/maps/search/?api=1&query=47.4987516, 19.0566642", "+3618781320", "http://spilerbp.hu/spiler/en"));
                add(new TouristItem(R.drawable.res_ba, getString(R.string.babel), getString(R.string.babel_desc), "https://www.google.com/maps/search/?api=1&query=47.492632, 19.0504127", "+36706000800", "http://babel-budapest.hu/"));
                add(new TouristItem(R.drawable.res_la, getString(R.string.langos), getString(R.string.langos_desc), "https://www.google.com/maps/search/?api=1&query=47.4926316, 19.0438466", "+3613663300", "https://en.wikipedia.org/wiki/L%C3%A1ngos"));
                add(new TouristItem(R.drawable.res_me, getString(R.string.menza), getString(R.string.menza_desc), "https://www.google.com/maps/search/?api=1&query=47.5039639, 19.0606278", "+3614131482", "http://www.menzaetterem.hu/english.php"));
            }
        };

        //setting up a touristadapter to connect this restaurant list with the listview.
        TouristAdapter touristAdapter = new TouristAdapter(this, destinations, R.color.category_restaurants);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(touristAdapter);

    }
}