package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Calls the array list in the numbersListEnglish array
        // Create an ArrayList for the English numbers
        ArrayList<Word> numbersList = new ArrayList<Word>();

        // Add the English word numbers and Miwok word numbers to the ArrayList numbersListEnglish
        numbersList.add(new Word("Where are you going?", "minto wuksus"));
        numbersList.add(new Word("What is your name?", "tinnә oyaase'nә"));
        numbersList.add(new Word("My name is...", "oyaaset..."));
        numbersList.add(new Word("How are you feeling?", "michәksәs?"));
        numbersList.add(new Word("I’m feeling good.", "kuchi achit"));
        numbersList.add(new Word("Are you coming?", "әәnәs'aa?"));
        numbersList.add(new Word("Yes, I’m coming.", "hәә’ әәnәm"));
        numbersList.add(new Word("I’m coming.", "әәnәm"));
        numbersList.add(new Word("Let’s go.", "yoowutis"));
        numbersList.add(new Word("Come here.", "әnni'nem"));


        // Create an ArrayAdapter referencing the NumbersActivity, the layout type of 'simple_expandable_list_item_1, and pass through the ArrayList of numbersListEnglish
        WordAdapter adapter = new WordAdapter(this, numbersList);

        // Find the ListView created in the activity_main.xml file
        ListView listView = findViewById(R.id.list);

        // pass through the ArrayAdapter itemsAdapter elements to be set in the listView view
        listView.setAdapter(adapter);
    }

}