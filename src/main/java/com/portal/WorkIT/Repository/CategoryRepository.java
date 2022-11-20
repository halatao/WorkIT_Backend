package com.portal.WorkIT.Repository;

import com.portal.WorkIT.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
