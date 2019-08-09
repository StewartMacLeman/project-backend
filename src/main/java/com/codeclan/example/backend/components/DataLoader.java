package com.codeclan.example.backend.components;

import com.codeclan.example.backend.models.locations.Accommodation;
import com.codeclan.example.backend.repositories.AccommodationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    AccommodationRepository accommodationRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) throws Exception {

        ArrayList<Double> coords1 = new ArrayList<>();
        coords1.add(-10.00);
        coords1.add(10.00);
        Accommodation accom1 = new Accommodation("BillyBob's Hotel", 5, "Nice!!", coords1);

        accommodationRepository.save(accom1);

    }


}
