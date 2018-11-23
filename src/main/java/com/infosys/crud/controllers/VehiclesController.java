package com.infosys.crud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.crud.models.Vehicle;
import com.infosys.crud.repositories.VehicleRepository;

@RestController
@RequestMapping("/api/v1/vehicles")
public class VehiclesController {
	@Autowired
	private VehicleRepository vehicleRepository;
	
	
	@GetMapping
	public List<Vehicle> list(){
		return vehicleRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Vehicle vehicle) {
		vehicleRepository.save(vehicle);
	}
	
	@GetMapping("/{id}")
	public Vehicle get(@PathVariable("id") long id) {
		return vehicleRepository.getOne(id);
	}
	
}
