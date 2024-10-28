
/////
package com.keyin.domain;
import com.keyin.Passenger.Passenger;
import com.keyin.Aircraft.Aircraft;
import com.keyin.Airport.Airport;

import javax.persistence.*;
        import java.util.List;


public class City {

    generator = "city_sequence")

    private long id;
    private String name;
    private String state;
    private int population;

    //relationships

    private List<Airport> airports;


    //getters and setters
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public List<Airport> getAirports() {
        return airports;
    }

    public void setAirports(List<Airport> airports) {
        this.airports = airports;
    }
}
