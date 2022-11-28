package com.portal.WorkIT.Entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "offer")
public class Offer {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private long id;

  @Column(name = "name", nullable = false)
  private String name;

  @Column(name = "salaryLowest")
  private int salaryLowest;

  @Column(name = "salaryHighest")
  private int salaryHighest;

  @ManyToOne
  @JoinColumn(name = "location_id", nullable = false)
  private Location location;

  @ManyToOne
  @JoinColumn(name = "category_id", nullable = false)
  private Category category;

  @ManyToOne
  @JoinColumn(name = "user_id", nullable = false)
  private User user;

  @OneToMany
  @JoinColumn(name = "response")
  private List<Response> responses;

  public Offer(
    String name,
    int salaryLowest,
    int salaryHighest,
    Location location,
    Category category,
    User user
  ) {
    this.name = name;
    this.salaryLowest = salaryLowest;
    this.salaryHighest = salaryHighest;
    this.location = location;
    this.category = category;
    this.user = user;
    this.responses = new ArrayList<>();
  }

  public Offer() {}

  public long getId() {
    return id;
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

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public List<Response> getResponses() {
    return responses;
  }

  public void setResponses(List<Response> responses) {
    this.responses = responses;
  }
}
