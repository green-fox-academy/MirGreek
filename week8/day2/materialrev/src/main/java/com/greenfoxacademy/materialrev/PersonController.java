package com.greenfoxacademy.materialrev;

import com.greenfoxacademy.materialrev.models.Person;
import com.greenfoxacademy.materialrev.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    private PersonRepository personRepository;

    @Autowired
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @PostMapping("/persons")
    public Person savePerson(@RequestBody Person person){
      Person savedPerson =  personRepository.save(person);
    return savedPerson;
    }

    @GetMapping("/persons"){
        public Iterable<Person> getPeople(){
            personRepository.findAll();
        }


    }
}
