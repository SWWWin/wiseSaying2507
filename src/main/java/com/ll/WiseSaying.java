package com.ll;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WiseSaying {
    private int id;
    private String wiseSaying;
    private String author;
    private LocalDateTime createDate;
    private LocalDateTime modifyDate;
    private DateTimeFormatter forPrintDateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public WiseSaying(String wiseSaying, String author) {
        this.wiseSaying = wiseSaying;
        this.author = author;
    }

    public int getId() {return id;}
    public String getWiseSaying() { return wiseSaying; }
    public String getAuthor() { return author; }
    public String getCreateDate() { 
        return createDate.format(forPrintDateTimeFormatter); }
    public String getModifyDate() { 
        return modifyDate.format(forPrintDateTimeFormatter); }
    public String getForPrintCreateDate() {
        return createDate.format(forPrintDateTimeFormatter);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWiseSaying(String wiseSaying){
        this.wiseSaying = wiseSaying;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public void setModifyDate(LocalDateTime createDate) {
        this.modifyDate = createDate;
    }

    public String getForPrintModifyDate() {
        return modifyDate.format(forPrintDateTimeFormatter);
    }

    public boolean isNew() {
        return getId() == 0;
    }


}
