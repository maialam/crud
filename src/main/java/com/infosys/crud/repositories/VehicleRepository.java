package com.infosys.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.crud.models.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

}
