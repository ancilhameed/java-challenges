package com.learn.java.puzzles;

import java.io.Serializable;

/*
 * A class which implements Serializable interface and has a transient variable.
 */
class Book implements Serializable{
    private int ISBN;
    private String title;
    private String author;
    private transient Integer edition = 1; //transient variable not serialized

    public Book(int ISBN, String title, String author, int edition) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.edition = edition;
    }

    @Override
    public String toString() {
        return "Book{" + "ISBN=" + ISBN + ", title=" + title + ", author=" + author + ", edition=" + edition + '}';
    }
 
}

