package com.scaler.quickride.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Ride extends BaseModel{
    private String source;
    private String destination;
    private int amount;
    private int availableSeatCount;

    @ManyToOne
    private Driver driver;

    @ManyToMany
    private List<Passenger> passengers;

    @ManyToOne
    private Vehicle vehicle;
}
