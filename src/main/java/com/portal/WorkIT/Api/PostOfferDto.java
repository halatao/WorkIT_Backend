package com.portal.WorkIT.Api;

public class PostOfferDto {
    private String name;
    private int salaryLowest;
    private int salaryHighest;
    private long location;
    private long category;
    private long user;

    public PostOfferDto(String name, int salaryLowest, int salaryHighest, long location, long category, long user) {
        this.name = name;
        this.salaryLowest = salaryLowest;
        this.salaryHighest = salaryHighest;
        this.location = location;
        this.category = category;
        this.user = user;
    }

    public PostOfferDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalaryLowest() {
        return salaryLowest;
    }

    public void setSalaryLowest(int salaryLowest) {
        this.salaryLowest = salaryLowest;
    }

    public int getSalaryHighest() {
        return salaryHighest;
    }

    public void setSalaryHighest(int salaryHighest) {
        this.salaryHighest = salaryHighest;
    }

    public long getLocation() {
        return location;
    }

    public void setLocation(long location) {
        this.location = location;
    }

    public long getCategory() {
        return category;
    }

    public void setCategory(long category) {
        this.category = category;
    }

    public long getUser() {
        return user;
    }

    public void setUser(long user) {
        this.user = user;
    }
}
