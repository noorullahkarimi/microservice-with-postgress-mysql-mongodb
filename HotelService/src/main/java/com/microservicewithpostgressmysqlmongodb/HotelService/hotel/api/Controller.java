package com.microservicewithpostgressmysqlmongodb.HotelService.hotel.api;

import com.microservicewithpostgressmysqlmongodb.HotelService.hotel.model.Hotels;
import com.microservicewithpostgressmysqlmongodb.HotelService.hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class Controller {

    private HotelService hotelService;

    @Autowired
    public Controller(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping("/index")
    public @ResponseBody List<Hotels> index(){
        return hotelService.getAllHotels();
    }

    @GetMapping("/save")
    public Hotels insert(){
        return hotelService.createHotel();
    }

    @GetMapping( "/getHotel/{name}")
    public @ResponseBody Hotels getHotel(@PathVariable String name){
        Hotels hotel = hotelService.getHotelByName("Hotel Paris");
//        System.out.println(hotel);
        return hotelService.getHotelByName(name);
    }
}
