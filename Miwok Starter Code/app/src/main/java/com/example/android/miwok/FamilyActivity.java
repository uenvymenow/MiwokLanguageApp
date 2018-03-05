package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Calls the array list in the numbersListEnglish array
        // Create an ArrayList for the English numbers
        ArrayList<Word> numbersList = new ArrayList<Word>();

        // Add the English word numbers and Miwok word numbers to the ArrayList numbersListEnglish
        numbersList.add(new Word("father", "әpә"));
        numbersList.add(new Word("mother", "әṭa"));
        numbersList.add(new Word("son", "angsi"));
        numbersList.add(new Word("daughter", "tune"));
        numbersList.add(new Word("older brother", "taachi"));
        numbersList.add(new Word("younger brother", "chalitti"));
        numbersList.add(new Word("older sister", "teṭe"));
        numbersList.add(new Word("younger sister", "kolliti"));
        numbersList.add(new Word("grandmother", "ama"));
        numbersList.add(new Word("grandfather", "paapa"));


        // Create an ArrayAdapter referencing the NumbersActivity, the layout type of 'simple_expandable_list_item_1, and pass through the ArrayList of numbersListEnglish
        WordAdapter adapter = new WordAdapter(this, numbersList);

        // Find the ListView created in the activity_main.xml file
        ListView listView = findViewById(R.id.list);

        // pass through the ArrayAdapter itemsAdapter elements to be set in the listView view
        listView.setAdapter(adapter);
    }

}