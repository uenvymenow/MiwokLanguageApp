package com.example.android.miwok;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

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

        // Find rootView LinearLayout from activity_numbers.xml
        LinearLayout numbersView = findViewById(R.id.rootView);

        // For loop that runs for each element in the numbersListEnglish ArrayList
        for (int index = 0; index < numbersListEnglish.size(); index++) {
            // Setup instructions to run each time through
            TextView wordView = new TextView(this);
            wordView.setText(numbersListEnglish.get(index));
            numbersView.addView(wordView);
        }
    }

}
