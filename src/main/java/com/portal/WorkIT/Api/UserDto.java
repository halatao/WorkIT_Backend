package com.portal.WorkIT.Api;

import com.portal.WorkIT.Entity.Offer;
import com.portal.WorkIT.Entity.Response;
import com.portal.WorkIT.Entity.Role;
import java.util.ArrayList;
import java.util.List;

public class UserDto {

  private long id;
  private String username;
  private RoleDto role;
  private List<SimpleOfferDto> offers;
  private List<ResponseDto> responses;

  public UserDto(long id, String username, RoleDto role) {
    this.id = id;
    this.username = username;
    this.role = role;
    this.offers = new ArrayList<>();
    this.responses = new ArrayList<>();
  }

  public UserDto(
    long id,
    String username,
    RoleDto role,
    List<SimpleOfferDto> offers,
    List<ResponseDto> responses
  ) {
    this.id = id;
    this.username = username;
    this.role = role;
    this.offers = offers;
    this.responses = responses;
  }

  UserDto() {}

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public RoleDto getRole() {
    return role;
  }

  public void setRole(RoleDto role) {
    this.role = role;
  }

  public List<SimpleOfferDto> getOffers() {
    return offers;
  }

  public void setOffers(List<SimpleOfferDto> offers) {
    this.offers = offers;
  }

  public List<ResponseDto> getResponses() {
    return responses;
  }

  public void setResponses(List<ResponseDto> responses) {
    this.responses = responses;
  }
}
