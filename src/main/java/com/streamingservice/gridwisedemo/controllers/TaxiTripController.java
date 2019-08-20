package com.streamingservice.gridwisedemo.controllers;

import com.streamingservice.gridwisedemo.messages.TaxiTrip;
import com.streamingservice.gridwisedemo.services.TaxiTripsService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaxiTripController {

    private final TaxiTripsService taxiTripsService;

    public TaxiTripController(TaxiTripsService taxiTripsService) {
        this.taxiTripsService = taxiTripsService;
    }

    @GetMapping("/taxiTrips")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void taxiTrips(@RequestParam("message") String message) {
        TaxiTrip taxiTrip = TaxiTrip.builder()
                .VendorID(25)
                .build();
    }
}
