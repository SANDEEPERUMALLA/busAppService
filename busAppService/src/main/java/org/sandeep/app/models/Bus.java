package org.sandeep.app.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalTime;

@Document(collection = "bus")
public class Bus {


    @Id
    private String Id;
    private Route route;
    private Travel travel;
    private LocalTime time;
    private int rating;
    private int fare;

    public Bus(Route route, Travel travel, LocalTime time, int rating, int fare) {
        this.route = route;
        this.travel = travel;
        this.time = time;
        this.rating = rating;
        this.fare = fare;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Travel getTravel() {
        return travel;
    }

    public void setTravel(Travel travel) {
        this.travel = travel;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "route=" + route +
                ", travel=" + travel +
                ", time=" + time +
                ", rating=" + rating +
                '}';
    }


}
