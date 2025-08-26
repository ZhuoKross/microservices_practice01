package com.microservice.host.DTO;

public record HostDTO(boolean isVipHost, boolean isRegularHost, double price, int document,String nombre) {
}
