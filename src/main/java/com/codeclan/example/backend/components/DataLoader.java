package com.codeclan.example.backend.components;

import com.codeclan.example.backend.models.locations.Accommodation;
import com.codeclan.example.backend.models.locations.AccommodationType;
import com.codeclan.example.backend.models.locations.Service;
import com.codeclan.example.backend.models.locations.ServiceType;
import com.codeclan.example.backend.repositories.AccommodationRepository;
import com.codeclan.example.backend.repositories.ServiceRepository;
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

    }


}
