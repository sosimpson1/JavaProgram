package com.esl.flightreservation.entities;

import javax.persistence.Entity;
import java.sql.Timestamp;
import java.util.Date;

@Entity
//@Table(name = "flights")
public class Flight extends AbstractEntity{



    private String arrivalCity;
    private Long flightNumber;
    private String operatingAirlines;
    private String departureCity;
    private Date dateOfDeparture;
    private Timestamp estimatedDepartureTime;


    public Long getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(Long flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOperatingAirlines() {
        return operatingAirlines;
    }

    public void setOperatingAirlines(String operatingAirlines) {
        this.operatingAirlines = operatingAirlines;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public Date getDateOfDeparture() {
        return dateOfDeparture;
    }

    public void setDateOfDeparture(Date dateOfDeparture) {
        this.dateOfDeparture = dateOfDeparture;
    }

    public Timestamp getEstimatedDepartureTime() {
        return estimatedDepartureTime;
    }

    public void setEstimatedDepartureTime(Timestamp estimatedDepartureTime) {
        this.estimatedDepartureTime = estimatedDepartureTime;
    }
    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "arrivalCity='" + arrivalCity + '\'' +
                ", flightNumber=" + flightNumber +
                ", operatingAirlines='" + operatingAirlines + '\'' +
                ", departureCity='" + departureCity + '\'' +
                ", dateOfDeparture=" + dateOfDeparture +
                ", estimatedDepartureTime=" + estimatedDepartureTime +
                '}';
    }
}
