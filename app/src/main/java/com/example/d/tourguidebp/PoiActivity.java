package com.example.d.tourguidebp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

/**
 * Created by d on 7/30/2017.
 */

public class PoiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourist_list);

        final ArrayList<TouristItem> destinations = new ArrayList<TouristItem>() {
            {
                add(new TouristItem(R.drawable.poi_gb, "Tomb of Gul Baba", "Old Ottoman tomb with a rosegarden.", 47.5160017, 19.033817));
                add(new TouristItem(R.drawable.poi_ss, "Saint Stephen Basilica", "Biggest church in Hungary, tallest dome in the country.", 47.500828, 19.053952));
            }
        };
    }
}