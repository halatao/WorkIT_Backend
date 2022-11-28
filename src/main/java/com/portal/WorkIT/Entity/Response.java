package com.portal.WorkIT.Entity;

import java.util.UUID;
import javax.persistence.*;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "response")
public class Response {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private long id;

  @Column(name = "reply", nullable = false)
  private String reply;

  @Column(name = "cv")
  private String cv;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;

  @ManyToOne
  @JoinColumn(name = "offer_id")
  private Offer offer;

  public Response(String reply, String cv, User user, Offer offer) {
    this.reply = reply;
    this.cv = cv;
    this.user = user;
    this.offer = offer;
  }

  public Response() {}

  public long getId() {
    return id;
  }

  public String getReply() {
    return reply;
  }

  public void setReply(String reply) {
    this.reply = reply;
  }

  public String getCv() {
    return cv;
  }

  public void setCv(String cv) {
    this.cv = cv;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Offer getOffer() {
    return offer;
  }

  public void setOffer(Offer offer) {
    this.offer = offer;
  }
}
