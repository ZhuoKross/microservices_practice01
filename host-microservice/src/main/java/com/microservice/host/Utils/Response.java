package com.microservice.host.Utils;

import java.time.LocalDateTime;

public record Response<T>(
   String message,
   LocalDateTime date,
   T data
) {}
