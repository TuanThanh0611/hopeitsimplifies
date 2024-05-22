package com.hopeitsimplifies.BookSystem.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="vocabularies")
public class Vocabulary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "word")
    private String word;
    @Column(name = "type")
    private String type;
    @Column(name = "topic")
    private String topic;
    @Column(columnDefinition = "TEXT")
    private Date studyday;

    public void setId(int id) {
        this.id = id;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setStudyday(Date dayLearn) {
        this.studyday = dayLearn;
    }

    public int getId() {
        return id;
    }

    public String getWord() {
        return word;
    }

    public String getType() {
        return type;
    }

    public String getTopic() {
        return topic;
    }

    public Date getStudyday() {
        return studyday;
    }
}
