package com.portal.WorkIT.Repository;

import com.portal.WorkIT.Entity.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OfferRepository extends JpaRepository<Offer,Long> {
}
