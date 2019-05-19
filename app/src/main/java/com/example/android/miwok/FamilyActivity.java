package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;

    @Override
    public String toString() {
        return "FamilyActivity{" +
                "mMediaPlayer=" + mMediaPlayer +
                '}';
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<ModelClass> family = new ArrayList<>();
        family.add(new ModelClass("father", "әpә", R.drawable.family_father, R.raw.family_father));
        family.add(new ModelClass("mother", "әṭa", R.drawable.family_mother, R.raw.family_mother));
        family.add(new ModelClass("son", "angsi", R.drawable.family_son, R.raw.family_son));
        family.add(new ModelClass("daughter", "tune", R.drawable.family_daughter, R.raw.family_daughter));
        family.add(new ModelClass("older brother", "taachi", R.drawable.family_older_brother, R.raw.family_older_brother));
        family.add(new ModelClass("younger brother", "chalitti", R.drawable.family_younger_brother, R.raw.family_younger_brother));
        family.add(new ModelClass("older sister", "teṭe", R.drawable.family_older_sister, R.raw.family_older_sister));
        family.add(new ModelClass("younger sister", "kolliti", R.drawable.family_younger_sister, R.raw.family_younger_sister));
        family.add(new ModelClass("grandmother ", "ama", R.drawable.family_grandmother, R.raw.family_grandmother));
        family.add(new ModelClass("grandfather", "paapa", R.drawable.family_grandfather, R.raw.family_grandfather));

        CustomAdapter itemsAdapter = new CustomAdapter(this,R.layout.list_item,family,R.color.category_family);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ModelClass word = family.get(position);
                mMediaPlayer = MediaPlayer.create(FamilyActivity.this, word.getmAudioResourceId());
                mMediaPlayer.start();
            }
        });
    }
}
