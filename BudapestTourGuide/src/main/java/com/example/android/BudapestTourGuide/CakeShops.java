package com.example.android.BudapestTourGuide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class CakeShops extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        // Create a list of Cake Shops locations together with their phone numbers, under they can be reached.
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.auguszt_phone), getString(R.string.auguszt), R.drawable.auguszt));
        locations.add(new Location(getString(R.string.szamos_phone), getString(R.string.szamos), R.drawable.szamos));
        locations.add(new Location(getString(R.string.nandori_phone), getString(R.string.nandori), R.drawable.nandori));
        locations.add(new Location(getString(R.string.daubner_phone), getString(R.string.daubner), R.drawable.daubner));
        locations.add(new Location(getString(R.string.budapest_phone), getString(R.string.budapest), R.drawable.budapest_cukraszda));
        locations.add(new Location(getString(R.string.damniczki_phone), getString(R.string.damniczki), R.drawable.damniczki));
        // Create anWordAdapter, whose data source is a list of Words. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(this, locations, R.color.category_cakeshop);
        // Find the ListView object in the view hierarchy of the Activity.
        // There should be a ListView with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);
        // Make the ListView use the WordAdapter we created above, so that the
        // ListView will display list items for each Location in the list.
        listView.setAdapter(adapter);
    }
}