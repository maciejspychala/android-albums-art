package com.example.test.myapplication.models;

/**
 * Created by maciej on 14.09.16.
 */
public class Album {
    public String title;
    public String author;
    public String year;
    public String albumArt;
    public long id;

    public Album(String title, String author, String year, String albumArt, long id) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.albumArt = albumArt;
        this.id = id;
    }


}