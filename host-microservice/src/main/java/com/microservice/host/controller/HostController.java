package com.microservice.host.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/rooms/")
public class HostController {

    @GetMapping("/all")
    public void getAllRooms (){

    }
}
