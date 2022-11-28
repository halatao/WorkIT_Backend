package com.portal.WorkIT.Api;

import java.util.List;
import javax.persistence.*;

public class LocationDto {

  private long id;
  private String name;

  public LocationDto(long id, String name) {
    this.id = id;
    this.name = name;
  }

  public LocationDto() {}

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }
}
