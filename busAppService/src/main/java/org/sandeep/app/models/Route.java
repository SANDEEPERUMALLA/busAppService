package org.sandeep.app.models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "route")
public class Route {

    @org.springframework.data.annotation.Id
    private String Id;
    private String routeCode;
    private Place fromPlaceCode;
    private Place toPlaceCode;


    public Route(String routeCode, Place fromPlaceCode, Place toPlaceCode) {

        this.routeCode = routeCode;
        this.fromPlaceCode = fromPlaceCode;
        this.toPlaceCode = toPlaceCode;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public Place getFromPlaceCode() {
        return fromPlaceCode;
    }

    public void setFromPlaceCode(Place fromPlaceCode) {
        this.fromPlaceCode = fromPlaceCode;
    }

    public Place getToPlaceCode() {
        return toPlaceCode;
    }

    public void setToPlaceCode(Place toPlaceCode) {
        this.toPlaceCode = toPlaceCode;
    }

    public String getRouteCode() {
        return routeCode;
    }

    public void setRouteCode(String routeCode) {
        this.routeCode = routeCode;
    }

    @Override
    public String toString() {
        return "Route{" +
                "routeCode='" + routeCode + '\'' +
                ", fromPlaceCode='" + fromPlaceCode + '\'' +
                ", toPlaceCode='" + toPlaceCode + '\'' +
                '}';
    }

    public static class RouteBuilder {

        private String routeCode;
        private Place fromPlaceCode;
        private Place toPlaceCode;


        public RouteBuilder setRouteCode(String routeCode) {
            this.routeCode = routeCode;
            return this;
        }

        public RouteBuilder setFromPlaceCode(Place fromPlaceCode) {
            this.fromPlaceCode = fromPlaceCode;
            return this;
        }

        public RouteBuilder setToPlaceCode(Place toPlaceCode) {
            this.toPlaceCode = toPlaceCode;
            return this;
        }

        public Route build() {
            return new Route(this.routeCode, this.fromPlaceCode, this.toPlaceCode);
        }
    }
}
