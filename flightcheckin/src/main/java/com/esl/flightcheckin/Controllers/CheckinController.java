package com.esl.flightcheckin.Controllers;

import com.esl.flightcheckin.integration.ReservationRestClient;
import com.esl.flightcheckin.integration.dto.Reservation;
import com.esl.flightcheckin.integration.dto.ReservationUpdateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CheckinController {
    @Autowired
    ReservationRestClient restClient;

    @RequestMapping("/showStartCheckIn")
    public String showStartCheckin(){
        return "startCheckIn";
    }
    @RequestMapping(value = "/startCheckIn", method = RequestMethod.POST)
    public String startCheckIn(@RequestParam("reservationId") Long reservationId, ModelMap modelMap) {
        Reservation reservation = restClient.findReservation(reservationId);
        modelMap.addAttribute("reservation", reservation);
        return "displayReservationDetails";

    }
    @RequestMapping(value = "/completeCheckIn", method = RequestMethod.POST)
     public String completeCheckIn(@RequestParam Long reservationId, @RequestParam int numberOfBags) {
        ReservationUpdateRequest reservationUpdateRequest = new ReservationUpdateRequest();
        reservationUpdateRequest.setId((reservationId));
        reservationUpdateRequest.setCheckedIn(true);
        reservationUpdateRequest.setNumberOfBags(numberOfBags);
        restClient.UpdateReservation(reservationUpdateRequest);
        return "checkinConfirmation";
     }
}
