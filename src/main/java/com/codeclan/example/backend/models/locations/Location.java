package com.codeclan.example.backend.models.locations;


import javax.persistence.*;
import java.util.ArrayList;


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="rating")
    private int rating;

    @Column(name="description")
    private String description;

    @Column(name="coordinates")
    private ArrayList<Double> coordinates;

    public Location(String name, int rating, String description, ArrayList<Double> coordinates) {
        this.name = name;
        this.rating = rating;
        this.description = description;
        this.coordinates = coordinates;
    }

    public Location() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Double> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(ArrayList<Double> coordinates) {
        this.coordinates = coordinates;
    }
}
