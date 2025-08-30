package com.microservice.booking.Client.model;

public record HostDTO(
        boolean isVipHost,
        boolean isRegularHost,
        double price,
        int document,
        String name) {
}
