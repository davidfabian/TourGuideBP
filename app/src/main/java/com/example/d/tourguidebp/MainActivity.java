/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.d.tourguidebp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the points of interest (POI) category
        TextView numbers = (TextView) findViewById(R.id.poi);
        // Set a click listener for POI view
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the POI View is clicked on.
            @Override
            public void onClick(View view) {
                Intent poiIntent = new Intent(MainActivity.this, PoiActivity.class);
                startActivity(poiIntent);
            }
        });

        // Find the View that shows the restaurants category
        TextView restaurant = (TextView) findViewById(R.id.restaurants);
        // Set a click listener for restaurants view
        restaurant.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the restaurants View is clicked on.
            @Override
            public void onClick(View view) {
                Intent restaurantIntent = new Intent(MainActivity.this, RestaurantActivity.class);
                startActivity(restaurantIntent);
            }
        });

        // Find the View that shows the transport category
        TextView transport = (TextView) findViewById(R.id.transport);
        // Set a click listener for colors view
        transport.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the transport View is clicked on.
            @Override
            public void onClick(View view) {
                Intent transportIntent = new Intent(MainActivity.this, TransportActivity.class);
                startActivity(transportIntent);
            }
        });

        // Find the View that shows the phrases category
        TextView phrases = (TextView) findViewById(R.id.phrases);
        // Set a click listener for phrases view
        phrases.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases View is clicked on.
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });
    }

}