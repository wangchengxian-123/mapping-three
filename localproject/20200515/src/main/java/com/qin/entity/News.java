package com.qin.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class News {
    private Integer id;
    private String title;
    private  String content;
    private  String clicknum;
    private String path;
    private Date addtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getClicknum() {
        return clicknum;
    }

    public void setClicknum(String clicknum) {
        this.clicknum = clicknum;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    public Date getAddtime() {
        return addtime;
    }
@JsonFormat(pattern = "yyyy-mm-dd",timezone = "GMT+8")
    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}
