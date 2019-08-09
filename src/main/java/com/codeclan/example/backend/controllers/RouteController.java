package com.codeclan.example.backend.controllers;

import com.codeclan.example.backend.repositories.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/routes")

public class RouteController {

    @Autowired
    RouteRepository routeRepository;
}
