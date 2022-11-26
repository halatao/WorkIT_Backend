package com.portal.WorkIT.Controller;

import com.portal.WorkIT.Api.OfferDto;
import com.portal.WorkIT.Repository.OfferRepository;
import com.portal.WorkIT.Repository.ResponseRepository;
import com.portal.WorkIT.Services.EntityConverter;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class OfferController {

  private final OfferRepository offerRepository;
  private final ResponseRepository responseRepository;
  private final EntityConverter entityConverter;

  OfferController(
    OfferRepository offerRepository,
    ResponseRepository responseRepository
  ) {
    this.entityConverter = new EntityConverter();
    this.offerRepository = offerRepository;
    this.responseRepository = responseRepository;
  }

  @GetMapping("/offers")
  List<OfferDto> all() {
    return offerRepository
      .findAll()
      .stream()
      .map(offer ->
        new OfferDto(
          offer.getId(),
          offer.getName(),
          offer.getSalaryLowest(),
          offer.getSalaryHighest(),
          entityConverter.LocationToDto(offer.getLocation()),
          entityConverter.CategoryToDto(offer.getCategory()),
          entityConverter.UserToSimpleDto(offer.getUser()),
          entityConverter.ResponsesToDto(
            responseRepository
              .findAll()
              .stream()
              .filter(q -> q.getOffer().getId() == offer.getId())
              .toList()
          )
        )
      )
      .collect(Collectors.toList());
  }
}
