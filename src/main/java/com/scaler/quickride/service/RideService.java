package com.scaler.quickride.service;

import com.scaler.quickride.model.Ride;
import org.springframework.stereotype.Service;

@Service
public class RideService {
    public Ride proposeRide(String source,
                            String destination,
                            Long driverId,
                            Long vehicleId,
                            int availableSeatCount) {
        return new Ride();
    }
}