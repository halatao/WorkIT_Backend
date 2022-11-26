package com.portal.WorkIT.Controller;

import com.portal.WorkIT.Api.*;
import com.portal.WorkIT.Entity.Response;
import com.portal.WorkIT.Entity.User;
import com.portal.WorkIT.Repository.OfferRepository;
import com.portal.WorkIT.Repository.ResponseRepository;
import com.portal.WorkIT.Repository.UserRepository;
import com.portal.WorkIT.Services.EntityConverter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class UserController {

  private final EntityConverter entityConverter;
  private final UserRepository userRepository;
  private final OfferRepository offerRepository;
  private final ResponseRepository responseRepository;

  UserController(
    UserRepository userRepository,
    OfferRepository offerRepository,
    ResponseRepository responseRepository
  ) {
    this.entityConverter = new EntityConverter();
    this.userRepository = userRepository;
    this.offerRepository = offerRepository;
    this.responseRepository = responseRepository;
  }

  @GetMapping("/users")
  List<UserDto> all() {
    return userRepository
      .findAll()
      .stream()
      .map(user ->
        new UserDto(
          user.getId(),
          user.getUsername(),
          entityConverter.RoleToDto(user.getRole()),
          offerRepository
            .findAll()
            .stream()
            .filter(offer -> offer.getUser().getId() == user.getId())
            .map(offer ->
              new SimpleOfferDto(
                entityConverter.OfferToDto(offer).getId(),
                entityConverter.OfferToDto(offer).getName(),
                entityConverter.OfferToDto(offer).getSalaryLowest(),
                entityConverter.OfferToDto(offer).getSalaryHighest(),
                entityConverter.OfferToDto(offer).getLocation(),
                entityConverter.OfferToDto(offer).getCategory()
              )
            )
            .collect(Collectors.toList()),
          entityConverter.ResponsesToDto(
            responseRepository
              .findAll()
              .stream()
              .filter(q -> q.getId() == user.getId())
              .toList()
          )
        )
      )
      .collect(Collectors.toList());
  }
}
