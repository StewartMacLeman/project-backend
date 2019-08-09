package com.codeclan.example.backend.components;

import com.codeclan.example.backend.models.locations.Accommodation;
import com.codeclan.example.backend.models.locations.AccommodationType;
import com.codeclan.example.backend.models.locations.PointOfInterest;
import com.codeclan.example.backend.models.locations.PointOfInterestType;
import com.codeclan.example.backend.repositories.AccommodationRepository;
import com.codeclan.example.backend.repositories.PointOfInterestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    AccommodationRepository accommodationRepository;

    @Autowired
    PointOfInterestRepository pointOfInterestRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) throws Exception {

        ArrayList<Double> coords1 = new ArrayList<>();
        coords1.add(-10.00);
        coords1.add(10.00);
        Accommodation accom1 = new Accommodation("BillyBob's Hotel", 5, "Nice!!", coords1, AccommodationType.HOTEL);
        accommodationRepository.save(accom1);

        ArrayList<Double> coords2 = new ArrayList<>();
        coords2.add(-20.00);
        coords2.add(20.00);
        PointOfInterest poi1 = new PointOfInterest("Milngavie", 3, "Small town with all the shops you need", coords2, PointOfInterestType.TOWN);
        pointOfInterestRepository.save(poi1);

    }


}
