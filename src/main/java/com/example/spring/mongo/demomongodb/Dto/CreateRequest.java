package com.example.spring.mongo.demomongodb.Dto;

public class CreateRequest {
    private String name;
    private String authorName;
    private int cost;

    public CreateRequest() {
    }

    public CreateRequest(String name, String authorName, int cost) {
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

    @Override
    public String toString() {
        return "CreateRequest{" +
                "name='" + name + '\'' +
                ", authorName='" + authorName + '\'' +
                ", cost=" + cost +
                '}';
    }
}
