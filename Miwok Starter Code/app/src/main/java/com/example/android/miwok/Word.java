package com.example.android.miwok;

import java.util.ArrayList;

/**
 * Created by Aaron on 3/4/2018.
 *
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */

public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    /** image resource variable **/
    private int mImageResourceID;

    /**
     * Creates two variables to hold the input parameters
     * @param defaultTranslation gets the default translation word
     * @param miwokTranslation gets the miwok translation word
     */
    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Creates a secondary constructor that will display the image alonge with
     * the English word and Miwok word
     * @param defaultTranslation pulls in the english translation
     * @param miwokTranslation pulls in the miwok translation
     * @param imageResourceID pulls in the resource integer of the image
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID){
        mImageResourceID = imageResourceID;
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    /** Get the image resource id to match the word translations **/
    public int getImageResourceID(){ return mImageResourceID; }
}
