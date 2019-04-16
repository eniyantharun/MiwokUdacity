package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<ModelClass> family = new ArrayList<>();
        family.add(new ModelClass("әpә","Father",R.drawable.family_father));
        family.add(new ModelClass("әṭa","Mother",R.drawable.family_mother));
        family.add(new ModelClass("angsi","Son",R.drawable.family_son));
        family.add(new ModelClass( "tune","Daughter",R.drawable.family_daughter));
        family.add(new ModelClass( "taachi","Older Brother",R.drawable.family_older_brother));
        family.add( new ModelClass( "chalitti","Younger brother",R.drawable.family_younger_brother));
        family.add( new ModelClass( "teṭe","Older Sister",R.drawable.family_older_sister));
        family.add(new ModelClass( "kolliti","Younger sister",R.drawable.family_younger_sister));
        family.add(new ModelClass( "ama","Grandmother",R.drawable.family_grandmother));
        family.add( new ModelClass( "paapa","grandfather",R.drawable.family_grandfather));

        CustomAdapter itemsAdapter = new CustomAdapter(this,R.layout.list_item,family,R.color.category_family);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);


    }
}
