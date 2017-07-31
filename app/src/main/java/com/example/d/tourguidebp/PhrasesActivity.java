package com.example.d.tourguidebp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by d on 7/30/2017.
 */

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourist_list);

        //populating the phrases list
        final ArrayList<TouristItem> destinations = new ArrayList<TouristItem>() {
            {
                add(new TouristItem("Good morning!", "Jó reggelt!"));
                add(new TouristItem("Good afternoon!", "Jó napot!"));
                add(new TouristItem("Good evening!", "Jó estét!"));
                add(new TouristItem("Good.", "Jó."));
                add(new TouristItem("Bad.", "Rossz."));
                add(new TouristItem("Yes.", "Igen."));
                add(new TouristItem("No.", "Nem."));
                add(new TouristItem("Thank you.", "Köszönöm."));
                add(new TouristItem("Thanks'", "Köszi!"));
                add(new TouristItem("Please.", "Kérem."));
                add(new TouristItem("Police!", "Rendőr!"));
                add(new TouristItem("Water!", "Víz"));
                add(new TouristItem("Help!", "Segítség!"));
                add(new TouristItem("Take me to....", "... akarok menni."));
                add(new TouristItem("Very good!", "Nagyon jó!"));
                add(new TouristItem("Not good.", "Nem jó."));

            }
        };

        //setting up a touristadapter to connect this phrases list with the listview.
        TouristAdapter touristAdapter = new TouristAdapter(this, destinations, R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(touristAdapter);

    }
}