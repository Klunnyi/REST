package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //@Controller + @ResponseBody над каждым методом
@RequestMapping("/people")
public class PeopleController {

    private final PersonService personService;

    @Autowired
    public PeopleController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public List<Person> getPeople() {
        return personService.findAll(); // Jackson конвертируеет эти обьекты в JSON
    }

    @GetMapping("/{id}")
    public Person getPerson(@PathVariable("id") Long id) {
        return personService.findOne(id);  // Jackson конвертируеет в JSON
    }

}
