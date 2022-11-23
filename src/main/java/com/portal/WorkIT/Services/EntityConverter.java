package com.portal.WorkIT.Services;

import com.portal.WorkIT.Api.*;
import com.portal.WorkIT.Entity.Offer;
import com.portal.WorkIT.Entity.Response;
import com.portal.WorkIT.Entity.Role;
import com.portal.WorkIT.Entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EntityConverter {
    public EntityConverter(){}
    public OfferDto OfferToDto(Offer offer){
        return new OfferDto(offer.getId(),offer.getName(),offer.getSalaryLowest(),offer.getSalaryHighest(),new LocationDto(offer.getLocation().getId(),offer.getLocation().getName()),new CategoryDto(offer.getCategory().getId(),offer.getCategory().getName()),UserToSimpleDto(offer.getUser()),ResponsesToDto(offer.getResponses()));
    }

    public UserDto UserToSimpleDto(User user) {
        return new UserDto(user.getId(),user.getUsername(), RoleToDto(user.getRole()));
    }

    public List<ResponseDto> ResponsesToDto(List<Response> responses){
        return responses.stream().map(response -> new ResponseDto(response.getId(),response.getReply(),response.getCv())).collect(Collectors.toList());
    }

    public RoleDto RoleToDto(Role role) {
        return new RoleDto(role.getId(),role.getName());
    }
}
