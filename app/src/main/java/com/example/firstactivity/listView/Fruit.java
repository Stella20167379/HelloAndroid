package com.example.firstactivity.listView;

public class Fruit {
    private String name;
    private int imageid;

    public Fruit(String name,int imageid){
        this.name = name;
        this.imageid = imageid;
    }

    public int getImageid() {
        return imageid;
    }

    public String getName() {
        return name;
    }
}
