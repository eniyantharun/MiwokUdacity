package com.example.android.miwok;

import android.media.MediaActionSound;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<ModelClass> phrases = new ArrayList<>();
        phrases.add(new ModelClass("Where are you going?", "minto wuksus", R.raw.phrase_where_are_you_going));
        phrases.add(new ModelClass("What is your name?", "tinnә oyaase'nә", R.raw.phrase_what_is_your_name));
        phrases.add(new ModelClass("My name is...", "oyaaset...", R.raw.phrase_my_name_is));
        phrases.add(new ModelClass("How are you feeling?", "michәksәs?", R.raw.phrase_how_are_you_feeling));
        phrases.add(new ModelClass("I’m feeling good.", "kuchi achit", R.raw.phrase_im_feeling_good));
        phrases.add(new ModelClass("Are you coming?", "әәnәs'aa?", R.raw.phrase_are_you_coming));
        phrases.add(new ModelClass("Yes, I’m coming.", "hәә’ әәnәm", R.raw.phrase_yes_im_coming));
        phrases.add(new ModelClass("I’m coming.", "әәnәm", R.raw.phrase_im_coming));
        phrases.add(new ModelClass("Let’s go.", "yoowutis", R.raw.phrase_lets_go));
        phrases.add(new ModelClass("Come here.", "әnni'nem", R.raw.phrase_come_here));

        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(),R.layout.list_item,phrases,R.color.category_phrases);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ModelClass word = phrases.get(position);
                mMediaPlayer = MediaPlayer.create(PhrasesActivity.this, word.getmAudioResourceId());
                mMediaPlayer.start();
            }
        });
    }
}
