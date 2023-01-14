package com.greetingapp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Greeting {

    @Id
    private Long id;
    private String text;

    public Greeting(Long id, String text) {
        this.id = id;
        this.text = text;
    }

    public Greeting() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
