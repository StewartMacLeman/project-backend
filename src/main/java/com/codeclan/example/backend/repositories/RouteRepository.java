package com.codeclan.example.backend.repositories;

import com.codeclan.example.backend.models.Route;
import com.codeclan.example.backend.projections.RouteEmbed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(excerptProjection = RouteEmbed.class)
public interface RouteRepository extends JpaRepository<Route, Long> {

}
