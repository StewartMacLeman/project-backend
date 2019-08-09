package com.codeclan.example.backend.repositories;

import com.codeclan.example.backend.models.locations.Accommodation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccommodationRepository extends JpaRepository<Accommodation, Long> {


}
