package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Calls the array list in the numbersListEnglish array
        // Create an ArrayList for the English numbers
        ArrayList<Word> numbersList = new ArrayList<Word>();

        // Add the English word numbers and Miwok word numbers to the ArrayList numbersListEnglish
        numbersList.add(new Word("one", "lutti", R.drawable.number_one));
        numbersList.add(new Word("two", "otiiko", R.drawable.number_two));
        numbersList.add(new Word("three", "tolookosu", R.drawable.number_three));
        numbersList.add(new Word("four", "oyyisa", R.drawable.number_four));
        numbersList.add(new Word("five", "massokka", R.drawable.number_five));
        numbersList.add(new Word("six", "temmokka", R.drawable.number_six));
        numbersList.add(new Word("seven", "kenekaku", R.drawable.number_seven));
        numbersList.add(new Word("eight", "kawinta", R.drawable.number_eight));
        numbersList.add(new Word("nine", "wo’e", R.drawable.number_nine));
        numbersList.add(new Word("ten", "na’aacha", R.drawable.number_ten));


        // Create an ArrayAdapter referencing the NumbersActivity, the layout type of 'simple_expandable_list_item_1, and pass through the ArrayList of numbersListEnglish
        WordAdapter adapter = new WordAdapter(this, numbersList);

        // Find the ListView created in the activity_main.xml file
        ListView listView = findViewById(R.id.list);

        // pass through the ArrayAdapter itemsAdapter elements to be set in the listView view
        listView.setAdapter(adapter);
    }

}
