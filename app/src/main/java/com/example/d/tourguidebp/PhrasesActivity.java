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
                add(new TouristItem("good morning", "Jo reggelt"));
                add(new TouristItem("good afternoon", "Jo napot"));
                add(new TouristItem("good evening", "Jo estet"));
            }
        };

        //setting up a touristadapter to connect this phrases list with the listview.
        TouristAdapter touristAdapter = new TouristAdapter(this, destinations, R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(touristAdapter);

    }
}