package com.codeclan.example.backend.models.locations;

import java.util.ArrayList;

public class Accommodation extends Location {

    public Accommodation(String name, int rating, String description, ArrayList<Double> coordinates) {
        super(name, rating, description, coordinates);
    }

    public Accommodation() {
    }

}
