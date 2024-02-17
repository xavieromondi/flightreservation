package com.okwatch.flightreservation.controller;

import com.okwatch.flightreservation.entities.Flight;
import com.okwatch.flightreservation.repos.FlightRepository;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;
import java.util.Optional;


@Controller
public class FlightController {
    Logger logger = LoggerFactory.getLogger(FlightController.class);
    @Autowired
    FlightRepository flightRepository;
    @RequestMapping(value = "findFlights",method = RequestMethod.POST)
    public String findFlight(@RequestParam("from") String from, @RequestParam("to") String to, @RequestParam("departureDate")@DateTimeFormat(pattern = "yyyy-MM-dd") String departureDate, ModelMap modelMap){
        // Logging the values received from the form
        System.out.println("Received from: " + from);
        System.out.println("Received to: " + to);
        System.out.println("Received departure date: " + departureDate);

        List<Flight> flights = flightRepository.findFlights(from,to,departureDate);
        Flight flight = flightRepository.findById(1l).get();

        logger.info(flight.getDateOfDeparture());
        System.out.println("Received flights: " + flights.toString()); // Logging flights object
        if (flights.isEmpty()) {
            System.out.println("No flights found for the given criteria.");
            // You can add error handling here if needed
        }
        modelMap.addAttribute("flights",flights);
        return "displayFlights";
    }
    @RequestMapping("admin/showAddFlight")
public String showAddFlight(){
        return "addFlight";
}
}
