package com.example.caz.androidfragmentbasicspractice;

import java.io.Serializable;

public class Book implements Serializable {
    private String id;
    private String content;

    public Book() {
    }

    public Book(String id, String content) {
        this.id = id;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}