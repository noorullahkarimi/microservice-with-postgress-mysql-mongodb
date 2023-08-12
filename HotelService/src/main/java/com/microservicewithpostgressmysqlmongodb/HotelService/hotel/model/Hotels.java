package com.microservicewithpostgressmysqlmongodb.HotelService.hotel.model;

//import org.springframework.data.mongodb.core.mapping.Document;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Hotels {
    @Id
    private String id;
    private String name;
    private Address address;
    private Price price;
    private String location;

    public Hotels(String name, Address address, Price price, String location) {
        this.name = name;
        this.address = address;
        this.price = price;
        this.location = location;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Hotels{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", price=" + price +
                ", location='" + location + '\'' +
                '}';
    }

}
