package com.streamingservice.gridwisedemo.services;

import com.streamingservice.gridwisedemo.messages.TaxiTrip;
import com.streamingservice.gridwisedemo.streams.TaxiTripsStream;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

@Service
@Slf4j
public class TaxiTripsService {

    private final TaxiTripsStream taxiTripsStream;

    public TaxiTripsService(TaxiTripsStream taxiTripsStream) {
        this.taxiTripsStream = taxiTripsStream;
    }

    public void sendTaxiTrip(final TaxiTrip taxiTrip) {
        log.info("Sending taxi trip {}", taxiTrip);

        MessageChannel messageChannel = taxiTripsStream.outboundsTaxiTrips();

        messageChannel.send(MessageBuilder
                .withPayload(taxiTrip)
                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
                .build());
    }
}
