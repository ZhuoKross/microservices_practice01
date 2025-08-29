package com.microservice.host.DTO;

import lombok.Builder;

@Builder
public record HostDTO(boolean isVipHost, boolean isRegularHost, double price, int document,String name) {
}
