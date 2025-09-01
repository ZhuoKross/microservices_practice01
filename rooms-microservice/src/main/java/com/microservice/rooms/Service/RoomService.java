package com.microservice.rooms.Service;

import com.microservice.rooms.Entity.Room;
import com.microservice.rooms.Repository.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

    private RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository){
        this.roomRepository = roomRepository;
    }

    public List<Room> getAllRooms (){
        return roomRepository.findAll();
    }

}
