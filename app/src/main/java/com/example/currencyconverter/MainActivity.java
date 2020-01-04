package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    double rate = 71.76;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void convert(View view)
    {
        EditText editText = findViewById(R.id.usd);
        try {
            double usd = Double.parseDouble(editText.getText().toString());
            double inr = usd*rate;
            Toast.makeText(this, "₹"+inr, Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            Toast.makeText(this,"Please Enter Correct Amount", Toast.LENGTH_LONG).show();
        }


    }
}
