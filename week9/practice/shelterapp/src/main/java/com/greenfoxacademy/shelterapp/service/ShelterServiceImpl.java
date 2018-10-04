package com.greenfoxacademy.shelterapp.service;

import com.greenfoxacademy.shelterapp.model.Shelter;
/*import com.greenfoxacademy.shelterapp.repository.AnimalRepository;
import com.greenfoxacademy.shelterapp.repository.PersonRepository;
import com.greenfoxacademy.shelterapp.repository.ShelterRepository;*/
import com.greenfoxacademy.shelterapp.repository.ShelterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShelterServiceImpl implements ShelterService {
    ShelterRepository shelterRepository;

    @Autowired
    public ShelterServiceImpl(ShelterRepository shelterRepository) {
        this.shelterRepository = shelterRepository;
    }


    @Override
    public Shelter createShelter(String name) {
        Shelter shelter = new Shelter(name);
        shelterRepository.save(shelter);
        shelterRepository.findAll();
        return shelter;
    }
}
