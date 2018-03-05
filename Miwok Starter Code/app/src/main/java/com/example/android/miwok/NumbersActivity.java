package com.example.android.miwok;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Create an ArrayList for the numbers
        ArrayList<String> numbersListEnglish = new ArrayList<String>();

        // Add the word numbers to the ArrayList
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

        // Create an ArrayAdapter referencing the NumbersActivity, the layout type of 'simple_expandable_list_item_1, and pass through the ArrayList of numbersListEnglish
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, numbersListEnglish);

        // Find the ListView created in the activity_main.xml file
        ListView listView = findViewById(R.id.list);

        // pass through the ArrayAdapter itemsAdapter elements to be set in the listView view
        listView.setAdapter(itemsAdapter);
    }

}
