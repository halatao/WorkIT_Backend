package com.portal.WorkIT.Controller;

import com.portal.WorkIT.Api.OfferDto;
import com.portal.WorkIT.Entity.Offer;
import com.portal.WorkIT.Entity.Response;
import com.portal.WorkIT.Entity.User;
import com.portal.WorkIT.Repository.OfferRepository;
import java.util.List;
import java.util.stream.Collectors;

import com.portal.WorkIT.Services.EntityConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class OfferController {

  private final OfferRepository repository;
  private final EntityConverter entityConverter;

  OfferController(OfferRepository repository) {
    this.repository = repository;
    this.entityConverter = new EntityConverter();
  }

  @GetMapping("/offers")
  List<OfferDto> all() {
    return repository
      .findAll()
      .stream()
      .map(offer ->new OfferDto(entityConverter.OfferToDto(offer)))
      .collect(Collectors.toList());
  }
}
