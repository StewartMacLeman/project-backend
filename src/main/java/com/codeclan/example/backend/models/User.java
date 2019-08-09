package com.codeclan.example.backend.models;

import com.codeclan.example.backend.models.locations.Location;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="users")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="locations")
    private ArrayList<Location> favourites;

    @OneToMany(mappedBy = "user")
    private List<Route> routes;

    public User(String name) {
        this.name = name;
        this.favourites = new ArrayList<>();
        this.routes = new ArrayList<>();
    }

    public User() {
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

    public ArrayList<Location> getFavourites() {
        return favourites;
    }

    public void setFavourites(ArrayList<Location> favourites) {
        this.favourites = favourites;
    }

    public List<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(ArrayList<Route> routes) {
        this.routes = routes;
    }
}
