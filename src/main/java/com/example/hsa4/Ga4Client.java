package com.example.hsa4;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "ga4client", url = "https://www.google-analytics.com/mp/collect?api_secret=z-s0jdd3QVSIHvB8AWT4_w&measurement_id=G-M3HEX1ZVME")
public interface Ga4Client {
    @PostMapping
    void sendRate(@RequestBody PayloadWrapper payload);
}
