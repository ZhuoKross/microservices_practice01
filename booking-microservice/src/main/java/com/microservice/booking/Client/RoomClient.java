package com.microservice.booking.Client;

import com.microservice.booking.Client.model.RoomDTO;
import com.microservice.booking.Utils.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "RoomClient", url = "http://localhost:9093")
public interface RoomClient {
    @GetMapping("/api/v1/rooms/{id}")
    RoomDTO getRoomClient (@PathVariable("id") Long idRoom);
}
