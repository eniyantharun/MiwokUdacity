package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<ModelClass> colors = new ArrayList<>();
        colors.add(new ModelClass("weṭeṭṭi", "Red"));
        colors.add(new ModelClass("chokokki", "Green"));
        colors.add(new ModelClass("ṭakaakki", "Brown"));
        colors.add(new ModelClass("ṭopoppi", "Gray"));
        colors.add(new ModelClass("kululli", "Black"));
        colors.add(new ModelClass("kelelli", "White"));
        colors.add(new ModelClass("ṭopiisә", "Dusty Yellow"));
        colors.add(new ModelClass("chiwiiṭә", "Mustard Yellow"));

        CustomAdapter itemsAdapter = new CustomAdapter(getApplicationContext(),R.layout.list_item,colors);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
