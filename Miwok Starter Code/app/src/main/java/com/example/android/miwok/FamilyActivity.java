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
        numbersList.add(new Word("father", "әpә", R.drawable.family_father));
        numbersList.add(new Word("mother", "әṭa", R.drawable.family_mother));
        numbersList.add(new Word("son", "angsi", R.drawable.family_son));
        numbersList.add(new Word("daughter", "tune", R.drawable.family_daughter));
        numbersList.add(new Word("older brother", "taachi", R.drawable.family_older_brother));
        numbersList.add(new Word("younger brother", "chalitti", R.drawable.family_younger_brother));
        numbersList.add(new Word("older sister", "teṭe", R.drawable.family_older_sister));
        numbersList.add(new Word("younger sister", "kolliti", R.drawable.family_younger_sister));
        numbersList.add(new Word("grandmother", "ama", R.drawable.family_grandmother));
        numbersList.add(new Word("grandfather", "paapa", R.drawable.family_grandfather));


        // Create an ArrayAdapter referencing the NumbersActivity, the layout type of 'simple_expandable_list_item_1, and pass through the ArrayList of numbersListEnglish
        WordAdapter adapter = new WordAdapter(this, numbersList);

        // Find the ListView created in the activity_main.xml file
        ListView listView = findViewById(R.id.list);

        // pass through the ArrayAdapter itemsAdapter elements to be set in the listView view
        listView.setAdapter(adapter);
    }

}