package com.keyin.domain;

import com.keyin.Airport.Airport;
import com.keyin.Passenger.Passenger;

import javax.persistence.*;

import javax.persistence.Id;
import java.util.List;

//@Entity
public class Aircraft {

    // @Id
    //@SequenceGenerator(name = "aircraft_sequence", sequenceName = "aircraft_sequence", allocationSize = 1, initialValue=1)
    //@GeneratedValue(generator = "aircraft_sequence")
    private long id;
    private String type;
    private String airLineName;
    private int numberOfPassengers;

    //relationships

    //@ManyToMany
    private List<Passenger> passengers;

    // getters
    public long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getAirLineName() {
        return airLineName;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    //setters

    public void setId(long id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAirLineName(String airLineName) {
        this.airLineName = airLineName;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

   /* public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }*/
}


