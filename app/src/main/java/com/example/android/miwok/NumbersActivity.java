package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //ArrayList<String> words = new ArrayList<String>();   normal arrayList with String class
        final ArrayList<ModelClass> words = new ArrayList<ModelClass>();    //ArrayList with custom array adapter
        words.add(new ModelClass("one", "lutti", R.drawable.number_one, R.raw.number_one));
        words.add(new ModelClass("two", "otiiko", R.drawable.number_two, R.raw.number_two));
        words.add(new ModelClass("three", "tolookosu", R.drawable.number_three, R.raw.number_three));
        words.add(new ModelClass("four", "oyyisa", R.drawable.number_four, R.raw.number_four));
        words.add(new ModelClass("five", "massokka", R.drawable.number_five, R.raw.number_five));
        words.add(new ModelClass("six", "temmokka", R.drawable.number_six, R.raw.number_six));
        words.add(new ModelClass("seven", "kenekaku", R.drawable.number_seven, R.raw.number_seven));
        words.add(new ModelClass("eight", "kawinta", R.drawable.number_eight, R.raw.number_eight));
        words.add(new ModelClass("nine", "wo’e", R.drawable.number_nine , R.raw.number_nine));
        words.add(new ModelClass("ten", "na’aacha", R.drawable.number_ten, R.raw.number_ten));

        /*words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");*/

//        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, R.layout.list_item, words);
        CustomAdapter itemsAdapter = new CustomAdapter(this, R.layout.list_item, words, R.color.category_numbers);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ModelClass modelClass = words.get(position);
                mMediaPlayer = MediaPlayer.create(NumbersActivity.this, modelClass.getmAudioResourceId()); //no need to call prepare(); create() does that for you
                mMediaPlayer.start();
            }
        });


    }

    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }

    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mMediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mMediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mMediaPlayer = null;
        }
    }
}
