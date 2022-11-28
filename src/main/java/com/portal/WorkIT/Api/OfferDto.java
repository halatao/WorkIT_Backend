package com.portal.WorkIT.Api;

import com.portal.WorkIT.Entity.Category;
import com.portal.WorkIT.Entity.Location;
import com.portal.WorkIT.Entity.Response;
import com.portal.WorkIT.Entity.User;
import java.util.List;

public class OfferDto {

  private long id;
  private String name;
  private int salaryLowest;
  private int salaryHighest;
  private LocationDto location;
  private CategoryDto category;
  private SimpleUserDto user;
  private List<ResponseDto> responses;

  public OfferDto(
    long id,
    String name,
    int salaryLowest,
    int salaryHighest,
    LocationDto location,
    CategoryDto category,
    SimpleUserDto user,
    List<ResponseDto> responses
  ) {
    this.id = id;
    this.name = name;
    this.salaryLowest = salaryLowest;
    this.salaryHighest = salaryHighest;
    this.location = location;
    this.category = category;
    this.user = user;
    this.responses = responses;
  }

  public OfferDto() {}

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

  public SimpleUserDto getUser() {
    return user;
  }

  public void setUser(SimpleUserDto user) {
    this.user = user;
  }

  public List<ResponseDto> getResponses() {
    return responses;
  }

  public void setResponses(List<ResponseDto> responses) {
    this.responses = responses;
  }
}
