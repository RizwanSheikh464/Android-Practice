package com.example.grandsol.coffeeshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        TextView quantityTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOdrer(View view) {
        display(2);
    }

    private void display(int number) {
         quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("1111" + number);
    }
}
