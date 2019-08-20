package com.streamingservice.gridwisedemo.config;

import com.streamingservice.gridwisedemo.streams.TaxiTripsStream;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(TaxiTripsStream.class)
public interface StreamsConfig {
}
