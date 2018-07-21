package com.pp.entity;

import java.util.Date;

public class Blog {
    private Integer id;

    //private Integer authorid;
    private Author author;

    private String title;

    private String type;

    private String content;

    private Date createdtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

//    public Integer getAuthorid() {
//        return authorid;
//    }
//
//    public void setAuthorid(Integer authorid) {
//        this.authorid = authorid;
//    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
}