package com.microservicewithpostgressmysqlmongodb.HistoricalService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {
		"com.microservicewithpostgressmysqlmongodb.HistoricalService.historical.api.v1",
		"com.microservicewithpostgressmysqlmongodb.HistoricalService.historical.api.v2",
		"com.microservicewithpostgressmysqlmongodb.HistoricalService.historical.service"
})

public class HistoricalServiceApplication {

	public static void main(String[] args){
		SpringApplication.run(HistoricalServiceApplication.class, args);
	}

}
