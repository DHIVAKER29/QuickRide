package com.scaler.quickride.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Passenger extends BaseModel{
    @ManyToMany(mappedBy = "passengers")
    private List<Ride> rides;
}