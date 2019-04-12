package com.example.android.miwok;

public class ModelClass {

    private String mMiwokTranslation;
    private String defaultTranslation;

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
}
