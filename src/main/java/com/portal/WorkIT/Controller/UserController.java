package com.portal.WorkIT.Controller;

import com.portal.WorkIT.Api.OfferDto;
import com.portal.WorkIT.Api.ResponseDto;
import com.portal.WorkIT.Api.RoleDto;
import com.portal.WorkIT.Api.UserDto;
import com.portal.WorkIT.Entity.Response;
import com.portal.WorkIT.Entity.User;
import com.portal.WorkIT.Repository.OfferRepository;
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

  UserController(
    UserRepository userRepository,
    OfferRepository offerRepository
  ) {
    this.entityConverter = new EntityConverter();
    this.userRepository = userRepository;
    this.offerRepository = offerRepository;
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
          user.getRole(),
          user.getResponses(),
          user.getOffers()
        )
      )
      .collect(Collectors.toList());
  }
}
