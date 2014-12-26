/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.flights.bean;

/**
 *
 * @author Asus
 */
public class ResultMapperBean {

    private String flightcode;
    private String airline;
    private String duration;
    private String arrdate;
    private String depdate;
    private String seatsavailable;

    public ResultMapperBean() {
    }

    public ResultMapperBean(String flightcode, String airline, String duration, String arrdate, String depdate, String seatsavailable) {
        this.flightcode = flightcode;
        this.airline = airline;
        this.duration = duration;
        this.arrdate = arrdate;
        this.depdate = depdate;
        this.seatsavailable = seatsavailable;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getArrdate() {
        return arrdate;
    }

    public void setArrdate(String arrdate) {
        this.arrdate = arrdate;
    }

    public String getDepdate() {
        return depdate;
    }

    public void setDepdate(String depdate) {
        this.depdate = depdate;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getFlightcode() {
        return flightcode;
    }

    public void setFlightcode(String flightcode) {
        this.flightcode = flightcode;
    }

    public String getSeatsavailable() {
        return seatsavailable;
    }

    public void setSeatsavailable(String seatsavailable) {
        this.seatsavailable = seatsavailable;
    }
}
