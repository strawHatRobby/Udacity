package com.rob.udacityfree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ArrayList<Word> family = new ArrayList<Word>();

        family.add(new Word("әpә","Father"));
        family.add(new Word("әṭa","Mother"));
        family.add(new Word("angsi","son"));
        family.add(new Word("tune","Daughter"));
        family.add(new Word("taachi","Older Brother"));
        family.add(new Word("teṭe","Older Sister"));
        family.add(new Word("kolliti","Younger Sister"));
        family.add(new Word("ama","Grandmother"));
        family.add(new Word("paapa","Grandfather"));

        WordAdapter<Word> familyListAdapter = new WordAdapter<Word>(this, family);
        ListView familyListView = (ListView)findViewById(R.id.activity_family);
        familyListView.setAdapter(familyListAdapter);
    }
}
