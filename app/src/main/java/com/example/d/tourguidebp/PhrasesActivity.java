package com.example.d.tourguidebp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * PhrasesActivity. populates phrases list, sets up adapter for listview.
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
                add(new TouristItem(getString(R.string.good_morning), getString(R.string.good_morning_hu)));
                add(new TouristItem(getString(R.string.good_afternoon), getString(R.string.good_afternoon_hu)));
                add(new TouristItem(getString(R.string.good_evening), getString(R.string.good_evening_hu)));
                add(new TouristItem(getString(R.string.good), getString(R.string.good_hu)));
                add(new TouristItem(getString(R.string.bad), getString(R.string.bad_hu)));
                add(new TouristItem(getString(R.string.yes), getString(R.string.yes_hu)));
                add(new TouristItem(getString(R.string.no), getString(R.string.no_hu)));
                add(new TouristItem(getString(R.string.thank_you), getString(R.string.thank_you_hu)));
                add(new TouristItem(getString(R.string.thanks), getString(R.string.thanks_hu)));
                add(new TouristItem(getString(R.string.please), getString(R.string.please_hu)));
                add(new TouristItem(getString(R.string.police), getString(R.string.police_hu)));
                add(new TouristItem(getString(R.string.water), getString(R.string.water_hu)));
                add(new TouristItem(getString(R.string.help), getString(R.string.help_hu)));
                add(new TouristItem(getString(R.string.take_me_to), getString(R.string.take_me_to_hu)));
                add(new TouristItem(getString(R.string.very_good), getString(R.string.very_good_hu)));
                add(new TouristItem(getString(R.string.not_good), getString(R.string.not_good_hu)));
            }
        };

        //setting up a touristadapter to connect this phrases list with the listview.
        TouristAdapter touristAdapter = new TouristAdapter(this, destinations, R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(touristAdapter);

    }
}