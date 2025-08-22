package com.microservice.host.Entity;


import jakarta.persistence.*;
import lombok.Builder;

@Table(name = "rooms")
@Entity
@Builder
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
}
