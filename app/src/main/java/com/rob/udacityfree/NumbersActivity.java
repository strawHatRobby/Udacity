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
        words.add(new Word("lutti","One",R.drawable.number_one));
        words.add(new Word("otiiko","Two",R.drawable.number_two));
        words.add(new Word("tolookosu","Three",R.drawable.number_three));
        words.add(new Word("oyyisa","Four",R.drawable.number_four));
        words.add(new Word("massokka","Five",R.drawable.number_five));
        words.add(new Word("temmokka","Six",R.drawable.number_six));
        words.add(new Word("kenekaku","Seven",R.drawable.number_seven));
        words.add(new Word("kawintha","Eight",R.drawable.number_eight));
        words.add(new Word("wo'e","Nine",R.drawable.number_nine));
        words.add(new Word("na'aacha","Ten",R.drawable.number_ten));


        for (int i=0;i<words.size();i++) {
            Log.v(TAG, "Word at index i" + words.get(i));
        }

        // context, view_name, data_passed
        WordAdapter<Word> itemsAdapter = new WordAdapter<Word>(this, words);

//        // Create a listView object
//        GridView gridView = (GridView)findViewById(R.id.grid);
//        gridView.setAdapter(itemsAdapter);
        ListView listView = (ListView) findViewById(R.id.list);
//        Dynamically add the data to list via an arrayAdapter
        listView.setAdapter(itemsAdapter);



    }
}
