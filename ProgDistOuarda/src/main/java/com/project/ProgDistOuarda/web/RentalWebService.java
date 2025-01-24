
package com.project.ProgDistOuarda.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class RentalWebService {
    Logger logger = LoggerFactory.getLogger(RentalWebService.class);

    @GetMapping("/bonjour")
    public String disBonjour() {
        return "Bonjour !";
    }
    
    @GetMapping("/bonjour_new")
    public String disReBonjour() {
        return "ReBonjour !";
    }
    @GetMapping("/newcarshow")
    public String newcarshow() {
        return "this is a new service !";
    }
    @GetMapping("/cars/rentalNumber")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public void getRentalNumbers(){
        logger.info("Rental Numbers requested");        
    }

    @GetMapping("/cars/{plateNumber}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public void getOneCar(
        @PathVariable("plateNumber") String plateNumber
    )throws Exception
    {
        logger.info("Requested one car: "+plateNumber);
    }
}