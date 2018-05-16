package org.sandeep.app.models;

public class Travel {

    private String travelCode;
    private String name;
    private int rating;

    public Travel(String travelCode, String name, int rating) {
        this.travelCode = travelCode;
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getTravelCode() {
        return travelCode;
    }

    public void setTravelCode(String travelCode) {
        this.travelCode = travelCode;
    }

    @Override
    public String toString() {
        return "Travel{" +
                "travelCode='" + travelCode + '\'' +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }
}
