package com.ll;

public class WiseSaying {
    private int id;
    private String wiseSaying;
    private String author;

    public WiseSaying(int id, String wiseSaying, String author) {
        this.id = id;
        this.wiseSaying = wiseSaying;
        this.author = author;
    }

    public int getId() {return id;}
    public String getWiseSaying() { return wiseSaying; }
    public String getAuthor() { return author; }


    public void setId(int id) {
        this.id = id;
    }

    public void setWiseSaying(String wiseSaying){
        this.wiseSaying = wiseSaying;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
