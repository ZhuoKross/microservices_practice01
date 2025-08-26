package com.microservice.host.controller;


import com.microservice.host.DTO.HostDTO;
import com.microservice.host.Entity.Host;
import com.microservice.host.Services.HostService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/hosts")
public class HostController {

    private HostService hostService;

    public HostController(HostService hostService){
        this.hostService = hostService;
    }


    @GetMapping("/all")
    public ResponseEntity<List<HostDTO>> getAllHosts (){
        List<Host> listOfEntityHost =  hostService.getAllHosts();

        List<HostDTO> hostDTOList = listOfEntityHost.stream()
                .map((host) -> new HostDTO(host.isVipHost, host.isRegularHost, host.price,host.document, host.nombre))
                .toList();

        return ResponseEntity.ok().body(hostDTOList);
    }

    @PostMapping("/create")
    public ResponseEntity<Host> createHost(@RequestBody HostDTO hostDTO){
        System.out.println("data: " + hostDTO);
        Host hostEntity = Host.builder()
                .isRegularHost(hostDTO.isRegularHost())
                .isVipHost(hostDTO.isVipHost())
                .price(hostDTO.price())
                .document(hostDTO.document())
                .nombre(hostDTO.nombre())
                .build();

        Host hostResponse = hostService.createHost(hostEntity);

        return ResponseEntity.ok().body(hostResponse);
    }
}
