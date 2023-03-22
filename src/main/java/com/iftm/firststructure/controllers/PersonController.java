package com.iftm.firststructure.controllers;

import com.iftm.firststructure.models.Person;
import com.iftm.firststructure.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping("persons")
    public List<Person> getAllPerson() {
        return personService.getAllPerson();
    }
    @GetMapping("person/{id}")
    public Optional<Person> getPerson(@PathVariable("id") Long id) {
        return personService.getPersonById(id);
    }
    @PostMapping("person")
    public Person save(@RequestBody Person person) {
        return personService.save(person);
    }
    @PutMapping("person")
    public Person update(@RequestBody Person person) {
        return personService.update(person);
    }
    @DeleteMapping("person/{id}")
    public String delete(@PathVariable("id") Long id) {
      return personService.delete(id);

    }
}
