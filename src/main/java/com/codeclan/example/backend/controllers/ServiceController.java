package com.codeclan.example.backend.controllers;

import com.codeclan.example.backend.repositories.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/locations/services")
public class ServiceController {

    @Autowired
    ServiceRepository serviceRepository;
}
