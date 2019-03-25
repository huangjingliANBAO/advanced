package com.java.util.one.test;

import java.util.Date;

public class Article {
    public Integer id;
    public String title;
    public String author;
    public Date time;

    public Article(Integer id, String title, String author, Date time) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.time = time;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getTime() {
        return this.time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

}
