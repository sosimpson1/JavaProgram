package com.esl.flightcheckin.integration;

import com.esl.flightcheckin.integration.dto.Reservation;
import com.esl.flightcheckin.integration.dto.ReservationUpdateRequest;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
@Component
public class ReservationRestClientImpl extends ReservationRestClient {
    public static final String RESERVATION_REST_URL = "http://localhost:8080/reservations/";

    @Override
    public Reservation findReservation(Long id) {
        RestTemplate restTemplate = new RestTemplate();
//        Reservation reservation = restTemplate.getForObject(RESERVATION_REST_URL + id, Reservation.class);
//        return reservation;

        try {
            ResponseEntity<Reservation> reservationResp = restTemplate.exchange(RESERVATION_REST_URL + id, HttpMethod.GET, null, Reservation.class);
            if (reservationResp.getStatusCodeValue() == 200) {
                return reservationResp.getBody();
            } else {
                return new Reservation();
            }
        }catch (HttpClientErrorException ex){
            LoggerFactory.getLogger(ReservationRestClientImpl.class).error("{}", ex.getLocalizedMessage());
            return new Reservation();
        }
    }

    public  Reservation updateReservation(ReservationUpdateRequest request){
        RestTemplate restTemplate = new RestTemplate();
//        Reservation reservation = restTemplate.postForObject(RESERVATION_REST_URL, request, Reservation.class);
        ResponseEntity<Reservation> reservationResp = restTemplate.exchange(RESERVATION_REST_URL, HttpMethod.POST, new HttpEntity<>(request), Reservation.class);
        if (reservationResp.getStatusCodeValue() == 200){
            return reservationResp.getBody();
        }else{
            return null;
        }
    }


}
