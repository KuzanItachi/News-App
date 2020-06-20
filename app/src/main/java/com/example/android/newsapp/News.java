package com.example.android.newsapp;

public class News {
    private String mTitle;
    private String mUrl;
    private String mWebPublicationDate;
    private String mSection;
    private String mAuthor;

    // Constructor for the Technology class

    //Input parameters title for headline and url for accessing
    public News(String title,String url,String date,String section,String author)
    {
        mTitle=title;
        mUrl=url;
        mWebPublicationDate=date.substring(0,10);
        mSection=section;
        mAuthor=author;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmUrl() {
        return mUrl;
    }

    public String getmSection() {
        return mSection;
    }

    public String getmWebPublicationDate() {
        return mWebPublicationDate;
    }

    public String getmAuthor() {
        return mAuthor;
    }
}
