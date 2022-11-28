package com.portal.WorkIT.Controller;

import com.portal.WorkIT.Api.LocationDto;
import com.portal.WorkIT.Repository.LocationRepository;
import com.portal.WorkIT.Services.EntityConverter;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {

  private final LocationRepository locationRepository;
  private final EntityConverter entityConverter;

  public LocationController(LocationRepository locationRepository) {
    this.locationRepository = locationRepository;
    entityConverter = new EntityConverter();
  }

  @GetMapping("/locations")
  List<LocationDto> all() {
    return locationRepository
      .findAll()
      .stream()
      .map(location ->
        new LocationDto(
          entityConverter.LocationToDto(location).getId(),
          entityConverter.LocationToDto(location).getName()
        )
      )
      .collect(Collectors.toList());
  }
}
