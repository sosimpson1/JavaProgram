package com.esl.User.controller;

import com.esl.User.Flight;
import com.esl.User.repos.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;
@Controller
public class FlightController {
    @Autowired
    FlightRepository flightRepository;

    @RequestMapping(value = "addFlight" , method = RequestMethod.GET)
    public String addFlight(@RequestParam("from") String from, @RequestParam("to") String to,
                              @RequestParam("departureDate") @DateTimeFormat(pattern = "MM-dd-yyyy") Date depatureDate,
                              ModelMap modelMap) {
        List<Flight> flights = flightRepository.findFlights(from, to, depatureDate);
        modelMap.addAttribute("flights", flights);
        return "find-flights";
    }
}
