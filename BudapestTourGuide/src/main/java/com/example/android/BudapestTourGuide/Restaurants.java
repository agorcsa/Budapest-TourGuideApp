package com.example.android.BudapestTourGuide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Restaurants extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        // Create a list of restaurants, with their phones numbers.
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.baraka_phone), getString(R.string.baraka), R.drawable.baraka));
        locations.add(new Location(getString(R.string.costes_phone), getString(R.string.costes), R.drawable.costes));
        locations.add(new Location(getString(R.string.burgers_phone), getString(R.string.burgers), R.drawable.burgers));
        locations.add(new Location(getString(R.string.meatology_phone), getString(R.string.meatology), R.drawable.meatology));
        locations.add(new Location(getString(R.string.local_corner_phone), getString(R.string.local_corner), R.drawable.local_corner));
        locations.add(new Location(getString(R.string.bors_gastrobar_phone), getString(R.string.bors_gastrobar), R.drawable.bors_gastrobar));
        // Create anWordAdapter, whose data source is a list of Words. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(this, locations, R.color.category_restaurants);
        // Find the ListView object in the view hierarchy of the Activity.
        // There should be a ListView with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);
        // Make the ListView use the WordAdapter we created above, so that the
        // ListView will display list items for each Location in the list.
        listView.setAdapter(adapter);
    }
}