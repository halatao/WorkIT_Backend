package com.portal.WorkIT.Entity;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "location")
public class Location {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private long id;

  @Column(name = "name")
  private String name;

  @OneToMany
  @JoinColumn(name = "offer")
  private List<Offer> offers;

  public Location(String name) {
    this.name = name;
  }

  public Location() {}

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getId() {
    return id;
  }

  public List<Offer> getOffers() {
    return offers;
  }

  public void setOffers(List<Offer> offers) {
    this.offers = offers;
  }
}
