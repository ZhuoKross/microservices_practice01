package com.microservice.host.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Table(name = "hosts")
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Host {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column
    public boolean isVipHost;

    @Column
    public boolean isRegularHost;

    @Column
    public double price;

    @Column
    public int document;

    @Column
    public String nombre;

}
