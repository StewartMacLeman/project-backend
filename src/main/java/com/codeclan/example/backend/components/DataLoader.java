package com.codeclan.example.backend.components;

import com.codeclan.example.backend.models.Route;
import com.codeclan.example.backend.models.User;
import com.codeclan.example.backend.models.locations.Accommodation;
import com.codeclan.example.backend.models.locations.AccommodationType;
import com.codeclan.example.backend.models.locations.Service;
import com.codeclan.example.backend.models.locations.ServiceType;
import com.codeclan.example.backend.repositories.*;
import com.codeclan.example.backend.models.locations.PointOfInterest;
import com.codeclan.example.backend.models.locations.PointOfInterestType;
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
    ServiceRepository serviceRepository;

    @Autowired
    PointOfInterestRepository pointOfInterestRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    RouteRepository routeRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) throws Exception {

        ArrayList<Double> coords1 = new ArrayList<>();
        coords1.add(-10.00);
        coords1.add(10.00);
        Accommodation accom1 = new Accommodation("BillyBob's Hotel", 5, "Nice!!", coords1, AccommodationType.HOTEL);
        accommodationRepository.save(accom1);

        ArrayList<Double> coords3 = new ArrayList<>();
        coords3.add(-9.00);
        coords3.add(9.00);
        Service service1 = new Service("The Walker's Stick", 5, "Awesome", coords3, ServiceType.PUB);
        serviceRepository.save(service1);

        ArrayList<Double> coords2 = new ArrayList<>();
        coords2.add(-20.00);
        coords2.add(20.00);
        PointOfInterest poi1 = new PointOfInterest("Milngavie", 3, "Small town with all the shops you need", coords2, PointOfInterestType.TOWN);
        pointOfInterestRepository.save(poi1);

        User user1 = new User("Dave Smith");
        userRepository.save(user1);


        Route route1 = new Route("route1", user1, coords1, coords2);
        routeRepository.save(route1);

        user1.addLocation(accom1);
        userRepository.save(user1);
        accommodationRepository.save(accom1);

    }


}
