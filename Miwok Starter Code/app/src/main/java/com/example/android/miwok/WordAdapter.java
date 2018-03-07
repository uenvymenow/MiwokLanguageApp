package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Aaron on 3/4/2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     * @param context The current context. Used to inflate the layout file.
     * @param words A list of the Word objects to display in the list
     */
    public WordAdapter(@NonNull Context context, ArrayList<Word> words){
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews, the adapter is not
        // going to use this second argument, os it can be any value. Here we used 0.
        super(context, 0, words);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     * @param position the position in the list of data should be displayed in the list item view
     * @param convertView the recycled view to populate
     * @param parent the parent ViewGroup that is used for inflation
     * @return the View for the position in the AdapterView
     */
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the ImageView in the list_item.xml layout with the id image
        ImageView imageResource = listItem.findViewById(R.id.image);

        // Check whether the array has an image
        if (currentWord.hasImage()){
            // If an image is available, display the provide image based on resource id
            imageResource.setImageResource(currentWord.getImageResourceID());
            // Make the image visible
            imageResource.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the imageResource
            imageResource.setVisibility(View.GONE);
        }

        // Find the TextView in the list_item.xml layout with the ID miwok_word
        TextView miwokWord = listItem.findViewById(R.id.miwok_word);

        // Get the Miwok translation from the current Word object and
        // set this text on the Miwok Word TextView
        miwokWord.setText(currentWord.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID english_word
        TextView englishWord = listItem.findViewById(R.id.english_word);

        // Get the English translation from the current Word object and
        // set this text on the English Word TextView
        englishWord.setText(currentWord.getDefaultTranslation());

        return listItem;
    }
}
