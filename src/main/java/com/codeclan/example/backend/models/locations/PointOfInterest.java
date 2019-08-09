package com.codeclan.example.backend.models.locations;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;

@Entity
@Table(name="points_of_interest")
public class PointOfInterest extends Location {

    public PointOfInterest(String name, int rating, String description, ArrayList<Double> coordinates) {
        super(name, rating, description, coordinates);
    }

    public PointOfInterest() {
    }
}
