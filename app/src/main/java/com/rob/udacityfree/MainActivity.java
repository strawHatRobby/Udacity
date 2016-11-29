package com.rob.udacityfree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int numberOfCoffees = 0;
    private int pricePerCup = 25;

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

    public void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_in_number);
        priceTextView.setText("$ " + number);
    }
}

