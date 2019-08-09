package com.codeclan.example.backend.repositories;

import com.codeclan.example.backend.models.locations.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Long> {
}
