package com.portal.WorkIT.Controller;

import com.portal.WorkIT.Api.OfferDto;
import com.portal.WorkIT.Entity.Offer;
import com.portal.WorkIT.Entity.User;
import com.portal.WorkIT.Repository.OfferRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class OfferController {

  private final OfferRepository repository;

  OfferController(OfferRepository repository) {
    this.repository = repository;
  }

  @GetMapping("/offers")
  List<OfferDto> all() {
    return repository
      .findAll()
      .stream()
      .map(offer ->
        new OfferDto(
          offer.getId(),
          offer.getName(),
          offer.getSalaryLowest(),
          offer.getSalaryHighest(),
          offer.getLocation(),
          offer.getCategory(),
          offer.getUser(),
          offer.getResponses()
        )
      )
      .collect(Collectors.toList());
  }
}
