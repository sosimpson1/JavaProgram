package com.esl.flightreservation.service;

import com.esl.flightreservatio.dto.ReservationRequest;
import com.esl.flightreservation.entities.Reservation;

public interface ReservationService {

    public Reservation bookFlight(ReservationRequest request);
}
