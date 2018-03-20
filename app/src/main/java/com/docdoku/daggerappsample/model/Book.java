package com.docdoku.daggerappsample.model;

import java.util.Date;

/**
 * Created by romainz on 20/03/18.
 */

public class Book {

    private String author;
    private String title;
    private String description;
    private String theme;
    private Date releaseDate;

    public Book(String author, String title, String description, String theme, Date releaseDate) {
        this.author = author;
        this.title = title;
        this.description = description;
        this.theme = theme;
        this.releaseDate = releaseDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}
