package com.microservicewithpostgressmysqlmongodb.HistoricalService.historical.repository;

import com.microservicewithpostgressmysqlmongodb.HistoricalService.historical.Model.Historical;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HistoricalRepository extends JpaRepository<Historical, Long> {

    Optional<Historical> findById(Long id);

    void deleteById(int id);
}
