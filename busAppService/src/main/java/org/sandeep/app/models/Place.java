package org.sandeep.app.models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "place")
public class Place {

    @org.springframework.data.annotation.Id
    String Id;
    String name;
    String code;


    public Place(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "Place{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
