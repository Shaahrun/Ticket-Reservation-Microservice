package com.gmail.ejikemesharon;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.metamodel.Metamodel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

    //@Autowired
    /*public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }*/

    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    public List<Flight> getFlightsTo(String destination) {
        return flightRepository.findByDestination(destination);
    }

}
