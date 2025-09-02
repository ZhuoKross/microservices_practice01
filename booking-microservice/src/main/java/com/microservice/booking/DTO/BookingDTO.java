package com.microservice.booking.DTO;

import lombok.Builder;

import java.time.LocalDate;

@Builder
public record BookingDTO(LocalDate startDate, LocalDate endDate, Long idHost, Long idRoom) {
}
