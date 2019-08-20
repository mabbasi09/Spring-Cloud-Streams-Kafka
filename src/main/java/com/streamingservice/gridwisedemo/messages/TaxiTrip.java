package com.streamingservice.gridwisedemo.messages;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@Builder
public class TaxiTrip {
    Integer VendorID;
    LocalDate tpep_pickup_datetime;
    LocalDate tpep_dropoff_datetime;

}
