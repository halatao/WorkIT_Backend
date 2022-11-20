package com.portal.WorkIT.Services;

import com.portal.WorkIT.Api.OfferDto;
import com.portal.WorkIT.Api.ResponseDto;
import com.portal.WorkIT.Api.RoleDto;
import com.portal.WorkIT.Api.UserDto;
import com.portal.WorkIT.Entity.Offer;
import com.portal.WorkIT.Entity.User;

import java.util.stream.Collectors;

public class EntityConverter {
    public EntityConverter(){}
    public OfferDto OfferToDto(Offer offer){
        return new OfferDto(offer.getId(),offer.getName(),offer.getSalaryLowest(),offer.getSalaryHighest(),offer.getLocation(),offer.getCategory(),offer.getUser(),offer.getResponses());
    }
}
