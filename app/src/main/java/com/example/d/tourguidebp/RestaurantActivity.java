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
                add(new TouristItem(R.drawable.res_ma, "Mazi", "Greek restaurant in the heart of downtown", 47.500828, 19.053952, "+36122022021", "www.saintstephensbasilica.hu"));
                add(new TouristItem(R.drawable.res_sp, "Spiler", "International casual with Hungarian touch in the party district.", 47.500828, 19.053952, "+36122022021", "www.saintstephensbasilica.hu"));
                add(new TouristItem(R.drawable.res_ba, "Babel", "Michelin Star Restaurant in downtown.", 47.500828, 19.053952, "+36122022021", "www.saintstephensbasilica.hu"));
                add(new TouristItem(R.drawable.res_la, "Langos", "Greasy, tasty streetfood, tallest dome in the country.", 47.500828, 19.053952, "+36122022021", "www.saintstephensbasilica.hu"));
            }
        };

        //setting up a touristadapter to connect this restaurant list with the listview.
        TouristAdapter touristAdapter = new TouristAdapter(this, destinations, R.color.category_restaurants);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(touristAdapter);

    }
}