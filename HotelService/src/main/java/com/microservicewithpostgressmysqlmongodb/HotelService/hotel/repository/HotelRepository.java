package com.microservicewithpostgressmysqlmongodb.HotelService.hotel.repository;

import com.microservicewithpostgressmysqlmongodb.HotelService.hotel.model.Hotels;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HotelRepository extends MongoRepository<Hotels, Long> {

    Optional<Hotels> findHotelsByName(String name);

}
