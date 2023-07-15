package com.example.hsa4;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "bitcoinclient", url = "https://api.coingecko.com/api/v3/simple/price?ids=bitcoin&vs_currencies=usd")
public interface BitcoinClient {
    @GetMapping
    BitcoinWrapper getRate();
}
