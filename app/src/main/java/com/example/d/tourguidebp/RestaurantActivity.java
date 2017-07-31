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
                add(new TouristItem(R.drawable.res_ma, "Mazi", "Greek restaurant in the heart of downtown", "https://www.google.com/maps/search/?api=1&query=47.507391, 19.0503484", "+3617945853", "https://www.facebook.com/mazigreekkitchen/"));
                add(new TouristItem(R.drawable.res_sp, "Spiler", "International casual with Hungarian touch in the party district.", "https://www.google.com/maps/search/?api=1&query=47.4987516, 19.0566642", "+3618781320", "http://spilerbp.hu/spiler/en"));
                add(new TouristItem(R.drawable.res_ba, "Babel", "Michelin Star Restaurant in downtown.", "https://www.google.com/maps/search/?api=1&query=47.492632, 19.0504127", "+36706000800", "http://babel-budapest.hu/"));
                add(new TouristItem(R.drawable.res_la, "Langos", "Greasy, tasty streetfood, tallest dome in the country.", "https://www.google.com/maps/search/?api=1&query=47.4926316, 19.0438466", "+3613663300", "https://en.wikipedia.org/wiki/L%C3%A1ngos"));
                add(new TouristItem(R.drawable.res_me, "Menza", "Hungarian inspired dishes.", "https://www.google.com/maps/search/?api=1&query=47.5039639, 19.0606278", "+3614131482", "http://www.menzaetterem.hu/english.php"));
            }
        };

        //setting up a touristadapter to connect this restaurant list with the listview.
        TouristAdapter touristAdapter = new TouristAdapter(this, destinations, R.color.category_restaurants);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(touristAdapter);

    }
}