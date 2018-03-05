package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Calls the array list in the numbersListEnglish array
        // Create an ArrayList for the English numbers
        ArrayList<Word> numbersList = new ArrayList<Word>();

        // Add the English word numbers and Miwok word numbers to the ArrayList numbersListEnglish
        numbersList.add(new Word("one", "lutti"));
        numbersList.add(new Word("two", "otiiko"));
        numbersList.add(new Word("three", "tolookosu"));
        numbersList.add(new Word("four", "oyyisa"));
        numbersList.add(new Word("five", "massokka"));
        numbersList.add(new Word("six", "temmokka"));
        numbersList.add(new Word("seven", "kenekaku"));
        numbersList.add(new Word("eight", "kawinta"));
        numbersList.add(new Word("nine", "wo’e"));
        numbersList.add(new Word("ten", "na’aacha"));


        // Create an ArrayAdapter referencing the NumbersActivity, the layout type of 'simple_expandable_list_item_1, and pass through the ArrayList of numbersListEnglish
        WordAdapter adapter = new WordAdapter(this, numbersList);

        // Find the ListView created in the activity_main.xml file
        ListView listView = findViewById(R.id.list);

        // pass through the ArrayAdapter itemsAdapter elements to be set in the listView view
        listView.setAdapter(adapter);
    }

}
