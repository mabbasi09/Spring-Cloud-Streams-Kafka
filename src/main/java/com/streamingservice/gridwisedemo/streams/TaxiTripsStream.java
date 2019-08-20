package com.streamingservice.gridwisedemo.streams;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

@Component
public interface TaxiTripsStream {
    String INPUT = "Taxi-in";
    String OUTPUT = "Taxi-out";

    @Input(INPUT)
    SubscribableChannel inboundsTaxiTrips();

    @Output(OUTPUT)
    MessageChannel outboundsTaxiTrips();
}
