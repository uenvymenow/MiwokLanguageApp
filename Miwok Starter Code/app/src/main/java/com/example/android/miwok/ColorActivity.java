package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Calls the array list in the numbersListEnglish array
        // Create an ArrayList for the English numbers
        ArrayList<Word> numbersList = new ArrayList<Word>();

        // Add the English word numbers and Miwok word numbers to the ArrayList numbersListEnglish
        numbersList.add(new Word("red", "weṭeṭṭi", R.drawable.color_red));
        numbersList.add(new Word("green", "chokokki", R.drawable.color_green));
        numbersList.add(new Word("brown", "ṭakaakki", R.drawable.color_brown));
        numbersList.add(new Word("gray", "ṭopoppi", R.drawable.color_gray));
        numbersList.add(new Word("black", "kululli", R.drawable.color_black));
        numbersList.add(new Word("white", "kelelli", R.drawable.color_white));
        numbersList.add(new Word("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow));
        numbersList.add(new Word("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow));

        // Create an ArrayAdapter referencing the NumbersActivity, the layout type of 'simple_expandable_list_item_1, and pass through the ArrayList of numbersListEnglish
        WordAdapter adapter = new WordAdapter(this, numbersList);

        // Find the ListView created in the activity_main.xml file
        ListView listView = findViewById(R.id.list);

        // pass through the ArrayAdapter itemsAdapter elements to be set in the listView view
        listView.setAdapter(adapter);
    }

}