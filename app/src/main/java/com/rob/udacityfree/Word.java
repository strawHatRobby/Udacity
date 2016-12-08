package com.rob.udacityfree;
/**
 * Created by MAC on 08/12/16.
 */

public class Word {
    private String mMiwokWord;
    private String mDefaultWord;
    private int mImageSource;

    public int getImageSource() {
        return mImageSource;
    }

    public Word(String miwokWord, String defaultWord, int imageSource) {
        mMiwokWord = miwokWord;
        mDefaultWord = defaultWord;
        mImageSource = imageSource;
    }

    public Word(String miwokWord, String defaultWord) {
        mMiwokWord = miwokWord;
        mDefaultWord = defaultWord;
    }

    public void setImageSource(int imageSource) {
        mImageSource = imageSource;

    }


    public String getMiwokWord() {
        return mMiwokWord;
    }

    /**
     *
     * @param miwokWord
     * Set MiworkWord value
     */
    public void setMiwokWord(String miwokWord) {
        mMiwokWord = miwokWord;
    }

    public String getDefaultWord() {
        return mDefaultWord;
    }

    public void setDefaultWord(String defaultWord) {
        mDefaultWord = defaultWord;
    }
}
