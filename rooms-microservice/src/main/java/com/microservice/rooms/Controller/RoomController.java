package com.microservice.rooms.Controller;

import com.microservice.rooms.Entity.Room;
import com.microservice.rooms.Service.RoomService;
import com.microservice.rooms.Utils.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/rooms")
public class RoomController {

    private RoomService roomService;

    public RoomController(RoomService roomService){
        this.roomService = roomService;
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllRooms (){
        try{
            List<Room> roomList = roomService.getAllRooms();
            Response responseSuccess = new Response<>("Rooms fetched successfully", LocalDateTime.now(), roomList);
            return ResponseEntity.ok(responseSuccess);
        } catch (Exception e) {
            return ResponseEntity.unprocessableEntity().body(new Response<String>("Can't fetch all rooms", LocalDateTime.now(), e.getMessage()));
        }
    }
}
