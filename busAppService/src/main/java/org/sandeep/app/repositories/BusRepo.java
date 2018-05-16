package org.sandeep.app.repositories;

import org.sandeep.app.models.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BusRepo {

    @Autowired
    private BusRepository busRepository;


    public List<Bus> fetchAllRouteBuses(String fromCode, String toCode) {
        return busRepository
                .findAll()
                .stream()
                .filter(bus ->
                {
                    return bus.getRoute().getFromPlaceCode().getCode().equals(fromCode) && bus.getRoute().getToPlaceCode().getCode().equals(toCode);
                })
                .collect(Collectors.toList());

    }
}
