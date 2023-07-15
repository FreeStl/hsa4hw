package com.example.hsa4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class MainService {
    @Autowired
    BitcoinClient bitcoinClient;
    @Autowired
    Ga4Client ga4Client;

    @Scheduled(fixedDelay = 15, timeUnit = TimeUnit.SECONDS)
    public void scheduleFixedDelayTask() {
        int rate = bitcoinClient.getRate().getBitcoin().getUsd();
        var params = new PayloadWrapper.PayloadEventParams(rate);
        var event = new PayloadWrapper.PayloadEvent(params);
        var time = String.valueOf(Instant.now().toEpochMilli() * 1000);
        var payload = new PayloadWrapper(time,  List.of(event));
        ga4Client.sendRate(payload);
        System.out.println(rate);
    }
}
