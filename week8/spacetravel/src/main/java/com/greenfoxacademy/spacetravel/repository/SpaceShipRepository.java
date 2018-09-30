package com.greenfoxacademy.spacetravel.repository;
import com.greenfoxacademy.spacetravel.models.SpaceShip;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface SpaceShipRepository  extends CrudRepository<SpaceShip,Long> {
    List<SpaceShip> findAll();
}
