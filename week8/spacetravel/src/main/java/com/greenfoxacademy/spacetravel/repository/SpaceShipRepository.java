package com.greenfoxacademy.spacetravel.repository;
import com.greenfoxacademy.spacetravel.models.Spaceship;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface SpaceShipRepository  extends CrudRepository<Spaceship,Long> {
    List<Spaceship> findAll();
    Spaceship findAllById(Long id);
}
