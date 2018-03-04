package com.example.android.miwok;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Create an array for the number list
        String[] numbers = new String[]{"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

        // Verify content of array
        Log.i("NumbersActivity", "Word at index 0: " + numbers[0]);
        Log.i("NumbersActivity", "Word at index 1: " + numbers[1]);
        Log.i("NumbersActivity", "Word at index 2: " + numbers[2]);
        Log.i("NumbersActivity", "Word at index 3: " + numbers[3]);
        Log.i("NumbersActivity", "Word at index 4: " + numbers[4]);
        Log.i("NumbersActivity", "Word at index 5: " + numbers[5]);
        Log.i("NumbersActivity", "Word at index 6: " + numbers[6]);
        Log.i("NumbersActivity", "Word at index 7: " + numbers[7]);
        Log.i("NumbersActivity", "Word at index 8: " + numbers[8]);
        Log.i("NumbersActivity", "Word at index 9: " + numbers[9]);

    }

}
