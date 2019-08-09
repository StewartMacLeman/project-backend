package com.codeclan.example.backend.controllers;

import com.codeclan.example.backend.repositories.AccommodationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/locations/accommodations")
public class AccommodationController {

    @Autowired
    AccommodationRepository accommodationRepository;
}
