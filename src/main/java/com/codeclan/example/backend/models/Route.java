package com.codeclan.example.backend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name="routes")
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;

    @JsonIgnoreProperties("routes")
    @ManyToOne
    @JoinColumn(name="user_id", nullable = false)
    private User user;

    @Column(name="start")
    private ArrayList<Double> start;

    @Column(name="end")
    private ArrayList<Double> end;

    public Route(String name, User user, ArrayList<Double> start, ArrayList<Double> end) {
        this.name = name;
        this.user = user;
        this.start = start;
        this.end = end;
    }

    public Route() {
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Double> getStart() {
        return start;
    }

    public void setStart(ArrayList<Double> start) {
        this.start = start;
    }

    public ArrayList<Double> getEnd() {
        return end;
    }

    public void setEnd(ArrayList<Double> end) {
        this.end = end;
    }
}
