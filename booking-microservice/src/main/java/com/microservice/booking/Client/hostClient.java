package com.microservice.booking.Client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "hostClient", url = "http://localhost:9092")
public interface hostClient {
    @GetMapping("/{id}")
    Host
}
