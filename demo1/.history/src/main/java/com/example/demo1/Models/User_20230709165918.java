package com.example.demo1.Models;

import java.util.*;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Long cardId;


    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Long getCardId() { return cardId; }

    public void setCardId(Long cardId) { this.cardId = cardId; }

    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cardId=" + cardId +
                '}';
    }
}
public class UserWithoutId {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String name;
    private Long cardId;

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Long getCardId() { return cardId; }

    public void setCardId(Long cardId) { this.cardId = cardId; }

    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cardId=" + cardId +
                '}';
    
    }
}

