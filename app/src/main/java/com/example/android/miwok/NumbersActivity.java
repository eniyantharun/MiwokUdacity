package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

       // ArrayList<String> words = new ArrayList<String>();   normal arraylist with String class
        ArrayList<ModelClass> words = new ArrayList<ModelClass>();    //ArrayList with custom array adapter
        words.add(new ModelClass("one", "lutti", R.drawable.number_one));
        words.add(new ModelClass("two", "otiiko", R.drawable.number_two));
        words.add(new ModelClass("three", "tolookosu", R.drawable.number_three));
        words.add(new ModelClass("four", "oyyisa", R.drawable.number_four));
        words.add(new ModelClass("five", "massokka", R.drawable.number_five));
        words.add(new ModelClass("six", "temmokka", R.drawable.number_six));
        words.add(new ModelClass("seven", "kenekaku", R.drawable.number_seven));
        words.add(new ModelClass("eight", "kawinta", R.drawable.number_eight));
        words.add(new ModelClass("nine", "wo’e", R.drawable.number_nine));
        words.add(new ModelClass("ten", "na’aacha", R.drawable.number_ten));



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

    }
}
