package com.example.android.miwok;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Create an ArrayList for the numbers
        ArrayList<String> numbersListEnglish = new ArrayList<String>();

        numbersListEnglish.add("One");
        numbersListEnglish.add("Two");
        numbersListEnglish.add("Three");
        numbersListEnglish.add("Four");
        numbersListEnglish.add("Five");
        numbersListEnglish.add("Six");
        numbersListEnglish.add("Seven");
        numbersListEnglish.add("Eight");
        numbersListEnglish.add("Nine");
        numbersListEnglish.add("Ten");


        // Verify content of array
        Log.i("NumbersActivity", "Word at index 0: " + numbersListEnglish.get(0));
        Log.i("NumbersActivity", "Word at index 1: " + numbersListEnglish.get(1));
        Log.i("NumbersActivity", "Word at index 2: " + numbersListEnglish.get(2));
        Log.i("NumbersActivity", "Word at index 3: " + numbersListEnglish.get(3));
        Log.i("NumbersActivity", "Word at index 4: " + numbersListEnglish.get(4));
        Log.i("NumbersActivity", "Word at index 5: " + numbersListEnglish.get(5));
        Log.i("NumbersActivity", "Word at index 6: " + numbersListEnglish.get(6));
        Log.i("NumbersActivity", "Word at index 7: " + numbersListEnglish.get(7));
        Log.i("NumbersActivity", "Word at index 8: " + numbersListEnglish.get(8));
        Log.i("NumbersActivity", "Word at index 9: " + numbersListEnglish.get(9));

    }

}
