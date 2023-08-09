package com.example.spring.mongo.demomongodb.Dto;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Books {
    private String name;
    private String authorName;
    private int cost;

    public Books() {
    }

    public Books(String name, String authorName, int cost) {
        this.name = name;
        this.authorName = authorName;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
