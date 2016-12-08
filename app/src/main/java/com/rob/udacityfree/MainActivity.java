package com.rob.udacityfree;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mNumberActivityTextView;
    private  TextView mFamilyActivityTextView;
    private TextView mPhrasesActivityTextView;
    private  TextView mColorsActivityTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNumberActivityTextView  = (TextView)findViewById(R.id.numbers_acitivity_text_view);
        mColorsActivityTextView = (TextView)findViewById(R.id.colors_activity_text_view);
        mFamilyActivityTextView = (TextView)findViewById(R.id.family_activity_text_view);
        mPhrasesActivityTextView = (TextView)findViewById(R.id.phrases_activity_text_view);

        mNumberActivityTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(i);
            }
        });

        mFamilyActivityTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(i);
            }
        });

        mColorsActivityTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(i);
            }
        });

        mPhrasesActivityTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(i);
            }
        });
    }




}
