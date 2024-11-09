package com.scaler.quickride.controller;

import com.scaler.quickride.dtos.ProposeRideRequestDto;
import com.scaler.quickride.dtos.ProposeRideResponseDto;
import com.scaler.quickride.model.Ride;
import com.scaler.quickride.service.RideService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rides")
public class RideController {
    private RideService rideService;

    public RideController(RideService rideService) {
        this.rideService = rideService;
    }

    public ProposeRideResponseDto proposeRide(ProposeRideRequestDto requestDto) {

        Ride ride = rideService.proposeRide(
                requestDto.getSource(),
                requestDto.getDestination(),
                requestDto.getDriverId(),
                requestDto.getVehicleId(),
                requestDto.getAvailableSeatCount()
        );

        return null;
    }
}