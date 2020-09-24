package com.seavus.java.Notes.Model;

public class Notes {
    private Long id;
    private String title;
    private String content;

    public Notes() {
    }

    public Notes(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Notes(Long id, String title, String content) {
        super();
        this.id = id;
        this.title = title;
        this.content = content;
    }


    public Notes(Long id) {
        this.id = id;
    }

    public Notes(String title) {
        this.title = title;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    @Override
    public String toString() {
        return "Notes{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
