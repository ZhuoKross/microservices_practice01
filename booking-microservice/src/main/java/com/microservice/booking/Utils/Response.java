package com.microservice.booking.Utils;

import java.time.LocalDateTime;

public record Response<T>(
   String message,
   LocalDateTime date,
   T data
) {}
