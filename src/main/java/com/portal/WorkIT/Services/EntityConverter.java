package com.portal.WorkIT.Services;

import com.portal.WorkIT.Api.*;
import com.portal.WorkIT.Entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EntityConverter {
    public EntityConverter(){}
    public OfferDto OfferToDto(Offer offer){
        return new OfferDto(offer.getId(),offer.getName(),offer.getSalaryLowest(),offer.getSalaryHighest(),LocationToDto(offer.getLocation()),CategoryToDto(offer.getCategory()),UserToSimpleDto(offer.getUser()),ResponsesToDto(offer.getResponses()));
    }

    public SimpleUserDto UserToSimpleDto(User user) {
        return new SimpleUserDto(user.getId(),user.getUsername(), RoleToDto(user.getRole()));
    }

    public List<ResponseDto> ResponsesToDto(List<Response> responses){
        return responses.stream().map(response -> new ResponseDto(response.getId(),response.getReply(),response.getCv())).collect(Collectors.toList());
    }

    public RoleDto RoleToDto(Role role) {
        return new RoleDto(role.getId(),role.getName());
    }

    public LocationDto LocationToDto(Location location){return new LocationDto(location.getId(),location.getName());}

    public CategoryDto CategoryToDto(Category category){return new CategoryDto(category.getId(),category.getName());}
}
