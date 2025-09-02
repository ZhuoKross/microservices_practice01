package com.microservice.booking.DTO;

import com.microservice.booking.Client.model.HostDTO;
import com.microservice.booking.Client.model.RoomDTO;
import lombok.Builder;

import java.time.LocalDate;

@Builder
public record ResponseBookingDTO(LocalDate startDate, LocalDate endDate, HostDTO hosts, RoomDTO rooms) {
}
