package com.microservicewithpostgressmysqlmongodb.HotelService.hotel.service;

import com.microservicewithpostgressmysqlmongodb.HotelService.hotel.model.Address;
import com.microservicewithpostgressmysqlmongodb.HotelService.hotel.model.Hotels;
import com.microservicewithpostgressmysqlmongodb.HotelService.hotel.model.Price;
import com.microservicewithpostgressmysqlmongodb.HotelService.hotel.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class HotelService {

    private HotelRepository hotelRepository;

    @Autowired
    public HotelService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    // create a hotels
    public Hotels createHotel() {
        Price price = new Price(10, 1000000, 100);
        Address address = new Address("France", "Paris", "Champs-Élysées", "81821212");
        Hotels hotel = new Hotels("Hotel Paris - 1", address, price, "Paris");
        return hotelRepository.insert(hotel);
    }
    public List<Hotels> getAllHotels(){
        return hotelRepository.findAll();
    }

    //Get a Hotel by name
    public Hotels getHotelByName(String name) {
        System.out.println(name);

        return hotelRepository.findHotelsByName(name)
                .orElseThrow(() -> new NoSuchElementException("Hotel not found"));
    }

}
