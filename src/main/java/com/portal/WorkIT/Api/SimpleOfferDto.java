package com.portal.WorkIT.Api;

public class SimpleOfferDto {
    private long id;
    private String name;
    private int salaryLowest;
    private int salaryHighest;
    private LocationDto location;
    private CategoryDto category;

    public SimpleOfferDto(long id, String name, int salaryLowest, int salaryHighest, LocationDto location, CategoryDto category) {
        this.id = id;
        this.name = name;
        this.salaryLowest = salaryLowest;
        this.salaryHighest = salaryHighest;
        this.location = location;
        this.category = category;
    }

    public SimpleOfferDto(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public LocationDto getLocation() {
        return location;
    }

    public void setLocation(LocationDto location) {
        this.location = location;
    }

    public CategoryDto getCategory() {
        return category;
    }

    public void setCategory(CategoryDto category) {
        this.category = category;
    }
}
