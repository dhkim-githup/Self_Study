package com.guides.spring;

public class Greeting {

    private long id=2020;
    private String content="hi-jar";

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}