package com.example.android.BudapestTourGuide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter {

    private int mColorResourceId;

    public LocationAdapter(Context context, ArrayList<Location> pLocations, int colorResourceId) {
        super(context, 0, pLocations);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Location currentLocation = (Location) getItem(position);
        TextView attractionTextView = (TextView) listItemView.findViewById(R.id.attraction_text_view);
        attractionTextView.setText(currentLocation.getmAttractionName());
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        descriptionTextView.setText(currentLocation.getmAttractionDescription());
        ImageView ImageResourceId = (ImageView) listItemView.findViewById(R.id.image);
        if (currentLocation.hasImage()) {
            ImageResourceId.setImageResource(currentLocation.getmImageResourceId());
            ImageResourceId.setVisibility(View.VISIBLE);
        } else {
            ImageResourceId.setVisibility(View.GONE);
        }
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }
}

