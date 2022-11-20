package com.portal.WorkIT.Repository;

import com.portal.WorkIT.Entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location,Long> {
}
