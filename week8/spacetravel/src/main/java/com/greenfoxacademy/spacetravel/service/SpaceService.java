package com.greenfoxacademy.spacetravel.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SpaceService {

     List<List> getPlanets();

     long getSpaceShip(long id);

}
