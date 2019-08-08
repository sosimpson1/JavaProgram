package com.esl.flightreservation.entities.repos;


import com.esl.flightreservation.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    public Reservation findById(long id);
}
