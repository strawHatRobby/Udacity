package com.rob.udacityfree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Word> colors = new ArrayList<Word>();

        colors.add(new Word("weṭeṭṭi","Red"));
        colors.add(new Word("chokokki","Green"));
        colors.add(new Word("ṭakaakki","Brown"));
        colors.add(new Word("ṭopiisә","Gray"));
        colors.add(new Word("kululli","Black"));
        colors.add(new Word("kelelli","White"));
        colors.add(new Word("ṭopiisә","Dusty Yellow"));
        colors.add(new Word("chiwiiṭә","Mustard Yellow"));

        WordAdapter<Word> colorsListAdapter = new WordAdapter<Word>(this, colors);
        ListView colorsListView = (ListView)findViewById(R.id.activity_colors);
        colorsListView.setAdapter(colorsListAdapter);

    }
}
