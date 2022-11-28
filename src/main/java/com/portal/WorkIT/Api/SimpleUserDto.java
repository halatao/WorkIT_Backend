package com.portal.WorkIT.Api;

public class SimpleUserDto {

  private long id;
  private String username;
  private RoleDto role;

  public SimpleUserDto(long id, String username, RoleDto role) {
    this.id = id;
    this.username = username;
    this.role = role;
  }

  public SimpleUserDto() {}

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
}
