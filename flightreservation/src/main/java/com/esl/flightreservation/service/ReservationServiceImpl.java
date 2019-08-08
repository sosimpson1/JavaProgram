package com.esl.flightreservation.service;

import com.esl.flightreservatio.dto.ReservationRequest;
import com.esl.flightreservation.entities.Flight;
import com.esl.flightreservation.entities.Passenger;
import com.esl.flightreservation.entities.Reservation;
import com.esl.flightreservation.entities.repos.FlightRepository;
import com.esl.flightreservation.entities.repos.PassengerRepository;
import com.esl.flightreservation.entities.repos.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    FlightRepository flightRepository;
    @Autowired
    PassengerRepository passengerRepository;
    @Autowired
    ReservationRepository reservationRepository;

    @Override
    public Reservation bookFlight(ReservationRequest request) {
        // TODO Auto-generate method stub//Make Payment

        Long flightId = request.getFlightId();
        Flight flight = flightRepository.findById(flightId).get();

        Passenger passenger = new Passenger();
        passenger.setFirstName(request.getPassengerFirstName());
        passenger.setLastName(request.getPassengerLastName());
        passenger.setPhone(request.getPassengerPhone());
        passenger.setEmail(request.getPassengerEmail());
        Passenger savedPassenger = passengerRepository.save(passenger);

        Reservation reservation = new Reservation();
        reservation.setFlight(flight);
        reservation.setPassenger(savedPassenger);
        reservation.setCheckedIn(false);

        Reservation savedReservation = reservationRepository.save(reservation);
        return  savedReservation;
    }
}
