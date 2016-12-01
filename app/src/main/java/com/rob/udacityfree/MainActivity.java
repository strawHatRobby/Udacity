package com.rob.udacityfree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private int numberOfCoffees = 0;
    private float pricePerCup = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        displayPrice(numberOfCoffees * pricePerCup);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quanity_in_number);
        quantityTextView.setText("" + number);
    }

    public void checkWhippedCream(View view){
        boolean isChecked = ((CheckBox) view).isChecked();
        switch(view.getId()){
            case R.id.whipped_cream_check_box:
                if(isChecked){
                    pricePerCup += 5;
                }
                else{
                    pricePerCup -= 5;
                }
                break;
            case R.id.chocolate_check_box:
                if(isChecked){
                    pricePerCup += 6;
                }
                else{
                    pricePerCup -= 6;
                }
                break;
            case R.id.pumpkin_cream_check_box:
                if(isChecked){
                    pricePerCup += 8;
                    Log.v("pricePerCup","rice per cu is " + pricePerCup);
                    Log.v("price total","total price is " + pricePerCup * numberOfCoffees);
                }
                else{
                    pricePerCup -= 8;
                }
                break;
            case R.id.white_chocolate_check_box:
                if(isChecked){
                    pricePerCup += 3;
                }
                else{
                    pricePerCup -= 3;
                }
                break;
            case R.id.chilled_check_box:
                if(isChecked){
                    pricePerCup += 7;
                }
                else{
                    pricePerCup -= 7;
                }
                break;
            case R.id.caramel_check_box:
                if(isChecked){
                    pricePerCup += 4;
                }
                else{
                    pricePerCup -= 4;
                }
                break;
        }


    }

    public void oneMore(View view) {
            numberOfCoffees++;
            display(numberOfCoffees);
    }

    public void oneLess(View view) {
        if(numberOfCoffees>0) {
            numberOfCoffees--;
            display(numberOfCoffees);
        }
    }

    public void displayPrice(float number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_in_number);
        EditText nameEditText = (EditText)findViewById(R.id.name_text_box);
        TextView nameText = (TextView)findViewById(R.id.hello_text_view);
        nameText.setText(String.format("Hello %s", nameEditText.getText().toString()));
        priceTextView.setText(String.format("%s\n$ %.2f", nameEditText.getText().toString(), number));

    }
}

