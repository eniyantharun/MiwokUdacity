package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ArrayList<ModelClass> family = new ArrayList<>();
        family.add(new ModelClass("әpә","Father"));
        family.add(new ModelClass("әṭa","Mother"));
        family.add(new ModelClass("angsi","Son"));
        family.add(new ModelClass( "tune","Daughter"));
        family.add(new ModelClass( "taachi","Older Brother"));
        family.add( new ModelClass( "chalitti","Younger brother"));
        family.add( new ModelClass( "teṭe","Older Sister"));
        family.add(new ModelClass( "kolliti","Younger sister"));
        family.add(new ModelClass( "ama","Grandmother"));
        family.add( new ModelClass( "paapa","grandfather"));

        CustomAdapter itemsAdapter = new CustomAdapter(this,R.layout.list_item,family);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);


    }
}
