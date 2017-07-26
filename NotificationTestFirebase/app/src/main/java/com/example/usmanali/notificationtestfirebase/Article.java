package com.example.usmanali.notificationtestfirebase;

/**
 * Created by Usman Ali on 10/07/2017.
 */

public class Article {

    public String events;
    public String location;

    public Article() {
        // Default constructor required for calls to DataSnapshot.getValue(Article.class)
    }

    public Article(String events, String location) {
        this.events = events;
        this.location = location;
    }
}