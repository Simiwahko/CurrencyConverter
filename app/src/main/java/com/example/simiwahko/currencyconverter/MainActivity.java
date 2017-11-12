package com.example.simiwahko.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertDollarstoPounds (View view) {

        EditText DollarAmount = (EditText) findViewById(R.id.DollarAmount);

        Double dollarsToConvert = Double.parseDouble( DollarAmount.getText().toString());

        Double poundsAmount = dollarsToConvert * 0.65;

        Toast. makeText(getApplicationContext(), "£" + poundsAmount.toString(), Toast.LENGTH_LONG).show();

        Log.i("Dollar Amount Entered:", DollarAmount.getText().toString());
        Log.i("Pound Amount is :", poundsAmount.toString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
