package com.microservice.booking.Entity;


import jakarta.persistence.*;
import lombok.Builder;

import java.time.LocalDate;

@Table(name = "bookings")
@Entity
@Builder
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBooking;
    @Column(name = "start_date")
    public LocalDate startDate;
    @Column(name = "end_date")
    public LocalDate endDate;
    @Column(name = "id_host")
    public Long idHost;

}
