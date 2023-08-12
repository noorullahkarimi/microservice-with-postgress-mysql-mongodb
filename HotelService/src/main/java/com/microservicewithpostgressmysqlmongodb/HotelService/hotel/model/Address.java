package com.microservicewithpostgressmysqlmongodb.HotelService.hotel.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Address {

    private String country;
    private String city;
    private String state;
    private String zipcode;

    public Address(String country, String city, String state, String zipcode) {
        this.country = country;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
