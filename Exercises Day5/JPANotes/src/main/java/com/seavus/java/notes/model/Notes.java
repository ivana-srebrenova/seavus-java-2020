package com.seavus.java.notes.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Notes {
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String content;

    @ManyToOne
    private User user;

    @ManyToMany
    //@JoinTable
    private List<Tag> tags;


    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public Notes() {
    }

    public Notes(String title, String content, User user) {
        this.title = title;
        this.content = content;
        this.user = user;
    }


    public Notes(Long id) {
        this.id = id;
    }


    public Notes(String title) {
        this.title = title;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
        return "notes{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
