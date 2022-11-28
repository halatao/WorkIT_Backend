package com.portal.WorkIT.Controller;

import com.portal.WorkIT.Api.CategoryDto;
import com.portal.WorkIT.Repository.CategoryRepository;
import com.portal.WorkIT.Services.EntityConverter;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

  private final CategoryRepository categoryRepository;
  private final EntityConverter entityConverter;

  public CategoryController(CategoryRepository categoryRepository) {
    this.categoryRepository = categoryRepository;
    this.entityConverter = new EntityConverter();
  }

  @GetMapping("/categories")
  List<CategoryDto> all() {
    return categoryRepository
      .findAll()
      .stream()
      .map(category ->
        new CategoryDto(
          entityConverter.CategoryToDto(category).getId(),
          entityConverter.CategoryToDto(category).getName()
        )
      )
      .collect(Collectors.toList());
  }
}
