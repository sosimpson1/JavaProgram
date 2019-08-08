package com.esl.flightreservation.Controllers;

import com.esl.flightreservatio.dto.ReservationUpdateRequest;
import com.esl.flightreservation.entities.Reservation;
import com.esl.flightreservation.entities.repos.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
public class ReservationRestController {

    @Autowired
    ReservationRepository reservationRepository;

    @RequestMapping("/reservations/{id}")
    public ResponseEntity<Reservation> findReservation(@PathVariable("id") long id) {
        //Reservation reservation = new Reservation();
        Reservation reservation = reservationRepository.findById(id);
        if (reservation != null)
            return new ResponseEntity<>(reservation, HttpStatus.OK);
        else
            return new ResponseEntity<>(new Reservation(), HttpStatus.NOT_FOUND);

    }
    @RequestMapping("/reservations")
    public Reservation updateReservation(@RequestBody ReservationUpdateRequest request) {
       Reservation reservation = reservationRepository.findById(request.getId()).get();
       reservation.setNumberOfBags(request.getNumberOfBags());
       reservation.setCheckedIn(request.getCheckedIn());
       Reservation updateReservation = reservationRepository.save(reservation);
       return reservationRepository.save(reservation);

    }
}
