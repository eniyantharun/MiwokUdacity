package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ArrayList<ModelClass> phrases = new ArrayList<>();
        phrases.add(new ModelClass("minto wuksus","Where are you going?"));
        phrases.add(new ModelClass("tinnә oyaase'nә","What is your name?"));
        phrases.add(new ModelClass("oyaaset...","My name is..."));
        phrases.add(new ModelClass("michәksәs?","How are you feeling?"));
        phrases.add(new ModelClass("kuchi achit","I’m feeling good."));
        phrases.add(new ModelClass("әәnәs'aa?","Are you coming?"));
        phrases.add(new ModelClass("hәә’ әәnәm","Yes, I’m coming."));
        phrases.add(new ModelClass("yoowutis", "Let’s go."));
        phrases.add(new ModelClass("әnni'nem","Come here."));

        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(),R.layout.list_item,phrases);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(customAdapter);



    }
}
