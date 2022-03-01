package com.example.firstactivity.recyclerView;

public class Msg {
    public static final int TYPE_RECIEVED = 0;
    public static final int TYPE_SENT = 1;

    private String content;
    private int Type;

    public Msg(String content, int Type){
        this.content = content;
        this.Type = Type;
    }

    public String getContent() {
        return content;
    }

    public int getType() {
        return Type;
    }
}

