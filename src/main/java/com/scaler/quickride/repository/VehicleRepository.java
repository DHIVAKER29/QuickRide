package com.scaler.quickride.repository;

import com.scaler.quickride.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    @Override
    Optional<Vehicle> findById(Long aLong);
}