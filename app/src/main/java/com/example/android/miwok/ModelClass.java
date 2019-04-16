package com.example.android.miwok;

public class ModelClass {

    private String mMiwokTranslation;
    private String defaultTranslation;
    private int mImageResourceID =  NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public ModelClass(String mMiwokTranslation, String defaultTranslation, int mImageResourceID) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.mImageResourceID = mImageResourceID;
    }


    public ModelClass(String mMiwokTranslation, String defaultTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.defaultTranslation = defaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public void setmMiwokTranslation(String mMiwokTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public void setDefaultTranslation(String defaultTranslation) {
        this.defaultTranslation = defaultTranslation;
    }

    public int getmImageResourceID() {
        return mImageResourceID;
    }

    public void setmImageResourceID(int mImageResourceID) {
        this.mImageResourceID = mImageResourceID;
    }


    /**
     * Return whether or not there is an image for this word object
     *
     */
    public boolean hasImage(){
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }
}
