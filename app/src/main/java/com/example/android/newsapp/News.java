package com.example.android.newsapp;


public class News {

    private String mTitle, mSection, mUrl;

    public News(String title, String section, String url) {
        mTitle = title;
        mSection = section;
        mUrl = url;
    }

    public String getTitle() { return mTitle; }

    public String getSection() { return mSection; }

    public String getUrl() { return mUrl; }

}
