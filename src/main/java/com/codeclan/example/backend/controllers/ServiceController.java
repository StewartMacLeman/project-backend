package com.codeclan.example.backend.controllers;

import com.codeclan.example.backend.models.locations.PointOfInterest;
import com.codeclan.example.backend.models.locations.Service;
import com.codeclan.example.backend.repositories.PointOfInterestRepository;
import com.codeclan.example.backend.repositories.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/locations/services")
public class ServiceController {

    @Autowired
    ServiceRepository serviceRepository;

    @GetMapping
    public List<Service> getServices(){
        return serviceRepository.findAll();
    }
}
