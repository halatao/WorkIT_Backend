package com.portal.WorkIT.Api;

import com.portal.WorkIT.Entity.Offer;
import com.portal.WorkIT.Entity.Response;
import com.portal.WorkIT.Entity.Role;

import java.util.List;

public class UserDto {
    private long id;
    private String username;
    private Role role;
    private List<Response> responses;
    private List<Offer> offers;

    public UserDto(long id, String username, Role role, List<Response> responses, List<Offer> offers) {
        this.id = id;
        this.username = username;
        this.role = role;
        this.responses = responses;
        this.offers = offers;
    }

    UserDto(){}

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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<Response> getResponses() {
        return responses;
    }

    public void setResponses(List<Response> responses) {
        this.responses = responses;
    }

    public List<Offer> getOffers() {
        return offers;
    }

    public void setOffers(List<Offer> offers) {
        this.offers = offers;
    }
}
