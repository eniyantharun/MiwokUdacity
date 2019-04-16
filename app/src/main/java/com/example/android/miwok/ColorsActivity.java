package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<ModelClass> colors = new ArrayList<>();
        colors.add(new ModelClass("red", "weṭeṭṭi", R.drawable.color_red));
        colors.add(new ModelClass("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow));
        colors.add(new ModelClass("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow));
        colors.add(new ModelClass("green", "chokokki", R.drawable.color_green));
        colors.add(new ModelClass("brown", "ṭakaakki", R.drawable.color_brown));
        colors.add(new ModelClass("gray", "ṭopoppi", R.drawable.color_gray));
        colors.add(new ModelClass("black", "kululli", R.drawable.color_black));
        colors.add(new ModelClass("white", "kelelli", R.drawable.color_white));

        CustomAdapter itemsAdapter = new CustomAdapter(getApplicationContext(),R.layout.list_item,colors,R.color.category_colors);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
