package com.example.elo;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class tags extends ListActivity {
    ArrayList<String> tagsList = new ArrayList<String>();

    ArrayAdapter<String> adapter;

    int clickCounter = 0;

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.tags);
        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                tagsList);
        setListAdapter(adapter);
    }

    public void addItems(View v) {
        adapter.add("New Item");
    }
}
