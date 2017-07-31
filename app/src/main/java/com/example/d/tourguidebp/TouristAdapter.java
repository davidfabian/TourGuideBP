package com.example.d.tourguidebp;

import android.app.Activity;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.widget.AdapterView.*;

/**
 * Created by d on 7/30/2017.
 */

public class TouristAdapter extends ArrayAdapter<TouristItem> {

    //create variable for color input parameter, initialize with default value.
    private int mColorCode = R.color.category_poi;

    public TouristAdapter(Activity context, ArrayList<TouristItem> touristItems, int categoryColor) {

        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, touristItems);

        mColorCode = categoryColor;

    }


    @NonNull
    @Override
    public View getView(int position, View convertView, final ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link TouristItem} object located at this position in the list
        final TouristItem currentItem = getItem(position);

        //Checks for present information in current item, inflating layout according to available information.
        ImageView image = (ImageView) listItemView.findViewById(R.id.left_image);
        if (currentItem.hasImage()) {
            image.setImageResource(currentItem.getmIconimage());
            image.setVisibility(View.VISIBLE);

        } else {
            image.setVisibility(View.GONE);
        }

        LinearLayout rightList = (LinearLayout) listItemView.findViewById(R.id.vert_rightside);
        rightList.setBackgroundResource(mColorCode);

        //name information is always present, this view always shows.
        TextView nameText = (TextView) listItemView.findViewById(R.id.name_text);
        nameText.setText(currentItem.getmName());

        //description is always present, this view always shows.
        TextView descText = (TextView) listItemView.findViewById(R.id.desc_text);
        descText.setText(currentItem.getmDescription());

        //Checks for available map information, inflating map icon only if info available
        ImageView mapIcon = (ImageView) listItemView.findViewById(R.id.ic_map);
        if (currentItem.hasMapInfo()) {
            mapIcon.setImageResource(R.drawable.ic_map_white_24dp);
            mapIcon.setVisibility(View.VISIBLE);
            //make icon clickable
            mapIcon.setClickable(true);
            //set up onclicklistener
            mapIcon.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    //get current items location
                    String mapExtra = currentItem.getmLocation();
                    Log.i("klikk", "location!" + mapExtra.toString());

                    Uri gmmIntentUri = Uri.parse(mapExtra.toString());
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    mapIntent.setPackage("com.google.android.apps.maps");
                    getContext().startActivity(mapIntent);

                }
            });
        } else {
            mapIcon.setVisibility(View.GONE);
        }

        //Checks for available phone number, inflating phone icon only if phone number is provided
        ImageView phoneIcon = (ImageView) listItemView.findViewById(R.id.ic_call);
        if (currentItem.hasPhone()) {
            phoneIcon.setImageResource(R.drawable.ic_call_white_24dp);
            phoneIcon.setVisibility(View.VISIBLE);
            //make icon clickable
            phoneIcon.setClickable(true);
            //set up onclicklistener
            phoneIcon.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    //get current items location
                    String phoneExtra = currentItem.getmPhoneNo();
                    Log.i("klikk", "phone!" + phoneExtra);
                    Uri gmmIntentUri = Uri.parse("tel:" + phoneExtra);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, gmmIntentUri);
                    getContext().startActivity(callIntent);

                }
            });
        } else {
            phoneIcon.setVisibility(View.GONE);
        }

        //Checks for available web address, inflating web icon only if web address provided
        ImageView wwwIcon = (ImageView) listItemView.findViewById(R.id.ic_web);
        if (currentItem.hasWww()) {
            wwwIcon.setImageResource(R.drawable.ic_public_white_24dp);
            wwwIcon.setVisibility(View.VISIBLE);
            //make icon clickable
            wwwIcon.setClickable(true);
            //set up onclicklistener
            wwwIcon.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    //get current items location
                    String wwwExtra = currentItem.getmWebAddress();
                    Log.i("klikk", "web!" + wwwExtra);
                    Uri gmmIntentUri = Uri.parse(wwwExtra);
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    getContext().startActivity(webIntent);

                }
            });
        } else {
            wwwIcon.setVisibility(View.GONE);
        }

        return listItemView;
    }

}
