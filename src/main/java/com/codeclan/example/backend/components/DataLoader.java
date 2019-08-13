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

        // ACCOMMODATION //

        ArrayList<Double> coords1 = new ArrayList<>();
        coords1.add(-10.00);
        coords1.add(10.00);

        Accommodation accom1 = new Accommodation("BillyBob's Hotel", 5, "Nice!!", coords1, "test url", AccommodationType.HOTEL);
        accommodationRepository.save(accom1);

        Accommodation accom2 = new Accommodation("Stewart's Hostel", 5, "Comfy beds", coords1, "test url", AccommodationType.HOSTEL);
        accommodationRepository.save(accom2);

        Accommodation accom3 = new Accommodation("Dafydd's Campsite", 1, "Pretty shoddy", coords1, "test url", AccommodationType.CAMPSITE);
        accommodationRepository.save(accom3);

        Accommodation accom4 = new Accommodation("Arledis' Hotel", 4, "Luxurious", coords1, "test url", AccommodationType.HOTEL);
        accommodationRepository.save(accom4);

        Accommodation accom5 = new Accommodation("Lochside B&B", 2, "Could use an update", coords1, "test url", AccommodationType.BANDB);
        accommodationRepository.save(accom5);


        // SERVICES //

        ArrayList<Double> coords3 = new ArrayList<>();
        coords3.add(-9.00);
        coords3.add(9.00);

        Service service1 = new Service("The Walker's Stick", 5, "Awesome", coords3, "test url", ServiceType.PUB);
        serviceRepository.save(service1);

        Service service2 = new Service("The Rambler's Arms", 4, "Dog friendly", coords3, "test url", ServiceType.PUB);
        serviceRepository.save(service2);

        Service service3 = new Service("Stewart's Bakery", 4, "The finest bagels in Balmaha", coords3, "test url", ServiceType.BAKERY);
        serviceRepository.save(service3);

        Service service4 = new Service("Fort Augustus Public Toilets", 1, "Needs a good clean", coords3, "test url", ServiceType.TOILETS);
        serviceRepository.save(service4);

        Service service5 = new Service("Perth Post Office", 5, "Open 9-5", coords3, "test url", ServiceType.POST_OFFICE);
        serviceRepository.save(service5);


        // POINTS OF INTEREST //

        ArrayList<Double> coords2 = new ArrayList<>();
        coords2.add(-20.00);
        coords2.add(20.00);

        PointOfInterest poi1 = new PointOfInterest("Milngavie", 3, "Small town with all the shops you need", coords2, "test url", PointOfInterestType.TOWN);
        pointOfInterestRepository.save(poi1);

        PointOfInterest poi2 = new PointOfInterest("Drymen", 2, "Village with small shop", coords2, "test url", PointOfInterestType.VILLAGE);
        pointOfInterestRepository.save(poi2);

        PointOfInterest poi3 = new PointOfInterest("Conic Hill", 5, "Beautiful views over Loch Lomond", coords2, "test url", PointOfInterestType.MOUNTAIN);
        pointOfInterestRepository.save(poi3);

        PointOfInterest poi4 = new PointOfInterest("Fort William", 3, "Highland capital - everything you need and plenty of pubs!", coords2, "test url", PointOfInterestType.TOWN);
        pointOfInterestRepository.save(poi4);

        PointOfInterest poi5 = new PointOfInterest("Drumlang Castle", 3, "Spooky ruins - don't camp here", coords2, "test url", PointOfInterestType.HISTORIC_SIGHT);
        pointOfInterestRepository.save(poi5);


        // USERS //

        User user1 = new User("Dave Smith");
        userRepository.save(user1);


        // ROUTES //


        // SETUP //

        user1.addLocation(accom1);
        userRepository.save(user1);
        accommodationRepository.save(accom1);

    }


}
