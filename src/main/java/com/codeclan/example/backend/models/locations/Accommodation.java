package com.codeclan.example.backend.models.locations;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;

@Entity
@Table(name="accommodations")
public class Accommodation extends Location {

    public Accommodation(String name, int rating, String description, ArrayList<Double> coordinates) {
        super(name, rating, description, coordinates);
    }

    public Accommodation() {
    }

}
