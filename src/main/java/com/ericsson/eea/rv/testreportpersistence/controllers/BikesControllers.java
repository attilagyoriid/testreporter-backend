package com.ericsson.eea.rv.testreportpersistence.controllers;

import com.ericsson.eea.rv.testreportpersistence.models.Bike;
import com.ericsson.eea.rv.testreportpersistence.repositories.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by eattgyo on 5/20/2018.
 */
@RestController
@RequestMapping(value = "api/v1/bikes")
public class BikesControllers {
    @Autowired
    private BikeRepository bikeRepository;

    @GetMapping
    public List<Bike> list() {
        return bikeRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Bike bike) {
        bikeRepository.save(bike);
    }

    @GetMapping("/{id}")
    public Bike get(@PathVariable("id") long id) {
        return bikeRepository.getOne(id);
    }
}
