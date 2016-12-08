package com.rob.udacityfree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;



public class NumbersActivity extends AppCompatActivity {

    private static final String TAG = "NumberAtivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("lutti","One"));
        words.add(new Word("otiiko","Two"));
        words.add(new Word("tolookosu","Three"));
        words.add(new Word("oyyisa","Four"));
        words.add(new Word("massokka","Five"));
        words.add(new Word("temmokka","Six"));
        words.add(new Word("kenekaku","Seven"));
        words.add(new Word("kawintha","Eight"));
        words.add(new Word("wo'e","Nine"));
        words.add(new Word("na'aacha","Ten"));


        for (int i=0;i<words.size();i++) {
            Log.v(TAG, "Word at index i" + words.get(i));
        }

        // context, view_name, data_passed
        WordAdapter<Word> itemsAdapter = new WordAdapter<Word>(this, R.layout.list_text_view_1, words);

//        // Create a listView object
//        GridView gridView = (GridView)findViewById(R.id.grid);
//        gridView.setAdapter(itemsAdapter);
        ListView listView = (ListView) findViewById(R.id.list);
//        Dynamically add the data to list via an arrayAdapter
        listView.setAdapter(itemsAdapter);



    }
}
