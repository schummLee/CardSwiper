package com.example.demo1.Models;

import java.util.*;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Long cardId;


    public getId(id) { return id; }

    public setId() { this.id = id; }

    public getName(String name) { return name; }

    public setName() { this.name = name; }

    public getCardId(cardId) { return cardId; }

    public setCardId() { this.cardId = id; }

    public ToString() {
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

    public getName(name) { return name; }

    public setName() { this.name = name; }

    public getCardId(cardId) { return cardId; }

    public setCardId() { this.cardId = id; }

    public ToString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cardId=" + cardId +
                '}';
    
    }
}

