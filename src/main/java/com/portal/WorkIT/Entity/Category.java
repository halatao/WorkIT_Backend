package com.portal.WorkIT.Entity;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private long id;

  @Column(name = "name", nullable = false)
  private String name;

  @OneToMany
  @JoinColumn(name = "offer")
  private List<Offer> offers;

  public Category(String name) {
    this.name = name;
  }

  public Category() {}

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Offer> getOffers() {
    return offers;
  }

  public void setOffers(List<Offer> offers) {
    this.offers = offers;
  }
}
