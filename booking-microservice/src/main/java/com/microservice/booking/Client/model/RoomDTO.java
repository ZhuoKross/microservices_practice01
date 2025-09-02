package com.microservice.booking.Client.model;

import lombok.Builder;

@Builder
public record RoomDTO(int numBeds, boolean hasWifi, boolean hasTv, double price, int personsCapacity) {
}

