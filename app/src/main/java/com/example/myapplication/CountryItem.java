package com.example.myapplication;


public class CountryItem {
    private String mCountryName;
    private String mFlagImage;

    public CountryItem(String countryName, String flagImage) {
        mCountryName = countryName;
        mFlagImage = flagImage;
    }

    public String getCountryName() {
        return mCountryName;
    }

    public String getFlagImage() {
        return mFlagImage;
    }
}