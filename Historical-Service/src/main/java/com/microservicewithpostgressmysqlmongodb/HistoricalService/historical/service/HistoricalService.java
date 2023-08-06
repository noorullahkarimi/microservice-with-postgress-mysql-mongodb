package com.microservicewithpostgressmysqlmongodb.HistoricalService.historical.service;

import com.microservicewithpostgressmysqlmongodb.HistoricalService.historical.Model.Historical;
import com.microservicewithpostgressmysqlmongodb.HistoricalService.historical.repository.HistoricalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class HistoricalService {

    private HistoricalRepository historicalRepository;

    @Autowired
    public HistoricalService(HistoricalRepository historicalRepository) {
        this.historicalRepository = historicalRepository;
    }
    //get all
    public List<Historical> getAllHistoricalPlace() {
        return historicalRepository.findAll();
    }

    //get by id
    public Historical getHistoricalPlaceById(int id) {
        Long idLong = (long) id;
        Optional<Historical> optionalHistorical = historicalRepository.findById(idLong);

        Historical historical = optionalHistorical.orElseThrow(
                () -> new EntityNotFoundException());

        return historical;
    }

    //save item
    public Historical saveHistoricalPlace(Historical historical){
       return historicalRepository.save(historical);
    }

    //update item
    public Historical updateItem(Historical historical){
        return historicalRepository.save(historical);
    }

    //delete item
    public void deleteHistorical(int id) {
        try {
            historicalRepository.deleteById(id);
        } catch (Exception e) {
            // Handle the exception appropriately or log the error
            e.printStackTrace();
            throw new RuntimeException("Failed to delete historical record with ID: " + id);
        }
    }
}

