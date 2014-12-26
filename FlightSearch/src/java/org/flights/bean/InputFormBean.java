/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.flights.bean;

/**
 *
 * @author prasannabalaji
 */
public class InputFormBean {

    private String fromPlace;
    private String toPlace;
    private String date;
    private String month;
    private String year;
    private String adultCount;
    private String childCount;
    private String infantCount;
    private String seatClass;
    private String apiName;
    private String appID;
    private String appSecretKey;

    public InputFormBean() {
    }

    public String getFromPlace() {
        return fromPlace;
    }

    public void setFromPlace(String fromPlace) {
        this.fromPlace = fromPlace;
    }

    public String getToPlace() {
        return toPlace;
    }

    public void setToPlace(String toPlace) {
        this.toPlace = toPlace;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getAdultCount() {
        return adultCount;
    }

    public void setAdultCount(String adultCount) {
        this.adultCount = adultCount;
    }

    public String getChildCount() {
        return childCount;
    }

    public void setChildCount(String childCount) {
        this.childCount = childCount;
    }

    public String getInfantCount() {
        return infantCount;
    }

    public void setInfantCount(String infantCount) {
        this.infantCount = infantCount;
    }

    public String getSeatClass() {
        return seatClass;
    }

    public void setSeatClass(String seatClass) {
        this.seatClass = seatClass;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public String getAppID() {
        return appID;
    }

    public void setApiID(String appID) {
        this.appID = appID;
    }

    public String getAppSecretKey() {
        return appSecretKey;
    }

    public void setApiSecretKey(String appSecretKey) {
        this.appSecretKey = appSecretKey;
    }

    @Override
    public String toString() {
        return "InputFormBean{" + "fromPlace=" + fromPlace + ", toPlace=" + toPlace + ", date=" + date + ", month=" + month + ", year=" + year + ", adultCount=" + adultCount + ", childCount=" + childCount + ", infantCount=" + infantCount + '}';
    }

}
