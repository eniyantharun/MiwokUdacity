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
        setContentView(R.layout.activity_numbers);

       // ArrayList<String> words = new ArrayList<String>();   normal arraylist with String class
        ArrayList<ModelClass> words = new ArrayList<ModelClass>();    //ArrayList with custom array adapter
        words.add(new ModelClass("lutti","one"));
        words.add(new ModelClass("otiiko","two"));
        words.add(new ModelClass("tolookosu","three"));
        words.add(new ModelClass("oyyisa","four"));
        words.add(new ModelClass("massokka","five"));
        words.add(new ModelClass("temmokka","six"));
        words.add(new ModelClass("kenekaku","seven"));
        words.add(new ModelClass("kawinta","eight"));
        words.add(new ModelClass("wo'e","nine"));
        words.add(new ModelClass("na'aacha","ten"));



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
        CustomAdapter itemsAdapter = new CustomAdapter(this, R.layout.list_item, words);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }
}
