package org.sandeep.app;

import org.sandeep.app.models.*;
import org.sandeep.app.repositories.BusRepository;
import org.sandeep.app.repositories.PlaceRepository;
import org.sandeep.app.repositories.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalTime;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private BusRepository busRepository;

    @Autowired
    private RouteRepository routeRepository;

    @Autowired
    private PlaceRepository placeRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Place place1 = new Place("Hyderabad", "HYD");
        placeRepository.save(place1);
        Place place2 = new Place("Bangalore", "BGL");
        placeRepository.save(place2);
        Place place3 = new Place("Chennai", "CHN");
        placeRepository.save(place3);
        Place place4 = new Place("Mumbai", "MUM");
        placeRepository.save(place4);
        Place place5 = new Place("Cochin", "COC");
        placeRepository.save(place5);
        Place place6 = new Place("Delhi", "DEL");
        placeRepository.save(place6);
        Place place7 = new Place("Pune", "PUN");
        placeRepository.save(place7);
        Place place8 = new Place("Mysore", "MYS");
        placeRepository.save(place8);


        Travel travel1 = new Travel("SKT", "Sri Krishna Travels", Rating.BAD.getRating());
        Travel travel2 = new Travel("SRS", "SRS Travels", Rating.GOOD.getRating());
        Travel travel3 = new Travel("LML", "Limo Liner Travels", Rating.GREAT.getRating());
        Travel travel4 = new Travel("KSN", "Kesineni Travels", Rating.WORSE.getRating());
        Travel travel5 = new Travel("KVR", "Kaveri Travels", Rating.AWESOME.getRating());


        Route.RouteBuilder routeBuilder = new Route.RouteBuilder();

        Route route1 = routeBuilder.setRouteCode("001").setFromPlaceCode(place1).setToPlaceCode(place2).build();
        routeRepository.save(route1);
        Route route2 = routeBuilder.setRouteCode("002").setFromPlaceCode(place4).setToPlaceCode(place6).build();
        routeRepository.save(route2);
        Route route3 = routeBuilder.setRouteCode("003").setFromPlaceCode(place5).setToPlaceCode(place2).build();
        routeRepository.save(route3);
        Route route4 = routeBuilder.setRouteCode("004").setFromPlaceCode(place6).setToPlaceCode(place6).build();
        routeRepository.save(route4);
        Route route5 = routeBuilder.setRouteCode("005").setFromPlaceCode(place6).setToPlaceCode(place7).build();
        routeRepository.save(route5);
        Route route6 = routeBuilder.setRouteCode("006").setFromPlaceCode(place8).setToPlaceCode(place8).build();
        routeRepository.save(route6);
        Route route7 = routeBuilder.setRouteCode("007").setFromPlaceCode(place1).setToPlaceCode(place2).build();
        routeRepository.save(route7);
        Route route8 = routeBuilder.setRouteCode("008").setFromPlaceCode(place4).setToPlaceCode(place1).build();
        routeRepository.save(route8);
        Route route9 = routeBuilder.setRouteCode("009").setFromPlaceCode(place2).setToPlaceCode(place1).build();
        routeRepository.save(route9);
        Route route10 = routeBuilder.setRouteCode("00").setFromPlaceCode(place3).setToPlaceCode(place2).build();
        routeRepository.save(route10);


        Bus bus1 = new Bus(route1, travel1, LocalTime.of(10, 20), Rating.AWESOME.getRating(),1000);
        busRepository.save(bus1);
        Bus bus2 = new Bus(route1, travel1, LocalTime.of(11, 20), Rating.BAD.getRating(),800);
        busRepository.save(bus2);
        Bus bus3 = new Bus(route1, travel1, LocalTime.of(12, 20), Rating.GREAT.getRating(), 200);
        busRepository.save(bus3);
        Bus bus4 = new Bus(route1, travel1, LocalTime.of(1, 20), Rating.GOOD.getRating(),1600);
        busRepository.save(bus4);
        Bus bus5 = new Bus(route1, travel1, LocalTime.of(2, 20), Rating.GREAT.getRating(), 1345);
        busRepository.save(bus5);
        Bus bus6 = new Bus(route1, travel1, LocalTime.of(3, 20), Rating.AWESOME.getRating(),2000);
        busRepository.save(bus5);

        Bus bus7 = new Bus(route1, travel1, LocalTime.of(10, 20), Rating.AWESOME.getRating(),1000);
        busRepository.save(bus7);
        Bus bus8 = new Bus(route1, travel2, LocalTime.of(11, 20), Rating.BAD.getRating(),800);
        busRepository.save(bus8);
        Bus bus9 = new Bus(route1, travel4, LocalTime.of(12, 20), Rating.GREAT.getRating(), 200);
        busRepository.save(bus9);
        Bus bus10 = new Bus(route1, travel5, LocalTime.of(1, 20), Rating.GOOD.getRating(),1600);
        busRepository.save(bus10);
        Bus bus11 = new Bus(route1, travel2, LocalTime.of(2, 20), Rating.GREAT.getRating(), 1345);
        busRepository.save(bus11);
        Bus bus12 = new Bus(route1, travel3, LocalTime.of(3, 20), Rating.AWESOME.getRating(),2000);
        busRepository.save(bus12);



    }

}