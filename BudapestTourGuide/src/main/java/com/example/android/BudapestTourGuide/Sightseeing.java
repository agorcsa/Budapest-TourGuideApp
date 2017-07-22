package com.example.android.BudapestTourGuide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Sightseeing extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        // Create a list of sightseeing programs together with their "opening hours"
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.open_time_danube), getString(R.string.danube), R.drawable.danube));
        locations.add(new Location(getString(R.string.open_time_hoponoff), getString(R.string.hoponoff), R.drawable.hoponhopoff));
        locations.add(new Location(getString(R.string.open_time_parliament), getString(R.string.parliament), R.drawable.parliement));
        locations.add(new Location(getString(R.string.open_time_segway), getString(R.string.segway), R.drawable.segway));
        locations.add(new Location(getString(R.string.open_time_amphybius), getString(R.string.amphybius), R.drawable.amphybius));
        // Create anWordAdapter, whose data source is a list of Words. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(this, locations, R.color.category_sightseeing);
        // Find the ListView object in the view hierarchy of the Activity.
        // There should be a ListView with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);
        // Make the ListView use the WordAdapter we created above, so that the
        // ListView will display list items for each Location in the list.
        listView.setAdapter(adapter);
    }
}







