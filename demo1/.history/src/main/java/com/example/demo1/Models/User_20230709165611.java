package com.example.demo1.Models;

import java.util.*;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Long cardId;


    public Long getId(Long id) { return id; }

    public void setId() { this.id = id; }

    public String getName(String name) { return name; }

    public void setName() { this.name = name; }

    public Long getCardId(Long cardId) { return cardId; }

    public void setCardId() { this.cardId = id; }

    public String ToString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cardId=" + cardId +
                '}';
    }
}

}

