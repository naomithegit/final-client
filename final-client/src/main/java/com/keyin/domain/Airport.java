package com.keyin.domain
        ;

import com.keyin.Aircraft.Aircraft;
import com.keyin.City.City;

import javax.persistence.*;
import java.util.List;

//@Entity
public class Airport {

    //@Id
    //@SequenceGenerator(name = "airport_sequence", sequenceName = "airport_sequence", allocationSize = 1, initialValue=1)
    //@GeneratedValue(generator = "airport_sequence")
    private long id;
    private String name;
    private String airportCode;

    //relationships

    //@ManyToMany
    private List<Aircraft> aircraft;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

   /* public List<Aircraft> getAircraft() {
        return aircraft;
    }

    public void setAircraft(List<Aircraft> aircraft) {
        this.aircraft = aircraft;
    }*/
}


