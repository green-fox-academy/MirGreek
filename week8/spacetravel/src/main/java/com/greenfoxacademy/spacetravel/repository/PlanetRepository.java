package com.greenfoxacademy.spacetravel.repository;

import com.greenfoxacademy.spacetravel.models.Planet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlanetRepository extends CrudRepository<Planet,Long> {
    List<Planet> findAll();
}
