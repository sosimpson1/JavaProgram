package com.esl.flightreservation.entities.repos;


import com.esl.flightreservation.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.Date;
import java.util.List;
import java.util.Optional;

@RequestMapping
public interface FlightRepository extends JpaRepository<Flight, Long> {
    @Query("from Flight where departureCity=departureCity and arrivalCity=arrivalCity and dateOfDeparture=dateOfDeparture")
    List<Flight> findFlights(@Param("departureCity") String from, @Param("arrivalCity") String to, @Param("dateOfDeparture") Date departureDate);

}
