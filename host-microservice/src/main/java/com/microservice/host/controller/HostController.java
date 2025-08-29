package com.microservice.host.controller;


import com.microservice.host.DTO.HostDTO;
import com.microservice.host.Entity.Host;
import com.microservice.host.Services.HostService;
import org.springframework.http.HttpStatus;
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
                .map((host) -> new HostDTO(host.isVipHost, host.isRegularHost, host.price,host.document, host.name))
                .toList();

        return ResponseEntity.ok().body(hostDTOList);
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> getHost(@PathVariable Long id){
        HostDTO hostFound = hostService.getOneHost(id);

        if(hostFound != null) {
            return ResponseEntity.ok(hostFound);
        }else {
            return ResponseEntity.unprocessableEntity().body("Can't get the host you searched :(");
        }
    }


    @PostMapping("/create")
    public ResponseEntity<Host> createHost(@RequestBody HostDTO hostDTO){
        Host hostEntity = Host.builder()
                .isRegularHost(hostDTO.isRegularHost())
                .isVipHost(hostDTO.isVipHost())
                .price(hostDTO.price())
                .document(hostDTO.document())
                .name(hostDTO.name())
                .build();

        Host hostResponse = hostService.createHost(hostEntity);

        return ResponseEntity.ok().body(hostResponse);
    }


    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateHost(@PathVariable("id") Long idHost, @RequestBody HostDTO hostDTO){

        Host response = hostService.updateHost(idHost, hostDTO);

        if(response != null){
            return ResponseEntity.status(HttpStatus.OK).body(response);
        }else {
            return ResponseEntity.unprocessableEntity().body("Can't update the host :(");
        }


    }
}
