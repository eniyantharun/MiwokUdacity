package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<ModelClass> colors = new ArrayList<>();
        colors.add(new ModelClass("red", "weṭeṭṭi", R.drawable.color_red, R.raw.color_red));  // resource id is of integer type
        colors.add(new ModelClass("green", "chokokki", R.drawable.color_green, R.raw.color_green));
        colors.add(new ModelClass("brown", "ṭakaakki", R.drawable.color_brown, R.raw.color_brown));
        colors.add(new ModelClass("gray", "ṭopoppi", R.drawable.color_gray, R.raw.color_gray));
        colors.add(new ModelClass("black","kululli", R.drawable.color_black, R.raw.color_black));
        colors.add(new ModelClass("white", "kelelli", R.drawable.color_white, R.raw.color_white));
        colors.add(new ModelClass("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        colors.add(new ModelClass("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));

        CustomAdapter itemsAdapter = new CustomAdapter(getApplicationContext(),R.layout.list_item,colors,R.color.category_colors);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ModelClass modelClass = colors.get(position);
                mMediaPlayer = MediaPlayer.create(ColorsActivity.this, modelClass.getmAudioResourceId());
                mMediaPlayer.start();
            }
        });
    }
}
