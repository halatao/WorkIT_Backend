package com.portal.WorkIT.Controller;

import com.portal.WorkIT.Api.OfferDto;
import com.portal.WorkIT.Api.PostOfferDto;
import com.portal.WorkIT.Entity.Offer;
import com.portal.WorkIT.Repository.*;
import com.portal.WorkIT.Services.EntityConverter;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.*;

@RestController
class OfferController {

  private final OfferRepository offerRepository;
  private final ResponseRepository responseRepository;
  private final CategoryRepository categoryRepository;
  private final LocationRepository locationRepository;
  private final UserRepository userRepository;
  private final EntityConverter entityConverter;

  public OfferController(
    OfferRepository offerRepository,
    ResponseRepository responseRepository,
    CategoryRepository categoryRepository,
    LocationRepository locationRepository,
    UserRepository userRepository
  ) {
    this.offerRepository = offerRepository;
    this.responseRepository = responseRepository;
    this.categoryRepository = categoryRepository;
    this.locationRepository = locationRepository;
    this.userRepository = userRepository;
    this.entityConverter = new EntityConverter();
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

  @GetMapping("/offers/{id}")
  OfferDto one(@PathVariable long id) {
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
      .collect(Collectors.toList())
      .stream()
      .filter(q -> q.getId() == id)
      .findFirst()
      .get();
  }

  @PostMapping("/offers")
  OfferDto newOffer(@RequestBody PostOfferDto offer) {
    return entityConverter.OfferToDto(
      offerRepository.save(
        new Offer(
          offer.getName(),
          offer.getSalaryLowest(),
          offer.getSalaryHighest(),
          locationRepository.findById(offer.getLocation()).get(),
          categoryRepository.findById(offer.getCategory()).get(),
          userRepository.findById(offer.getUser()).get()
        )
      )
    );
  }

  @DeleteMapping("/offers/{id}")
  void deleteEmployee(@PathVariable Long id) {
    offerRepository.deleteById(id);
  }
}
