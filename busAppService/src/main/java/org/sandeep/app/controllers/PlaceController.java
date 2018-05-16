package org.sandeep.app.controllers;

import org.sandeep.app.models.Place;
import org.sandeep.app.repositories.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/place")
public class PlaceController {


    @Autowired
    private PlaceRepository placeRepository;

    @GetMapping("/")
    List<Place> fetchAllPlaces() {
        return placeRepository.findAll();
    }


}
