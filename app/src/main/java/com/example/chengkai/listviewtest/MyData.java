package com.example.chengkai.listviewtest;

/**
 * Created by chengkai on 18-3-15.
 */

public class MyData {
    String text = null;
    int id = 0;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MyData(String text, int id) {

        this.text = text;
        this.id = id;
    }
}
