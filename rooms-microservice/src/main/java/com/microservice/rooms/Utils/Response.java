package com.microservice.rooms.Utils;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record Response<T>(
   String message,
   LocalDateTime date,
   T data
) {}
