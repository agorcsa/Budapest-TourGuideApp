package com.example.android.BudapestTourGuide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ThermalBaths extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        // Create a list of locations(Thermal Baths) and their opening hours.
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.open_time_szecsenyi), getString(R.string.szecsenyi_name), R.drawable.szechenyi));
        locations.add(new Location(getString(R.string.open_time_gellert), getString(R.string.gellert_name), R.drawable.gellert));
        locations.add(new Location(getString(R.string.open_time_lukacs), getString(R.string.lukacs_name), R.drawable.lukacs));
        locations.add(new Location(getString(R.string.open_time_rudas), getString(R.string.rudas_name), R.drawable.rudas));
        locations.add(new Location(getString(R.string.open_time_kiralyi), getString(R.string.kiralyi_name), R.drawable.kiraly));
        // Create anWordAdapter, whose data source is a list of Words. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(this, locations, R.color.category_thermalbaths);
        // Find the ListView object in the view hierarchy of the Activity.
        // There should be a ListView with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);
        // Make the ListView use the WordAdapter we created above, so that the
        // ListView will display list items for each Location in the list.
        listView.setAdapter(adapter);
    }
}