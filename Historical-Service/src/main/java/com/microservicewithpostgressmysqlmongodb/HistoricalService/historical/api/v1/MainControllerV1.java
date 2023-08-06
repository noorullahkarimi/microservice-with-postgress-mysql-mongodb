package com.microservicewithpostgressmysqlmongodb.HistoricalService.historical.api.v1;

import com.microservicewithpostgressmysqlmongodb.HistoricalService.historical.Model.Historical;
import com.microservicewithpostgressmysqlmongodb.HistoricalService.historical.service.HistoricalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class MainControllerV1 {

    private HistoricalService historicalService;

    @Autowired
    public MainControllerV1(HistoricalService historicalService) {
        this.historicalService = historicalService;
    }

    //get a list of historical palce
    @GetMapping("/index")
    @ResponseBody
    public List<Historical> index(){
        return historicalService.getAllHistoricalPlace();
    }

    //get historical place with id
    @GetMapping("/getHistoricalPlace/{id}")
    @ResponseBody
    public Historical getHistoricalPlace(@PathVariable int id){
        return historicalService.getHistoricalPlaceById(id);
    }

    //inserting new historical place
    @PutMapping("/addHistorical")
    @ResponseBody
    public Historical getHistoricalPlace(@ModelAttribute Historical historical){
        return historicalService.saveHistoricalPlace(historical);
    }

    //editing the historical place with id
    @PatchMapping("/editHistorical")
    public Historical updateHistoricalPlace(@ModelAttribute Historical historical){
        return historicalService.updateItem(historical);
    }

    //delete the place with id
    @DeleteMapping("/deleteHistorical/{id}")
    public void deleteHistorical(@PathVariable int id){
        historicalService.deleteHistorical(id);
    }

    @GetMapping("/version")
    public @ResponseBody String version(){
        return  "v1";
    }
}
