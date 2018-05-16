package org.sandeep.app.models;

public enum Rating {
    AWESOME(5),
    GREAT(4),
    GOOD(3),
    BAD(1),
    WORSE(1);

    private int rating;

    Rating(int rating) {
        this.rating = rating;

    }

    public int getRating() {

        return this.rating;


    }
}
