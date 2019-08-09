package com.codeclan.example.backend.repositories;

import com.codeclan.example.backend.models.locations.PointOfInterest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PointOfInterestRepository extends JpaRepository<PointOfInterest, Long> {
}
