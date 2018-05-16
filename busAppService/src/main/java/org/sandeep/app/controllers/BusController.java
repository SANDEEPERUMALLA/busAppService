package org.sandeep.app.controllers;

import org.sandeep.app.models.Bus;
import org.sandeep.app.repositories.BusRepo;
import org.sandeep.app.repositories.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/bus")
public class BusController {

    @Autowired
    private BusRepository busRepository;

    @Autowired
    private BusRepo busRepo;

    @GetMapping("/")
    List<Bus> fetchAllBuses() {

        return busRepository.findAll();


    }


    @GetMapping(path = "/route", produces = MediaType.APPLICATION_JSON_VALUE)
    List<Bus> fetchBusesByRoute(@RequestParam("from") String fromCode, @RequestParam("to") String toCode) {

        return busRepo.fetchAllRouteBuses(fromCode, toCode);

    }
}
