package com.okwatch.flightreservation.controller;

import com.itextpdf.text.DocumentException;
import com.okwatch.flightreservation.dto.ReservationRequest;
import com.okwatch.flightreservation.entities.Flight;
import com.okwatch.flightreservation.entities.Reservation;
import com.okwatch.flightreservation.repos.FlightRepository;
import com.okwatch.flightreservation.services.ReservationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.FileNotFoundException;
import java.util.Optional;

@Controller
public class ReservationController {
    Logger logger = LoggerFactory.getLogger(ReservationController.class);
    @Autowired
    ReservationService reservationService;
    @Autowired
    FlightRepository flightRepository;
    @RequestMapping("showCompleteReservation")
    public String showCompleteReservation(@RequestParam("id") Long flightId, ModelMap modelMap){

        Optional<Flight> optionalFlight = flightRepository.findById(flightId);
        if (optionalFlight.isPresent()) {
            Flight flight = optionalFlight.get();
            modelMap.addAttribute("flight", flight);
            return "completeReservation";
        } else {
            // Handle the case where the flight with the given ID is not found
            logger.error("Flight with ID " + flightId + " not found.");
            return "error";
        }
    }
    @RequestMapping(value = "completeReservation", method = RequestMethod.POST)
    public String completeReservation(ReservationRequest request,ModelMap modelMap){
        try {
            Reservation reservation = reservationService.bookFlight(request);
            modelMap.addAttribute("msg", "Reservation successful id:" + reservation.getId());
            return "reservationConfirmation";
        } catch (DocumentException | FileNotFoundException e) {
            // Handle the DocumentException here
            logger.error("An error occurred while generating the document: " + e.getMessage());
            modelMap.addAttribute("errorMsg", "An error occurred while generating the document.");
            return "errorPage";
        }
    }
}
