package com.codeclan.example.backend.controllers;
import com.codeclan.example.backend.models.locations.PointOfInterest;
import com.codeclan.example.backend.repositories.PointOfInterestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(value = "locations/pointsOfInterest")
public class PointOfInterestController {

    @Autowired
    PointOfInterestRepository pointOfInterestRepository;

    @GetMapping
    public List<PointOfInterest> getPointsOfInterest(){
        return pointOfInterestRepository.findAll();
    }
}
